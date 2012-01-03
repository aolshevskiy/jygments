package jygments;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class Lexer {
	private final PyObject lexer;
	Lexer(PyObject lexer) {
		this.lexer = lexer;
	}
	PyObject getLexer() {return lexer;}
}
