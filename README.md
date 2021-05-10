# kratos-client

Ory Kratos API
- API version: v0.6.0-alpha.5
  - Build date: 2021-05-10T11:42:23.157993085Z[Etc/UTC]

Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs
are exposed on different ports. Public APIs can face the public internet without any protection
while administrative APIs should never be exposed without prior authorization. To protect
the administative API port you should use something like Nginx, Ory Oathkeeper, or any other
technology capable of authorizing incoming requests.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>sh.ory.kratos</groupId>
  <artifactId>kratos-client</artifactId>
  <version>v0.6.0-alpha.5</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "sh.ory.kratos:kratos-client:v0.6.0-alpha.5"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/kratos-client-v0.6.0-alpha.5.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import sh.ory.kratos.ApiClient;
import sh.ory.kratos.ApiException;
import sh.ory.kratos.Configuration;
import sh.ory.kratos.models.*;
import sh.ory.kratos.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.tenants.oryapis.com/api/kratos/public");

    AdminApi apiInstance = new AdminApi(defaultClient);
    CreateIdentity createIdentity = new CreateIdentity(); // CreateIdentity | 
    try {
      Identity result = apiInstance.createIdentity(createIdentity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#createIdentity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://demo.tenants.oryapis.com/api/kratos/public*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**createIdentity**](docs/AdminApi.md#createIdentity) | **POST** /identities | Create an Identity
*AdminApi* | [**createRecoveryLink**](docs/AdminApi.md#createRecoveryLink) | **POST** /recovery/link | Create a Recovery Link
*AdminApi* | [**deleteIdentity**](docs/AdminApi.md#deleteIdentity) | **DELETE** /identities/{id} | Delete an Identity
*AdminApi* | [**getIdentity**](docs/AdminApi.md#getIdentity) | **GET** /identities/{id} | Get an Identity
*AdminApi* | [**getSchema**](docs/AdminApi.md#getSchema) | **GET** /schemas/{id} | 
*AdminApi* | [**getSelfServiceError**](docs/AdminApi.md#getSelfServiceError) | **GET** /self-service/errors | Get User-Facing Self-Service Errors
*AdminApi* | [**getSelfServiceLoginFlow**](docs/AdminApi.md#getSelfServiceLoginFlow) | **GET** /self-service/login/flows | Get Login Flow
*AdminApi* | [**getSelfServiceRecoveryFlow**](docs/AdminApi.md#getSelfServiceRecoveryFlow) | **GET** /self-service/recovery/flows | Get information about a recovery flow
*AdminApi* | [**getSelfServiceRegistrationFlow**](docs/AdminApi.md#getSelfServiceRegistrationFlow) | **GET** /self-service/registration/flows | Get Registration Flow
*AdminApi* | [**getSelfServiceSettingsFlow**](docs/AdminApi.md#getSelfServiceSettingsFlow) | **GET** /self-service/settings/flows | Get Settings Flow
*AdminApi* | [**getSelfServiceVerificationFlow**](docs/AdminApi.md#getSelfServiceVerificationFlow) | **GET** /self-service/verification/flows | Get Verification Flow
*AdminApi* | [**getVersion**](docs/AdminApi.md#getVersion) | **GET** /version | Return Running Software Version.
*AdminApi* | [**isAlive**](docs/AdminApi.md#isAlive) | **GET** /health/alive | Check HTTP Server Status
*AdminApi* | [**isReady**](docs/AdminApi.md#isReady) | **GET** /health/ready | Check HTTP Server and Database Status
*AdminApi* | [**listIdentities**](docs/AdminApi.md#listIdentities) | **GET** /identities | List Identities
*AdminApi* | [**prometheus**](docs/AdminApi.md#prometheus) | **GET** /metrics/prometheus | Get snapshot metrics from the Hydra service. If you&#39;re using k8s, you can then add annotations to your deployment like so:
*AdminApi* | [**updateIdentity**](docs/AdminApi.md#updateIdentity) | **PUT** /identities/{id} | Update an Identity
*PublicApi* | [**getSchema**](docs/PublicApi.md#getSchema) | **GET** /schemas/{id} | 
*PublicApi* | [**getSelfServiceError**](docs/PublicApi.md#getSelfServiceError) | **GET** /self-service/errors | Get User-Facing Self-Service Errors
*PublicApi* | [**getSelfServiceLoginFlow**](docs/PublicApi.md#getSelfServiceLoginFlow) | **GET** /self-service/login/flows | Get Login Flow
*PublicApi* | [**getSelfServiceRecoveryFlow**](docs/PublicApi.md#getSelfServiceRecoveryFlow) | **GET** /self-service/recovery/flows | Get information about a recovery flow
*PublicApi* | [**getSelfServiceRegistrationFlow**](docs/PublicApi.md#getSelfServiceRegistrationFlow) | **GET** /self-service/registration/flows | Get Registration Flow
*PublicApi* | [**getSelfServiceSettingsFlow**](docs/PublicApi.md#getSelfServiceSettingsFlow) | **GET** /self-service/settings/flows | Get Settings Flow
*PublicApi* | [**getSelfServiceVerificationFlow**](docs/PublicApi.md#getSelfServiceVerificationFlow) | **GET** /self-service/verification/flows | Get Verification Flow
*PublicApi* | [**initializeSelfServiceBrowserLogoutFlow**](docs/PublicApi.md#initializeSelfServiceBrowserLogoutFlow) | **GET** /self-service/browser/flows/logout | Initialize Browser-Based Logout User Flow
*PublicApi* | [**initializeSelfServiceLoginViaAPIFlow**](docs/PublicApi.md#initializeSelfServiceLoginViaAPIFlow) | **GET** /self-service/login/api | Initialize Login Flow for API clients
*PublicApi* | [**initializeSelfServiceLoginViaBrowserFlow**](docs/PublicApi.md#initializeSelfServiceLoginViaBrowserFlow) | **GET** /self-service/login/browser | Initialize Login Flow for browsers
*PublicApi* | [**initializeSelfServiceRecoveryViaAPIFlow**](docs/PublicApi.md#initializeSelfServiceRecoveryViaAPIFlow) | **GET** /self-service/recovery/api | Initialize Recovery Flow for API Clients
*PublicApi* | [**initializeSelfServiceRecoveryViaBrowserFlow**](docs/PublicApi.md#initializeSelfServiceRecoveryViaBrowserFlow) | **GET** /self-service/recovery/browser | Initialize Recovery Flow for Browser Clients
*PublicApi* | [**initializeSelfServiceRegistrationViaAPIFlow**](docs/PublicApi.md#initializeSelfServiceRegistrationViaAPIFlow) | **GET** /self-service/registration/api | Initialize Registration Flow for API clients
*PublicApi* | [**initializeSelfServiceRegistrationViaBrowserFlow**](docs/PublicApi.md#initializeSelfServiceRegistrationViaBrowserFlow) | **GET** /self-service/registration/browser | Initialize Registration Flow for browsers
*PublicApi* | [**initializeSelfServiceSettingsViaAPIFlow**](docs/PublicApi.md#initializeSelfServiceSettingsViaAPIFlow) | **GET** /self-service/settings/api | Initialize Settings Flow for API Clients
*PublicApi* | [**initializeSelfServiceSettingsViaBrowserFlow**](docs/PublicApi.md#initializeSelfServiceSettingsViaBrowserFlow) | **GET** /self-service/settings/browser | Initialize Settings Flow for Browsers
*PublicApi* | [**initializeSelfServiceVerificationViaAPIFlow**](docs/PublicApi.md#initializeSelfServiceVerificationViaAPIFlow) | **GET** /self-service/verification/api | Initialize Verification Flow for API Clients
*PublicApi* | [**initializeSelfServiceVerificationViaBrowserFlow**](docs/PublicApi.md#initializeSelfServiceVerificationViaBrowserFlow) | **GET** /self-service/verification/browser | Initialize Verification Flow for Browser Clients
*PublicApi* | [**revokeSession**](docs/PublicApi.md#revokeSession) | **DELETE** /sessions | Initialize Logout Flow for API Clients - Revoke a Session
*PublicApi* | [**submitSelfServiceLoginFlow**](docs/PublicApi.md#submitSelfServiceLoginFlow) | **POST** /self-service/login | Submit a Login Flow
*PublicApi* | [**submitSelfServiceRecoveryFlow**](docs/PublicApi.md#submitSelfServiceRecoveryFlow) | **POST** /self-service/recovery | Complete Recovery Flow
*PublicApi* | [**submitSelfServiceRecoveryFlowWithLinkMethod**](docs/PublicApi.md#submitSelfServiceRecoveryFlowWithLinkMethod) | **POST** /self-service/recovery/methods/link | Complete Recovery Flow with Link Method
*PublicApi* | [**submitSelfServiceRegistrationFlow**](docs/PublicApi.md#submitSelfServiceRegistrationFlow) | **POST** /self-service/registration | Submit a Registration Flow
*PublicApi* | [**submitSelfServiceSettingsFlow**](docs/PublicApi.md#submitSelfServiceSettingsFlow) | **POST** /self-service/settings | Complete Settings Flow
*PublicApi* | [**submitSelfServiceVerificationFlow**](docs/PublicApi.md#submitSelfServiceVerificationFlow) | **POST** /self-service/verification/methods/link | Complete Verification Flow
*PublicApi* | [**whoami**](docs/PublicApi.md#whoami) | **GET** /sessions/whoami | Check Who the Current HTTP Session Belongs To


## Documentation for Models

 - [AuthenticateOKBody](docs/AuthenticateOKBody.md)
 - [ContainerChangeResponseItem](docs/ContainerChangeResponseItem.md)
 - [ContainerCreateCreatedBody](docs/ContainerCreateCreatedBody.md)
 - [ContainerTopOKBody](docs/ContainerTopOKBody.md)
 - [ContainerUpdateOKBody](docs/ContainerUpdateOKBody.md)
 - [ContainerWaitOKBody](docs/ContainerWaitOKBody.md)
 - [ContainerWaitOKBodyError](docs/ContainerWaitOKBodyError.md)
 - [CreateIdentity](docs/CreateIdentity.md)
 - [CreateRecoveryLink](docs/CreateRecoveryLink.md)
 - [ErrorContainer](docs/ErrorContainer.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [GenericError](docs/GenericError.md)
 - [GenericErrorPayload](docs/GenericErrorPayload.md)
 - [GraphDriverData](docs/GraphDriverData.md)
 - [HealthNotReadyStatus](docs/HealthNotReadyStatus.md)
 - [HealthStatus](docs/HealthStatus.md)
 - [IdResponse](docs/IdResponse.md)
 - [Identity](docs/Identity.md)
 - [IdentityCredentials](docs/IdentityCredentials.md)
 - [ImageDeleteResponseItem](docs/ImageDeleteResponseItem.md)
 - [ImageSummary](docs/ImageSummary.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse503](docs/InlineResponse503.md)
 - [LoginFlow](docs/LoginFlow.md)
 - [LoginViaApiResponse](docs/LoginViaApiResponse.md)
 - [Meta](docs/Meta.md)
 - [Plugin](docs/Plugin.md)
 - [PluginConfig](docs/PluginConfig.md)
 - [PluginConfigArgs](docs/PluginConfigArgs.md)
 - [PluginConfigInterface](docs/PluginConfigInterface.md)
 - [PluginConfigLinux](docs/PluginConfigLinux.md)
 - [PluginConfigNetwork](docs/PluginConfigNetwork.md)
 - [PluginConfigRootfs](docs/PluginConfigRootfs.md)
 - [PluginConfigUser](docs/PluginConfigUser.md)
 - [PluginDevice](docs/PluginDevice.md)
 - [PluginEnv](docs/PluginEnv.md)
 - [PluginInterfaceType](docs/PluginInterfaceType.md)
 - [PluginMount](docs/PluginMount.md)
 - [PluginSettings](docs/PluginSettings.md)
 - [Port](docs/Port.md)
 - [RecoveryAddress](docs/RecoveryAddress.md)
 - [RecoveryFlow](docs/RecoveryFlow.md)
 - [RecoveryLink](docs/RecoveryLink.md)
 - [RegistrationFlow](docs/RegistrationFlow.md)
 - [RegistrationViaApiResponse](docs/RegistrationViaApiResponse.md)
 - [RevokeSession](docs/RevokeSession.md)
 - [ServiceUpdateResponse](docs/ServiceUpdateResponse.md)
 - [Session](docs/Session.md)
 - [SettingsFlow](docs/SettingsFlow.md)
 - [SettingsProfileFormConfig](docs/SettingsProfileFormConfig.md)
 - [SettingsViaApiResponse](docs/SettingsViaApiResponse.md)
 - [SubmitSelfServiceBrowserSettingsOIDCFlowPayload](docs/SubmitSelfServiceBrowserSettingsOIDCFlowPayload.md)
 - [SubmitSelfServiceLoginFlow](docs/SubmitSelfServiceLoginFlow.md)
 - [SubmitSelfServiceLoginFlowWithPasswordMethod](docs/SubmitSelfServiceLoginFlowWithPasswordMethod.md)
 - [SubmitSelfServiceRecoveryFlowWithLinkMethod](docs/SubmitSelfServiceRecoveryFlowWithLinkMethod.md)
 - [SubmitSelfServiceRegistrationFlow](docs/SubmitSelfServiceRegistrationFlow.md)
 - [SubmitSelfServiceRegistrationFlowWithPasswordMethod](docs/SubmitSelfServiceRegistrationFlowWithPasswordMethod.md)
 - [SubmitSelfServiceSettingsFlow](docs/SubmitSelfServiceSettingsFlow.md)
 - [SubmitSelfServiceSettingsFlowWithPasswordMethod](docs/SubmitSelfServiceSettingsFlowWithPasswordMethod.md)
 - [SubmitSelfServiceSettingsFlowWithProfileMethod](docs/SubmitSelfServiceSettingsFlowWithProfileMethod.md)
 - [SubmitSelfServiceVerificationFlowWithLinkMethod](docs/SubmitSelfServiceVerificationFlowWithLinkMethod.md)
 - [UiContainer](docs/UiContainer.md)
 - [UiNode](docs/UiNode.md)
 - [UiNodeAnchorAttributes](docs/UiNodeAnchorAttributes.md)
 - [UiNodeAttributes](docs/UiNodeAttributes.md)
 - [UiNodeImageAttributes](docs/UiNodeImageAttributes.md)
 - [UiNodeInputAttributes](docs/UiNodeInputAttributes.md)
 - [UiNodeInputAttributesValue](docs/UiNodeInputAttributesValue.md)
 - [UiNodeTextAttributes](docs/UiNodeTextAttributes.md)
 - [UiText](docs/UiText.md)
 - [UpdateIdentity](docs/UpdateIdentity.md)
 - [VerifiableAddress](docs/VerifiableAddress.md)
 - [VerificationFlow](docs/VerificationFlow.md)
 - [Version](docs/Version.md)
 - [Volume](docs/Volume.md)
 - [VolumeUsageData](docs/VolumeUsageData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### sessionCookie

- **Type**: API key
- **API key parameter name**: ory_kratos_session
- **Location**: 

### sessionToken

- **Type**: API key
- **API key parameter name**: X-Session-Token
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hi@ory.sh

