package com.jwebmp.plugins.metrojs.tiles;

import com.jwebmp.base.html.DivSimple;
import com.jwebmp.base.html.Image;
import com.jwebmp.base.html.Paragraph;
import com.jwebmp.base.html.Span;

import javax.validation.constraints.NotNull;

public class TileFace<J extends TileFace<J>>
		extends DivSimple<J>
{
	/**
	 * Creates a new tile face for display
	 */
	public TileFace()
	{
	}

	/**
	 * Creates a new tile face with the given text for display
	 *
	 * @param text
	 */
	public TileFace(String text)
	{
		addParagraph(text);
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J addParagraph(String text)
	{
		Paragraph p = new Paragraph(text);
		add(p);
		return (J) this;
	}

	/**
	 * Adds an image to the given component
	 *
	 * @param imageUrl
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J addImage(String imageUrl)
	{
		Image i = new Image(imageUrl);
		i.addClass("full");
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J addCaption(String caption)
	{
		Span span = new Span(caption);
		span.addClass("tile-title");
		span.addStyle("padding-left:10px;");
		span.addStyle("padding-right:10px;");
		span.addStyle("padding-bottom:5px;");
		add(span);
		return (J) this;
	}
}
