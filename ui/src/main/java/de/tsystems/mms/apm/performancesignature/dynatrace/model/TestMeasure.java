/*
 * Copyright (c) 2014-2018 T-Systems Multimedia Solutions GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tsystems.mms.apm.performancesignature.dynatrace.model;

import com.google.gson.annotations.SerializedName;
import de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils;
import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

/**
 * TestMeasure
 */

@ExportedBean
public class TestMeasure {
    @SerializedName("name")
    private String name;

    @SerializedName("metricGroup")
    private String metricGroup;

    @SerializedName("value")
    private Double value;

    @SerializedName("unit")
    private String unit;

    @SerializedName("expectedMin")
    private Double expectedMin;

    @SerializedName("expectedMax")
    private Double expectedMax;

    /**
     * Get name
     *
     * @return name
     **/
    @Exported
    public String getName() {
        return name;
    }

    /**
     * Get metricGroup
     *
     * @return metricGroup
     **/
    @Exported
    public String getMetricGroup() {
        return metricGroup;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @Exported
    public Double getValue() {
        return value;
    }

    /**
     * Get unit
     *
     * @return unit
     **/
    @Exported
    public String getUnit() {
        return unit;
    }

    /**
     * Get expectedMin
     *
     * @return expectedMin
     **/
    @Exported
    public Double getExpectedMin() {
        return expectedMin;
    }

    /**
     * Get expectedMax
     *
     * @return expectedMax
     **/
    @Exported
    public Double getExpectedMax() {
        return expectedMax;
    }

    @Override
    public String toString() {
        return "class TestMeasure {\n" +
                "    name: " + PerfSigUIUtils.toIndentedString(name) + "\n" +
                "    metricGroup: " + PerfSigUIUtils.toIndentedString(metricGroup) + "\n" +
                "    value: " + PerfSigUIUtils.toIndentedString(value) + "\n" +
                "    unit: " + PerfSigUIUtils.toIndentedString(unit) + "\n" +
                "    expectedMin: " + PerfSigUIUtils.toIndentedString(expectedMin) + "\n" +
                "    expectedMax: " + PerfSigUIUtils.toIndentedString(expectedMax) + "\n" +
                "}";
    }
}
