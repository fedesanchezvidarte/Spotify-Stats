package com.spotify.stats.api;

import se.michaelthelin.spotify.SpotifyApi;
import com.spotify.stats.utils.ScannerUtils;

import java.net.URI;

public class SpotifyAuthService {
    private static final String CLIENT_ID = "your_client_id";
    private static final String CLIENT_SECRET = "your_client_secret";
    private static final String REDIRECT_URI = "your_redirect_uri";


    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setClientId(CLIENT_ID)
            .setClientSecret(CLIENT_SECRET)
            .setRedirectUri(URI.create(REDIRECT_URI))
            .build();

    public String authenticate() {
        String authUrl = "https://accounts.spotify.com/authorize?client_id=" + CLIENT_ID
                         + "&response_type=code&redirect_uri=" + REDIRECT_URI;
        System.out.println("Please, go to the following link to autenticate:");
        System.out.println(authUrl);

        System.out.print("Enter authorization code: ");
        String authCode = ScannerUtils.getScanner().nextLine();

        // Implement logig to obtain token with authCode
        return authCode;
    }
}
