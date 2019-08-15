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

	public  boolean areAnagram(char[] str1,char[] str2){
		
		//Get lenght of both String
		int leng1=str1.length;
		int leng2=str2.length;
		
		//Check for the length equals
		if(leng1!=leng2){
			return false;
		}
		
		//Get Sorts an String
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<leng1;i++){
			
			if(str1[i]!=str2[i]){
				return false;
			}
		}
		
		return true;

	}
	
}
