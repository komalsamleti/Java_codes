import java.util.ArrayList;

public class StringHighlighter {
	public static String highlightString(String input, ArrayList<HighlighterPattern> listOfKeywords) {
		// TODO Auto-generated method stub
		String output=input;
		for (HighlighterPattern pattern : listOfKeywords) {
			String keyword = pattern.getKeyword();
			String color = pattern.getColor();
			String capitalization = pattern.getCapitalization();
			String style = pattern.getStyle();
			if (input.contains(keyword)) {
				if (capitalization.equals("capital")) {
					if (style.equals("normal")) {
						output=output.replaceAll(keyword,"["+color+"]"+keyword.toUpperCase()+"["+color+"]");

					} else if (style.equals("bold")) {
						output=output.replaceAll(keyword, "["+color+"]"+"["+style+"]"+keyword.toUpperCase()+"["+style+"]"+"["+color+"]");
					}
				}
				if (capitalization.equals("lower")) {
					if (style.equals("normal")) {
						output=output.replaceAll(keyword,"["+color+"]"+keyword+"["+color+"]" );
					} else if (style.equals("bold")) {
						output=output.replaceAll(keyword, "["+color+"]"+"["+style+"]"+keyword+"["+style+"]"+"["+color+"]");
					}
				}
			}
		}
		return output;
	}

}
