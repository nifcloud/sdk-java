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
package com.nifty.cloud.sdk.security.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * CreateKeyPairリクエストクラス。<br />
 * このクラスはCreateKeyPairへのリクエストを構築します。
 * 
 */
@Action("CreateKeyPair")
public class CreateKeyPairRequest implements Request {
	
	/** SSHキー名 */
	private String keyName;
	
	/** パスワード */
	private String password;
	
	/**
	 * SSHキー名を取得します。
	 * 
	 * @return SSHキー名
	 */
	@Query(name="KeyName", require=true)
	public String getKeyName() {
		return keyName;
	}
	/**
	 * SSHキー名を設定します。
	 * 
	 * @param keyName SSHキー名
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	/**
	 * SSHキー名を設定し、自オブジェクトを返します。
	 * 
	 * @param keyName SSHキー名
	 * @return 自オブジェクト	 
	 */
	public CreateKeyPairRequest withKeyName(String keyName) {
		setKeyName(keyName);
		return this;
	}
	
	/**
	 * パスワードを取得します。
	 * 
	 * @return パスワード
	 */
	@Query(name="Password", require=true)
	public String getPassword() {
		return password;
	}
	/**
	 * パスワードを設定します。
	 * 
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * パスワードを設定し、自オブジェクトを返します。
	 * 
	 * @param password パスワード
	 * @return 自オブジェクト	 
	 */
	public CreateKeyPairRequest withPassword(String password) {
		setPassword(password);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[keyName=");
		builder.append(keyName);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
