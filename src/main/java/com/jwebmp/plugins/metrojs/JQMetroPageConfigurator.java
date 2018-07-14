/*
 * Copyright (C) 2017 Marc Magon
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

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.plugins.PluginInformation;
import com.jwebmp.plugins.metrojs.references.JQMetroCSSReference;
import com.jwebmp.plugins.metrojs.references.JQMetroJavascriptReference;

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
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQMetroPlugin",
		pluginSourceUrl = "http://www.drewgreenwell.com/projects/metrojs/theme-generator",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQMetroPlugin/wiki",
		pluginOriginalHomepage = "http://www.drewgreenwell.com/projects/metrojs",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQMetroPlugin.jar/download")
public class JQMetroPageConfigurator
		extends PageConfigurator
{

	public static final String METRO_TILES_STATIC_EXCLUDE = "static_tile_exclusions";
	private static final long serialVersionUID = 1L;

	/**
	 * A new instance of the page configurator
	 */
	public JQMetroPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page<?> page)
	{
		if (!page.isConfigured())
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
}
