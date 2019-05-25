package com.itcast.mapper.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itcast.ssm.po.Scores;
import com.itcast.ssm.po.ScoresExample;

public interface ScoresMapper {
    int countByExample(ScoresExample example);

    int deleteByExample(ScoresExample example);

    int insert(Scores record);

    int insertSelective(Scores record);

    List<Scores> selectByExample(ScoresExample example);

    int updateByExampleSelective(@Param("record") Scores record, @Param("example") ScoresExample example);

    int updateByExample(@Param("record") Scores record, @Param("example") ScoresExample example);
}