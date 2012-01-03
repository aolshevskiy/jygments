package jygments;

import org.python.core.PyObject;
import org.python.core.PyString;

public class HtmlFormatter extends Formatter {
	HtmlFormatter(PyObject formatter) {
		super(formatter);
	}

	public final String getStyleDefs(String selector) {
		return formatter.invoke("get_style_defs", new PyString(selector)).asString();
	}
}
