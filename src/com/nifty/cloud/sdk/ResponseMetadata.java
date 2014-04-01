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
package com.nifty.cloud.sdk;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ResponseMetadataクラス。<br />
 * このクラスはレスポンスのMetadata情報を格納します。
 */
public class ResponseMetadata {

	/** リクエストID	*/
	@XStreamAlias("RequestId")
	private String RequestId;
	
	/**
	 * リクエストIDを取得します。
	 * 
	 * @return リクエストID
	 */
	public String getRequestId() {
		return RequestId;
	}
	/**
	 * リクエストIDを設定します。
	 * 
	 * @param requestId リクエストID
	 */
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

}
