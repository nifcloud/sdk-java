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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 * 
 */
package com.nifty.cloud.sdk.misc.model.transform;

import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.ResponseMetadata;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.misc.model.AssociateUsersResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * AssociateUsersResponseクラス。<br />
 * このクラスはAssociateUsersのレスポンスを格納します。
 */
@XStreamAlias("AssociateUsersResponse")
public class AssociateUsersResponse implements Response {
	
	/** AssociateUsersResult 結果セット */
	@XStreamAlias("AssociateUsersResult")
	private AssociateUsersResult associateUsersResult;
	
	/** リクエスト情報 */	
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;


	/**
	 * AssociateUsersResult 結果セットを取得します。
	 *
	 * @return AssociateUsersResult 結果セット
	 */
	public AssociateUsersResult getAssociateUsersResult() {
		return associateUsersResult;
	}
	/**
	 * AssociateUsers 結果セットを設定します。
	 *
	 * @param associateUsersResult 結果セット
	 */
	public void setAssociateUsersResult(AssociateUsersResult associateUsersResult) {
		this.associateUsersResult = associateUsersResult;
	}

	/**
	 * AssociateUsersResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return associateUsersResult;
	}
}
