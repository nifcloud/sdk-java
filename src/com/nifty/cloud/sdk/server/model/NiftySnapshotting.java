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
package com.nifty.cloud.sdk.server.model;

import com.nifty.cloud.sdk.annotation.Query;


/**
 * スナップショット情報クラス。<br />
 * このクラスはスナップショット情報を格納します。
 */
public class NiftySnapshotting {

	/** スナップショットステータス */
	private String	state;

	/**
	 * スナップショットステータスを取得します。
	 *
	 * @return スナップショットステータス
	 */
	public String getState() {
		return state;
	}
	/**
	 * スナップショットステータスを設定します。
	 *
	 * @param state スナップショットステータス
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * スナップショットステータスを設定し、自オブジェクトを返します。
	 *
	 * @param state スナップショットステータス
	 * @return 自オブジェクト
	 */
	public NiftySnapshotting withState(String state) {
		setState(state);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[state=");
		builder.append(state);
		builder.append("]");
		return builder.toString();
	}
}