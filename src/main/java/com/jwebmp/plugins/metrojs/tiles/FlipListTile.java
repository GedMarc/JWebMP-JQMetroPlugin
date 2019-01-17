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

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.generics.HorizontalOrVertical;
import com.jwebmp.core.plugins.ComponentInformation;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author GedMarc
 * @version 1.0
 * @since Aug 30, 2016
 */
@ComponentInformation(name = "Flip List Tile",
		description = "flip-list tile mode to flip any number of tiles in sequence or at custom intervals to create mosaics and other unique content presentations (e.g. People tile or the color strip, skills tile, and the hover list on the home page)",
		url = "http://www.drewgreenwell.com/projects/metrojs")
public class FlipListTile
		extends Tile<FlipListTileAttributes, FlipListTile>
{


	private final Set<TileFace<?>> tileFaces;
	private FlipList tileList;

	private Map<TileFace<?>, HorizontalOrVertical> directions;

	/**
	 * Constructs a new FlipList tileset with the given title
	 *
	 * @param tileTitle
	 */
	public FlipListTile(String tileTitle)
	{
		this();
		TileTitle sp = new TileTitle<>().setText(tileTitle);
		add(sp);
	}

	/**
	 * Constructs a new flip list tile
	 */
	public FlipListTile()
	{
		removeClass("live-tile");
		addClass("list-tile");

		tileList = new FlipList();

		tileFaces = new LinkedHashSet<>();

		directions = new HashMap<>();
	}

	@Override
	public FlipListTile addFace(TileFace<?> newFace, String title)
	{
		tileFaces.add(newFace.addCaption(title));
		return this;
	}

	@Override
	public FlipListTile addFace(TileFace<?> newFace)
	{
		tileFaces.add(newFace);
		return this;
	}

	public FlipListTile addFace(TileFace<?> newFace, HorizontalOrVertical direction)
	{
		tileFaces.add(newFace);
		directions.put(newFace, direction);
		return this;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void preConfigure()
	{
		if (!isConfigured())
		{
			add(tileList);
			tileFaces.forEach(a ->
			                  {
				                  ListItem li = new ListItem();
				                  li.add(a);
				                  tileList.add(li);

				                  if (directions.containsKey(a))
				                  {
					                  li.addAttribute("data-direction", directions.get(a)
					                                                              .toString());
				                  }
			                  });
		}
		super.preConfigure();
	}
}
