/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.api;

import sh.ory.kratos.ApiException;
import sh.ory.kratos.model.CompleteSelfServiceBrowserProfileManagementFlowPayload;
import sh.ory.kratos.model.ErrorContainer;
import sh.ory.kratos.model.GenericError;
import sh.ory.kratos.model.LoginRequest;
import sh.ory.kratos.model.ProfileManagementRequest;
import sh.ory.kratos.model.RegistrationRequest;
import sh.ory.kratos.model.Session;
import sh.ory.kratos.model.VerificationRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicApi
 */
@Ignore
public class PublicApiTest {

    private final PublicApi api = new PublicApi();

    
    /**
     * Complete the browser-based profile management flows
     *
     * This endpoint completes a browser-based profile management flow. This is usually achieved by POSTing data to this endpoint.  If the provided profile data is valid against the Identity&#39;s Traits JSON Schema, the data will be updated and the browser redirected to &#x60;url.profile_ui&#x60; for further steps.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...) and HTML Forms.  More information can be found at [ORY Kratos Profile Management Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-profile-management).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeSelfServiceBrowserProfileManagementFlowTest() throws ApiException {
        String request = null;
        CompleteSelfServiceBrowserProfileManagementFlowPayload body = null;
        api.completeSelfServiceBrowserProfileManagementFlow(request, body);

        // TODO: test validations
    }
    
    /**
     * Complete the browser-based profile management flows
     *
     * This endpoint completes a browser-based profile management flow. This is usually achieved by POSTing data to this endpoint.  If the provided profile data is valid against the Identity&#39;s Traits JSON Schema, the data will be updated and the browser redirected to &#x60;url.profile_ui&#x60; for further steps.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...) and HTML Forms.  More information can be found at [ORY Kratos Email and Phone Verification Documentation](https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeSelfServiceBrowserVerificationFlowTest() throws ApiException {
        String request = null;
        api.completeSelfServiceBrowserVerificationFlow(request);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based login user flows
     *
     * This endpoint returns a login request&#39;s context with, for example, error details and other information.  When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for CSRF to work. To prevent token scanning attacks, the public endpoint does not return 404 status codes to prevent scanning attacks.  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserLoginRequestTest() throws ApiException {
        String request = null;
        LoginRequest response = api.getSelfServiceBrowserLoginRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based profile management flows
     *
     * When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for checking the auth session. To prevent scanning attacks, the public endpoint does not return 404 status codes but instead 403 or 500.  More information can be found at [ORY Kratos Profile Management Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-profile-management).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserProfileManagementRequestTest() throws ApiException {
        String request = null;
        ProfileManagementRequest response = api.getSelfServiceBrowserProfileManagementRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based registration user flows
     *
     * This endpoint returns a registration request&#39;s context with, for example, error details and other information.  When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for CSRF to work. To prevent token scanning attacks, the public endpoint does not return 404 status codes to prevent scanning attacks.  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserRegistrationRequestTest() throws ApiException {
        String request = null;
        RegistrationRequest response = api.getSelfServiceBrowserRegistrationRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get user-facing self-service errors
     *
     * This endpoint returns the error associated with a user-facing self service errors.  When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for CSRF to work. To prevent token scanning attacks, the public endpoint does not return 404 status codes to prevent scanning attacks.  More information can be found at [ORY Kratos User User Facing Error Documentation](https://www.ory.sh/docs/kratos/self-service/flows/user-facing-errors).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceErrorTest() throws ApiException {
        String id = null;
        ErrorContainer response = api.getSelfServiceError(id);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based verification flows
     *
     * When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for checking the auth session. To prevent scanning attacks, the public endpoint does not return 404 status codes but instead 403 or 500.  More information can be found at [ORY Kratos Email and Phone Verification Documentation](https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceVerificationRequestTest() throws ApiException {
        String request = null;
        VerificationRequest response = api.getSelfServiceVerificationRequest(request);

        // TODO: test validations
    }
    
    /**
     * Initialize browser-based login user flow
     *
     * This endpoint initializes a browser-based user login flow. Once initialized, the browser will be redirected to &#x60;urls.login_ui&#x60; with the request ID set as a query parameter. If a valid user session exists already, the browser will be redirected to &#x60;urls.default_redirect_url&#x60;.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceBrowserLoginFlowTest() throws ApiException {
        api.initializeSelfServiceBrowserLoginFlow();

        // TODO: test validations
    }
    
    /**
     * Initialize Browser-Based Logout User Flow
     *
     * This endpoint initializes a logout flow.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  On successful logout, the browser will be redirected (HTTP 302 Found) to &#x60;urls.default_return_to&#x60;.  More information can be found at [ORY Kratos User Logout Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-logout).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceBrowserLogoutFlowTest() throws ApiException {
        api.initializeSelfServiceBrowserLogoutFlow();

        // TODO: test validations
    }
    
    /**
     * Initialize browser-based registration user flow
     *
     * This endpoint initializes a browser-based user registration flow. Once initialized, the browser will be redirected to &#x60;urls.registration_ui&#x60; with the request ID set as a query parameter. If a valid user session exists already, the browser will be redirected to &#x60;urls.default_redirect_url&#x60;.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceBrowserRegistrationFlowTest() throws ApiException {
        api.initializeSelfServiceBrowserRegistrationFlow();

        // TODO: test validations
    }
    
    /**
     * Initialize browser-based verification flow
     *
     * This endpoint initializes a browser-based profile management flow. Once initialized, the browser will be redirected to &#x60;urls.profile_ui&#x60; with the request ID set as a query parameter. If no valid user session exists, a login flow will be initialized.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  More information can be found at [ORY Kratos Email and Phone Verification Documentation](https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceBrowserVerificationFlowTest() throws ApiException {
        String via = null;
        api.initializeSelfServiceBrowserVerificationFlow(via);

        // TODO: test validations
    }
    
    /**
     * Initialize browser-based profile management flow
     *
     * This endpoint initializes a browser-based profile management flow. Once initialized, the browser will be redirected to &#x60;urls.profile_ui&#x60; with the request ID set as a query parameter. If no valid user session exists, a login flow will be initialized.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  More information can be found at [ORY Kratos Profile Management Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-profile-management).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceProfileManagementFlowTest() throws ApiException {
        api.initializeSelfServiceProfileManagementFlow();

        // TODO: test validations
    }
    
    /**
     * Complete the browser-based verification flows
     *
     * This endpoint completes a browser-based verification flow.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...) and HTML Forms.  More information can be found at [ORY Kratos Email and Phone Verification Documentation](https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void selfServiceBrowserVerifyTest() throws ApiException {
        String code = null;
        api.selfServiceBrowserVerify(code);

        // TODO: test validations
    }
    
    /**
     * Check who the current HTTP session belongs to
     *
     * Uses the HTTP Headers in the GET request to determine (e.g. by using checking the cookies) who is authenticated. Returns a session object or 401 if the credentials are invalid or no credentials were sent.  This endpoint is useful for reverse proxies and API Gateways.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void whoamiTest() throws ApiException {
        Session response = api.whoami();

        // TODO: test validations
    }
    
}
