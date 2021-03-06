/*
* Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License").
* You may not use this file except in compliance with the License.
* A copy of the License is located at
*
*  http://aws.amazon.com/apache2.0
*
* or in the "license" file accompanying this file. This file is distributed
* on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
* express or implied. See the License for the specific language governing
* permissions and limitations under the License.
*/
package software.amazon.cloudformation.exceptions;

/**
 * Uses for this exception class should delegate instead to
 * CfnAlreadyExistsException. Many APIs use exception classes titled
 * ResourceAlreadyExistsException, and if handler authors use this class,
 * they'll often need to use the fully qualified exception name.
 */
public class ResourceAlreadyExistsException extends CfnAlreadyExistsException {

    private static final long serialVersionUID = -1646136434112354328L;

    public ResourceAlreadyExistsException(final Throwable cause) {
        super(cause);
    }

    public ResourceAlreadyExistsException(final String resourceTypeName,
                                          final String resourceIdentifier) {
        this(resourceTypeName, resourceIdentifier, null);
    }

    public ResourceAlreadyExistsException(final String resourceTypeName,
                                          final String resourceIdentifier,
                                          final Throwable cause) {
        super(resourceTypeName, resourceIdentifier, cause);
    }
}
