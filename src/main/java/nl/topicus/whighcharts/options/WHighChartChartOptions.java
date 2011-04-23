package nl.topicus.whighcharts.options;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartChartOptions
{
	/**
	 * When using multiple axis, the ticks of two or more opposite axes will automatically
	 * be aligned by adding ticks to the axis or axes with the least ticks. This can be
	 * prevented by setting alignTicks to false. If the grid lines look messy, it's a good
	 * idea to hide them for the secondary axis by setting gridLineWidth to 0. Defaults to
	 * true.
	 */
	private Boolean alignTicks;

	/**
	 * Set the overall animation for all chart updating. Animation can be disabled
	 * throughout the chart by setting it to false here. It can be overridden for each
	 * individual API method as a function parameter. The only animation not affected by
	 * this option is the initial series animation, see plotOptions.series => animation. <br/>
	 * <br/>
	 * The animation can either be set as a boolean or a configuration object. If true, it
	 * will use the 'swing' jQuery easing and a duration of 500 ms. If used as a
	 * configuration object, the following properties are supported: <br/>
	 * <br/>
	 * <b>duration</b> - The duration of the animation in milliseconds.<br/>
	 * <b>easing</b> - When using jQuery as the general framework, the easing can be set
	 * to linear or swing. More easing functions are available with the use of jQuery
	 * plug-ins, most notably the jQuery UI suite. See the jQuery docs. When using
	 * MooTools as the general framework, use the property name transition instead of
	 * easing.
	 */
	private Boolean animation;

	/**
	 * The background color or gradient for the outer chart area. Defaults to "#FFFFFF".
	 */
	private String backgroundColor;

	/**
	 * The color of the outer chart border. The border is painted using vector graphic
	 * techniques to allow rounded corners. Defaults to "#4572A7".
	 */
	private String borderColor;

	/**
	 * The corner radius of the outer chart border. Defaults to 5.
	 */
	private Double borderRadius;

	/**
	 * The pixel width of the outer chart border. The border is painted using vector
	 * graphic techniques to allow rounded corners. Defaults to 0.
	 */
	private Double borderWidth;

	/**
	 * A CSS class name to apply to the charts container div, allowing unique CSS styling
	 * for each chart. Defaults to "".
	 */
	private String className;

	/**
	 * Event listeners for chart events.
	 */
	private WHighChartChartEventsOptions events;

	/**
	 * An explicit height for the chart. By default the height is calculated from the
	 * offset height of the containing element. Defaults to null.
	 */
	private Double height;

	/**
	 * If true, the axes will scale to the remaining visible series once one series is
	 * hidden. If false, hiding and showing a series will not affect the axes or the other
	 * series. For stacks, once one series within the stack is hidden, the rest of the
	 * stack will close in around it even if the axis is not affected. Defaults to true.
	 */
	private Boolean ignoreHiddenSeries;

	/**
	 * Whether to invert the axes so that the x axis is horizontal and y axis is vertical.
	 * When true, the x axis is reversed by default. If a bar plot is present in the
	 * chart, it will be inverted automatically. Defaults to false.
	 */
	private Boolean inverted;

	/**
	 * The margin between the outer edge of the chart and the plot area. The numbers in
	 * the array designate top, right, bottom and left respectively. Use the options
	 * marginTop, marginRight, marginBottom and marginLeft for shorthand setting of one
	 * option. <br/>
	 * <br/>
	 * Since version 2.1, the margin is 0 by default. The actual space is dynamically
	 * calculated from the offset of axis labels, axis title, title, subtitle and legend
	 * in addition to the spacingTop, spacingRight, spacingBottom and spacingLeft options.
	 */
	private Double[] margin;

	/**
	 * The margin between the top outer edge of the chart and the plot area. Use this to
	 * set a fixed pixel value for the margin as opposed to the default dynamic margin.
	 * See also spacingTop. Defaults to null.
	 */
	private Double marginTop;

	/**
	 * The margin between the right outer edge of the chart and the plot area. Use this to
	 * set a fixed pixel value for the margin as opposed to the default dynamic margin.
	 * See also spacingRight. Defaults to 50.
	 */
	private Double marginRight;

	/**
	 * The margin between the bottom outer edge of the chart and the plot area. Use this
	 * to set a fixed pixel value for the margin as opposed to the default dynamic margin.
	 * See also spacingBottom. Defaults to 70.
	 */
	private Double marginBottom;

	/**
	 * The margin between the left outer edge of the chart and the plot area. Use this to
	 * set a fixed pixel value for the margin as opposed to the default dynamic margin.
	 * See also spacingLeft. Defaults to 80.
	 */
	private Double marginLeft;

	/**
	 * The background color or gradient for the plot area. Defaults to null.
	 */
	private String plotBackgroundColor;

	/**
	 * The URL for an image to use as the plot background. To set an image as the
	 * background for the entire chart, set a CSS background image to the container
	 * element. Defaults to null.
	 */
	private String plotBackgroundImage;

	/**
	 * The color of the inner chart or plot area border. Defaults to "#C0C0C0".
	 */
	private String plotBorderColor;

	/**
	 * The pixel width of the plot area border. Defaults to 0.
	 */
	private Double plotBorderWidth;

	/**
	 * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor
	 * be set. Defaults to false.
	 */
	private Boolean plotShadow;

	/**
	 * Whether to reflow the chart to fit the width of the container div on resizing the
	 * window. Defaults to true.
	 */
	private Boolean reflow;

	/**
	 * The HTML element where the chart will be rendered. If it is a string, the element
	 * by that id is used. The HTML element can also be passed by direct reference.
	 * Defaults to null.
	 */
	private String renderTo;

	/**
	 * Whether to apply a drop shadow to the outer chart area. Requires that
	 * backgroundColor be set. Defaults to false.
	 */
	private Boolean shadow;

	/**
	 * Whether to show the axes initially. This only applies to empty charts where series
	 * are added dynamically, as axes are automatically added to cartesian series.
	 * Defaults to false.
	 */
	private Boolean showAxes;

	/**
	 * The space between the top edge of the chart and the content (plot area, axis title
	 * and labels, title, subtitle or legend in top position). Defaults to 10.
	 */
	private Double spacingTop;

	/**
	 * The space between the right edge of the chart and the content (plot area, axis
	 * title and labels, title, subtitle or legend in top position). Defaults to 10.
	 */
	private Double spacingRight;

	/**
	 * The space between the bottom edge of the chart and the content (plot area, axis
	 * title and labels, title, subtitle or legend in top position). Defaults to 15.
	 */
	private Double spacingBottom;

	/**
	 * The space between the left edge of the chart and the content (plot area, axis title
	 * and labels, title, subtitle or legend in top position). Defaults to 10.
	 */
	private Double spacingLeft;

	/**
	 * Additional CSS styles to apply inline to the container div. Note that since the
	 * default font styles are applied in the renderer, it is ignorant of the individual
	 * chart options and must be set globally. Defaults to:
	 * 
	 * <pre>
	 * style: {
	 * 	fontFamily: '"Lucida Grande", "Lucida Sans Unicode", Verdana, Arial, Helvetica, sans-serif', // default font
	 * 	fontSize: '12px'
	 * }
	 * </pre>
	 */
	private String style;

	/**
	 * The default series type for the chart. Can be one of line, spline, area,
	 * areaspline, column, bar, pie and scatter. Defaults to "line".
	 */
	private WHighChartChartOptionsType type;

	/**
	 * An explicit width for the chart. By default the width is calculated from the offset
	 * width of the containing element. Defaults to null.
	 */
	private Double width;

	/**
	 * Decides in what dimentions the user can zoom by dragging the mouse. Can be one of
	 * x, y or xy. Defaults to "".
	 */
	private WHighChartChartOptionsZoomType zoomType;

	public Boolean getAlignTicks()
	{
		return alignTicks;
	}

	public WHighChartChartOptions setAlignTicks(Boolean alignTicks)
	{
		this.alignTicks = alignTicks;
		return this;
	}

	public Boolean getAnimation()
	{
		return animation;
	}

	public WHighChartChartOptions setAnimation(Boolean animation)
	{
		this.animation = animation;
		return this;
	}

	public String getBackgroundColor()
	{
		return backgroundColor;
	}

	public WHighChartChartOptions setBackgroundColor(String backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighChartChartOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Double getBorderRadius()
	{
		return borderRadius;
	}

	public WHighChartChartOptions setBorderRadius(Double borderRadius)
	{
		this.borderRadius = borderRadius;
		return this;
	}

	public Double getBorderWidth()
	{
		return borderWidth;
	}

	public WHighChartChartOptions setBorderWidth(Double borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public String getClassName()
	{
		return className;
	}

	public WHighChartChartOptions setClassName(String className)
	{
		this.className = className;
		return this;
	}

	public WHighChartChartEventsOptions getEvents()
	{
		return events;
	}

	public WHighChartChartOptions setEvents(WHighChartChartEventsOptions events)
	{
		this.events = events;
		return this;
	}

	public Double getHeight()
	{
		return height;
	}

	public WHighChartChartOptions setHeight(Double height)
	{
		this.height = height;
		return this;
	}

	public Boolean getIgnoreHiddenSeries()
	{
		return ignoreHiddenSeries;
	}

	public WHighChartChartOptions setIgnoreHiddenSeries(Boolean ignoreHiddenSeries)
	{
		this.ignoreHiddenSeries = ignoreHiddenSeries;
		return this;
	}

	public Boolean getInverted()
	{
		return inverted;
	}

	public WHighChartChartOptions setInverted(Boolean inverted)
	{
		this.inverted = inverted;
		return this;
	}

	public Double[] getMargin()
	{
		return margin;
	}

	public Double getMarginTop()
	{
		return marginTop;
	}

	public WHighChartChartOptions setMarginTop(Double marginTop)
	{
		this.marginTop = marginTop;

		if (margin != null && margin.length > 0)
			margin[0] = marginTop;
		else if (marginTop != null && (margin == null || margin.length == 0))
		{
			margin = new Double[4];
			margin[0] = marginTop;
			margin[1] = marginRight;
			margin[2] = marginBottom;
			margin[3] = marginLeft;
		}

		return this;
	}

	public Double getMarginRight()
	{
		return marginRight;
	}

	public WHighChartChartOptions setMarginRight(Double marginRight)
	{
		this.marginRight = marginRight;

		if (margin != null && margin.length > 1)
			margin[1] = marginRight;
		else if (marginTop != null && (margin == null || margin.length < 2))
		{
			margin = margin == null ? new Double[4] : Arrays.copyOf(margin, 4);
			margin[0] = marginTop;
			margin[1] = marginRight;
			margin[2] = marginBottom;
			margin[3] = marginLeft;
		}

		return this;
	}

	public Double getMarginBottom()
	{
		return marginBottom;
	}

	public WHighChartChartOptions setMarginBottom(Double marginBottom)
	{
		this.marginBottom = marginBottom;

		if (margin != null && margin.length > 2)
			margin[1] = marginRight;
		else if (marginTop != null && (margin == null || margin.length < 3))
		{
			margin = margin == null ? new Double[4] : Arrays.copyOf(margin, 4);
			margin[0] = marginTop;
			margin[1] = marginRight;
			margin[2] = marginBottom;
			margin[3] = marginLeft;
		}

		return this;
	}

	public Double getMarginLeft()
	{
		return marginLeft;
	}

	public WHighChartChartOptions setMarginLeft(Double marginLeft)
	{
		this.marginLeft = marginLeft;

		if (margin != null && margin.length > 3)
			margin[1] = marginRight;
		else if (marginTop != null && (margin == null || margin.length < 4))
		{
			margin = margin == null ? new Double[4] : Arrays.copyOf(margin, 4);
			margin[0] = marginTop;
			margin[1] = marginRight;
			margin[2] = marginBottom;
			margin[3] = marginLeft;
		}

		return this;
	}

	public String getPlotBackgroundColor()
	{
		return plotBackgroundColor;
	}

	public WHighChartChartOptions setPlotBackgroundColor(String plotBackgroundColor)
	{
		this.plotBackgroundColor = plotBackgroundColor;
		return this;
	}

	public String getPlotBackgroundImage()
	{
		return plotBackgroundImage;
	}

	public WHighChartChartOptions setPlotBackgroundImage(String plotBackgroundImage)
	{
		this.plotBackgroundImage = plotBackgroundImage;
		return this;
	}

	public String getPlotBorderColor()
	{
		return plotBorderColor;
	}

	public WHighChartChartOptions setPlotBorderColor(String plotBorderColor)
	{
		this.plotBorderColor = plotBorderColor;
		return this;
	}

	public Double getPlotBorderWidth()
	{
		return plotBorderWidth;
	}

	public WHighChartChartOptions setPlotBorderWidth(Double plotBorderWidth)
	{
		this.plotBorderWidth = plotBorderWidth;
		return this;
	}

	public Boolean getPlotShadow()
	{
		return plotShadow;
	}

	public WHighChartChartOptions setPlotShadow(Boolean plotShadow)
	{
		this.plotShadow = plotShadow;
		return this;
	}

	public Boolean getReflow()
	{
		return reflow;
	}

	public WHighChartChartOptions setReflow(Boolean reflow)
	{
		this.reflow = reflow;
		return this;
	}

	public String getRenderTo()
	{
		return renderTo;
	}

	public WHighChartChartOptions setRenderTo(String renderTo)
	{
		this.renderTo = renderTo;
		return this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	public WHighChartChartOptions setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return this;
	}

	public Boolean getShowAxes()
	{
		return showAxes;
	}

	public WHighChartChartOptions setShowAxes(Boolean showAxes)
	{
		this.showAxes = showAxes;
		return this;
	}

	public Double getSpacingTop()
	{
		return spacingTop;
	}

	public WHighChartChartOptions setSpacingTop(Double spacingTop)
	{
		this.spacingTop = spacingTop;
		return this;
	}

	public Double getSpacingRight()
	{
		return spacingRight;
	}

	public WHighChartChartOptions setSpacingRight(Double spacingRight)
	{
		this.spacingRight = spacingRight;
		return this;
	}

	public Double getSpacingBottom()
	{
		return spacingBottom;
	}

	public WHighChartChartOptions setSpacingBottom(Double spacingBottom)
	{
		this.spacingBottom = spacingBottom;
		return this;
	}

	public Double getSpacingLeft()
	{
		return spacingLeft;
	}

	public WHighChartChartOptions setSpacingLeft(Double spacingLeft)
	{
		this.spacingLeft = spacingLeft;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartChartOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public WHighChartChartOptionsType getType()
	{
		return type;
	}

	public WHighChartChartOptions setType(WHighChartChartOptionsType type)
	{
		this.type = type;
		return this;
	}

	public Double getWidth()
	{
		return width;
	}

	public WHighChartChartOptions setWidth(Double width)
	{
		this.width = width;
		return this;
	}

	public WHighChartChartOptionsZoomType getZoomType()
	{
		return zoomType;
	}

	public WHighChartChartOptions setZoomType(WHighChartChartOptionsZoomType zoomType)
	{
		this.zoomType = zoomType;
		return this;
	}
}
