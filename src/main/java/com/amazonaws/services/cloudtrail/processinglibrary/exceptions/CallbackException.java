/*******************************************************************************
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 ******************************************************************************/

package com.amazonaws.services.cloudtrail.processinglibrary.exceptions;

import com.amazonaws.services.cloudtrail.processinglibrary.progress.ProgressStatus;

/**
 * The exception from call back to implementation of AWSCloudTrailClientLibrary interfaces.
 */
public class CallbackException extends ProcessingLibraryException{

    private static final long serialVersionUID = -2425808722370565843L;

    public CallbackException(String message, ProgressStatus status) {
        super(message, status);
    }


    public CallbackException(String message, Exception e, ProgressStatus status) {
        super(message, e, status);
    }
}