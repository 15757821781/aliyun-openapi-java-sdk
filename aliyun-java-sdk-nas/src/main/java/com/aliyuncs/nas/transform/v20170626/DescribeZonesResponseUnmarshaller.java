/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeZonesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeZonesResponse.Zone;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext context) {
		
		describeZonesResponse.setRequestId(context.stringValue("DescribeZonesResponse.RequestId"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < context.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(context.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));

			List<String> capacity = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeZonesResponse.Zones["+ i +"].Capacity.Length"); j++) {
				capacity.add(context.stringValue("DescribeZonesResponse.Zones["+ i +"].Capacity["+ j +"]"));
			}
			zone.setCapacity(capacity);

			List<String> performance = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeZonesResponse.Zones["+ i +"].Performance.Length"); j++) {
				performance.add(context.stringValue("DescribeZonesResponse.Zones["+ i +"].Performance["+ j +"]"));
			}
			zone.setPerformance(performance);

			zones.add(zone);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}