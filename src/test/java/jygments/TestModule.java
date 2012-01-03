package jygments;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;
import net.sourceforge.stripes.controller.DispatcherServlet;
import net.sourceforge.stripes.controller.StripesFilter;

import java.util.HashMap;
import java.util.Map;

class TestModule extends ServletModule {
	@Override
	protected void configureServlets() {
		bind(StripesFilter.class).in(Singleton.class);
		bind(DispatcherServlet.class).in(Singleton.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("ActionResolver.Packages", "jygments");
		filter("*.action").through(StripesFilter.class, params);
		serve("*.action").with(DispatcherServlet.class);
	}
}
