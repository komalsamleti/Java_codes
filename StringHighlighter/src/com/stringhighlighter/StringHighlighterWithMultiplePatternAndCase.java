package com.stringhighlighter;

import java.util.Iterator;
import java.util.Map;

public class StringHighlighterWithMultiplePatternAndCase extends StringHighlighter{

	@Override
	protected String highlighter(String input, Map<String, String> keyword) {
		// TODO Auto-generated method stub
		String token;
		String output=input;
		Iterator<String> keywordIterator=keyword.keySet().iterator();
		while(keywordIterator.hasNext()){
			token =keywordIterator.next();
			String value = keyword.get(token);
			String appendingPattern = getAppendingPattern(value);
			String casePattern = getCasePattern(value);
			if (casePattern.equals("capital")) {
				output=output.replaceAll(token, "["+appendingPattern+"]"+token.toUpperCase()+"["+appendingPattern+"]");
			} else if (casePattern.equals("lower")) {
				output=output.replaceAll(token, "["+appendingPattern+"]"+token.toLowerCase()+"["+appendingPattern+"]");
			}
		}
		return output;
	}
	
	/*@Override
	protected StringBuffer highlighter(String[] inputArray, Map<String, String> keyword) {
		// TODO Auto-generated method stub
		StringBuffer output = new StringBuffer();
		String outputToken = "";
		for (String inputToken : inputArray) {
			if (keyword.keySet().contains(inputToken)) {
				String value = keyword.get(inputToken);
				String appendingPattern = getAppendingPattern(value);
				String casePattern = getCasePattern(value);
				if (casePattern.equals("capital")) {
					outputToken = "[" + appendingPattern + "]" + inputToken.toUpperCase() + "[" + appendingPattern
							+ "]";
				} else if (casePattern.equals("lower")) {
					outputToken = "[" + appendingPattern + "]" + inputToken.toLowerCase() + "[" + appendingPattern
							+ "]";
				}

			} else {
				outputToken = inputToken;
			}
			output = output.append(" ").append(outputToken);
		}
		return output;
	}*/

}
