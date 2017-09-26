package com.att

import org.springframework.context.annotation.Configuration
import springfox.documentation.swagger2.annotations.EnableSwagger2
import springfox.documentation.spring.web.plugins.Docket
import org.springframework.context.annotation.Bean
import springfox.documentation.spi.DocumentationType
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.ApiInfoBuilder
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

@Configuration
@EnableSwagger2
class SwaggerConfig {

  @Bean
  def newsApi: Docket = {
    var docket = new Docket(DocumentationType.SWAGGER_2).groupName("metadata data").enable(true).apiInfo(new ApiInfoBuilder().title("Metadata Management").description("Datacatalog services").build()).select().paths(Predicates.not(PathSelectors.regex("/error"))).build();
    return docket;
  }

}