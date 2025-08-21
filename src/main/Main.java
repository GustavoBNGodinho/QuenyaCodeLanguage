package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;
import parser.QuenyaCodeLanguageLexer;
import parser.QuenyaCodeLanguageParser;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromPath(Paths.get("input.qn"), StandardCharsets.UTF_8);

            QuenyaCodeLanguageLexer lexer = new QuenyaCodeLanguageLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            QuenyaCodeLanguageParser parser = new QuenyaCodeLanguageParser(tokens);

            ParseTree tree = parser.program();

            Visitor visitor = new Visitor();
            String javaCode = visitor.visit(tree);

            Path outputPath = Paths.get("src/main/MainClass.java");
            Files.writeString(outputPath, javaCode);

            System.out.println("Código Java gerado com sucesso em Main.java");

        } catch (IOException e) {
            System.err.println("Erro ao ler ou escrever arquivos: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro durante compilação do código Quenya: " + e.getMessage());
        }
    }
}
