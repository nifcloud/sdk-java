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
package com.nifty.cloud.sdk.misc;


import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.misc.model.DescribeAvailabilityZonesRequest;
import com.nifty.cloud.sdk.misc.model.DescribeAvailabilityZonesResult;

/**
 * NIFTY Cloud API クライアント　具象クラス。
 * その他カテゴリ クライアント。<br />
 * その他カテゴリの同期クライアントの具象クラスです。
 */
public class NiftyMiscClient extends BaseClient implements NiftyMisc {
	
	/** 
	 * 認証情報を指定し、その他カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyMiscClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、その他カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyMiscClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMisc#describeAvailabilityZones(DescribeAvailabilityZonesRequest)
	 */
	@Override
	public DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest request) {
		return (DescribeAvailabilityZonesResult)client.execute(request, DescribeAvailabilityZonesResult.class);
	}

}
