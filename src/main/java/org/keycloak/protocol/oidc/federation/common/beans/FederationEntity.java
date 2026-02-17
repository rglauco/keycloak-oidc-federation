package org.keycloak.protocol.oidc.federation.common.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FederationEntity {
    
    @JsonProperty("federation_fetch_endpoint")
    @JsonAlias("federation_api_endpoint")
    private String federationFetchEndpoint;
    @JsonProperty("federation_list_endpoint")
    private String federationListEndpoint;
    @JsonProperty("federation_resolve_endpoint")
    private String federationResolveEndpoint;
    @JsonProperty("federation_trust_mark_status_endpoint")
    private String federationTrustMarkStatusEndpoint;
    @JsonProperty("federation_trust_mark_list_endpoint")
    private String federationTrustMarkListEndpoint;
    @JsonProperty("federation_trust_mark_endpoint")
    private String federationTrustMarkEndpoint;
    private String name;
    private List<String> contacts;
    @JsonProperty("policy_uri")
    private String policyUri;
    @JsonProperty("homepage_uri")
    private String homepageUri;
    @JsonProperty("trust_marks")
    private List<String> trustMarks;

    public String getFederationFetchEndpoint() {
        return federationFetchEndpoint;
    }

    public void setFederationFetchEndpoint(String federationFetchEndpoint) {
        this.federationFetchEndpoint = federationFetchEndpoint;
    }


    // backward compatibility with draft field name
    public String getFederationApiEndpoint() {
        return federationFetchEndpoint;
    }

    public void setFederationApiEndpoint(String federationApiEndpoint) {
        this.federationFetchEndpoint = federationApiEndpoint;
    }

    public String getFederationListEndpoint() {
        return federationListEndpoint;
    }

    public void setFederationListEndpoint(String federationListEndpoint) {
        this.federationListEndpoint = federationListEndpoint;
    }

    public String getFederationResolveEndpoint() {
        return federationResolveEndpoint;
    }

    public void setFederationResolveEndpoint(String federationResolveEndpoint) {
        this.federationResolveEndpoint = federationResolveEndpoint;
    }

    public String getFederationTrustMarkStatusEndpoint() {
        return federationTrustMarkStatusEndpoint;
    }

    public void setFederationTrustMarkStatusEndpoint(String federationTrustMarkStatusEndpoint) {
        this.federationTrustMarkStatusEndpoint = federationTrustMarkStatusEndpoint;
    }

    public String getFederationTrustMarkListEndpoint() {
        return federationTrustMarkListEndpoint;
    }

    public void setFederationTrustMarkListEndpoint(String federationTrustMarkListEndpoint) {
        this.federationTrustMarkListEndpoint = federationTrustMarkListEndpoint;
    }

    public String getFederationTrustMarkEndpoint() {
        return federationTrustMarkEndpoint;
    }

    public void setFederationTrustMarkEndpoint(String federationTrustMarkEndpoint) {
        this.federationTrustMarkEndpoint = federationTrustMarkEndpoint;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getContacts() {
        return contacts;
    }
    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }
    public String getPolicyUri() {
        return policyUri;
    }
    public void setPolicyUri(String policyUri) {
        this.policyUri = policyUri;
    }
    public String getHomepageUri() {
        return homepageUri;
    }
    public void setHomepageUri(String homepageUri) {
        this.homepageUri = homepageUri;
    }
    public List<String> getTrustMarks() {
        return trustMarks;
    }

    public void setTrustMarks(List<String> trustMarks) {
        this.trustMarks = trustMarks;
    }
}
