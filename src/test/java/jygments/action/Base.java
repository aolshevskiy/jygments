package jygments.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

abstract class Base implements ActionBean {
	private ActionBeanContext ctx;
	@Override
	public void setContext(ActionBeanContext ctx) { this.ctx = ctx; }
	@Override
	public ActionBeanContext getContext() { return ctx; }
}
