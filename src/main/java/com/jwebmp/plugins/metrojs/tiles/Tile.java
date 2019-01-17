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
package com.jwebmp.plugins.metrojs.tiles;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.metrojs.enumerations.JQMetroModes;
import com.jwebmp.plugins.metrojs.enumerations.TileAccentThemes;
import com.jwebmp.plugins.metrojs.enumerations.TileCount;
import com.jwebmp.plugins.metrojs.enumerations.TileProportions;
import com.jwebmp.plugins.metrojs.interfaces.JQMetroChildren;
import com.jwebmp.plugins.metrojs.interfaces.JQMetroTileAttributes;
import com.jwebmp.plugins.metrojs.interfaces.JQMetroTileChildren;

import javax.validation.constraints.NotNull;

/**
 * A Tile
 * <p>
 *
 * @param <A>
 * 		A valid set of attributes for a metro JS tile
 * @param <J>
 *
 * @author MMagon
 * @version 1.0
 * @since 13 Sep 2013
 */
public abstract class Tile<A extends Enum & JQMetroTileAttributes & AttributeDefinitions, J extends Tile<A, J>>
		extends Div<JQMetroTileChildren, A, GlobalFeatures, GlobalEvents, J>
		implements JQMetroChildren<JQMetroTileChildren, J>, IMetroTile<J>
{


	private static final String TitleTitleClassName = "tile-title";

	/**
	 * The tile proportion - tall or half
	 */
	private TileProportions tileProportion;

	/**
	 * Denotes a live tile
	 */
	public Tile()
	{
		addClass("live-tile");
	}

	/**
	 * Sets the new tiles proportion
	 *
	 * @param tileProportion
	 */
	public Tile(TileProportions tileProportion)
	{
		this.tileProportion = tileProportion;
		addClass("live-tile");
	}

	/**
	 * Returns this tiles configurable properties
	 *
	 * @return
	 */
	public IMetroTile asTile()
	{
		return this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J addFace(TileFace<?> newFace, String title)
	{
		getChildren().add(newFace);
		newFace.addCaption(title);
		return (J) this;
	}

	/**
	 * Sets the tile proportion
	 *
	 * @return
	 */
	@Override
	public TileProportions getTileProportion()
	{
		return tileProportion;
	}

	/**
	 * Returns the tile proportion
	 *
	 * @param tileProportion
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setTileProportion(TileProportions tileProportion)
	{
		removeClass("half" + this.tileProportion + "");
		removeClass("");
		this.tileProportion = tileProportion;
		addClass(tileProportion == null ? "" : "half" + tileProportion + "");
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J addFace(TileFace<?> newFace)
	{
		getChildren().add(newFace);
		return (J) this;
	}

	@Override
	public void removeFace(TileFace<?> oldFace)
	{
		getChildren().remove(oldFace);
	}

	/**
	 * Sets the current tile accent theme
	 *
	 * @param theme
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setTheme(TileAccentThemes theme)
	{
		removeExistingThemes();
		addClass(theme.toString());
		return (J) this;
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
	 * Sets the current tile count
	 *
	 * @param theme
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setTileCount(TileCount theme)
	{
		removeExistingTileCounts();
		addClass(theme.toString());
		return (J) this;
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
	 * Sets the mode of this tile
	 *
	 * @param mode
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMode(JQMetroModes mode)
	{
		addAttribute("data-mode", mode.toString());
		return (J) this;
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
}
