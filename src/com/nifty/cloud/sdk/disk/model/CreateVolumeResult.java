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

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.disk.model.transform.CreateVolumeResponseConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * CreateVolume処理結果クラス。<br />
 * このクラスはCreateVolumeのレスポンスを格納します。
 */
@XStreamAlias("CreateVolumeResponse")
@XStreamConverter(CreateVolumeResponseConverter.class)
public class CreateVolumeResult extends Result {
	
	/** リクエスト識別子 */
	private String requestId;
	
	/** ディスク情報 */
	private Volume volume;
	
	
	/**
	 * リクエスト識別子を取得します。
	 * 
	 * @return リクエスト識別子
	 */
	public String getRequestId() {
		return requestId;
	}
	/**
	 * リクエスト識別子を設定します。
	 * 
	 * @param requestId リクエスト識別子
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * リクエスト識別子を設定し、自オブジェクトを返します。
	 * 
	 * @param requestId リクエスト識別子
	 * @return 自オブジェクト
	 */
	public CreateVolumeResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * ディスク情報を取得します。
	 * 
	 * @return ディスク情報
	 */
	public Volume getVolume() {
		return volume;
	}
	/**
	 * ディスク情報を設定します。
	 * 
	 * @param volume ディスク情報
	 */
	public void setVolume(Volume volume) {
		this.volume = volume;
	}
	/**
	 * ディスク情報を設定し、自オブジェクトを返します。
	 * 
	 * @param volume ディスク情報
	 * @return 自オブジェクト
	 */
	public CreateVolumeResult withVolume(Volume volume) {
		setVolume(volume);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append(", volume=");
		builder.append(volume);
		builder.append("]");
		return builder.toString();
	}
	
}
