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
package za.co.mmagon.jwebswing.plugins.jqmetro.metro.tiles;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.enumerations.TileAccentThemes;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.enumerations.TileCount;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.enumerations.TileProportions;

/**
 * @author GedMarc
 * @since Sep 26, 2016
 */
public interface IMetroTile<J>
{
	/**
	 * Adds a new tile face
	 *
	 * @param <T>     Any Div
	 * @param newFace The new face to add
	 * @param title   The title of the tile
	 *
	 * @return The input div
	 */
	<T extends Div> J addFace(T newFace, String title);

	/**
	 * Adds a new tile face
	 *
	 * @param <T>     Any Div
	 * @param newFace The new face to add
	 * @param title   The title of the tile
	 *
	 * @return The input div
	 */
	<T extends Div> J addFace(T newFace, ComponentHierarchyBase title);

	/**
	 * Sets the tile proportion
	 *
	 * @return
	 */
	TileProportions getTileProportion();

	/**
	 * Removes the face from the collection
	 *
	 * @param <T>     The face to remove
	 * @param oldFace The old face
	 */
	<T extends Div> void removeFace(T oldFace);

	/**
	 * Sets the current tile accent theme
	 *
	 * @param theme
	 */
	J setTheme(TileAccentThemes theme);

	/**
	 * Sets the current tile count
	 *
	 * @param theme
	 */
	J setTileCount(TileCount theme);

	/**
	 * Returns the tile proportion
	 *
	 * @param tileProportion
	 */
	J setTileProportion(TileProportions tileProportion);
}
