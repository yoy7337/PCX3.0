
package com.tutk.device.apis;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.apache.http.Header;

public class RestFulApis {
    private static String PRIVATE_KEY = "8888";
    private static String RESTFUL_SERVER_IP = "127.0.0.1";
    private static String RESTFUL_SERVER_PORT = "8080";
    private static AsyncHttpClient client = new AsyncHttpClient();

    public void ping() {
        //client
    }

    private AsyncHttpResponseHandler mAsyncHttpResponseHandler = new AsyncHttpResponseHandler() {
        @Override
        public void onStart() {
            // called before request is started
        }

        @Override
        public void onSuccess(int statusCode, Header[] headers, byte[] response) {
            // called when response HTTP status is "200 OK"
        }

        @Override
        public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
            // called when response HTTP status is "4XX" (eg. 401, 403, 404)
        }

        @Override
        public void onRetry(int retryNo) {
            // called when request is retried
        }
    };
}
