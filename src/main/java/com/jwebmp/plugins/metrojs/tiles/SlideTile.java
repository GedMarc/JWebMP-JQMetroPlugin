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

import com.jwebmp.core.plugins.ComponentInformation;

/**
 * @author GedMarc
 * @version 1.0
 * @since Aug 30, 2016
 */
@ComponentInformation(name = "Sliding Tile",
		description = "slide tile mode to stop at an arbitrary number of points to reveal or slide with the tile face behind it (e.g. Me tile, or the animated clouds on the projects page)",
		url = "http://www.drewgreenwell.com/projects/metrojs")
public class SlideTile
		extends Tile<SlideTileAttributes, SlideTile>
{


	public SlideTile()
	{
		//Nothing Needed
	}
}
