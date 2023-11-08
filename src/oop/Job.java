package oop;

public abstract class Job {
	public String title;

	public abstract String doJob();

	protected abstract String extendJob();

	private String finalJob() {
		return "final job";
	}
	
	public String interviewJob() {
		return "interviewJob";
	}

}
