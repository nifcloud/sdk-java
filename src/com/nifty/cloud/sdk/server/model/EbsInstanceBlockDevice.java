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

import java.util.Date;

/**
 * 接続しているディスクの詳細情報クラス。<br />
 * このクラスは接続しているディスクの詳細情報を格納します。
 */
public class EbsInstanceBlockDevice {
	
	/** ディスク名 */
	private String	volumeId;
	
	/** 接続ステータス  */
	private String	status;
	
	/** ディスク接続日時 */
	private Date	attachTime;
	
	/** サーバー削除時のディスク消去フラグ  */
	private Boolean	deleteOnTermination;
	
	
	/**
	 * ディスク名を取得します。
	 * 
	 * @return ディスク名
	 */
	public String getVolumeId() {
		return volumeId;
	}
	/**
	 * ディスク名を設定します。
	 * 
	 * @param volumeId ディスク名
	 */
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	/**
	 * ディスク名を設定し、自オブジェクトを返します。
	 *
	 * @param volumeId ディスク名
	 * @return 自オブジェクト	 
	 */
	public EbsInstanceBlockDevice withVolumeId(String volumeId) {
		setVolumeId(volumeId);
		return this;
	}
	
	/**
	 * 接続ステータスを取得します。
	 * 
	 * @return 接続ステータス
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 接続ステータスを設定します。
	 * 
	 * @param status 接続ステータス
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 接続ステータスを設定し、自オブジェクトを返します。
	 *
	 * @param status 接続ステータス
	 * @return 自オブジェクト	 
	 */
	public EbsInstanceBlockDevice withStatus(String status) {
		setStatus(status);
		return this;
	}
	
	/**
	 * ディスク接続日時を取得します。
	 * 
	 * @return ディスク接続日時
	 */
	public Date getAttachTime() {
		return attachTime;
	}
	/**
	 * ディスク接続日時を設定します。
	 * 
	 * @param attachTime ディスク接続日時
	 */
	public void setAttachTime(Date attachTime) {
		this.attachTime = attachTime;
	}
	/**
	 * ディスク接続日時を設定し、自オブジェクトを返します。
	 *
	 * @param attachTime ディスク接続日時
	 * @return 自オブジェクト	 
	 */
	public EbsInstanceBlockDevice withAttachTime(Date attachTime) {
		setAttachTime(attachTime);
		return this;
	}
	
	/**
	 * サーバー削除時のディスク消去フラグを取得します。
	 * 
	 * @return サーバー削除時のディスク消去フラグ
	 */
	public Boolean getDeleteOnTermination() {
		return deleteOnTermination;
	}
	/**
	 * サーバー削除時のディスク消去フラグを設定します。
	 * 
	 * @param deleteOnTermination サーバー削除時のディスク消去フラグ
	 */
	public void setDeleteOnTermination(Boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	/**
	 * サーバー削除時のディスク消去フラグを設定し、自オブジェクトを返します。
	 *
	 * @param deleteOnTermination サーバー削除時のディスク消去フラグ
	 * @return 自オブジェクト	 
	 */
	public EbsInstanceBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
		setDeleteOnTermination(deleteOnTermination);
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
		builder.append(", status=");
		builder.append(status);
		builder.append(", attachTime=");
		builder.append(attachTime);
		builder.append(", deleteOnTermination=");
		builder.append(deleteOnTermination);
		builder.append("]");
		return builder.toString();
	}
	
}
