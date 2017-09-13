package com.stringhighlighter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StringMaker {
	public static void main(String[] args) throws IOException {
		String input;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input string");
		input = br.readLine();
		//String[] inputArray = input.split(" ");
		//StringBuffer input1=new StringBuffer(input);

		Map<String, String> keyword = new HashMap<String, String>();
		keyword.put("as", "blue,capital,normal");
		keyword.put("if", "red,lower,bold");
		keyword.put("and", "red,capital,bold");
		keyword.put("then", "green,lower,normal");
		keyword.put("when", "blue,lower,normal");

		StringHighlighter pattern1 = new StringHighlighterWithSinglePattern();
		pattern1.setOutput(pattern1.highlighter(input, keyword));
		System.out.println("output string is for 1st scenario is : " + pattern1.getOutput());
		StringHighlighter pattern2 = new StringHighlighterWithMultiplePattern();
		pattern2.setOutput(pattern2.highlighter(input, keyword));
		System.out.println("output string is for 2nd scenario is : " + pattern2.getOutput());
		StringHighlighter pattern3 = new StringHighlighterWithMultiplePatternAndCase();
		pattern3.setOutput(pattern3.highlighter(input, keyword));
		System.out.println("output string is for 3rd scenario is : " +pattern3.getOutput());
		StringHighlighter pattern4 = new StringHighlighterWithMultiplePatternAndStyle();
		pattern4.setOutput(pattern4.highlighter(input, keyword));
		System.out.println("output string is for 4th scenario is : " + pattern4.getOutput());
	}

}
