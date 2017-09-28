import static org.junit.Assert.*;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<HighlighterPattern> listOfKeywords = new ArrayList<>();
		listOfKeywords.add(new HighlighterPattern("as", "blue", "capital", "normal"));
		listOfKeywords.add(new HighlighterPattern("if", "red", "lower", "bold"));
		listOfKeywords.add(new HighlighterPattern("and", "red", "capital", "bold"));
		listOfKeywords.add(new HighlighterPattern("then", "green", "lower", "normal"));
		listOfKeywords.add(new HighlighterPattern("when", "blue", "lower", "normal"));

		String inputString = "if we write a program and compile it, then as we run the program,we will get output";
		String expectedOutputString = "[red][bold]if[bold][red] we write a program [red][bold]AND[bold][red] compile it, [green]then[green] [blue]AS[blue] we run the program,we will get output";
		String outputString = StringHighlighter.highlightString(inputString, listOfKeywords);
		// System.out.println(outputString);
		assertEquals(expectedOutputString, outputString);
	}
}
