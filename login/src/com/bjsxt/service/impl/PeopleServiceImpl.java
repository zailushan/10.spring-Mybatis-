package com.bjsxt.service.impl;

import com.bjsxt.mapper.PeopleMapper;
import com.bjsxt.pojo.People;
import com.bjsxt.service.PeopleService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-02-07 12:32
 */
public class PeopleServiceImpl implements PeopleService {

    private PeopleMapper peopleMapper;

    @Value("${my.demo1}")
    private String test1;

    public PeopleMapper getPeopleMapper() {
        return peopleMapper;
    }

    public void setPeopleMapper(PeopleMapper peopleMapper) {
        this.peopleMapper = peopleMapper;
    }

    @Override
    public People login(People people) {
        System.out.println(test1);
        return peopleMapper.findByNameAndAge(people);
    }
}
