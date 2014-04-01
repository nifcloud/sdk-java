/******************************************************************************* 
 *  Copyright 2014 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model.transform;

import com.nifty.cloud.sdk.server.model.Placement;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * PlacementResponseType変換クラス。<br />
 * このクラスはレスポンスXMLのplacement要素からPlacementクラスを生成します。
 *  
 */
public class PlacementConverter implements Converter {

	private static final String ELEMENT_AVAILABILITY_ZONE = "availabilityZone";
	
	/**
	 * 変換可能なクラスか判定します。
	 * 
	 * @param clazz クラス
	 * @return 変換可能な場合true, 変換不可能な場合false
	 *  
	 * @see com.thoughtworks.xstream.converters.Converter#canConvert(Class)
	 */		
	@SuppressWarnings("rawtypes")
	@Override
	public boolean canConvert(Class clazz) {
		return clazz == Placement.class;
	}

	/**
	 * placementをPlacementクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return Placementオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		Placement placement = new Placement();
        
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();

			name = reader.getNodeName();
			if (name.equals(ELEMENT_AVAILABILITY_ZONE)) {
				placement.setAvailabilityZone(reader.getValue());
			}
			
			reader.moveUp();
		}
		return placement;
	}

	/**
	 * 未実装メソッド 
	 */
	@Override
	public void marshal(Object paramObject,
						HierarchicalStreamWriter paramHierarchicalStreamWriter,
						MarshallingContext paramMarshallingContext) {
	}

}
