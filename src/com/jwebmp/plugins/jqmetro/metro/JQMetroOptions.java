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
package com.jwebmp.plugins.jqmetro.metro;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.base.servlets.enumarations.Orientation;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import com.jwebmp.plugins.jqmetro.metro.enumerations.JQMetroBounceDirections;
import com.jwebmp.plugins.jqmetro.metro.enumerations.JQMetroModes;
import com.jwebmp.plugins.jqmetro.metro.enumerations.JQMetroSwapOptions;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * All the options for the tooltip library
 * <p>
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 4, 2015
 */
public class JQMetroOptions<J extends JQMetroOptions<J>>
		extends JavaScriptPart<J>
{

	private static final long serialVersionUID = 1L;

	private JQMetroModes mode;
	private Integer speed;
	private Integer initDelay;
	private Integer delay;
	private Boolean startNow;
	private List<String> stops;
	private Boolean stack;
	private Orientation direction;
	private Boolean bounce;
	private List<JQMetroBounceDirections> bounceDirections;
	private Boolean bounceFollowsMove;
	private String link;
	private Boolean newWindow;
	private String animationDirection;
	private Boolean autoAniDirection;
	private Boolean ignoreDataAttributes;
	private Boolean pauseOnHover;
	private Boolean playOnHover;
	private Integer onHoverDelay;
	private Integer onHoverOutDelay;
	private Integer repeatCount;
	private Boolean appendBack;
	private Boolean alwaysTrigger;
	private Boolean flipListOnHover;
	private EventTypes flipListOnHoverEvent;
	private Double noHAflipOpacity;
	@JsonProperty("haTransFunc")
	private JQEasingEffects haTransFunc;
	private JQEasingEffects noHaTransFunc;
	private Integer currentIndex;
	private Boolean useModernizr;
	private Boolean useHardwareAccel;
	private JQMetroSwapOptions swap;
	private Boolean useTranslate;
	private JQMetroSwapOptions swapFront;
	private JQMetroSwapOptions swapBack;

	public JQMetroOptions()
	{
		setRenderEmptyBraces(true);
	}

	/**
	 * carousel
	 * slide any number of tile faces infinitely or slide to a specific tile face
	 * fade
	 * fade the front face in and out
	 * slide
	 * slide two tile faces at an arbitrary number of stopping points
	 * flip
	 * flip two tile faces in a vertical or horizontal direction
	 * flip-list
	 * trigger a list of tiles to flip between tile faces with custom delays
	 * none
	 * no animations are performed. This is useful if you just want to bind a bounce, click or link to the tile.
	 *
	 * @return
	 */
	public JQMetroModes getMode()
	{
		return mode;
	}

	/**
	 * carousel
	 * slide any number of tile faces infinitely or slide to a specific tile face
	 * fade
	 * fade the front face in and out
	 * slide
	 * slide two tile faces at an arbitrary number of stopping points
	 * flip
	 * flip two tile faces in a vertical or horizontal direction
	 * flip-list
	 * trigger a list of tiles to flip between tile faces with custom delays
	 * none
	 * no animations are performed. This is useful if you just want to bind a bounce, click or link to the tile.
	 *
	 * @param mode
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMode(JQMetroModes mode)
	{
		this.mode = mode;
		return (J) this;
	}

	/**
	 * how fast should animations be performed (in milliseconds).
	 *
	 * @return
	 */
	public Integer getSpeed()
	{
		return speed;
	}

	/**
	 * how fast should animations be performed (in milliseconds).
	 *
	 * @param speed
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSpeed(Integer speed)
	{
		this.speed = speed;
		return (J) this;
	}

	/**
	 * how long to wait before starting (in milliseconds). If the value is '-1' the delay property is used
	 * supported modes carousel,fade,flip,flip-list,slidedefault value -1options -1 = use delay, any number greater than or equal to zero is used
	 *
	 * @return
	 */
	public Integer getInitDelay()
	{
		return initDelay;
	}

	/**
	 * how long to wait before starting (in milliseconds). If the value is '-1' the delay property is used
	 * supported modes carousel,fade,flip,flip-list,slidedefault value -1options -1 = use delay, any number greater than or equal to zero is used
	 *
	 * @param initDelay
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setInitDelay(Integer initDelay)
	{
		this.initDelay = initDelay;
		return (J) this;
	}

	/**
	 * how long to wait between animations (in milliseconds).
	 * Setting the delay value to -1 will use a random delay value between 3500 and 8000 milliseconds (3.5 - 8 seconds).
	 * Setting the delay value to anything lower than -1 (e.g. -2) will call the triggerDelay method (see below) one time to get the delay value.
	 *
	 * @return
	 */
	public Integer getDelay()
	{
		return delay;
	}

	/**
	 * how long to wait between animations (in milliseconds).
	 * Setting the delay value to -1 will use a random delay value between 3500 and 8000 milliseconds (3.5 - 8 seconds).
	 * Setting the delay value to anything lower than -1 (e.g. -2) will call the triggerDelay method (see below) one time to get the delay value.
	 *
	 * @param delay
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDelay(Integer delay)
	{
		this.delay = delay;
		return (J) this;
	}

	/**
	 * should the tile immediately start or wait util play or restart has been called
	 *
	 * @return
	 */
	public Boolean getStartNow()
	{
		return startNow;
	}

	/**
	 * should the tile immediately start or wait util play or restart has been called
	 *
	 * @param startNow
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStartNow(Boolean startNow)
	{
		this.startNow = startNow;
		return (J) this;
	}

	/**
	 * How much should the front tile slide in slide mode before pausing. Setting one stop will make the tile slide between the stop value and 0. If more than one stop is set, the
	 * tile will loop through all stop values
	 * Note: If more than one stop is used, you need to set the final stop to 0px if you want the tile to return to the default position.
	 *
	 * @return
	 */
	@NotNull
	public List<String> getStops()
	{
		if (stops == null)
		{
			stops = new ArrayList<>();
		}
		return stops;
	}

	/**
	 * How much should the front tile slide in slide mode before pausing. Setting one stop will make the tile slide between the stop value and 0. If more than one stop is set, the
	 * tile will loop through all stop values
	 * Note: If more than one stop is used, you need to set the final stop to 0px if you want the tile to return to the default position.
	 *
	 * @param stops
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStops(List<String> stops)
	{
		this.stops = stops;
		return (J) this;
	}

	/**
	 * Should tiles in slide mode move synchronously as if stacked (e.g Me tile).
	 *
	 * @return
	 */
	public Boolean getStack()
	{
		return stack;
	}

	/**
	 * Should tiles in slide mode move synchronously as if stacked (e.g Me tile).
	 *
	 * @param stack
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStack(Boolean stack)
	{
		this.stack = stack;
		return (J) this;
	}

	/**
	 * The direction that tiles slide and flip.
	 *
	 * @return
	 */
	public Orientation getDirection()
	{
		return direction;
	}

	/**
	 * The direction that tiles slide and flip.
	 *
	 * @param direction
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDirection(Orientation direction)
	{
		this.direction = direction;
		return (J) this;
	}

	/**
	 * should the tile tilt or shrink when tapped. You can use bounceDirections to choose which directions a tile will tilt or shrink.
	 *
	 * @return
	 */
	public Boolean getBounce()
	{
		return bounce;
	}

	/**
	 * should the tile tilt or shrink when tapped. You can use bounceDirections to choose which directions a tile will tilt or shrink.
	 *
	 * @param bounce
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBounce(Boolean bounce)
	{
		this.bounce = bounce;
		return (J) this;
	}

	/**
	 * Controls the direction that a tile will bounce or tilt in. A click or tap must fall within the region of the option chosen unless the previous region is an '*' as in the the
	 * example below
	 * supported modes carousel, fade, flip, slide, nonedefault value 'all'options 'all', 'edges', 'corners', '*', 'c', 'tl', 'tr', 'bl'. 'br'. 't', 'l', 'b', 'r'
	 *
	 * @return
	 */
	@NotNull
	public List<JQMetroBounceDirections> getBounceDirections()
	{
		if (bounceDirections == null)
		{
			bounceDirections = new ArrayList<>();
		}
		return bounceDirections;
	}

	/**
	 * Controls the direction that a tile will bounce or tilt in. A click or tap must fall within the region of the option chosen unless the previous region is an '*' as in the the
	 * example below
	 * supported modes carousel, fade, flip, slide, nonedefault value 'all'options 'all', 'edges', 'corners', '*', 'c', 'tl', 'tr', 'bl'. 'br'. 't', 'l', 'b', 'r'
	 *
	 * @param bounceDirections
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBounceDirections(List<JQMetroBounceDirections> bounceDirections)
	{
		this.bounceDirections = bounceDirections;
		return (J) this;
	}

	/**
	 * Should the tile change the active bounce direction as the mouse or touch moves
	 *
	 * @return
	 */
	public Boolean getBounceFollowsMove()
	{
		return bounceFollowsMove;
	}

	/**
	 * Should the tile change the active bounce direction as the mouse or touch moves
	 *
	 * @param bounceFollowsMove
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBounceFollowsMove(Boolean bounceFollowsMove)
	{
		this.bounceFollowsMove = bounceFollowsMove;
		return (J) this;
	}

	/**
	 * a url to go to when clicked or tapped
	 *
	 * @return
	 */
	public String getLink()
	{
		return link;
	}

	/**
	 * a url to go to when clicked or tapped
	 *
	 * @param link
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLink(String link)
	{
		this.link = link;
		return (J) this;
	}

	/**
	 * should the link option be opened in a new window
	 *
	 * @return
	 */
	public Boolean getNewWindow()
	{
		return newWindow;
	}

	/**
	 * should the link option be opened in a new window
	 *
	 * @param newWindow
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNewWindow(Boolean newWindow)
	{
		this.newWindow = newWindow;
		return (J) this;
	}

	/**
	 * Should animations be played forward or backward
	 *
	 * @return
	 */
	public String getAnimationDirection()
	{
		return animationDirection;
	}

	/**
	 * Should animations be played forward or backward
	 *
	 * @param animationDirection
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAnimationDirection(String animationDirection)
	{
		this.animationDirection = animationDirection;
		return (J) this;
	}

	/**
	 * OTE: autoAniDirection is specific to the goto method of carousel mode.
	 * By default, whenever goto is called MetroJS will animate forward or backwards based on the index of the tile face being animated to. If autoAniDirection is false, the
	 * data-ani-direction property of that face or the default value for the tile will be used.
	 *
	 * @return
	 */
	public Boolean getAutoAniDirection()
	{
		return autoAniDirection;
	}

	/**
	 * OTE: autoAniDirection is specific to the goto method of carousel mode.
	 * By default, whenever goto is called MetroJS will animate forward or backwards based on the index of the tile face being animated to. If autoAniDirection is false, the
	 * data-ani-direction property of that face or the default value for the tile will be used.
	 *
	 * @param autoAniDirection
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAutoAniDirection(Boolean autoAniDirection)
	{
		this.autoAniDirection = autoAniDirection;
		return (J) this;
	}

	/**
	 * should data attributes be ignored
	 *
	 * @return
	 */
	public Boolean getIgnoreDataAttributes()
	{
		return ignoreDataAttributes;
	}

	/**
	 * should data attributes be ignored
	 *
	 * @param ignoreDataAttributes
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIgnoreDataAttributes(Boolean ignoreDataAttributes)
	{
		this.ignoreDataAttributes = ignoreDataAttributes;
		return (J) this;
	}

	/**
	 * should tile animations be paused on hover in and restarted on hover out
	 *
	 * @return
	 */
	public Boolean getPauseOnHover()
	{
		return pauseOnHover;
	}

	/**
	 * should tile animations be paused on hover in and restarted on hover out
	 *
	 * @param pauseOnHover
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPauseOnHover(Boolean pauseOnHover)
	{
		this.pauseOnHover = pauseOnHover;
		return (J) this;
	}

	/**
	 * should "play" be called when the tile is hovered or touched
	 *
	 * @return
	 */
	public Boolean getPlayOnHover()
	{
		return playOnHover;
	}

	/**
	 * should "play" be called when the tile is hovered or touched
	 *
	 * @param playOnHover
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPlayOnHover(Boolean playOnHover)
	{
		this.playOnHover = playOnHover;
		return (J) this;
	}

	/**
	 * a delay that occurs before playOnHover and pauseOnHover is called. Setting this to a value of 200 or greater will reduce accidental flips when a user quickly passes by a
	 * tile
	 *
	 * @return
	 */
	public Integer getOnHoverDelay()
	{
		return onHoverDelay;
	}

	/**
	 * a delay that occurs before playOnHover and pauseOnHover is called. Setting this to a value of 200 or greater will reduce accidental flips when a user quickly passes by a
	 * tile
	 *
	 * @param onHoverDelay
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOnHoverDelay(Integer onHoverDelay)
	{
		this.onHoverDelay = onHoverDelay;
		return (J) this;
	}

	/**
	 * a delay that occurs before playOnHover and pauseOnHover call their out action. The default value lets the user move their mouse or finger away and come back before flipping
	 * back. This value is added to the value speed property when used. To reduce the speed further you can use a negative value.
	 * supported modes carousel,fade,flip,flip-list,slidedefault value 200
	 *
	 * @return
	 */
	public Integer getOnHoverOutDelay()
	{
		return onHoverOutDelay;
	}

	/**
	 * a delay that occurs before playOnHover and pauseOnHover call their out action. The default value lets the user move their mouse or finger away and come back before flipping
	 * back. This value is added to the value speed property when used. To reduce the speed further you can use a negative value.
	 * supported modes carousel,fade,flip,flip-list,slidedefault value 200
	 *
	 * @param onHoverOutDelay
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOnHoverOutDelay(Integer onHoverOutDelay)
	{
		this.onHoverOutDelay = onHoverOutDelay;
		return (J) this;
	}

	/**
	 * how many times should the animation be performed. If the value is '-1' the animations will loop until stopped or paused
	 * supported modes carousel,fade,flip,flip-list,slidedefault value -1
	 *
	 * @return
	 */
	public Integer getRepeatCount()
	{
		return repeatCount;
	}

	/**
	 * how many times should the animation be performed. If the value is '-1' the animations will loop until stopped or paused
	 * supported modes carousel,fade,flip,flip-list,slidedefault value -1
	 *
	 * @param repeatCount
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRepeatCount(Integer repeatCount)
	{
		this.repeatCount = repeatCount;
		return (J) this;
	}

	/**
	 * appends the .last tile if one doesnt exist (slide and flip only)
	 * supported modes fade,flip,flip-list,slidedefault value true
	 *
	 * @return
	 */
	public Boolean getAppendBack()
	{
		return appendBack;
	}

	/**
	 * appends the .last tile if one doesnt exist (slide and flip only)
	 * supported modes fade,flip,flip-list,slidedefault value true
	 *
	 * @param appendBack
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAppendBack(Boolean appendBack)
	{
		this.appendBack = appendBack;
		return (J) this;
	}

	/**
	 * should every item in a flip list trigger every time a delay passes
	 * supported modes flip-listdefault value false
	 *
	 * @return
	 */
	public Boolean getAlwaysTrigger()
	{
		return alwaysTrigger;
	}

	/**
	 * should every item in a flip list trigger every time a delay passes
	 * supported modes flip-listdefault value false
	 *
	 * @param alwaysTrigger
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAlwaysTrigger(Boolean alwaysTrigger)
	{
		this.alwaysTrigger = alwaysTrigger;
		return (J) this;
	}

	/**
	 * should items in flip-list flip and stop when hovered
	 * supported modes flip-listdefault value false
	 *
	 * @return
	 */
	public Boolean getFlipListOnHover()
	{
		return flipListOnHover;
	}

	/**
	 * should items in flip-list flip and stop when hovered
	 * supported modes flip-listdefault value false
	 *
	 * @param flipListOnHover
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFlipListOnHover(Boolean flipListOnHover)
	{
		this.flipListOnHover = flipListOnHover;
		return (J) this;
	}

	/**
	 * The event that triggers the fli method to fire for tiles in 'flip-list' mode with 'flipListOnHover' set to true
	 * default value mouseoutoptions mouseout, mouseover, click, etc.
	 *
	 * @return
	 */
	public EventTypes getFlipListOnHoverEvent()
	{
		return flipListOnHoverEvent;
	}

	/**
	 * The event that triggers the fli method to fire for tiles in 'flip-list' mode with 'flipListOnHover' set to true
	 * default value mouseoutoptions mouseout, mouseover, click, etc.
	 *
	 * @param flipListOnHoverEvent
	 *
	 * @return
	 */

	@SuppressWarnings("unchecked")
	@NotNull
	public J setFlipListOnHoverEvent(EventTypes flipListOnHoverEvent)
	{
		this.flipListOnHoverEvent = flipListOnHoverEvent;
		return (J) this;
	}

	/**
	 * Only applies when hardware acceleration is disabled. If this value is less than 1, flip animations will animate to and from the opacity level specified when they flip
	 * supported modes flip, flip-listdefault value '1'options 0-1
	 *
	 * @return
	 */
	public Double getNoHAflipOpacity()
	{
		return noHAflipOpacity;
	}

	/**
	 * Only applies when hardware acceleration is disabled. If this value is less than 1, flip animations will animate to and from the opacity level specified when they flip
	 * supported modes flip, flip-listdefault value '1'options 0-1
	 *
	 * @param noHAflipOpacity
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNoHAflipOpacity(Double noHAflipOpacity)
	{
		this.noHAflipOpacity = noHAflipOpacity;
		return (J) this;
	}

	/**
	 * the tranisiton-timing function to use in hardware accelerated mode
	 * supported modes carousel, slide, flip, flip-listdefault value easeoptions ease | linear | ease-in | ease-out | ease-in-out...
	 *
	 * @return
	 */
	public JQEasingEffects getHaTransFunc()
	{
		return haTransFunc;
	}

	/**
	 * the tranisiton-timing function to use in hardware accelerated mode
	 * supported modes carousel, slide, flip, flip-listdefault value easeoptions ease | linear | ease-in | ease-out | ease-in-out...
	 *
	 * @param haTransFunc
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHaTransFunc(JQEasingEffects haTransFunc)
	{
		this.haTransFunc = haTransFunc;
		return (J) this;
	}

	/**
	 * the animation easing to use in non hardware accelerated mode
	 * supported modes carousel,fade,flip,flip-list,slidedefault value linearoptions swing | linear | plugins..
	 *
	 * @return
	 */
	public JQEasingEffects getNoHaTransFunc()
	{
		return noHaTransFunc;
	}

	/**
	 * the animation easing to use in non hardware accelerated mode
	 * supported modes carousel,fade,flip,flip-list,slidedefault value linearoptions swing | linear | plugins..
	 *
	 * @param noHaTransFunc
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNoHaTransFunc(JQEasingEffects noHaTransFunc)
	{
		this.noHaTransFunc = noHaTransFunc;
		return (J) this;
	}

	/**
	 * what is the current stop index for slide mode or slide index for carousel mode
	 * supported modes carousel, slidedefault value 0
	 *
	 * @return
	 */
	public Integer getCurrentIndex()
	{
		return currentIndex;
	}

	/**
	 * what is the current stop index for slide mode or slide index for carousel mode
	 * supported modes carousel, slidedefault value 0
	 *
	 * @param currentIndex
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCurrentIndex(Integer currentIndex)
	{
		this.currentIndex = currentIndex;
		return (J) this;
	}

	/**
	 * y default this checks to see if modernizer is already in use, but it can be overridden. If you're not using Modernizr, Metro JS will do its own testing internally. If you're
	 * using a custom version of Modernizr, Metro JS will need the transforms, transitions, transform3d and touch tests or you can set useModernizr to false.
	 * supported modes alldefault value (typeof (window.Modernizr) != "undefined")
	 *
	 * @return
	 */
	public Boolean getUseModernizr()
	{
		return useModernizr;
	}

	/**
	 * y default this checks to see if modernizer is already in use, but it can be overridden. If you're not using Modernizr, Metro JS will do its own testing internally. If you're
	 * using a custom version of Modernizr, Metro JS will need the transforms, transitions, transform3d and touch tests or you can set useModernizr to false.
	 * supported modes alldefault value (typeof (window.Modernizr) != "undefined")
	 *
	 * @param useModernizr
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUseModernizr(Boolean useModernizr)
	{
		this.useModernizr = useModernizr;
		return (J) this;
	}

	/**
	 * should css animations, transitions and transforms be used when available
	 * supported modes alldefault value true
	 *
	 * @return
	 */
	public Boolean getUseHardwareAccel()
	{
		return useHardwareAccel;
	}

	/**
	 * should css animations, transitions and transforms be used when available
	 * supported modes alldefault value true
	 *
	 * @param useHardwareAccel
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUseHardwareAccel(Boolean useHardwareAccel)
	{
		this.useHardwareAccel = useHardwareAccel;
		return (J) this;
	}

	/**
	 * which swap modules are active for this tile
	 * supported modes carousel,fade,flip,flip-list,slidedefault value [ ]options html, image
	 *
	 * @return
	 */
	public JQMetroSwapOptions getSwap()
	{
		return swap;
	}

	/**
	 * which swap modules are active for this tile
	 * supported modes carousel,fade,flip,flip-list,slidedefault value [ ]options html, image
	 *
	 * @param swap
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSwap(JQMetroSwapOptions swap)
	{
		this.swap = swap;
		return (J) this;
	}

	/**
	 * Should Metro JS use translate() when available rather than top/left
	 * supported modes carousel,slidedefault value true
	 *
	 * @return
	 */
	public Boolean getUseTranslate()
	{
		return useTranslate;
	}

	/**
	 * Should Metro JS use translate() when available rather than top/left
	 * supported modes carousel,slidedefault value true
	 *
	 * @param useTranslate
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUseTranslate(Boolean useTranslate)
	{
		this.useTranslate = useTranslate;
		return (J) this;
	}

	/**
	 * override the available swap modules for the front face
	 * supported modes carousel,fade,flip,flip-list,slidedefault value [ ]options html, image
	 *
	 * @return
	 */
	public JQMetroSwapOptions getSwapFront()
	{
		return swapFront;
	}

	/**
	 * override the available swap modules for the front face
	 * supported modes carousel,fade,flip,flip-list,slidedefault value [ ]options html, image
	 *
	 * @param swapFront
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSwapFront(JQMetroSwapOptions swapFront)
	{
		this.swapFront = swapFront;
		return (J) this;
	}

	/**
	 * override the available swap modules for the back face
	 * supported modes carousel,fade,flip,flip-list,slidedefault value [ ]options html, image
	 *
	 * @return
	 */
	public JQMetroSwapOptions getSwapBack()
	{
		return swapBack;
	}

	/**
	 * override the available swap modules for the back face
	 * supported modes carousel,fade,flip,flip-list,slidedefault value [ ]options html, image
	 *
	 * @param swapBack
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSwapBack(JQMetroSwapOptions swapBack)
	{
		this.swapBack = swapBack;
		return (J) this;
	}

}
