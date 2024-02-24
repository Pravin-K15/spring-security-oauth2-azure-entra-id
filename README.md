# spring-security-oauth2

This repo is demonstrate how to Add sign-in with Microsoft Entra account to a Spring web app.

Once the application is initialized, it'll redirect to the Microsoft Entra sign-in page when it's been accessed anonymously. On entering the email id, the user will be redirected to the login page.

Internal user (B2C) can login with their Password and 2FA (if enabled).

External user (B2B) will be redirected to their respective domain login page.

After you've logged in successfully, you should see the "Authenticated User Detail" page with the userName, email, tenant id, client id and validity of the access token.

Refer the below link for Microsoft Azure Entra ID - tenant, app and user registration

https://learn.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-active-directory