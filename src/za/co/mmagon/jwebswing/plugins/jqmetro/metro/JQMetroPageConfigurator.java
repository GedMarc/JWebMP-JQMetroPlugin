/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.jqmetro.metro;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 * @since 26 Feb 2017
 *
 */
@PluginInformation(pluginName = "MetroJS", pluginUniqueName = "metro-js",
        pluginDescription = "Metro JS is a JavaScript plugin for jQuery developed to easily enable Metro interfaces on the web. This release focuses on Live Tiles, the Application Bar and Theming. It's early in the development phase, but all features should work on at least IE7+(Win/WinPhone), Firefox, Chrome, Android, Opera, and Safari(OSX/iOS).",
        pluginVersion = "1.0.0",
        pluginDependancyUniqueIDs = "", pluginCategories = "fonts, icons",
        pluginSubtitle = "Want to make a 'Me' tile or a 'People' tile like you see on Windows Phone for your website? Metro JS makes it easy!",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQMetroPlugin",
        pluginSourceUrl = "",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQMetroPlugin/wiki",
        pluginOriginalHomepage = "http://www.drewgreenwell.com/projects/metrojs")
public class JQMetroPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    /**
     * A new instance of the page configurator
     */
    public JQMetroPageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {

        }
        return page;
    }
}
