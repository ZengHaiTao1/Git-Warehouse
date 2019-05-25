package com.itcast.ssm.po;

import java.util.List;

public class QueryVo {
	
	private Scores scores;
	private Integer[] ids;
	private List<Integer> integers;
	public List<Integer> getIntegers() {
		return integers;
	}
	public void setIntegers(List<Integer> integers) {
		this.integers = integers;
	}
	public Integer[] getIds() {
		return ids;
	}
	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	public Scores getScores() {
		return scores;
	}
	public void setScores(Scores scores) {
		this.scores = scores;
	}
	
}
