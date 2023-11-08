package oop;

public class RunProgram {
	public static void main(String[] args) {
		Job j1 = new SEJob();
		Job j2 = new TeacherJob();

		System.out.println("RunProgram.main(): "+j1.doJob());
		System.out.println("RunProgram.main(): "+j2.doJob());
		
		SEJob sej1 = new SEJob();
		System.out.println("RunProgram.main(): "+sej1.doJob());
		
		System.out.println("RunProgram.main(): "+sej1.interviewJob());
	}
}
