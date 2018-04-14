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
package com.jwebmp.plugins.jqmetro.metro.tiles;

import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.Span;
import com.jwebmp.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.base.html.interfaces.GlobalFeatures;
import com.jwebmp.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.jqmetro.metro.JQMetroChildren;
import com.jwebmp.plugins.jqmetro.metro.enumerations.TileAccentThemes;
import com.jwebmp.plugins.jqmetro.metro.enumerations.TileCount;
import com.jwebmp.plugins.jqmetro.metro.enumerations.TileProportions;
import com.jwebmp.plugins.jqmetro.metro.interfaces.JQMetroTileAttributes;
import com.jwebmp.plugins.jqmetro.metro.interfaces.JQMetroTileChildren;

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
		implements JQMetroChildren, IMetroTile<J>
{

	private static final long serialVersionUID = 1L;
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

	/**
	 * Adds a new tile face
	 *
	 * @param <T>
	 * 		Any Div
	 * @param newFace
	 * 		The new face to add
	 * @param title
	 *
	 * @return The input div
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T extends Div> J addFace(T newFace, String title)
	{
		getChildren().add(newFace);
		Span titleDiv = new Span();
		titleDiv.addClass(TitleTitleClassName);
		titleDiv.add(title);
		newFace.add(titleDiv);
		return (J) this;
	}

	/**
	 * Adds a new tile face
	 *
	 * @param <T>
	 * 		Any Div
	 * @param newFace
	 * 		The new face to add
	 * @param title
	 *
	 * @return The input div
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T extends Div> J addFace(T newFace, ComponentHierarchyBase title)
	{
		getChildren().add(newFace);
		title.addClass(TitleTitleClassName);
		newFace.add(title);
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

	/**
	 * Removes the face from the collection
	 *
	 * @param <T>
	 * 		The face to remove
	 * @param oldFace
	 * 		The old face
	 */
	@Override
	public <T extends Div> void removeFace(T oldFace)
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

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof Tile))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		Tile<?, ?> tile = (Tile<?, ?>) o;

		return getTileProportion() == tile.getTileProportion();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		return result;
	}
}