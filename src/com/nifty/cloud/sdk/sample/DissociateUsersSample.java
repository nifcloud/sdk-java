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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 * 
 */
package com.nifty.cloud.sdk.sample;

import static java.lang.System.err;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Protocol;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureMethod;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;
import com.nifty.cloud.sdk.misc.NiftyMiscClient;
import com.nifty.cloud.sdk.misc.model.DissociateUsersRequest;
import com.nifty.cloud.sdk.misc.model.DissociateUsersResult;
import com.nifty.cloud.sdk.misc.model.UserInfo;

/**
 * DissociateUsersSampleサンプル
 *
 */
public class DissociateUsersSample {

    /**
     * DissociateUsersSampleを実行するサンプルです。
     * 必要なパラメーターを設定してから利用してください。
     *
     * @param args 利用しない
     */
    public static void main(String[] args) {

        /************************************************************************
         * AccessKeyとSecretAccessKeyを設定します。 キーはNIFTY Cloudのコントロールパネルから取得します。
         ***********************************************************************/
        String accessKey = "<Input Your AccessKey>";
        String secretKey = "<Input Your SecretAccessKey>";

        /************************************************************************
         * 指定されたAccessKeyとSecretAccessKeyから認証情報インスタンスを生成します。
         ***********************************************************************/
        Credentials credential = new BasicCredentials(accessKey, secretKey);

        /************************************************************************
         * クライアント設定情報インスタンスを生成します。
         * 設定情報を変更する場合は値を設定します。
         * 以下の項目について設定可能です。
         *   - ユーザーエージェント
         *   - プロトコル
         *   - プロキシサーバーアドレス
         *   - プロキシサーバーポート番号
         *   - プロキシユーザー名
         *   - プロキシパスワード
         *   - 最大リトライ回数
         *   - 最大接続数
         *   - TCPソケットタイムアウト秒数
         *   - 接続タイムアウト秒数
         *   - 送信バッファサイズ / 受信バッファサイズ
         *   - SignatureVersion
         *   - SignatureMethod
         *     HTTPメソッド
         ***********************************************************************/
         ClientConfiguration config = new ClientConfiguration();
         //config.setUserAgent("NIFTY Cloud API Java SDK");
         //config.setProtocol(Protocol.HTTPS);
         //config.setProxyHost("proxy_port");
         //config.setProxyPort(0);
         //config.setProxyUsername("proxy_username");
         //config.setProxyPassword("proxy_password");
         //config.setMaxErrorRetry(3);
         //config.setMaxConnections(50);
         //config.setSocketTimeout(30);
         //config.setConnectionTimeout(30);
         //config.setSocketSendBufferSizeHint(0, 0);
         //config.setSignatureVersion(SignatureVersion.Version_2);
         //config.setSignatureMethod(SignatureMethod.HmacSHA256);
         //config.setRequestMethod("GET");

        /************************************************************************
         * 認証情報とクライアント設定情報からファイアウォールカテゴリクライアントを生成します。
         * 非同期実行を行う場合はNiftyMiscAsyncClientクラスを指定します。
         ***********************************************************************/
         NiftyMiscClient client = new NiftyMiscClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
         //client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、DissociateUsersSampleを実行します。
         ***********************************************************************/
         DissociateUsersRequest request = new DissociateUsersRequest();
         //request.setFunction("LB");
         //ArrayList<String> users = new ArrayList<String>();
         //users.add("ABC00001");
         //users.add("ABC00002");
         //request.setUserid(users);


         invokeDissociateUsers(client, request);
    }
    

    /**
     * DissociateUsers 実行サンプル
     * 設定されたリクエストから DissociateUsersを実行し、実行結果を表示します。
     *
     * @param client   クライアント
     * @param request  リクエスト
     */
    public static void invokeDissociateUsers(
            NiftyMiscClient client,
            DissociateUsersRequest request) {
        try {
            DissociateUsersResult result = client.dissociateUsers(request);

            out.println("DissociateUsers Action Response");
            out.println("=============================================================================");

            if (result.getUserInfo() != null){
                out.println("Users");
                for(UserInfo uid : result.getUserInfo()){
                	out.println("UserId : " + uid.getUserId());
                }
            }

            out.println("=============================================================================");
        } catch (NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }

}
