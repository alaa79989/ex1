package ex1;
//שם השותפים:ALAA NFAFAA(212896021)/MOAMER RABEA(207661836)
public class question4 {
 public static String compare(double a,double b,String mod) {
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
         return "Invalid mode";
	 }
	
 }

}

