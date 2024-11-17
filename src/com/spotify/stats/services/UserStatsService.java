package com.spotify.stats.services;

import com.spotify.stats.api.SpotifyApiClient;

public class UserStatsService {
    private SpotifyApiClient apiClient;

    public UserStatsService(SpotifyApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String getMostListenedTrack() {
        try {
            String response = apiClient.get("me/top/tracks?limit=1");
            // Parse JSON and retrieve track
            return "Most listened track: ..."; // Complete logic
        } catch (Exception e) {
            e.printStackTrace();
            return "Error retrieving data.";
        }
    }
}
