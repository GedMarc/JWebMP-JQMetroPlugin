package com.jwebmp.plugins.metrojs.tiles;

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.children.ListChildren;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.metrojs.interfaces.JQMetroTileChildren;

public class FlipList
		extends List<ListChildren, NoAttributes, GlobalEvents,FlipList>
		implements JQMetroTileChildren
{
	public FlipList()
	{
		super(false);
		addClass("flip-list");
		addAttribute("data-mode", "flip-list");
	}
}
