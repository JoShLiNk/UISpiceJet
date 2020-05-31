package com.vo;

public class TestRuns {
	String title;
	String id;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TestRuns [title=" + title + ", id=" + id + "]";
	}

	public TestRuns(String title, String id) {
		super();
		this.title = title;
		this.id = id;
	}

	TestRuns() {

	}
}
