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
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.interfaces.AttributeDefinitions;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.JQMetroChildren;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.enumerations.TileAccentThemes;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.enumerations.TileCount;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.enumerations.TileProportions;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.interfaces.JQMetroTileAttributes;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.interfaces.JQMetroTileChildren;
import za.co.mmagon.jwebswing.plugins.jqmetro.metro.tiles.IMetroTile;

/**
 * A Tile
 * <p>
 * @author MMagon
 * @param <A> A valid set of attributes for a metro JS tile
 * @since 13 Sep 2013
 * @version 1.0
 */
public abstract class Tile<A extends Enum & JQMetroTileAttributes & AttributeDefinitions>
        extends Div<JQMetroTileChildren, A, GlobalFeatures, GlobalEvents, Tile> implements JQMetroChildren, IMetroTile
{

    private static final long serialVersionUID = 1L;

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
    public void setTileProportion(TileProportions tileProportion)
    {
        removeClass("half" + this.tileProportion + "");
        removeClass("");
        this.tileProportion = tileProportion;
        addClass(tileProportion == null ? "" : "half" + tileProportion + "");
    }

    /**
     * Returns the tile title
     *
     * @return
     */
    /*@Override
    public Div getTileTitle()
    {
        return tileTitle;
    }*/
    /**
     * Sets the tile title
     *
     * @param tileTitle
     */
    /*@Override
    public void setTileTitle(Div tileTitle)
    {
        if(this.tileTitle != null)
        {
            remove(this.tileTitle);
        }
        this.tileTitle = tileTitle;

        if(tileTitle != null)
        {
            tileTitle.addClass("tile-title");
            //add(this.tileTitle);
        }
    }*/
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
     * Sets the current tile accent theme
     *
     * @param theme
     */
    @Override
    public void setTheme(TileAccentThemes theme)
    {
        removeExistingThemes();
        addClass(theme.toString());
    }

    /**
     * Sets the current tile count
     *
     * @param theme
     */
    @Override
    public void setTileCount(TileCount theme)
    {
        removeExistingTileCounts();
        addClass(theme.toString());
    }

    /**
     * Adds a new tile face
     *
     * @param <T> Any Div
     * @param newFace The new face to add
     * @param title
     * @return The input div
     */
    @Override
    public <T extends Div> T addFace(T newFace, String title)
    {
        getChildren().add(newFace);
        Span titleDiv = new Span();
        titleDiv.addClass("tile-title");
        titleDiv.add(title);
        newFace.add(titleDiv);
        return newFace;
    }

    /**
     * Adds a new tile face
     *
     * @param <T> Any Div
     * @param newFace The new face to add
     * @param title
     * @return The input div
     */
    @Override
    public <T extends Div> T addFace(T newFace, ComponentHierarchyBase title)
    {
        getChildren().add(newFace);
        title.addClass("tile-title");
        newFace.add(title);
        return newFace;
    }

    /**
     * Adds a new tile face
     *
     * @param <T> Any Div
     * @param position The position in the array
     * @param newFace The new face to add
     * @return The input div
     */
    @Override
    public <T extends Div> T addFace(int position, T newFace, ComponentHierarchyBase title)
    {
        getChildren().add(position, newFace);
        title.addClass("tile-title");
        newFace.add(title);
        return newFace;
    }

    /**
     * Adds a new tile face
     *
     * @param <T> Any Div
     * @param newFace The new face to add
     * @param title
     * @param position
     * @return The input div
     */
    @Override
    public <T extends Div> T addFace(int position, T newFace, String title)
    {
        getChildren().add(position, newFace);
        Span titleDiv = new Span();
        titleDiv.addClass("tile-title");
        titleDiv.add(title);
        newFace.add(titleDiv);
        return newFace;
    }

    /**
     * Removes the face from the collection
     *
     * @param <T> The face to remove
     * @param oldFace The old face
     */
    @Override
    public <T extends Div> void removeFace(T oldFace)
    {
        getChildren().remove(oldFace);
    }
}
