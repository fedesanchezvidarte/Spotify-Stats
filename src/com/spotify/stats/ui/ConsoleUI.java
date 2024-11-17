package com.spotify.stats.ui;

import com.spotify.stats.api.SpotifyAuthService;
import com.spotify.stats.api.SpotifyApiClient;
import com.spotify.stats.services.UserStatsService;

public class ConsoleUI {
    public void start() {
        SpotifyAuthService authService = new SpotifyAuthService();
        String accessToken = authService.authenticate();

        SpotifyApiClient apiClient = new SpotifyApiClient(accessToken);
        UserStatsService statsService = new UserStatsService(apiClient);

        System.out.println(statsService.getMostListenedTrack());
    }
}
