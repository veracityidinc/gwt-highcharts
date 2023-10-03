


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
    private void maxIterations;
    @JsProperty
    private double maxSpeed;
    @JsProperty
    private Boolean parentNodeLimit;
    @JsProperty
    private Boolean seriesInteraction;
    @JsProperty
    private Boolean splitSeries;

    public double getBubblePadding() {
        return bubblePadding;
    }

    public LayoutAlgorithm setBubblePadding(double bubblePadding) {
        this.bubblePadding = bubblePadding;
        return this;
    }

    public Boolean getDragBetweenSeries() {
        return dragBetweenSeries;
    }

    public LayoutAlgorithm setDragBetweenSeries(Boolean dragBetweenSeries) {
        this.dragBetweenSeries = dragBetweenSeries;
        return this;
    }

    public Boolean getEnableSimulation() {
        return enableSimulation;
    }

    public LayoutAlgorithm setEnableSimulation(Boolean enableSimulation) {
        this.enableSimulation = enableSimulation;
        return this;
    }

    public double getFriction() {
        return friction;
    }

    public LayoutAlgorithm setFriction(double friction) {
        this.friction = friction;
        return this;
    }

    public double getGravitationalConstant() {
        return gravitationalConstant;
    }

    public LayoutAlgorithm setGravitationalConstant(double gravitationalConstant) {
        this.gravitationalConstant = gravitationalConstant;
        return this;
    }

    public double getInitialPositionRadius() {
        return initialPositionRadius;
    }

    public LayoutAlgorithm setInitialPositionRadius(double initialPositionRadius) {
        this.initialPositionRadius = initialPositionRadius;
        return this;
    }

    public double getLinkLength() {
        return linkLength;
    }

    public LayoutAlgorithm setLinkLength(double linkLength) {
        this.linkLength = linkLength;
        return this;
    }


    public LayoutAlgorithm setMaxIterations(double maxIterations) {
        this.maxIterations = maxIterations;
        return this;
    }

    public double getMaxIterations() {
        return maxIterations;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public LayoutAlgorithm setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Boolean getParentNodeLimit() {
        return parentNodeLimit;
    }

    public LayoutAlgorithm setParentNodeLimit(Boolean parentNodeLimit) {
        this.parentNodeLimit = parentNodeLimit;
        return this;
    }

    public Boolean getSeriesInteraction() {
        return seriesInteraction;
    }

    public LayoutAlgorithm setSeriesInteraction(Boolean seriesInteraction) {
        this.seriesInteraction = seriesInteraction;
        return this;
    }

    public Boolean getSplitSeries() {
        return splitSeries;
    }

    public LayoutAlgorithm setSplitSeries(Boolean splitSeries) {
        this.splitSeries = splitSeries;
        return this;
    }
}