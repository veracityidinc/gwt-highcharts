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
    public double getBubblePadding() {
        return bubblePadding;
    }

    @JsOverlay
    public LayoutAlgorithm setBubblePadding(double bubblePadding) {
        this.bubblePadding = bubblePadding;
        return this;
    }

    @JsOverlay
    public Boolean getDragBetweenSeries() {
        return dragBetweenSeries;
    }

    @JsOverlay
    public LayoutAlgorithm setDragBetweenSeries(Boolean dragBetweenSeries) {
        this.dragBetweenSeries = dragBetweenSeries;
        return this;
    }

    @JsOverlay
    public Boolean getEnableSimulation() {
        return enableSimulation;
    }

    @JsOverlay
    public LayoutAlgorithm setEnableSimulation(Boolean enableSimulation) {
        this.enableSimulation = enableSimulation;
        return this;
    }

    @JsOverlay
    public double getFriction() {
        return friction;
    }

    @JsOverlay
    public LayoutAlgorithm setFriction(double friction) {
        this.friction = friction;
        return this;
    }

    @JsOverlay
    public double getGravitationalConstant() {
        return gravitationalConstant;
    }

    @JsOverlay
    public LayoutAlgorithm setGravitationalConstant(double gravitationalConstant) {
        this.gravitationalConstant = gravitationalConstant;
        return this;
    }

    @JsOverlay
    public double getInitialPositionRadius() {
        return initialPositionRadius;
    }

    @JsOverlay
    public LayoutAlgorithm setInitialPositionRadius(double initialPositionRadius) {
        this.initialPositionRadius = initialPositionRadius;
        return this;
    }

    @JsOverlay
    public double getLinkLength() {
        return linkLength;
    }

    @JsOverlay
    public LayoutAlgorithm setLinkLength(double linkLength) {
        this.linkLength = linkLength;
        return this;
    }

    @JsOverlay
    public LayoutAlgorithm setMaxIterations(double maxIterations) {
        this.maxIterations = maxIterations;
        return this;
    }

    @JsOverlay
    public double getMaxIterations() {
        return maxIterations;
    }

    @JsOverlay
    public double getMaxSpeed() {
        return maxSpeed;
    }

    @JsOverlay
    public LayoutAlgorithm setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    @JsOverlay
    public Boolean getParentNodeLimit() {
        return parentNodeLimit;
    }

    @JsOverlay
    public LayoutAlgorithm setParentNodeLimit(Boolean parentNodeLimit) {
        this.parentNodeLimit = parentNodeLimit;
        return this;
    }

    @JsOverlay
    public Boolean getSeriesInteraction() {
        return seriesInteraction;
    }

    @JsOverlay
    public LayoutAlgorithm setSeriesInteraction(Boolean seriesInteraction) {
        this.seriesInteraction = seriesInteraction;
        return this;
    }

    @JsOverlay
    public Boolean getSplitSeries() {
        return splitSeries;
    }

    @JsOverlay
    public LayoutAlgorithm setSplitSeries(Boolean splitSeries) {
        this.splitSeries = splitSeries;
        return this;
    }
}