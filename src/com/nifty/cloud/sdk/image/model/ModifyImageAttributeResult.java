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
package com.nifty.cloud.sdk.image.model;

import com.nifty.cloud.sdk.Result;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ModifyImageAttribute処理結果クラス。<br />
 * このクラスはModifyImageAttributeのレスポンスを格納します。
 */
@XStreamAlias("ModifyImageAttributeResponse")
public class ModifyImageAttributeResult extends Result {
	
	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;
	
	/** 更新ステータス */
	@XStreamAlias("return")
	private Boolean _return;

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
	public ModifyImageAttributeResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	
	/**
	 * 更新ステータスを取得します。
	 * 
	 * @return 更新ステータス
	 */
	public Boolean getReturn() {
		return _return;
	}
	/**
	 * 更新ステータスを設定します。
	 * 
	 * @param _return 更新ステータス
	 */
	public void setReturn(Boolean _return) {
		this._return = _return;
	}
	/**
	 * 更新ステータスを設定します。
	 * 
	 * @param _return 更新ステータス
	 * @return 自オブジェクト
	 */
	public ModifyImageAttributeResult withReturn(Boolean _return) {
		setReturn(_return);
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
		builder.append("]");
		return builder.toString();
	}

}
