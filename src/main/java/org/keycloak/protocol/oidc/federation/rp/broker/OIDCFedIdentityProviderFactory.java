package org.keycloak.protocol.oidc.federation.rp.broker;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.provider.ProviderConfigProperty;

public class OIDCFedIdentityProviderFactory extends AbstractIdentityProviderFactory<OIDCFedIdentityProvider> {

    public static final String PROVIDER_ID = "oidc-federation";

    @Override
    public String getName() {
        return "OpenID Connect Federation";
    }

    @Override
    public OIDCFedIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new OIDCFedIdentityProvider(session, new OIDCFedIdentityProviderConfig(model));
    }

    @Override
    public OIDCFedIdentityProviderConfig createConfig() {
        return new OIDCFedIdentityProviderConfig();
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public Map<String, String> parseConfig(KeycloakSession session, InputStream inputStream) {
        // may be needed to implement later
        return new HashMap<>();
    }

    public List<ProviderConfigProperty> getConfigProperties() {
        List<ProviderConfigProperty> properties = new ArrayList<>();

        properties.add(buildStringProperty(OIDCFedIdentityProviderConfig.CLIENT_REGISTRATION_TYPES,
            "Registration Type", "OIDC Federation registration type: automatic or explicit."));
        properties.add(buildStringProperty(OIDCFedIdentityProviderConfig.ORGANIZATION_NAME,
            "Organization Name", "Organization name sent in federation metadata."));
        properties.add(buildStringProperty(OIDCFedIdentityProviderConfig.EXPIRED,
            "Registration Expiration (epoch)", "Client expiration timestamp in epoch seconds."));

        properties.add(buildTextProperty(OIDCFedIdentityProviderConfig.AUTHORITY_HINTS,
            "Authority Hints", "JSON array of authority hints, e.g. [\"https://ta.example.org\"]"));
        properties.add(buildTextProperty(OIDCFedIdentityProviderConfig.TRUST_ANCHOR_IDS,
            "Trust Anchor IDs", "JSON array of trust anchors, e.g. [\"https://ta.example.org\"]"));

        properties.add(buildStringProperty(OIDCFedIdentityProviderConfig.OP_ENTITY_IDENTIFIER,
            "OP Entity Identifier", "Federation OP entity identifier."));

        return properties;
    }

    private ProviderConfigProperty buildStringProperty(String name, String label, String helpText) {
        ProviderConfigProperty property = new ProviderConfigProperty();
        property.setName(name);
        property.setLabel(label);
        property.setHelpText(helpText);
        property.setType(ProviderConfigProperty.STRING_TYPE);
        return property;
    }

    private ProviderConfigProperty buildTextProperty(String name, String label, String helpText) {
        ProviderConfigProperty property = new ProviderConfigProperty();
        property.setName(name);
        property.setLabel(label);
        property.setHelpText(helpText);
        property.setType(ProviderConfigProperty.TEXT_TYPE);
        return property;
    }
}
