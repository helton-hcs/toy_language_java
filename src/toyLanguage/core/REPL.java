package toyLanguage.core;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import toyLanguage.gen.ToyLanguageLexer;
import toyLanguage.gen.ToyLanguageParser;
import toyLanguage.values.ToyValue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class REPL {

    private static Interpreter interpreter = new Interpreter();

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
        if (inputFile != null)
            evaluateAndPrint(new ANTLRInputStream(new FileInputStream(inputFile)));
        else {
            System.out.print("repl> ");
            Scanner input = new Scanner(System.in);
            while (input.hasNext()) {
                String command = input.nextLine();
                try {
                    evaluateAndPrint(new ANTLRInputStream(command));
                }
                catch(Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
                finally {
                    System.out.print("repl> ");
                }
            }
        }
    }

    private static void evaluateAndPrint(ANTLRInputStream input) throws IOException {
        ToyLanguageLexer lexer = new ToyLanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ToyLanguageParser parser = new ToyLanguageParser(tokens);
        ParseTree tree = parser.program();
        ToyValue value = interpreter.visit(tree);
        //System.out.println("=> input: " + tree.getText());
        //System.out.println("=> tree: "  + parser.getText());
        System.out.println("=> " + value);
    }

}