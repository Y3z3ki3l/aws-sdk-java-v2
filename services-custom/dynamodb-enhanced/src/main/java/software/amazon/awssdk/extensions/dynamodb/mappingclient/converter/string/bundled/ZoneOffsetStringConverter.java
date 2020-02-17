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

package software.amazon.awssdk.extensions.dynamodb.mappingclient.converter.string.bundled;

import java.time.ZoneOffset;
import software.amazon.awssdk.annotations.Immutable;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.annotations.ThreadSafe;
import software.amazon.awssdk.extensions.dynamodb.mappingclient.converter.TypeToken;
import software.amazon.awssdk.extensions.dynamodb.mappingclient.converter.string.StringConverter;

/**
 * A converter between {@link ZoneOffset} and {@link String}.
 */
@SdkPublicApi
@ThreadSafe
@Immutable
public class ZoneOffsetStringConverter implements StringConverter<ZoneOffset> {
    private ZoneOffsetStringConverter() { }

    public static ZoneOffsetStringConverter create() {
        return new ZoneOffsetStringConverter();
    }

    @Override
    public TypeToken<ZoneOffset> type() {
        return TypeToken.of(ZoneOffset.class);
    }

    @Override
    public ZoneOffset fromString(String string) {
        return ZoneOffset.of(string);
    }
}
