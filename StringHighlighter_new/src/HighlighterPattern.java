
public class HighlighterPattern {
	String keyword;
	String color;
	String capitalization;
	String style;
	
	public HighlighterPattern(String keyword,String color,String capitalization,String style) {
		// TODO Auto-generated constructor stub
		this.keyword=keyword;
		this.color=color;
		this.capitalization=capitalization;
		this.style=style;
	}
	public String getKeyword() {
		return keyword;
	}
	public String getColor() {
		return color;
	}
	public String getCapitalization() {
		return capitalization;
	}
	public String getStyle() {
		return style;
	}
}
