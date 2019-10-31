// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.aad.msal4j;

/**
 * Representation of client credential containing a secret in string format
 */
public interface IClientSecret extends IClientCredential{

    /**
     * @return secret secret of application requesting a token
     */
    String clientSecret();
}
