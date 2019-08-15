package com.Algorithms.misc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Algorithms.misc.Anagram;

public class AnagramTest {
    @Test
	public void test(){
		
    	Anagram a = new  Anagram();
    	   
    	assertTrue(  a.areAnagram(new char[]{'a','b','c','d'}, new char[]{
    	    		 'a','b','d','c'
    	     }));
		
	}
}
