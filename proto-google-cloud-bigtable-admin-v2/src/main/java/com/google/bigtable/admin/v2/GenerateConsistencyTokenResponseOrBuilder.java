/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

public interface GenerateConsistencyTokenResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.GenerateConsistencyTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The generated consistency token.
   * </pre>
   *
   * <code>string consistency_token = 1;</code>
   *
   * @return The consistencyToken.
   */
  java.lang.String getConsistencyToken();
  /**
   *
   *
   * <pre>
   * The generated consistency token.
   * </pre>
   *
   * <code>string consistency_token = 1;</code>
   *
   * @return The bytes for consistencyToken.
   */
  com.google.protobuf.ByteString getConsistencyTokenBytes();
}
