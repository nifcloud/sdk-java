/******************************************************************************* 
 *  Copyright 2013 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.ResponseMetadata;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.loadbalancer.model.CreateLoadBalancerResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * CreateLoadBalancerResponseクラス。<br />
 * このクラスはCreateLoadBalancerのレスポンスを格納します。
 */
@XStreamAlias("CreateLoadBalancerResponse")
public class CreateLoadBalancerResponse implements Response {
	
	/** ロードバランサー情報 */
	@XStreamAlias("CreateLoadBalancerResult")
	private CreateLoadBalancerResult createLoadBalancerResult;
	
	/** リクエスト情報 */
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;

	/**
	 * ロードバランサー情報を取得します。
	 *
	 * @return ロードバランサー情報
	 */
	public CreateLoadBalancerResult getCreateLoadBalancerResult() {
		return createLoadBalancerResult;
	}

	/**
	 * ロードバランサー情報を設定します。
	 *
	 * @param createLoadBalancerResult ロードバランサー情報
	 */
	public void setCreateLoadBalancerResult(CreateLoadBalancerResult createLoadBalancerResult) {
		this.createLoadBalancerResult = createLoadBalancerResult;
	}

	/**
	 * CreateLoadBalancerResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return createLoadBalancerResult;
	}

}
