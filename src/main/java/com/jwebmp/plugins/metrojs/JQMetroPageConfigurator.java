/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.metrojs;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.metrojs.references.JQMetroCSSReference;
import com.jwebmp.plugins.metrojs.references.JQMetroJavascriptReference;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
@PluginInformation(pluginName = "MetroJS",
		pluginUniqueName = "metro-js",
		pluginDescription = "Metro JS is a JavaScript plugin for jQuery developed to easily enable Metro interfaces on the web. This release focuses on Live Tiles, the Application Bar and Theming. It's early in the development phase, but all features should work on at least IE7+(Win/WinPhone), Firefox, Chrome, Android, Opera, and Safari(OSX/iOS).",
		pluginVersion = "0.9.77",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "tiles, icons,themes,fliptiles",
		pluginSubtitle = "Want to make a 'Me' tile or a 'People' tile like you see on Windows Phone for your website? Metro JS makes it easy!",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-JQMetroPlugin",
		pluginSourceUrl = "http://www.drewgreenwell.com/projects/metrojs/theme-generator",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-JQMetroPlugin/wiki",
		pluginOriginalHomepage = "http://www.drewgreenwell.com/projects/metrojs",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/jwebmp-metro-tiles",
		pluginGroupId = "com.jwebmp.plugins.jquery",
		pluginArtifactId = "jwebmp-metro-tiles",
		pluginModuleName = "com.jwebmp.plugins.metrojs",
		pluginStatus = PluginStatus.Released
)
public class JQMetroPageConfigurator
		implements IPageConfigurator<JQMetroPageConfigurator>
{
	public static final String METRO_TILES_STATIC_EXCLUDE = "static_tile_exclusions";
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * A new instance of the page configurator
	 */
	public JQMetroPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return JQMetroPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQMetroPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .getJavascriptReferences()
			    .add(new JQMetroJavascriptReference());
			page.getBody()
			    .getCssReferences()
			    .add(new JQMetroCSSReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQMetroPageConfigurator.enabled;
	}
}
