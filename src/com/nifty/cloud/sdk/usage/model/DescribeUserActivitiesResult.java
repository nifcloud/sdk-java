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
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.usage.model.transform.UserActivitySetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeUserActivities処理結果クラス。<br />
 * このクラスはDescribeUserActivitiesのレスポンスを格納します。
 */
@XStreamAlias("DescribeUserActivitiesResponse")
public class DescribeUserActivitiesResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** ログ情報リスト */
	@XStreamAlias("userActivitiesSet")
	@XStreamConverter(UserActivitySetConverter.class)
	private List<UserActivity> userActivities;

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
	public DescribeUserActivitiesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * ログ情報リストを取得します。
	 * 
	 * @return ログ情報リスト
	 */
	public List<UserActivity> getUserActivities() {
		return userActivities;
	}

	/**
	 * ログ情報リストを設定します。
	 * 
	 * @param userActivities ログ情報リスト
	 */
	public void setUserActivities(List<UserActivity> userActivities) {
		this.userActivities = userActivities;
	}

	/**
	 * ログ情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param userActivities ログ情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeUserActivitiesResult withUserActivities(UserActivity... userActivities) {
		if (this.userActivities == null) this.userActivities = new ArrayList<UserActivity>();
		for (UserActivity userActivity : userActivities) {
			getUserActivities().add(userActivity);
		}
		return this;
	}

	/**
	 * ログ情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param userActivities ログ情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeUserActivitiesResult withUserActivities(List<UserActivity> userActivities) {
		if (this.userActivities == null) this.userActivities = new ArrayList<UserActivity>();
		if (userActivities != null) {
			getUserActivities().addAll(userActivities);
		}
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
		builder.append(", userActivities=");
		builder.append(userActivities);
		builder.append("]");
		return builder.toString();
	}
}
