package oop;

public class SEJob extends Job {

	@Override
	public String doJob() {
		return "Coding and sleep";
	}

	@Override
	protected String extendJob() {
		return "watching anime";
	}

}
