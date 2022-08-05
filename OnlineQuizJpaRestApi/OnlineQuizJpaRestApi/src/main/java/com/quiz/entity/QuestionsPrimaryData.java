package com.quiz.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class QuestionsPrimaryData implements Serializable {

	private Integer paperid;
	
	private Integer question_no;

	public QuestionsPrimaryData() {
		super();
	}

	public QuestionsPrimaryData(Integer paperid, Integer questionno) {
		super();
		this.paperid = paperid;
		this.question_no = questionno;
	}

	public Integer getPaperid() {
		return paperid;
	}

	public void setPaperid(Integer paperid) {
		this.paperid = paperid;
	}

	public Integer getQuestionno() {
		return question_no;
	}

	public void setQuestionno(Integer questionno) {
		this.question_no = questionno;
	}

	@Override
	public String toString() {
		return "QuestionsPrimaryData [paperid=" + paperid + ", questionno=" + question_no + "]";
	}

	
	
	
}
