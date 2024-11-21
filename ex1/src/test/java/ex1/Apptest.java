package ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Apptest {
	question4 tester=new question4();
	/**
	 * rigorous test:-)
	 */
	@Test
	public void Test1() {
		String Expected_result="A";
		int a=28,b=24;
		String mod="regular";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result);
	}

	@Test
	public void Test2() {
		String Expected_result="B";
		int a=20,b=24;
		String mod="regular";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
	}
	
	@Test
	public void Test3() {
		String Expected_result="B";
		int a=12,b=2;
		String mod="negative";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
}
	@Test
	public void Test4() {
		String Expected_result="A";
		int a=1,b=3;
		String mod="negative";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
}

	@Test
	public void Test5() {
		String Expected_result="A";
		int a=2,b=5;
		String mod="reciprocal";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
}
	@Test
	public void Test6() {
		String Expected_result="B";
		int a=5,b=3;
		String mod="reciprocal";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
}
	@Test
	public void Test7() {
		String Expected_result="Invalid mode";
		int a=5,b=2;
		String mod="random";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
}
}






