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
package com.jwebmp.plugins.metrojs.references;

import com.jwebmp.core.base.references.CSSReference;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 2, 2015
 */
public class JQMetroCSSReference
		extends CSSReference
{

	/**
	 *
	 */
	public JQMetroCSSReference()
	{
		super("JWMetroCSSReference", 1.0, "bower_components/metrojs/release/MetroJs.Full/MetroJs.min.css");
	}
}
