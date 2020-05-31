package com.vo;

public class Reuslts {
	private String testId;
	private String StatusId;
	private String comment;
	private String defects;

	public void Results() {

	}

	public Reuslts(String testId, String statusId, String comment, String defects) {
		super();
		this.testId = testId;
		StatusId = statusId;
		this.comment = comment;
		this.defects = defects;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getStatusId() {
		return StatusId;
	}

	public void setStatusId(String statusId) {
		StatusId = statusId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDefects() {
		return defects;
	}

	public void setDefects(String defects) {
		this.defects = defects;
	}
}
