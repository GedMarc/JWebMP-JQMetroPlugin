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
package com.jwebmp.plugins.metrojs.tiles;

import com.jwebmp.plugins.ComponentInformation;

/**
 * A JQMetro Fade Tile. Configure with attributes
 *
 * @author GedMarc
 * @version 1.0
 * @since Aug 30, 2016
 */
@ComponentInformation(name = "Fading Tile",
		description = "slide tile mode to stop at an arbitrary number of points to reveal or slide with the tile face behind it (e.g. Me tile, or the animated clouds on the projects page)",
		url = "http://www.drewgreenwell.com/projects/metrojs")
public class CarouselTiles
		extends Tile<CarouselTileAttributes, CarouselTiles>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new fade tile
	 */
	public CarouselTiles()
	{
		addAttribute(CarouselTileAttributes.mode, "carousel");
		addAttribute("data-direction", "horizontal");
	}
}
