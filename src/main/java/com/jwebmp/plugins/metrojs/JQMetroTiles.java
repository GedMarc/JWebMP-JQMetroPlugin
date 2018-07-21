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

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.metrojs.enumerations.TileAccentThemes;
import com.jwebmp.plugins.metrojs.enumerations.TileCount;
import com.jwebmp.plugins.metrojs.interfaces.JQMetroChildren;
import com.jwebmp.plugins.metrojs.interfaces.JQMetroEvents;
import com.jwebmp.plugins.metrojs.interfaces.JQMetroFeatures;
import com.jwebmp.plugins.metrojs.tiles.Tile;

import javax.validation.constraints.NotNull;

/**
 * The implementation of JQuery Metro JS http://www.drewgreenwell.com/projects/metrojs
 * <p>
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Metro Tiles",
		description = "All tile modes support swapping content with images or html at random or sequentially from an array",
		url = "http://www.drewgreenwell.com/projects/metrojs")
public class JQMetroTiles<J extends JQMetroTiles<J>>
		extends Div<JQMetroChildren, JQMetroAttributes, JQMetroFeatures, JQMetroEvents, J>
{

	private static final long serialVersionUID = 1L;

	private JQMetroFeature feature;

	/**
	 * Constructs a default tile group of blue and four
	 */
	public JQMetroTiles()
	{
		this(TileAccentThemes.Blue, TileCount.four);
	}

	/**
	 * Construct a new tile group with themes and tile counts
	 *
	 * @param theme
	 * 		The theme
	 * @param tileCount
	 * 		The tile count
	 */
	public JQMetroTiles(TileAccentThemes theme, TileCount tileCount)
	{
		addClass("tiles");
		addClass("tile-group");

		setTheme(theme);
		setTileCount(tileCount);

		addFeature(getFeature());
	}

	/**
	 * Sets the current tile accent theme
	 *
	 * @param theme
	 */
	public final void setTheme(TileAccentThemes theme)
	{
		removeExistingThemes();
		addClass(theme.toString());
	}

	/**
	 * Sets the current tile count
	 *
	 * @param theme
	 */
	public final void setTileCount(TileCount theme)
	{
		removeExistingTileCounts();
		addClass(theme.toString());
	}

	/**
	 * Returns the Metro JQuery Feature
	 *
	 * @return
	 */
	@NotNull
	protected final JQMetroFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQMetroFeature(this);
		}
		return feature;
	}

	/**
	 * Removes any applied colour themes
	 */
	private void removeExistingThemes()
	{
		for (TileAccentThemes theme : TileAccentThemes.values())
		{
			removeClass(theme.toString());
		}
	}

	/**
	 * Remove existing tiles
	 */
	private void removeExistingTileCounts()
	{
		for (TileCount tileCount : TileCount.values())
		{
			removeClass(tileCount.toString());
		}
	}

	/**
	 * Adds a tile to this metro tile group
	 *
	 * @param tile
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J addTile(Tile<?, ?> tile)
	{
		add(tile);
		return (J) this;
	}

	/**
	 * Returns the options
	 *
	 * @return
	 */
	@Override
	public JQMetroOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
