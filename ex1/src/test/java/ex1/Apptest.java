package ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Apptest {
	question4 tester=new question4();
	/**
	 * rigorous test:-)
	 */
	////דוגמא חיובית למוד השוואה לשני מספרים חיובים
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
		String Expected_result="Error";
		int a=28,b='k';
		String mod="regular";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
	}
	
	@Test
	public void Test3() {
		String Expected_result="B";
		int a=28,b=-28;
		String mod="negative";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
}
	@Test
	public void Test4() {
		String Expected_result="Error";
		int a=-28,b='h';
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
		String Expected_result="Error";
		int a=5,b=0;
		String mod="reciprocal";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
}
	/// (כתבתי מוד אחר וכך יתן לי שגיאה בגלל שאין מוד בשם הזה)דוגמא נוספת ללא קשר מהטבלה
	@Test
	public void Test7() {
		String Expected_result="Error";
		int a=5,b=2;
		String mod="random";
		String actual_result=tester.compare(a,b,mod);
	    assertEquals(Expected_result,actual_result); 
}
}






