package com.att.model

import org.apache.spark.sql.Dataset
import springfox.documentation.spring.web.json.Json
import scala.beans.BeanProperty

class DataFrameRequest {
  @BeanProperty
  var config: DataFrameConfiguration = _;
  @BeanProperty
  var environment: DataFrameEnvironment = _;
  @BeanProperty
  var dataFrame:DataFrameValues=_;
}