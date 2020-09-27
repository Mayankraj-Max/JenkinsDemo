package com.junit.demo;

import java.util.List;

public class SimpleProgram {

    public int	Max(int a,int b) {
    	int  max=0;
    	/*for(Integer temp:list) {
    		if(temp>max) {
    			max=temp;
    		}
    	}*/
    	if(a>b)
    		max=a;
    	else
    		 max=b;
    	return max;
    }
	
}
