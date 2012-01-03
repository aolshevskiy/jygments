package jygments;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

abstract public class Formatter {
	protected final PyObject formatter;
	Formatter(PyObject formatter) {
		this.formatter = formatter;
	}
	final PyObject getFormatter() {
		return formatter;
	}
}
