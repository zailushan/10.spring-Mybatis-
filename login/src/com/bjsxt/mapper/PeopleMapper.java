package com.bjsxt.mapper;

import com.bjsxt.pojo.People;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-01-29 15:57
 */
public interface PeopleMapper {

    People findByNameAndAge(@Param("people") People people);

}
