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
		
		/*//Get Sorts an String
		Arrays.sort(str2);
		Arrays.sort(str3);*/
		char [] ch=sort(str2);
		char [] ch1=sort(str3);

		for(int i=0;i<leng1;i++){
			
			if(ch[i]!=ch1[i]){
				return false;
			}
		}
		
		return true;

	}
	
	//let write custom logic for the sort
	
	private char[] sort(char[] generic) {
		int len = generic.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (generic[j] > generic[j + 1]) {
					char temp = generic[j];
					generic[j] = generic[j + 1];
					generic[j + 1] = temp;
				}

			}

		}

		return generic;
	}
	
}
