package com.uid2.operator.model;

import java.time.Instant;

public class IdentityTokens {
    public static IdentityTokens LogoutToken = new IdentityTokens("", "", "", Instant.EPOCH, Instant.EPOCH, Instant.EPOCH);
    private final String advertisingToken;
    private final String userToken;
    private final String refreshToken;
    private final Instant identityExpires;
    private final Instant refreshExpires;
    private final Instant refreshFrom;

    public IdentityTokens(String advertisingToken, String userToken, String refreshToken,
                          Instant identityExpires, Instant refreshExpires, Instant refreshFrom) {
        this.advertisingToken = advertisingToken;
        this.userToken = userToken;
        this.refreshToken = refreshToken;
        this.identityExpires = identityExpires;
        this.refreshExpires = refreshExpires;
        this.refreshFrom = refreshFrom;
    }

    public String getAdvertisingToken() {
        return advertisingToken;
    }

    public String getUserToken() {
        return userToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public Instant getIdentityExpires() {
        return identityExpires;
    }

    public Instant getRefreshExpires() {
        return refreshExpires;
    }

    public Instant getRefreshFrom() {
        return refreshFrom;
    }
}
