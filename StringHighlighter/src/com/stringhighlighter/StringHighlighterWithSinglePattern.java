package com.stringhighlighter;

import java.util.Iterator;
import java.util.Map;

public class StringHighlighterWithSinglePattern extends StringHighlighter {
	@Override
	protected String highlighter(String input, Map<String, String> keyword) {
		String token;
		String output=input;
		Iterator<String> keywordIterator=keyword.keySet().iterator();
		while(keywordIterator.hasNext()){
			token =keywordIterator.next();
			output=output.replaceAll(token, "[blue]"+token+"[blue]");
		}
		return output;
		
		// TODO Auto-generated method stub
	/*	StringBuffer output=new StringBuffer();
		String outputToken="";
		for (String inutToken : input) {

			if (keyword.keySet().contains(inutToken)) {
				outputToken = "[blue]" + inutToken + "[blue]";
			} else {
				outputToken = inutToken;
			}
			output = output.append(" ").append(outputToken);

		}
		return output;*/
		//if(keyword.keySet().contains(arg0))
		
		}

}
