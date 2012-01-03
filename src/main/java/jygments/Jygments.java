package jygments;

import org.python.core.*;
import org.python.util.PythonInterpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Jygments {
	private final PythonInterpreter i = new PythonInterpreter();
	{
		i.exec("import sys");
		i.exec("sys.path.append('__pyclasspath__/Lib')");
		i.exec("from pygments import highlight");
		i.exec("from pygments.lexers import get_lexer_by_name");
		i.exec("from pygments.formatters import HtmlFormatter");
	}
	public Lexer newLexer(String name) {
		return new Lexer(i.get("get_lexer_by_name").__call__(new PyString(name)));
	}
	public HtmlFormatter newHtmlFormatter(String params) {				
		return new HtmlFormatter(i.eval("HtmlFormatter("+params+")"));
	}
	
	public String highlight(String code, Lexer lexer, Formatter formatter) {
		PyFunction f = i.get("highlight", PyFunction.class);
		return f.__call__(new PyString(code), lexer.getLexer(), formatter.getFormatter()).asString();
	}
	
}
