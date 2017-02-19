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
package za.co.mmagon.jwebswing.plugins.jqmetro.metro.interfaces;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.servlets.interfaces.IComponent;
import za.co.mmagon.jwebswing.base.servlets.interfaces.IFeature;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.events.interfaces.IEvent;

/**
 *
 * @author MMagon
 * @since 13 Sep 2013
 * @version 1.0
 */
public interface JQMetroChildren<A extends Enum> extends IComponent<Component, A, IFeature, IEvent>
{

}
