package com.learn.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String regex="[987]{3}[0-9]{7}";
			String input="9783527819";
			
			Pattern pattern= Pattern.compile(regex);
			
			Matcher match= pattern.matcher(input);
			
			if(match.matches())
			{
				System.out.println("Pattern Matched");
			}
			else
			{
				System.out.println("invalid input");
			}
	}

}
