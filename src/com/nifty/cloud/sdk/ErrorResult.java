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
package com.nifty.cloud.sdk;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * サーバーにてエラーが発生した場合の処理結果クラス。<br />
 * このクラスはエラー情報を格納するクラスです。
 */
@XStreamAlias("Response")
@XStreamConverter(ErrorResultConverter.class)
public class ErrorResult extends Result {
	/** エラーコード */
	private String code;
	/** エラーメッセージ */
	private String message;

	/**
	 * エラーコードを取得します。
	 * 
	 * @return エラーコード
	 */
	public String getCode() {
		return code;
	}
	/**
	 * エラーコードを設定します。
	 * 
	 * @param code エラーコード
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * エラーメッセージを取得します。
	 * 
	 * @return エラーメッセージ
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * エラーメッセージを設定します。
	 * 
	 * @param message エラーメッセージ
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * エラーメッセージ全体を取得します。
	 * 
	 * @return message エラーメッセージ
	 */
	public String getFaultMessage() {
		return code + ": " + message;
	}
	
}
