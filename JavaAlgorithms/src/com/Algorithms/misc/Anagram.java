/**
 * 
 * Java Program to check whether two String's anagram
 * or not
 *
 */

package com.Algorithms.misc;

import java.util.Arrays;

/**
 * 
 * @author Kashinath Agire
 *
 */

public class Anagram {

	public  boolean areAnagram(char[] str2,char[] str3){
		
		//Get lenght of both String
		int leng1=str2.length;
		int leng2=str3.length;
		
		//Check for the length equals
		if(leng1!=leng2){
			return false;
		}
		
		//Get Sorts an String
		Arrays.sort(str2);
		Arrays.sort(str3);
		
		for(int i=0;i<leng1;i++){
			
			if(str2[i]!=str3[i]){
				return false;
			}
		}
		
		return true;

	}
	
}
