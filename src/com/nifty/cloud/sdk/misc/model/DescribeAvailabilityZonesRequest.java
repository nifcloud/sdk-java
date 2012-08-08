/******************************************************************************* 
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * ***************************************************************************** 
 * 
 *  NIFTY Cloud SDK for Java
 *  API Version: 1.9
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeAvailabilityZonesリクエストクラス。<br />
 * このクラスはDescribeAvailabilityZonesへのリクエストを構築します。
 */
@Action("DescribeAvailabilityZones")
public class DescribeAvailabilityZonesRequest implements Request {
	
	private List<String>	zoneNames;

	/**
	 * zoneNamesを取得します。
	 * 
	 * @return zoneNames
	 */
	@Query(name="ZoneName")			
	public List<String> getZoneNames() {
		return zoneNames;
	}
	/**
	 * zoneNamesを設定します。
	 * 
	 * @param zoneNames
	 */
	public void setZoneNames(List<String> zoneNames) {
		this.zoneNames = zoneNames;
	}
	/**
	 * zoneNamesの配列を設定し、自オブジェクトを返します。
	 *
	 * @param zoneNames
	 * @return 自オブジェクト
	 */
	public DescribeAvailabilityZonesRequest withZoneNames(String ... zoneNames) {
		if(this.zoneNames == null) this.zoneNames = new ArrayList<String>();
		for(String zoneName: zoneNames) {
			getZoneNames().add(zoneName);
		}
		return this;
	}
	/**
	 * zoneNamesを設定し、自オブジェクトを返します。
	 *
	 * @param zoneNames
	 * @return 自オブジェクト
	 */
	public DescribeAvailabilityZonesRequest withZoneNames(Collection<String> zoneNames) {
		if(this.zoneNames == null) this.zoneNames = new ArrayList<String>();
		if(zoneNames != null) {
			getZoneNames().addAll(zoneNames);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[zoneNames=");
		builder.append(zoneNames);
		builder.append("]");
		return builder.toString();
	}

}
