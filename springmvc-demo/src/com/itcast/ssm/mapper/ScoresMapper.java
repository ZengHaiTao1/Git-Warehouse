package com.itcast.ssm.mapper;

import java.util.List;

import com.itcast.ssm.po.Scores;
import com.itcast.ssm.po.ScoresExample;

public interface ScoresMapper {
    int countByExample(ScoresExample example);

    int deleteByExample(ScoresExample example);

    int insert(Scores record);

    int insertSelective(Scores record);

    List<Scores> selectByExample(ScoresExample example);

    int updateByExampleSelective( Scores record,  ScoresExample example);

    int updateByExample( Scores record,  ScoresExample example);
}