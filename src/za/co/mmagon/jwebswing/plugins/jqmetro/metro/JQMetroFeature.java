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
package za.co.mmagon.jwebswing.plugins.jqmetro.metro;

import com.fasterxml.jackson.annotation.JsonIgnore;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQMetroFeature extends Feature<JQMetroOptions, JQMetroFeature> implements JQMetroFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private final JQMetroTiles forComponent;
	private JQMetroOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQMetroFeature(JQMetroTiles forComponent)
	{
		super("JQMetroFeature");
		this.forComponent = forComponent;
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
		String requiredString = "$('.live-tile').liveTile('rebind'";
		String queryOptions = getOptions().toString();
		if (!queryOptions.isEmpty())
		{
			requiredString += getOptions().toString();
		}
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQMetroFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQMetroFeature that = (JQMetroFeature) o;

		if (forComponent != null ? !forComponent.equals(that.forComponent) : that.forComponent != null)
		{
			return false;
		}
		return getOptions() != null ? getOptions().equals(that.getOptions()) : that.getOptions() == null;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
