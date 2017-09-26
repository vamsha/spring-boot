package com.att.controllers

import javax.validation.Valid

import com.att.exception.BadRequestException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation._
import com.att.model.DataFrameRequest
import org.springframework.http.ResponseEntity
import org.apache.spark.sql.Dataset
import org.apache.spark.sql.Dataset
import org.apache.spark.sql.Dataset
import com.att.model.DataFrameConfiguration
import com.att.model.DataFrameConfiguration

/**
 * Created by wonwoo on 2016. 3. 9..
 */

@RestController
class PostController {

  @RequestMapping(value = Array("/dataframe/"), method = Array(RequestMethod.POST))
  @ResponseStatus(HttpStatus.OK)
  def postDataFrame(@Valid @RequestBody request: DataFrameRequest): DataFrameConfiguration = {
    var p1 = request.config.param1;
    var p2 = request.environment.param1;
    var dataframe = new DataFrameConfiguration;
    dataframe.setParam1(p1)
    dataframe.setParam2(p2)
    dataframe.setParam3(p1)
    return dataframe;
  }
  @RequestMapping(value = Array("/sample/"), method = Array(RequestMethod.GET))
  @ResponseStatus(HttpStatus.OK)
  def sample(): Unit ={
    println("hello")
  }
}