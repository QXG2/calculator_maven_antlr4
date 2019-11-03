package chester.calculator;

import java.io.IOException;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import org.jline.reader.*;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4_calculator.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {	
        System.out.println( "Hello World!" );
        
        Terminal terminal = TerminalBuilder.builder()
                .system(true)
                .build();

        LineReader lineReader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build();

        String prompt = "Calculator> ";
        CalculatorVisitorImpl visitor = new CalculatorVisitorImpl();
        
        while (true) {
            String line;
            try {
                line = lineReader.readLine(prompt);
                line += "\n"; // add NEWLINE char to the read line
                System.out.println(calculate_string(line, visitor));
            } catch (UserInterruptException e) {
                // Do nothing
            } catch (EndOfFileException e) {
                System.out.println("\nBye.");
                return;
            }
        }
    }
    
    private static String calculate_string(String source, CalculatorVisitorImpl visitor) {
    	CharStream input = CharStreams.fromString(source);
    	calculatorLexer lexer = new calculatorLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        calculatorParser parser = new calculatorParser(tokenStream);
        ParseTree tree = parser.prog();
        Double result = visitor.visit(tree);
        if (result == null)
        	return "";
        else
        	return result.toString();
    }
}
