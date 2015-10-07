/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
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

import de.tsystems.mms.apm.performancesignature.dynatrace.util.AttributeUtils;
import de.tsystems.mms.apm.performancesignature.util.DTPerfSigUtils;
import org.xml.sax.Attributes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rapi on 19.05.2014.
 */
public class ChartDashlet {
    private final String name;
    private List<Measure> measures;

    public ChartDashlet(final String name) {
        this.name = name;
    }

    public ChartDashlet(final Attributes attr) {
        this.name = AttributeUtils.getStringAttribute("name", attr);
    }

    public static String encode(final String string) {
        return DTPerfSigUtils.encodeString(string);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ChartDashlet{" +
                "name='" + name + '\'' +
                ", measures=" + measures +
                '}';
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public void addMeasure(final Measure tm) {
        if (this.measures == null)
            this.measures = new ArrayList<Measure>();
        this.measures.add(tm);
    }
}