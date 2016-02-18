/**
 *  Copyright 2014-2016 CyberVision, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.kaaproject.kaa.demo.powerplant.pojo;

import java.util.List;

public class DataReport {

    private final long time;

    private final List<DataPoint> dataPoints;
    
    private float powerConsumption;

    public DataReport(long time, List<DataPoint> dataPoints, float powerConsumption) {
        super();
        this.time = time;
        this.dataPoints = dataPoints;
        this.powerConsumption = powerConsumption;
    }

    public long getTime() {
        return time;
    }

    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }
    
    @Override
    public String toString() {
        return "DataReport{" +
                "time=" + time +
                ", dataPoints=" + dataPoints +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
