package com.itcast.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itcast.mapper.dao.ScoresMapper;
import com.itcast.ssm.po.Scores;
import com.itcast.ssm.po.ScoresExample;

@Service(value = "ScoresServiceImpl")
public class ScoresServiceImpl implements ScoresService {
	
	@Autowired
	private ScoresMapper scoresMapper;

	@Override
	public List<Scores> queryScoresist() {
		List<Scores> list = this.scoresMapper.selectByExample(null);
		return list;
	}

	@Override
	public Scores queryScoresById(int id) {
		ScoresExample example = new ScoresExample();
		example.createCriteria().andIdEqualTo(id);
		List<Scores> scores = this.scoresMapper.selectByExample(example);
		return scores.get(0);
	}

	@Override
	public int updateScores(@Param("record") Scores scores) {
		ScoresExample example = new ScoresExample();
		example.createCriteria().andIdEqualTo(scores.getId());
		this.scoresMapper.updateByExampleSelective(scores, example);
		return 1;
	}

	@Override
	public int deleteScores(List<Integer> integers) {
		
		ScoresExample example = new ScoresExample();
		example.createCriteria().andIdIn(integers);
		this.scoresMapper.deleteByExample(example);
		return 1;
	}

	@Override
	public int deleteScores(Integer[] ids) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
