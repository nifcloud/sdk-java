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
package com.nifty.cloud.sdk.loadbalancer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeInstanceHealthリクエストクラス。<br />
 * このクラスはDescribeInstanceHealthへのリクエストを構築します。
 */
@Action("DescribeInstanceHealth")
public class DescribeInstanceHealthRequest implements Request {
	/** ロードバランサー名 */
	private String loadBalancerName;
	
	/** 待ち受けポート */
	private Integer loadBalancerPort;
	
	/** 宛先ポート */
	private Integer instancePort;
	
	/** サーバー情報リスト */
	private List<Instance> instances;

	/**
	 * デフォルトコンストラクタ。
	 */
	public DescribeInstanceHealthRequest() {
	}

	/**
	 * ロードバランサー名,待ち受けポート,宛先ポートを指定し、DescribeInstanceHealthRequestを構築します。
	 * 
	 * @param loadBalancerName ロードバランサー名 
	 * @param loadBalancerPort 待ち受けポート 
	 * @param instancePort 宛先ポート
	 */
	public DescribeInstanceHealthRequest(String loadBalancerName, Integer loadBalancerPort, Integer instancePort) {
		this.loadBalancerName = loadBalancerName;
		this.loadBalancerPort = loadBalancerPort;
		this.instancePort = instancePort;
	}

	/**
	 * ロードバランサー名を取得します。
	 * 
	 * @return ロードバランサー名
	 */
	@Query(name="LoadBalancerName")		
	public String getLoadBalancerName() {
		return loadBalancerName;
	}
	/**
	 * ロードバランサー名を設定します。
	 * 
	 * @param loadBalancerName ロードバランサー名
	 */
	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
	}
	/**
	 * ロードバランサー名を設定し、自オブジェクトを返します。
	 *
	 * @param loadBalancerName ロードバランサー名
	 * @return 自オブジェクト
	 */
	public DescribeInstanceHealthRequest withLoadBalancerName(String loadBalancerName) {
		setLoadBalancerName(loadBalancerName);
		return this;
	}
	
	/**
	 * 待ち受けポートを取得します。
	 * 
	 * @return 待ち受けポート
	 */
	@Query(name="LoadBalancerPort")		
	public Integer getLoadBalancerPort() {
		return loadBalancerPort;
	}
	/**
	 * 待ち受けポートを設定します。
	 * 
	 * @param loadBalancerPort 待ち受けポート
	 */
	public void setLoadBalancerPort(Integer loadBalancerPort) {
		this.loadBalancerPort = loadBalancerPort;
	}
	/**
	 * 待ち受けポートを設定し、自オブジェクトを返します。
	 *
	 * @param loadBalancerPort 待ち受けポート
	 * @return 自オブジェクト
	 */
	public DescribeInstanceHealthRequest withLoadBalancerPort(Integer loadBalancerPort) {
		setLoadBalancerPort(loadBalancerPort);
		return this;
	}
	
	/**
	 * 宛先ポートを取得します。
	 * 
	 * @return 宛先ポート
	 */
	@Query(name="InstancePort")	
	public Integer getInstancePort() {
		return instancePort;
	}
	/**
	 * 宛先ポートを設定します。
	 * 
	 * @param instancePort 宛先ポート
	 */
	public void setInstancePort(Integer instancePort) {
		this.instancePort = instancePort;
	}
	/**
	 * 宛先ポートを設定し、自オブジェクトを返します。
	 *
	 * @param instancePort 宛先ポート
	 * @return 自オブジェクト
	 */
	public DescribeInstanceHealthRequest withInstancePort(Integer instancePort) {
		setInstancePort(instancePort);
		return this;
	}
	
	/**
	 * サーバー情報リストを取得します。
	 * 
	 * @return サーバー情報リスト
	 */
	@Query(name="Instances.member")	
	public List<Instance> getInstances() {
		return instances;
	}
	/**
	 * サーバー情報リストを設定します。
	 * 
	 * @param instances サーバー情報リスト
	 */
	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	/**
	 * サーバー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instances サーバー情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeInstanceHealthRequest withInstances(Instance ... instances) {
		if(this.instances == null) this.instances = new ArrayList<Instance>();
		for (Instance instance : instances) {
			getInstances().add(instance);
		}
		return this;
	}
	/**
	 * サーバー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param instances サーバー情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeInstanceHealthRequest withInstances(Collection<Instance> instances) {
		if(this.instances == null) this.instances = new ArrayList<Instance>();
		if (instances != null) {
			getInstances().addAll(instances);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[loadBalancerName=");
		builder.append(loadBalancerName);
		builder.append(", loadBalancerPort=");
		builder.append(loadBalancerPort);
		builder.append(", instancePort=");
		builder.append(instancePort);
		builder.append(", instances=");
		builder.append(instances);
		builder.append("]");
		return builder.toString();
	}

}
