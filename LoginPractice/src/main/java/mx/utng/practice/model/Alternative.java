package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity @Table(name="alternatives")
public class Alternative {
	@Id @GeneratedValue
	private Long id;
	private String text;
	private String correct;
	@Column(name="question_def")
	private String questionDef;
	private String answer;
	
	
	
	
	public Alternative(String text, String correct, String questionDef,
			String answer) {
		super();
		this.text = text;
		this.correct = correct;
		this.questionDef = questionDef;
		this.answer = answer;
	}


	public Alternative(){
		this("","","","");
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getCorrect() {
		return correct;
	}


	public void setCorrect(String correct) {
		this.correct = correct;
	}


	public String getQuestionDef() {
		return questionDef;
	}


	public void setQuestionDef(String questionDef) {
		this.questionDef = questionDef;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "Alternative [id=" + id + ", text=" + text + ", correct="
				+ correct + ", questionDef=" + questionDef + ", answer="
				+ answer + "]";
	}
	
}
