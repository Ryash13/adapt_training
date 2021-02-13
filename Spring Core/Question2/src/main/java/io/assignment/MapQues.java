package io.assignment;

import java.util.Map;

public class MapQues {
	
	private int questionId;
	private String question;
	private Map<Integer,String> answers;
	
	public int getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	public Map<Integer, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}

	public String display() {
		return "MapQuestion => QuestionId = " + questionId + " , Question = " + question + " Answer = " + answers + "";
	}
	
}
