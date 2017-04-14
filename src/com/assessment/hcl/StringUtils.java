package com.assessment.hcl;

/**
 * StringCheck is for reversing the string and
 * checking if the string is Palindrome
 * 
 * 
 * @author Lokesh Reddy
 * @version 1.0
 */
public class StringUtils {
	/**
	 * Reads the input string and reverses it
	 * @param String the input string
	 * @return String the reversed string
	 */
	public String reverse(String strInput)
	{
		StringBuilder sbInp = new StringBuilder(strInput);
		int strLen = strInput.length();
		for(int i=0, j=strLen-1; i<(strLen/2) && i<j;i++, j--)
		{
			char temp = sbInp.charAt(i);
			sbInp.setCharAt(i,sbInp.charAt(j));
			sbInp.setCharAt(j,temp);		
		}
		return sbInp.toString();
	}
	/**
	 * Reads the input string and checks if it is Palindrome
	 * @param String the input string
	 * @return boolean return's true if the input string is Palindrome and otherwise
	 */
	public boolean isPalendrome(String strInput)
	{
		if(strInput.equalsIgnoreCase(reverse(strInput)))
			return true;
		return false;
	}

}
