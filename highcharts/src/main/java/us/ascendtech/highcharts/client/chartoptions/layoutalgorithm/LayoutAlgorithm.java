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
    @JsProperty
    private double bubblePadding;
    @JsProperty
    private Boolean dragBetweenSeries;
    @JsProperty
    private Boolean enableSimulation;
    @JsProperty
    private double friction;
    @JsProperty
    private double gravitationalConstant;
    @JsProperty
    private double initialPositionRadius;
    @JsProperty
    private double linkLength;
    @JsProperty
    private double maxIterations;
    @JsProperty
    private double maxSpeed;
    @JsProperty
    private Boolean parentNodeLimit;
    @JsProperty
    private Boolean seriesInteraction;
    @JsProperty
    private Boolean splitSeries;

    @JsOverlay
    public final double getBubblePadding() {
        return bubblePadding;
    }

    @JsOverlay
    public final LayoutAlgorithm setBubblePadding(double bubblePadding) {
        this.bubblePadding = bubblePadding;
        return this;
    }

    @JsOverlay
    public final Boolean getDragBetweenSeries() {
        return dragBetweenSeries;
    }

    @JsOverlay
    public final LayoutAlgorithm setDragBetweenSeries(Boolean dragBetweenSeries) {
        this.dragBetweenSeries = dragBetweenSeries;
        return this;
    }

    @JsOverlay
    public final Boolean getEnableSimulation() {
        return enableSimulation;
    }

    @JsOverlay
    public final LayoutAlgorithm setEnableSimulation(Boolean enableSimulation) {
        this.enableSimulation = enableSimulation;
        return this;
    }

    @JsOverlay
    public final double getFriction() {
        return friction;
    }

    @JsOverlay
    public final LayoutAlgorithm setFriction(double friction) {
        this.friction = friction;
        return this;
    }

    @JsOverlay
    public final double getGravitationalConstant() {
        return gravitationalConstant;
    }

    @JsOverlay
    public final LayoutAlgorithm setGravitationalConstant(double gravitationalConstant) {
        this.gravitationalConstant = gravitationalConstant;
        return this;
    }

    @JsOverlay
    public final double getInitialPositionRadius() {
        return initialPositionRadius;
    }

    @JsOverlay
    public final LayoutAlgorithm setInitialPositionRadius(double initialPositionRadius) {
        this.initialPositionRadius = initialPositionRadius;
        return this;
    }

    @JsOverlay
    public final double getLinkLength() {
        return linkLength;
    }

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

    @JsOverlay
    public final double getMaxIterations() {
        return maxIterations;
    }

    @JsOverlay
    public final double getMaxSpeed() {
        return maxSpeed;
    }

    @JsOverlay
    public final LayoutAlgorithm setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    @JsOverlay
    public final Boolean getParentNodeLimit() {
        return parentNodeLimit;
    }

    @JsOverlay
    public final LayoutAlgorithm setParentNodeLimit(Boolean parentNodeLimit) {
        this.parentNodeLimit = parentNodeLimit;
        return this;
    }

    @JsOverlay
    public final Boolean getSeriesInteraction() {
        return seriesInteraction;
    }

    @JsOverlay
    public final LayoutAlgorithm setSeriesInteraction(Boolean seriesInteraction) {
        this.seriesInteraction = seriesInteraction;
        return this;
    }

    @JsOverlay
    public final Boolean getSplitSeries() {
        return splitSeries;
    }

    @JsOverlay
    public final LayoutAlgorithm setSplitSeries(Boolean splitSeries) {
        this.splitSeries = splitSeries;
        return this;
    }
}