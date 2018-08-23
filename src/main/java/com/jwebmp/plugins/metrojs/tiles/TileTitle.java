package com.jwebmp.plugins.metrojs.tiles;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.metrojs.interfaces.JQMetroTileChildren;

public class TileTitle<J extends TileTitle<J, A>, A extends Enum & AttributeDefinitions>
		extends Span<IComponentHierarchyBase, A, J>
		implements JQMetroTileChildren<IComponentHierarchyBase, J>
{
	public TileTitle()
	{
		addClass("tile-title");
	}
}
