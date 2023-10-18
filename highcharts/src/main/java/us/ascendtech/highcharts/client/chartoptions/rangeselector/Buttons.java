package us.ascendtech.highcharts.client.chartoptions.rangeselector;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * @author Samuel Palacean
 * Docs: https://api.highcharts.com/highstock/rangeSelector.buttons
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Buttons {
    private double count;
    private double offsetMax;
    private double offsetMin;
    private Boolean preserveDataGrouping;
    private String text;
    private String title;
    private String type;

    @JsProperty
    public native Boolean getPreserveDataGrouping();

    @JsOverlay
    public final Buttons setPreserveDataGrouping(Boolean preserveDataGrouping) {
        this.preserveDataGrouping = preserveDataGrouping;
        return this;
    }

    @JsProperty
    public native double getCount();

    @JsOverlay
    public final Buttons setCount(double count) {
        this.count = count;
        return this;
    }

    @JsProperty
    public native double getOffsetMax();

    @JsOverlay
    public final Buttons setOffsetMax(double offsetMax) {
        this.offsetMax = offsetMax;
        return this;
    }

    @JsProperty
    public native double getOffsetMin();

    @JsOverlay
    public final Buttons setOffsetMin(double offsetMin) {
        this.offsetMin = offsetMin;
        return this;
    }

    @JsProperty
    public native String getText();

    @JsOverlay
    public final Buttons setText(String text) {
        this.text = text;
        return this;
    }

    @JsProperty
    public native String getTitle();

    @JsOverlay
    public final Buttons setTitle(String title) {
        this.title = title;
        return this;
    }

    @JsProperty
    public native String getType();

    @JsOverlay
    public final Buttons setType(String type) {
        this.type = type;
        return this;
    }


}