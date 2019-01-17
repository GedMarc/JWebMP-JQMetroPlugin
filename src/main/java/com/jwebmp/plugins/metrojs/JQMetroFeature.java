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

import com.jwebmp.core.Feature;

import static com.jwebmp.plugins.metrojs.JQMetroPageConfigurator.*;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQMetroFeature
		extends Feature<JQMetroFeature, JQMetroOptions, JQMetroFeature>
{


	private JQMetroOptions options;
	private boolean rebind;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQMetroFeature(JQMetroTiles forComponent)
	{
		super("JQMetroFeature");
		setComponent(forComponent);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQMetroOptions getOptions()
	{
		if (options == null)
		{
			options = new JQMetroOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = "$('.live-tile').not('." + METRO_TILES_STATIC_EXCLUDE + "').liveTile(" + (rebind ? "'rebind'," : "");
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}

	public boolean isRebind()
	{
		return rebind;
	}

	public void setRebind(boolean rebind)
	{
		this.rebind = rebind;
	}
}
