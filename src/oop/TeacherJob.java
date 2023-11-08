package oop;

public class TeacherJob extends Job {

	@Override
	public String doJob() {
		return "teach student";
	}

	@Override
	protected String extendJob() {
		return "livestream";
	}

}
