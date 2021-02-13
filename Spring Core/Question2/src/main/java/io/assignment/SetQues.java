package io.assignment;

import java.util.Set;

public class SetQues {
	
	private int questionId;
	private String question;
	private Set<String> answers;
	
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
	
	public Set<String> getAnswers() {
		return answers;
	}
	
	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	
	public String display() {
		return "SetQuestion => QuestionId = " + questionId + " , Question = " + question + " Answer = " + answers + "";
	}
	
}
