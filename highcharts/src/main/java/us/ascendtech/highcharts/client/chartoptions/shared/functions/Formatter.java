package us.ascendtech.highcharts.client.chartoptions.shared.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPoint;

@JsFunction
public interface Formatter {
    String format(SeriesPoint point);
}
