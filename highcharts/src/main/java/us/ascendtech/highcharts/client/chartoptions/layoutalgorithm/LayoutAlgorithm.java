package us.ascendtech.highcharts.client.chartoptions.layoutalgorithm;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Samuel Palacean
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class LayoutAlgorithm {
    private double bubblePadding;
    private Boolean dragBetweenSeries;
    private Boolean enableSimulation;
    private double friction;
    private double gravitationalConstant;
    private double initialPositionRadius;
    private double linkLength;
    private double maxIterations;
    private double maxSpeed;
    private Boolean parentNodeLimit;
    private Boolean seriesInteraction;
    private Boolean splitSeries;

    @JsProperty
    public native double getBubblePadding();

    @JsOverlay
    public final LayoutAlgorithm setBubblePadding(double bubblePadding) {
        this.bubblePadding = bubblePadding;
        return this;
    }

    @JsProperty
    public native Boolean getDragBetweenSeries();

    @JsOverlay
    public final LayoutAlgorithm setDragBetweenSeries(Boolean dragBetweenSeries) {
        this.dragBetweenSeries = dragBetweenSeries;
        return this;
    }

    @JsProperty
    public native Boolean getEnableSimulation();

    @JsOverlay
    public final LayoutAlgorithm setEnableSimulation(Boolean enableSimulation) {
        this.enableSimulation = enableSimulation;
        return this;
    }

    @JsProperty
    public native double getFriction();

    @JsOverlay
    public final LayoutAlgorithm setFriction(double friction) {
        this.friction = friction;
        return this;
    }

    @JsProperty
    public native double getGravitationalConstant();

    @JsOverlay
    public final LayoutAlgorithm setGravitationalConstant(double gravitationalConstant) {
        this.gravitationalConstant = gravitationalConstant;
        return this;
    }

    @JsProperty
    public native double getInitialPositionRadius();

    @JsOverlay
    public final LayoutAlgorithm setInitialPositionRadius(double initialPositionRadius) {
        this.initialPositionRadius = initialPositionRadius;
        return this;
    }

    @JsProperty
    public native double getLinkLength();

    @JsOverlay
    public final LayoutAlgorithm setLinkLength(double linkLength) {
        this.linkLength = linkLength;
        return this;
    }

    @JsOverlay
    public final LayoutAlgorithm setMaxIterations(double maxIterations) {
        this.maxIterations = maxIterations;
        return this;
    }

    @JsProperty
    public native double getMaxIterations();

    @JsProperty
    public native double getMaxSpeed();

    @JsOverlay
    public final LayoutAlgorithm setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    @JsProperty
    public native Boolean getParentNodeLimit();

    @JsOverlay
    public final LayoutAlgorithm setParentNodeLimit(Boolean parentNodeLimit) {
        this.parentNodeLimit = parentNodeLimit;
        return this;
    }

    @JsProperty
    public native Boolean getSeriesInteraction();

    @JsOverlay
    public final LayoutAlgorithm setSeriesInteraction(Boolean seriesInteraction) {
        this.seriesInteraction = seriesInteraction;
        return this;
    }

    @JsProperty
    public native Boolean getSplitSeries();

    @JsOverlay
    public final LayoutAlgorithm setSplitSeries(Boolean splitSeries) {
        this.splitSeries = splitSeries;
        return this;
    }
}