package org.keycloak.protocol.oidc.federation.common.beans;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TrustMark {

    private String id;

    // OpenID Federation 1.0 final
    @JsonProperty("trust_mark")
    @JsonAlias("mark")
    private String trustMark;

    @JsonProperty("trust_mark_delegation")
    private String trustMarkDelegation;

    @JsonProperty("trust_mark_status")
    private String trustMarkStatus;

    private String ref;

    // Backward compatibility with old draft payloads
    private String iss;
    private String sub;
    private Long iat;
    private Long exp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrustMark() {
        return trustMark;
    }

    public void setTrustMark(String trustMark) {
        this.trustMark = trustMark;
    }

    public String getTrustMarkDelegation() {
        return trustMarkDelegation;
    }

    public void setTrustMarkDelegation(String trustMarkDelegation) {
        this.trustMarkDelegation = trustMarkDelegation;
    }

    public String getTrustMarkStatus() {
        return trustMarkStatus;
    }

    public void setTrustMarkStatus(String trustMarkStatus) {
        this.trustMarkStatus = trustMarkStatus;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public Long getIat() {
        return iat;
    }

    public void setIat(Long iat) {
        this.iat = iat;
    }

    public Long getExp() {
        return exp;
    }

    public void setExp(Long exp) {
        this.exp = exp;
    }

    // old name used in draft payloads
    public String getMark() {
        return trustMark;
    }

    public void setMark(String mark) {
        this.trustMark = mark;
    }
}
