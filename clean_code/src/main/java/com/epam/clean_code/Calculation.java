package com.epam.clean_code;

public class Calculation {
	 static float p;
	 static float n;
	 static float r;
	
	Calculation(float p,float n,float r){
		this.p = p;
		this.n = n;
		this.r = r;
	}

	public static float SI() {
		return (p*n*r)/100;
		
	}

	public static float CI() {
		return (float) (Math.pow(1+(r/100),n)*p);
	}
}
