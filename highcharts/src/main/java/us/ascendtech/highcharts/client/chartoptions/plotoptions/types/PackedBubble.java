package us.ascendtech.highcharts.client.chartoptions.plotoptions.types;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesDataLabels;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesEvents;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesLabel;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesMarker;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPoint;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesZones;
import us.ascendtech.highcharts.client.chartoptions.series.states.SeriesStates;
import us.ascendtech.highcharts.client.chartoptions.shared.Shadow;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Animation;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDescriptionFormatter;
import us.ascendtech.highcharts.client.chartoptions.tooltip.Tooltip;
import us.ascendtech.highcharts.client.chartoptions.layoutalgorithm.LayoutAlgorithm;

/**
 * @author Samuel Palacean
 * Docs: https://api.highcharts.com/highcharts/plotOptions.packedbubble
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PackedBubble {
	private Boolean allowPointSelect;
	private Animation animation;
	private double animationLimit;
	private double boostThreshold;
	private String className;
	private String color;
	private double colorIndex;
	private Boolean connectEnds;
	private Boolean connectNulls;
	private double cropThreshold;
	private String cursor;
	private String dashStyle;
	private SeriesDataLabels dataLabels;
	private String description;
	private Boolean displayNegative;
	private Boolean enableMouseTracking;
	private SeriesEvents events;
	private Boolean exposeElementToA11y;
	private String findNearestPointBy;
	private Boolean getExtremesFromAll;
	private JsArray<String> keys;
	private SeriesLabel label;
	private String linecap;
	private double lineWidth;
	private String linkedTo;
	private SeriesMarker marker;
	private String maxSize;
	private String minSize;
	private String negativeColor;
	private SeriesPoint point;
	private PointDescriptionFormatter pointDescriptionFormatter;
	private double pointInterval;
	private String pointIntervalUnit;
	private double pointStart;
	private Boolean selected;
	private Shadow shadow;
	private Boolean showCheckbox;
	private Boolean showInLegend;
	private String sizeBy;
	private Boolean sizyByAbsoluteValue;
	private Boolean skipKeyboardNavigation;
	private Boolean softThreshold;
	private String stacking;
	private SeriesStates states;
	private String step;
	private Boolean stickyTracking;
	private double threshold;
	private Tooltip tooltip;
	private Boolean trackByArea;
	private double turboThreshold;
	private Boolean visible;
	private double zMax;
	private double zMin;
	private String zoneAxis;
	private JsArray<SeriesZones> zones;
	private double zThreshold;
	private LayoutAlgorithm layoutAlgorithm;

	@JsProperty
	public native Boolean getAllowPointSelect();

	@JsOverlay
	public final PackedBubble setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsProperty
	public native Animation getAnimation();

	@JsOverlay
	public final PackedBubble setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsProperty
	public native double getAnimationLimit();

	@JsOverlay
	public final PackedBubble setAnimationLimit(double animationLimit) {
		this.animationLimit = animationLimit;
		return this;
	}

	@JsProperty
	public native double getBoostThreshold();

	@JsOverlay
	public final PackedBubble setBoostThreshold(double boostThreshold) {
		this.boostThreshold = boostThreshold;
		return this;
	}

	@JsProperty
	public native String getClassName();

	@JsOverlay
	public final PackedBubble setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsProperty
	public native String getColor();

	@JsOverlay
	public final PackedBubble setColor(String color) {
		this.color = color;
		return this;
	}

	@JsProperty
	public native double getColorIndex();

	@JsOverlay
	public final PackedBubble setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsProperty
	public native Boolean getConnectEnds();

	@JsOverlay
	public final PackedBubble setConnectEnds(Boolean connectEnds) {
		this.connectEnds = connectEnds;
		return this;
	}

	@JsProperty
	public native Boolean getConnectNulls();

	@JsOverlay
	public final PackedBubble setConnectNulls(Boolean connectNulls) {
		this.connectNulls = connectNulls;
		return this;
	}

	@JsProperty
	public native double getCropThreshold();

	@JsOverlay
	public final PackedBubble setCropThreshold(double cropThreshold) {
		this.cropThreshold = cropThreshold;
		return this;
	}

	@JsProperty
	public native String getCursor();

	@JsOverlay
	public final PackedBubble setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsProperty
	public native String getDashStyle();

	@JsOverlay
	public final PackedBubble setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	@JsProperty
	public native SeriesDataLabels getDataLabels();

	@JsOverlay
	public final PackedBubble setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsProperty
	public native String getDescription();

	@JsOverlay
	public final PackedBubble setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsProperty
	public native Boolean getDisplayNegative();

	@JsOverlay
	public final PackedBubble setDisplayNegative(Boolean displayNegative) {
		this.displayNegative = displayNegative;
		return this;
	}

	@JsProperty
	public native Boolean getEnableMouseTracking();

	@JsOverlay
	public final PackedBubble setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsProperty
	public native SeriesEvents getEvents();

	@JsOverlay
	public final PackedBubble setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsProperty
	public native Boolean getExposeElementToA11y();

	@JsOverlay
	public final PackedBubble setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsProperty
	public native String getFindNearestPointBy();

	@JsOverlay
	public final PackedBubble setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		return this;
	}

	@JsProperty
	public native Boolean getGetExtremesFromAll();

	@JsOverlay
	public final PackedBubble setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
		return this;
	}

	@JsProperty
	public native JsArray<String> getKeys();

	@JsOverlay
	public final PackedBubble setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsProperty
	public native SeriesLabel getLabel();

	@JsOverlay
	public final PackedBubble setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsProperty
	public native String getLinecap();

	@JsOverlay
	public final PackedBubble setLinecap(String linecap) {
		this.linecap = linecap;
		return this;
	}

	@JsProperty
	public native double getLineWidth();

	@JsOverlay
	public final PackedBubble setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsProperty
	public native String getLinkedTo();

	@JsOverlay
	public final PackedBubble setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsProperty
	public native SeriesMarker getMarker();

	@JsOverlay
	public final PackedBubble setMarker(SeriesMarker marker) {
		this.marker = marker;
		return this;
	}

	@JsProperty
	public native String getMaxSize();

	@JsOverlay
	public final PackedBubble setMaxSize(String maxSize) {
		this.maxSize = maxSize;
		return this;
	}

	@JsProperty
	public native String getMinSize();

	@JsOverlay
	public final PackedBubble setMinSize(String minSize) {
		this.minSize = minSize;
		return this;
	}

	@JsProperty
	public native String getNegativeColor();

	@JsOverlay
	public final PackedBubble setNegativeColor(String negativeColor) {
		this.negativeColor = negativeColor;
		return this;
	}

	@JsProperty
	public native SeriesPoint getPoint();

	@JsOverlay
	public final PackedBubble setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsProperty
	public native PointDescriptionFormatter getPointDescriptionFormatter();

	@JsOverlay
	public final PackedBubble setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsProperty
	public native double getPointInterval();

	@JsOverlay
	public final PackedBubble setPointInterval(double pointInterval) {
		this.pointInterval = pointInterval;
		return this;
	}

	@JsProperty
	public native String getPointIntervalUnit();

	@JsOverlay
	public final PackedBubble setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
		return this;
	}

	@JsProperty
	public native double getPointStart();

	@JsOverlay
	public final PackedBubble setPointStart(double pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	@JsProperty
	public native Boolean getSelected();

	@JsOverlay
	public final PackedBubble setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsProperty
	public native Shadow getShadow();

	@JsOverlay
	public final PackedBubble setShadow(Shadow shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsProperty
	public native Boolean getShowCheckbox();

	@JsOverlay
	public final PackedBubble setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsProperty
	public native Boolean getShowInLegend();

	@JsOverlay
	public final PackedBubble setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsProperty
	public native String getSizeBy();

	@JsOverlay
	public final PackedBubble setSizeBy(String sizeBy) {
		this.sizeBy = sizeBy;
		return this;
	}

	@JsProperty
	public native Boolean getSizyByAbsoluteValue();

	@JsOverlay
	public final PackedBubble setSizyByAbsoluteValue(Boolean sizyByAbsoluteValue) {
		this.sizyByAbsoluteValue = sizyByAbsoluteValue;
		return this;
	}

	@JsProperty
	public native Boolean getSkipKeyboardNavigation();

	@JsOverlay
	public final PackedBubble setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsProperty
	public native Boolean getSoftThreshold();

	@JsOverlay
	public final PackedBubble setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
		return this;
	}

	@JsProperty
	public native String getStacking();

	@JsOverlay
	public final PackedBubble setStacking(String stacking) {
		this.stacking = stacking;
		return this;
	}

	@JsProperty
	public native SeriesStates getStates();

	@JsOverlay
	public final PackedBubble setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsProperty
	public native String getStep();

	@JsOverlay
	public final PackedBubble setStep(String step) {
		this.step = step;
		return this;
	}

	@JsProperty
	public native Boolean getStickyTracking();

	@JsOverlay
	public final PackedBubble setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsProperty
	public native double getThreshold();

	@JsOverlay
	public final PackedBubble setThreshold(double threshold) {
		this.threshold = threshold;
		return this;
	}

	@JsProperty
	public native Tooltip getTooltip();

	@JsOverlay
	public final PackedBubble setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsProperty
	public native Boolean getTrackByArea();

	@JsOverlay
	public final PackedBubble setTrackByArea(Boolean trackByArea) {
		this.trackByArea = trackByArea;
		return this;
	}

	@JsProperty
	public native double getTurboThreshold();

	@JsOverlay
	public final PackedBubble setTurboThreshold(double turboThreshold) {
		this.turboThreshold = turboThreshold;
		return this;
	}

	@JsProperty
	public native Boolean getVisible();

	@JsOverlay
	public final PackedBubble setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsProperty
	public native double getzMax();

	@JsOverlay
	public final PackedBubble setzMax(double zMax) {
		this.zMax = zMax;
		return this;
	}

	@JsProperty
	public native double getzMin();

	@JsOverlay
	public final PackedBubble setzMin(double zMin) {
		this.zMin = zMin;
		return this;
	}

	@JsProperty
	public native String getZoneAxis();

	@JsOverlay
	public final PackedBubble setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
		return this;
	}

	@JsProperty
	public native JsArray<SeriesZones> getZones();

	@JsOverlay
	public final PackedBubble setZones(JsArray<SeriesZones> zones) {
		this.zones = zones;
		return this;
	}

	@JsProperty
	public native double getzThreshold();

	@JsOverlay
	public final PackedBubble setzThreshold(double zThreshold) {
		this.zThreshold = zThreshold;
		return this;
	}

	@JsProperty
	public native LayoutAlgorithm getLayoutAlgorithm();

	@JsOverlay
	public final PackedBubble setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
		return this;
	}
}
