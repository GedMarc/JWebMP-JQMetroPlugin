module com.jwebmp.plugins.metrojs {
	exports com.jwebmp.plugins.metrojs;
	exports com.jwebmp.plugins.metrojs.enumerations;
	exports com.jwebmp.plugins.metrojs.interfaces;
	exports com.jwebmp.plugins.metrojs.references;
	exports com.jwebmp.plugins.metrojs.tiles;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.easingeffects;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.metrojs.JQMetroPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.metrojs.implementations.JQMetroExclusionsModule;

	opens com.jwebmp.plugins.metrojs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.metrojs.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.metrojs.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.metrojs.references to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.metrojs.tiles to com.fasterxml.jackson.databind, com.jwebmp.core;
}
