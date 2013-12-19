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
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * TerminateInstancesリクエストクラス。<br />
 * このクラスはTerminateInstancesへのリクエストを構築します。
 */
@Action("TerminateInstances")
public class TerminateInstancesRequest implements Request {
	
	/** サーバー名リスト */
	private List<String> instanceIds;
	
	/**
	 * デフォルトコンストラクタ。
	 */
	public TerminateInstancesRequest() {
	}
	
	/**
	 * サーバー名リストを指定し、TerminateInstancesRequestを構築します。
	 * @param instanceIds サーバー名リスト
	 */
	public TerminateInstancesRequest(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
	
	
	/**
	 * サーバー名リストを取得します。
	 * 
	 * @return サーバー名リスト
	 */
	@Query(name="InstanceId", require=true)	
	public List<String> getInstanceIds() {
		return instanceIds;
	}
	/**
	 * サーバー名リストを設定します。
	 * 
	 * @param instanceIds サーバー名リスト
	 */
	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
	/**
	 * サーバー名の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds サーバー名の配列
	 * @return 自オブジェクト	 
	 */
	public TerminateInstancesRequest withInstanceIds(String ... instanceIds) {
		if(this.instanceIds == null) this.instanceIds = new ArrayList<String>();
		for(String instanceId: instanceIds) {
			getInstanceIds().add(instanceId);
		}
		return this;
	}
	/**
	 * サーバー名リストを設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds サーバー名リスト
	 * @return 自オブジェクト	 
	 */
	public TerminateInstancesRequest withInstanceIds(Collection<String> instanceIds) {
		if(this.instanceIds == null) this.instanceIds = new ArrayList<String>();
		if (instanceIds!=null) {
			getInstanceIds().addAll(instanceIds);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[instanceIds=");
		builder.append(instanceIds);
		builder.append("]");
		return builder.toString();
	}
	
}
