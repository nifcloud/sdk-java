/*******************************************************************************
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 *
 */
package com.nifty.cloud.sdk.upload.model;

import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.upload.model.transform.UploadSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeUploads処理結果クラス。<br />
 * このクラスはDescribeUploadsのレスポンスを格納します。
 * 
 */
@XStreamAlias("DescribeUploadsResponse")
public class DescribeUploadsResult extends Result {
	/** アップロードタスクリスト */
	@XStreamAlias("uploads")
	@XStreamConverter(UploadSetConverter.class)
	private List<Upload> uploadSet;

	/**
	 * アップロードタスクリストを取得します。
	 * @return アップロードタスクリスト
	 */
	public List<Upload> getUploadSet() {
		return uploadSet;
	}
	/**
	 * アップロードタスクリストを設定します。
	 * @param uploadSet アップロードタスクリスト
	 */
	public void setUploadSet(List<Upload> uploadSet) {
		this.uploadSet = uploadSet;
	}
	/**
	 * アップロードタスクリストを設定し、自オブジェクトを返します。
	 * @param uploadSet アップロードタスクリスト
	 * @return 自オブジェクト
	 */
	public DescribeUploadsResult withUploadSet(List<Upload> uploadSet) {
		setUploadSet(uploadSet);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[uploadSet=");
		builder.append(uploadSet);
		return builder.toString();
	}
}
