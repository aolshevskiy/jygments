package jygments.action;

import jygments.HtmlFormatter;
import jygments.Jygments;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

import java.util.HashMap;
import java.util.Map;

public class Index extends Base {
	private final String content;
	private final String styleDefs;
	public Index() {
		Jygments jygments = new Jygments();
		HtmlFormatter formatter = jygments.newHtmlFormatter("nobackground=True");
		this.styleDefs = formatter.getStyleDefs(".highlight");
		this.content = jygments.highlight("<?php\nphpinfo();", jygments.newLexer("php"), formatter);
	}
	public String getContent() {return content;}
	public String getStyleDefs() {return styleDefs;}
	@DefaultHandler
	public Resolution index() {		
		return new ForwardResolution("/WEB-INF/index.jsp");
	}
}
