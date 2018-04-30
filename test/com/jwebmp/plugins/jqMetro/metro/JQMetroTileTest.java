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
package com.jwebmp.plugins.jqMetro.metro;

import com.jwebmp.Page;
import com.jwebmp.generics.HorizontalOrVertical;
import com.jwebmp.plugins.jqmetro.metro.JQMetroTiles;
import com.jwebmp.plugins.jqmetro.metro.enumerations.TileAccentThemes;
import com.jwebmp.plugins.jqmetro.metro.references.JQMetroJavascriptReference;
import com.jwebmp.plugins.jqmetro.metro.tiles.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author GedMarc
 */
public class JQMetroTileTest

{

	public JQMetroTileTest()
	{

	}

	@Test
	public void testJS()
	{
		Page p = new Page();
		JQMetroTiles instance = new JQMetroTiles();
		instance.setID("id");
		instance.setTheme(TileAccentThemes.Cobalt);
		System.out.println(instance.renderJavascript());
	}

	/**
	 * Test of getFeature method, of class JQMetroTiles.
	 */
	@Test
	public void testGroup()
	{
		Page p = new Page();
		JQMetroTiles instance = new JQMetroTiles();
		instance.setID("id");
		instance.setTheme(TileAccentThemes.Cobalt);
		System.out.println(instance.toString(true));
		String expResult = "<div class=\"tiles tile-group four-wide cobalt\" id=\"id\"></div>";
		String result = instance.toString(true);
		assertEquals(expResult, result);
	}

	@Test
	public void testJavascriptLinks()
	{
		Page p = new Page();
		JQMetroTiles instance = new JQMetroTiles();
		instance.setID("id");
		instance.setTheme(TileAccentThemes.Cobalt);
		System.out.println(instance.getJavascriptReferencesAll());
		String expResult = "[bower_components/metrojs/release/MetroJs.Full/MetroJs.min.js]";
		String result = "[" + new JQMetroJavascriptReference().getLocalReference() + "]";
		assertEquals(expResult, result);
	}

	@Test
	public void testSlideTile()
	{
		Page p = new Page();
		JQMetroTiles instance = new JQMetroTiles();
		instance.setID("id");
		instance.setTheme(TileAccentThemes.Cobalt);

		instance.addTile(new SlideTile().addFace(new TileFace<>("Face1"), "Title 1")
		                                .addFace(new TileFace("Face2"), "Title 2"));

		System.out.println(instance.toString(0));
	}

	@Test
	public void testFlipTile()
	{
		Page p = new Page();
		JQMetroTiles instance = new JQMetroTiles();
		instance.setID("id");
		instance.setTheme(TileAccentThemes.Cobalt);

		instance.addTile(new FlipTile().addFace(new TileFace("Face1").addImage("imageUrl1"), "Title 1")
		                               .addFace(new TileFace("Face2"), "Title 2"));

		System.out.println("\n" + instance.toString(0));
	}

	@Test
	public void testCarousel()
	{
		Page p = new Page();
		JQMetroTiles instance = new JQMetroTiles();
		instance.setID("id");
		instance.setTheme(TileAccentThemes.Cobalt);

		instance.addTile(new CarouselTiles().addFace(new TileFace("Face1").addImage("imageUrl1"), "Title 1")
		                                    .addFace(new TileFace("Face2"), "Title 2")
		                                    .addFace(new TileFace("Face3"), "Title 3")
		                                    .addFace(new TileFace("Face4"), "Title 4"));

		System.out.println("\n" + instance.toString(0));
	}

	@Test
	public void testFlipListTile()
	{
		Page p = new Page();
		JQMetroTiles instance = new JQMetroTiles();
		instance.setID("id");
		instance.setTheme(TileAccentThemes.Cobalt);

		instance.addTile(new FlipListTile("Tile Title").addFace(new TileFace("Face1").addImage("imageUrl1"))
		                                               .addFace(new TileFace("Face2"))
		                                               .addFace(new TileFace("Face3"))
		                                               .addFace(new TileFace("Face4"), HorizontalOrVertical.Horizontal));

		System.out.println("\n" + instance.toString(0));
	}


}
