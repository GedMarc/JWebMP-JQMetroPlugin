package com.jwebmp.plugins.metrojs.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQMetroExclusionsModule
		implements IGuiceScanModuleExclusions<JQMetroExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.metrojs");
		return strings;
	}
}
