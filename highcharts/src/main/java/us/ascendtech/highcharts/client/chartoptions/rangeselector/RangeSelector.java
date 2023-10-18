package us.ascendtech.highcharts.client.chartoptions.rangeselector;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.rangeselector.Buttons;


/**
 * @author Samuel Palacean
 * Docs: https://api.highcharts.com/highstock/rangeSelector
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class RangeSelector {
    private Boolean allButtonsEnabled;
    private double buttonSpacing;
    private String buttonTheme;
    private String dropdown;
    private Boolean enabled;
    private Boolean floating;
    private String inputBoxBorderColor;
    private double inputBoxHeight;
    private double inputBoxWidth;
    private String inputDateFormat;
    private String inputEditDateFormat;
    private Boolean inputEnabled;
    private double inputSpacing;
    private String inputStyle;
    private String labelStyle;
    private double selected;
    private String verticalAlign;
    private double x;
    private double y;
    private JsArray<Buttons> buttons;

    @JsProperty
    public native Boolean getAllButtonsEnabled();

    @JsOverlay
    public final RangeSelector setAllButtonsEnabled(Boolean allButtonsEnabled) {
        this.allButtonsEnabled = allButtonsEnabled;
        return this;
    }

    @JsProperty
    public native double getButtonSpacing();

    @JsOverlay
    public final RangeSelector setButtonSpacing(double buttonSpacing) {
        this.buttonSpacing = buttonSpacing;
        return this;
    }

    @JsProperty
    public native String getButtonTheme();

    @JsOverlay
    public final RangeSelector setButtonTheme(String buttonTheme) {
        this.buttonTheme = buttonTheme;
        return this;
    }

    @JsProperty
    public native String getDropdown();

    @JsOverlay
    public final RangeSelector setDropdown(String dropdown) {
        this.dropdown = dropdown;
        return this;
    }

    @JsProperty
    public native Boolean getEnabled();

    @JsOverlay
    public final RangeSelector setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsProperty
    public native Boolean getFloating();

    @JsOverlay
    public final RangeSelector setFloating(Boolean floating) {
        this.floating = floating;
        return this;
    }

    @JsProperty
    public native String getInputBoxBorderColor();

    @JsOverlay
    public final RangeSelector setInputBoxBorderColor(String inputBoxBorderColor) {
        this.inputBoxBorderColor = inputBoxBorderColor;
        return this;
    }

    @JsProperty
    public native double getInputBoxHeight();

    @JsOverlay
    public final RangeSelector setInputBoxHeight(double inputBoxHeight) {
        this.inputBoxHeight = inputBoxHeight;
        return this;
    }

    @JsProperty
    public native double getInputBoxWidth();

    @JsOverlay
    public final RangeSelector setInputBoxWidth(double inputBoxWidth) {
        this.inputBoxWidth = inputBoxWidth;
        return this;
    }

    @JsProperty
    public native String getInputDateFormat();

    @JsOverlay
    public final RangeSelector setInputDateFormat(String inputDateFormat) {
        this.inputDateFormat = inputDateFormat;
        return this;
    }

    @JsProperty
    public native String getInputEditDateFormat();

    @JsOverlay
    public final RangeSelector setInputEditDateFormat(String inputEditDateFormat) {
        this.inputEditDateFormat = inputEditDateFormat;
        return this;
    }

    @JsProperty
    public native Boolean getInputEnabled();

    @JsOverlay
    public final RangeSelector setInputEnabled(Boolean inputEnabled) {
        this.inputEnabled = inputEnabled;
        return this;
    }

    @JsProperty
    public native double getInputSpacing();

    @JsOverlay
    public final RangeSelector setInputSpacing(double inputSpacing) {
        this.inputSpacing = inputSpacing;
        return this;
    }

    @JsProperty
    public native String getInputStyle();

    @JsOverlay
    public final RangeSelector setInputStyle(String inputStyle) {
        this.inputStyle = inputStyle;
        return this;
    }

    @JsProperty
    public native String getLabelStyle();

    @JsOverlay
    public final RangeSelector setLabelStyle(String labelStyle) {
        this.labelStyle = labelStyle;
        return this;
    }

    @JsProperty
    public native double getSelected();

    @JsOverlay
    public final RangeSelector setSelected(double selected) {
        this.selected = selected;
        return this;
    }

    @JsProperty
    public native String getVerticalAlign();

    @JsOverlay
    public final RangeSelector setVerticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    @JsProperty
    public native double getX();

    @JsOverlay
    public final RangeSelector setX(double x) {
        this.x = x;
        return this;
    }

    @JsProperty
    public native double getY();

    @JsOverlay
    public final RangeSelector setY(double y) {
        this.y = y;
        return this;
    }

    @JsProperty
    public native JsArray<Buttons> getButtons();

    @JsOverlay
    public final RangeSelector setButtons(JsArray<Buttons> buttons) {
        this.buttons = buttons;
        return this;
    }

}