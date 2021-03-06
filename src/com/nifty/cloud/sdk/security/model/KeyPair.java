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

/**
 * SSHキーペア情報クラス。<br />
 * このクラスはSSHキーペア情報を格納します。
 */
public class KeyPair {

	/** SSHキー名 */
	private String	keyName;
	
	/** SHA-1エンコードキー */
	private String	keyFingerprint;
	
	/** RSAキー */
	private String	keyMaterial;
	
	
	/**
	 * SSHキー名を取得します。
	 * 
	 * @return SSHキー名
	 */
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
	public KeyPair withKeyName(String keyName) {
		setKeyName(keyName);
		return this;
	}

	/**
	 * SHA-1エンコードキーを取得します。
	 * 
	 * @return SHA-1エンコードキー
	 */
	public String getKeyFingerprint() {
		return keyFingerprint;
	}
	/**
	 * SHA-1エンコードキーを設定します。
	 * 
	 * @param keyFingerprint SHA-1エンコードキー
	 */
	public void setKeyFingerprint(String keyFingerprint) {
		this.keyFingerprint = keyFingerprint;
	}
	/**
	 * RSAキーを設定し、自オブジェクトを返します。
	 * 
	 * @param keyFingerprint RSAキー
	 * @return 自オブジェクト	 
	 */
	public KeyPair withKeyFingerprint(String keyFingerprint) {
		setKeyFingerprint(keyFingerprint);
		return this;
	}

	/**
	 * RSAキーを取得します。
	 * 
	 * @return RSAキー
	 */
	public String getKeyMaterial() {
		return keyMaterial;
	}
	/**
	 * RSAキーを設定します。
	 * 
	 * @param keyMaterial RSAキー
	 */
	public void setKeyMaterial(String keyMaterial) {
		this.keyMaterial = keyMaterial;
	}
	/**
	 * RSAキーを設定し、自オブジェクトを返します。
	 * 
	 * @param keyMaterial RSAキー
	 * @return 自オブジェクト	 
	 */
	public KeyPair withKeyMaterial(String keyMaterial) {
		setKeyMaterial(keyMaterial);
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
		builder.append(", keyFingerprint=");
		builder.append(keyFingerprint);
		builder.append(", keyMaterial=");
		builder.append(keyMaterial);
		builder.append("]");
		return builder.toString();
	}
	
}
