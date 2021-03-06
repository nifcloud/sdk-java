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
package com.nifty.cloud.sdk.disk.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DetachVolumeリクエストクラス。<br />
 * このクラスはDetachVolumeへのリクエストを構築します。
 */
@Action("DetachVolume")
public class DetachVolumeRequest implements Request {

	/** ディスク名 */
	private String	volumeId;

	/** サーバー名 */
	private String	instanceId;

	private String	device;

	private Boolean	force;

	/** 処理続行フラグ **/
	private Boolean agreement;

	/**
	 * ディスク名を取得します。
	 *
	 * @return ディスク名
	 */
	@Query(name="VolumeId", require=true)
	public String getVolumeId() {
		return volumeId;
	}
	/**
	 * ディスク名を取得します。
	 *
	 * @param volumeId ディスク名
	 */
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	/**
	 * ディスク名を取得し、自オブジェクトを返します。
	 *
	 * @param volumeId ディスク名
	 * @return 自オブジェクト
	 */
	public DetachVolumeRequest withVolumeId(String volumeId) {
		setVolumeId(volumeId);
		return this;
	}

	/**
	 * サーバー名を取得します。
	 *
	 * @return サーバー名
	 */
	@Query(name="InstanceId")
	public String getInstanceId() {
		return instanceId;
	}
	/**
	 * サーバー名を設定します。
	 *
	 * @param instanceId サーバー名
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/**
	 * サーバー名を設定し、自オブジェクトを返します。
	 *
	 * @param instanceId サーバー名
	 * @return 自オブジェクト
	 */
	public DetachVolumeRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}

	/**
	 * deviceを取得します。
	 *
	 * @return device
	 */
	@Query(name="Device")
	public String getDevice() {
		return device;
	}
	/**
	 * deviceを設定します。
	 *
	 * @param device
	 */
	public void setDevice(String device) {
		this.device = device;
	}
	/**
	 * deviceを設定し、自オブジェクトを返します。
	 *
	 * @param device
	 * @return 自オブジェクト
	 */
	public DetachVolumeRequest withDevice(String device) {
		setDevice(device);
		return this;
	}

	/**
	 * forceを取得します。
	 *
	 * @return force
	 */
	@Query(name="Force")
	public Boolean getForce() {
		return force;
	}
	/**
	 * forceを設定します。
	 *
	 * @param force
	 */
	public void setForce(Boolean force) {
		this.force = force;
	}
	/**
	 * forceを設定し、自オブジェクトを返します。
	 *
	 * @param force
	 * @return 自オブジェクト
	 */
	public DetachVolumeRequest withForce(Boolean force) {
		setForce(force);
		return this;
	}

	/**
	 * 処理続行フラグを取得します。
	 *
	 * @return 処理続行フラグ
	 */
	@Query(name="Agreement")
	public Boolean getAgreement() {
		return agreement;
	}
	/**
	 * 処理続行フラグを設定します。起動中のサーバーからディスクを外す際に設定します。<br />
	 * 起動中のサーバーからディスクを外す場合、OS上で必ず対象ディスクの認識を外してから操作を行ってください。<br />
	 * OSが対象ディスクを認識したまま外すと、サーバーが異常な状態になります。<br />
	 * ディスクの認識を外すには、こちら(<a href="http://cloud.nifty.com/rf/cp/help_detach_linux.htm" target="_blank">http://cloud.nifty.com/rf/cp/help_detach_linux.htm</a>)の手順をご確認ください。
	 *
	 * @param agreement 処理続行フラグ
	 */
	public void setAgreement(Boolean agreement) {
		this.agreement = agreement;
	}
	/**
	 * 処理続行フラグを設定し、自オブジェクトを返します。
	 *
	 * @param agreement 処理続行フラグ
	 * @return 自オブジェクト
	 */
	public DetachVolumeRequest withAgreement(Boolean agreement) {
		setAgreement(agreement);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[volumeId=");
		builder.append(volumeId);
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append(", device=");
		builder.append(device);
		builder.append(", force=");
		builder.append(force);
		builder.append(", agreement=");
		builder.append(agreement);
		builder.append("]");
		return builder.toString();
	}

}
