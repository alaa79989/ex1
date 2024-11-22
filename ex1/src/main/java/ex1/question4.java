package ex1;
//שם השותפים:ALAA NFAFAA(212896021)
public class question4 {
	
 public static String compare(double a,double b,String mod) {
	 if ((int) b >= 0 && (int) b <= 127 && Character.isLetter((char) b)||Character.isLetter((char) a)) {
	   return "Error"; // אם מדובר בתו חוקי
		}
	
	    // בדיקה אם אחד המספרים מחולק ב-0
	    if (a == 0 || b == 0) {
	        if ("reciprocal".equals(mod)) {
	            return "Error"; // חילוק ב-0 אינו חוקי במוד "reciprocal"
	        }
	    }
	 switch(mod) {
	 case "regular":
	    if(a<b)
	    	return"B";
	    else
	    	return"A";
	 case "negative":
		 if(-a<-b)
			 return"B";
		 else
			 return"A";
	 case "reciprocal":
		  if((1/a) > (1/b))
		     return "A";
		  else
			  return "B";
	 
	 default:
		 return "Error";
 }

 }
 }

