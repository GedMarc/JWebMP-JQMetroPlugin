package com.jwebmp.plugins.metrojs.tiles;

import com.jwebmp.core.base.html.List;
import com.jwebmp.plugins.metrojs.interfaces.JQMetroTileChildren;

public class FlipList
		extends List
		implements JQMetroTileChildren
{
	public FlipList()
	{
		super(false);
		addClass("flip-list");
		addAttribute("data-mode", "flip-list");
	}
}
