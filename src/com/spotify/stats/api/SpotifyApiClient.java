package com.spotify.stats.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SpotifyApiClient {
    private final OkHttpClient client = new OkHttpClient();
    private final String accessToken;

    public SpotifyApiClient(String accessToken) {
        this.accessToken = accessToken;
    }

    public String get(String endpoint) throws Exception {
        Request request = new Request.Builder()
                .url("https://api.spotify.com/v1/" + endpoint)
                .addHeader("Authorization", "Bearer " + accessToken)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new Exception("Unexpected code: " + response);
            }
            assert response.body() != null;
            return response.body().string();
        }
    }
}
