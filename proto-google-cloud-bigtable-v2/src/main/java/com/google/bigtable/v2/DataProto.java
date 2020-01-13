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
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

public final class DataProto {
  private DataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_Row_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_Row_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_Family_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_Family_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_Column_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_Column_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_Cell_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_Cell_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_RowRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_RowRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_RowSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_RowSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_ColumnRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_ColumnRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_TimestampRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_TimestampRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_ValueRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_ValueRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_RowFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_RowFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_RowFilter_Chain_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_RowFilter_Chain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_RowFilter_Interleave_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_RowFilter_Interleave_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_RowFilter_Condition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_RowFilter_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_Mutation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_Mutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_Mutation_SetCell_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_Mutation_SetCell_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_Mutation_DeleteFromColumn_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_Mutation_DeleteFromColumn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_Mutation_DeleteFromFamily_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_Mutation_DeleteFromFamily_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_Mutation_DeleteFromRow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_Mutation_DeleteFromRow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_v2_ReadModifyWriteRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_ReadModifyWriteRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\035google/bigtable/v2/data.proto\022\022google."
          + "bigtable.v2\"@\n\003Row\022\013\n\003key\030\001 \001(\014\022,\n\010famil"
          + "ies\030\002 \003(\0132\032.google.bigtable.v2.Family\"C\n"
          + "\006Family\022\014\n\004name\030\001 \001(\t\022+\n\007columns\030\002 \003(\0132\032"
          + ".google.bigtable.v2.Column\"D\n\006Column\022\021\n\t"
          + "qualifier\030\001 \001(\014\022\'\n\005cells\030\002 \003(\0132\030.google."
          + "bigtable.v2.Cell\"?\n\004Cell\022\030\n\020timestamp_mi"
          + "cros\030\001 \001(\003\022\r\n\005value\030\002 \001(\014\022\016\n\006labels\030\003 \003("
          + "\t\"\212\001\n\010RowRange\022\032\n\020start_key_closed\030\001 \001(\014"
          + "H\000\022\030\n\016start_key_open\030\002 \001(\014H\000\022\026\n\014end_key_"
          + "open\030\003 \001(\014H\001\022\030\n\016end_key_closed\030\004 \001(\014H\001B\013"
          + "\n\tstart_keyB\t\n\007end_key\"L\n\006RowSet\022\020\n\010row_"
          + "keys\030\001 \003(\014\0220\n\nrow_ranges\030\002 \003(\0132\034.google."
          + "bigtable.v2.RowRange\"\306\001\n\013ColumnRange\022\023\n\013"
          + "family_name\030\001 \001(\t\022 \n\026start_qualifier_clo"
          + "sed\030\002 \001(\014H\000\022\036\n\024start_qualifier_open\030\003 \001("
          + "\014H\000\022\036\n\024end_qualifier_closed\030\004 \001(\014H\001\022\034\n\022e"
          + "nd_qualifier_open\030\005 \001(\014H\001B\021\n\017start_quali"
          + "fierB\017\n\rend_qualifier\"N\n\016TimestampRange\022"
          + "\036\n\026start_timestamp_micros\030\001 \001(\003\022\034\n\024end_t"
          + "imestamp_micros\030\002 \001(\003\"\230\001\n\nValueRange\022\034\n\022"
          + "start_value_closed\030\001 \001(\014H\000\022\032\n\020start_valu"
          + "e_open\030\002 \001(\014H\000\022\032\n\020end_value_closed\030\003 \001(\014"
          + "H\001\022\030\n\016end_value_open\030\004 \001(\014H\001B\r\n\013start_va"
          + "lueB\013\n\tend_value\"\337\010\n\tRowFilter\0224\n\005chain\030"
          + "\001 \001(\0132#.google.bigtable.v2.RowFilter.Cha"
          + "inH\000\022>\n\ninterleave\030\002 \001(\0132(.google.bigtab"
          + "le.v2.RowFilter.InterleaveH\000\022<\n\tconditio"
          + "n\030\003 \001(\0132\'.google.bigtable.v2.RowFilter.C"
          + "onditionH\000\022\016\n\004sink\030\020 \001(\010H\000\022\031\n\017pass_all_f"
          + "ilter\030\021 \001(\010H\000\022\032\n\020block_all_filter\030\022 \001(\010H"
          + "\000\022\036\n\024row_key_regex_filter\030\004 \001(\014H\000\022\033\n\021row"
          + "_sample_filter\030\016 \001(\001H\000\022\"\n\030family_name_re"
          + "gex_filter\030\005 \001(\tH\000\022\'\n\035column_qualifier_r"
          + "egex_filter\030\006 \001(\014H\000\022>\n\023column_range_filt"
          + "er\030\007 \001(\0132\037.google.bigtable.v2.ColumnRang"
          + "eH\000\022D\n\026timestamp_range_filter\030\010 \001(\0132\".go"
          + "ogle.bigtable.v2.TimestampRangeH\000\022\034\n\022val"
          + "ue_regex_filter\030\t \001(\014H\000\022<\n\022value_range_f"
          + "ilter\030\017 \001(\0132\036.google.bigtable.v2.ValueRa"
          + "ngeH\000\022%\n\033cells_per_row_offset_filter\030\n \001"
          + "(\005H\000\022$\n\032cells_per_row_limit_filter\030\013 \001(\005"
          + "H\000\022\'\n\035cells_per_column_limit_filter\030\014 \001("
          + "\005H\000\022!\n\027strip_value_transformer\030\r \001(\010H\000\022!"
          + "\n\027apply_label_transformer\030\023 \001(\tH\000\0327\n\005Cha"
          + "in\022.\n\007filters\030\001 \003(\0132\035.google.bigtable.v2"
          + ".RowFilter\032<\n\nInterleave\022.\n\007filters\030\001 \003("
          + "\0132\035.google.bigtable.v2.RowFilter\032\255\001\n\tCon"
          + "dition\0227\n\020predicate_filter\030\001 \001(\0132\035.googl"
          + "e.bigtable.v2.RowFilter\0222\n\013true_filter\030\002"
          + " \001(\0132\035.google.bigtable.v2.RowFilter\0223\n\014f"
          + "alse_filter\030\003 \001(\0132\035.google.bigtable.v2.R"
          + "owFilterB\010\n\006filter\"\311\004\n\010Mutation\0228\n\010set_c"
          + "ell\030\001 \001(\0132$.google.bigtable.v2.Mutation."
          + "SetCellH\000\022K\n\022delete_from_column\030\002 \001(\0132-."
          + "google.bigtable.v2.Mutation.DeleteFromCo"
          + "lumnH\000\022K\n\022delete_from_family\030\003 \001(\0132-.goo"
          + "gle.bigtable.v2.Mutation.DeleteFromFamil"
          + "yH\000\022E\n\017delete_from_row\030\004 \001(\0132*.google.bi"
          + "gtable.v2.Mutation.DeleteFromRowH\000\032a\n\007Se"
          + "tCell\022\023\n\013family_name\030\001 \001(\t\022\030\n\020column_qua"
          + "lifier\030\002 \001(\014\022\030\n\020timestamp_micros\030\003 \001(\003\022\r"
          + "\n\005value\030\004 \001(\014\032y\n\020DeleteFromColumn\022\023\n\013fam"
          + "ily_name\030\001 \001(\t\022\030\n\020column_qualifier\030\002 \001(\014"
          + "\0226\n\ntime_range\030\003 \001(\0132\".google.bigtable.v"
          + "2.TimestampRange\032\'\n\020DeleteFromFamily\022\023\n\013"
          + "family_name\030\001 \001(\t\032\017\n\rDeleteFromRowB\n\n\010mu"
          + "tation\"\200\001\n\023ReadModifyWriteRule\022\023\n\013family"
          + "_name\030\001 \001(\t\022\030\n\020column_qualifier\030\002 \001(\014\022\026\n"
          + "\014append_value\030\003 \001(\014H\000\022\032\n\020increment_amoun"
          + "t\030\004 \001(\003H\000B\006\n\004ruleB\227\001\n\026com.google.bigtabl"
          + "e.v2B\tDataProtoP\001Z:google.golang.org/gen"
          + "proto/googleapis/bigtable/v2;bigtable\252\002\030"
          + "Google.Cloud.Bigtable.V2\312\002\030Google\\Cloud\\"
          + "Bigtable\\V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_bigtable_v2_Row_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_v2_Row_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_Row_descriptor,
            new java.lang.String[] {
              "Key", "Families",
            });
    internal_static_google_bigtable_v2_Family_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_v2_Family_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_Family_descriptor,
            new java.lang.String[] {
              "Name", "Columns",
            });
    internal_static_google_bigtable_v2_Column_descriptor = getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_v2_Column_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_Column_descriptor,
            new java.lang.String[] {
              "Qualifier", "Cells",
            });
    internal_static_google_bigtable_v2_Cell_descriptor = getDescriptor().getMessageTypes().get(3);
    internal_static_google_bigtable_v2_Cell_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_Cell_descriptor,
            new java.lang.String[] {
              "TimestampMicros", "Value", "Labels",
            });
    internal_static_google_bigtable_v2_RowRange_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_bigtable_v2_RowRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_RowRange_descriptor,
            new java.lang.String[] {
              "StartKeyClosed", "StartKeyOpen", "EndKeyOpen", "EndKeyClosed", "StartKey", "EndKey",
            });
    internal_static_google_bigtable_v2_RowSet_descriptor = getDescriptor().getMessageTypes().get(5);
    internal_static_google_bigtable_v2_RowSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_RowSet_descriptor,
            new java.lang.String[] {
              "RowKeys", "RowRanges",
            });
    internal_static_google_bigtable_v2_ColumnRange_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_bigtable_v2_ColumnRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_ColumnRange_descriptor,
            new java.lang.String[] {
              "FamilyName",
              "StartQualifierClosed",
              "StartQualifierOpen",
              "EndQualifierClosed",
              "EndQualifierOpen",
              "StartQualifier",
              "EndQualifier",
            });
    internal_static_google_bigtable_v2_TimestampRange_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_bigtable_v2_TimestampRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_TimestampRange_descriptor,
            new java.lang.String[] {
              "StartTimestampMicros", "EndTimestampMicros",
            });
    internal_static_google_bigtable_v2_ValueRange_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_bigtable_v2_ValueRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_ValueRange_descriptor,
            new java.lang.String[] {
              "StartValueClosed",
              "StartValueOpen",
              "EndValueClosed",
              "EndValueOpen",
              "StartValue",
              "EndValue",
            });
    internal_static_google_bigtable_v2_RowFilter_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_bigtable_v2_RowFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_RowFilter_descriptor,
            new java.lang.String[] {
              "Chain",
              "Interleave",
              "Condition",
              "Sink",
              "PassAllFilter",
              "BlockAllFilter",
              "RowKeyRegexFilter",
              "RowSampleFilter",
              "FamilyNameRegexFilter",
              "ColumnQualifierRegexFilter",
              "ColumnRangeFilter",
              "TimestampRangeFilter",
              "ValueRegexFilter",
              "ValueRangeFilter",
              "CellsPerRowOffsetFilter",
              "CellsPerRowLimitFilter",
              "CellsPerColumnLimitFilter",
              "StripValueTransformer",
              "ApplyLabelTransformer",
              "Filter",
            });
    internal_static_google_bigtable_v2_RowFilter_Chain_descriptor =
        internal_static_google_bigtable_v2_RowFilter_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_v2_RowFilter_Chain_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_RowFilter_Chain_descriptor,
            new java.lang.String[] {
              "Filters",
            });
    internal_static_google_bigtable_v2_RowFilter_Interleave_descriptor =
        internal_static_google_bigtable_v2_RowFilter_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_v2_RowFilter_Interleave_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_RowFilter_Interleave_descriptor,
            new java.lang.String[] {
              "Filters",
            });
    internal_static_google_bigtable_v2_RowFilter_Condition_descriptor =
        internal_static_google_bigtable_v2_RowFilter_descriptor.getNestedTypes().get(2);
    internal_static_google_bigtable_v2_RowFilter_Condition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_RowFilter_Condition_descriptor,
            new java.lang.String[] {
              "PredicateFilter", "TrueFilter", "FalseFilter",
            });
    internal_static_google_bigtable_v2_Mutation_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_bigtable_v2_Mutation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_Mutation_descriptor,
            new java.lang.String[] {
              "SetCell", "DeleteFromColumn", "DeleteFromFamily", "DeleteFromRow", "Mutation",
            });
    internal_static_google_bigtable_v2_Mutation_SetCell_descriptor =
        internal_static_google_bigtable_v2_Mutation_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_v2_Mutation_SetCell_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_Mutation_SetCell_descriptor,
            new java.lang.String[] {
              "FamilyName", "ColumnQualifier", "TimestampMicros", "Value",
            });
    internal_static_google_bigtable_v2_Mutation_DeleteFromColumn_descriptor =
        internal_static_google_bigtable_v2_Mutation_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_v2_Mutation_DeleteFromColumn_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_Mutation_DeleteFromColumn_descriptor,
            new java.lang.String[] {
              "FamilyName", "ColumnQualifier", "TimeRange",
            });
    internal_static_google_bigtable_v2_Mutation_DeleteFromFamily_descriptor =
        internal_static_google_bigtable_v2_Mutation_descriptor.getNestedTypes().get(2);
    internal_static_google_bigtable_v2_Mutation_DeleteFromFamily_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_Mutation_DeleteFromFamily_descriptor,
            new java.lang.String[] {
              "FamilyName",
            });
    internal_static_google_bigtable_v2_Mutation_DeleteFromRow_descriptor =
        internal_static_google_bigtable_v2_Mutation_descriptor.getNestedTypes().get(3);
    internal_static_google_bigtable_v2_Mutation_DeleteFromRow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_Mutation_DeleteFromRow_descriptor,
            new java.lang.String[] {});
    internal_static_google_bigtable_v2_ReadModifyWriteRule_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_bigtable_v2_ReadModifyWriteRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_v2_ReadModifyWriteRule_descriptor,
            new java.lang.String[] {
              "FamilyName", "ColumnQualifier", "AppendValue", "IncrementAmount", "Rule",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
