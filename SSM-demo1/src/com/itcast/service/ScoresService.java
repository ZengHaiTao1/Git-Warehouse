package com.itcast.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itcast.ssm.po.Scores;

public interface ScoresService {
	List<Scores> queryScoresist();
	Scores queryScoresById(int id);
	int updateScores(@Param("record") Scores scores);
	int deleteScores(Integer[] ids);
	int deleteScores(List<Integer> integers);
}
