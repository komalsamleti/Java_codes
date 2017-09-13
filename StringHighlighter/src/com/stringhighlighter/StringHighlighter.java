package com.stringhighlighter;

import java.util.Map;
import java.util.StringTokenizer;

public abstract class StringHighlighter {
	private String output;
	
	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	protected abstract String highlighter(String input, Map<String, String> keyword);
	
	public String getAppendingPattern(String keywordValue) {
		StringTokenizer st = new StringTokenizer(keywordValue, ",");
		String appendingPattern = st.nextToken();
		return appendingPattern;
	}

	public String getCasePattern(String keywordValue) {
		StringTokenizer st = new StringTokenizer(keywordValue, ",");
		String appendingPattern = st.nextToken();
		String casePattern = st.nextToken();
		return casePattern;
	}

	public String getStylePattern(String keywordValue) {
		StringTokenizer st = new StringTokenizer(keywordValue, ",");
		String appendingPattern = st.nextToken();
		String casePattern = st.nextToken();
		String stylePattern = st.nextToken();
		return stylePattern;
	}

}
