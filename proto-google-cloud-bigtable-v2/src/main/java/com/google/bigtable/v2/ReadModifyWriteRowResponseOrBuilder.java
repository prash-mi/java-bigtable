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
// source: google/bigtable/v2/bigtable.proto

package com.google.bigtable.v2;

public interface ReadModifyWriteRowResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ReadModifyWriteRowResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Row containing the new contents of all cells modified by the request.
   * </pre>
   *
   * <code>.google.bigtable.v2.Row row = 1;</code>
   *
   * @return Whether the row field is set.
   */
  boolean hasRow();
  /**
   *
   *
   * <pre>
   * A Row containing the new contents of all cells modified by the request.
   * </pre>
   *
   * <code>.google.bigtable.v2.Row row = 1;</code>
   *
   * @return The row.
   */
  com.google.bigtable.v2.Row getRow();
  /**
   *
   *
   * <pre>
   * A Row containing the new contents of all cells modified by the request.
   * </pre>
   *
   * <code>.google.bigtable.v2.Row row = 1;</code>
   */
  com.google.bigtable.v2.RowOrBuilder getRowOrBuilder();
}
