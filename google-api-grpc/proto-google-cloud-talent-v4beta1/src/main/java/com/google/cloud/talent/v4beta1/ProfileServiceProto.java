// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile_service.proto

package com.google.cloud.talent.v4beta1;

public final class ProfileServiceProto {
  private ProfileServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_GetProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SummarizedProfile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SummarizedProfile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/talent/v4beta1/profile_se"
          + "rvice.proto\022\033google.cloud.talent.v4beta1"
          + "\032\034google/api/annotations.proto\032(google/c"
          + "loud/talent/v4beta1/common.proto\032)google"
          + "/cloud/talent/v4beta1/filters.proto\032+goo"
          + "gle/cloud/talent/v4beta1/histogram.proto"
          + "\032)google/cloud/talent/v4beta1/profile.pr"
          + "oto\032\033google/protobuf/empty.proto\032 google"
          + "/protobuf/field_mask.proto\"|\n\023ListProfil"
          + "esRequest\022\016\n\006parent\030\001 \001(\t\022\022\n\npage_token\030"
          + "\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022.\n\nfield_mask\030\004"
          + " \001(\0132\032.google.protobuf.FieldMask\"g\n\024List"
          + "ProfilesResponse\0226\n\010profiles\030\001 \003(\0132$.goo"
          + "gle.cloud.talent.v4beta1.Profile\022\027\n\017next"
          + "_page_token\030\002 \001(\t\"]\n\024CreateProfileReques"
          + "t\022\016\n\006parent\030\001 \001(\t\0225\n\007profile\030\002 \001(\0132$.goo"
          + "gle.cloud.talent.v4beta1.Profile\"!\n\021GetP"
          + "rofileRequest\022\014\n\004name\030\001 \001(\t\"~\n\024UpdatePro"
          + "fileRequest\0225\n\007profile\030\001 \001(\0132$.google.cl"
          + "oud.talent.v4beta1.Profile\022/\n\013update_mas"
          + "k\030\002 \001(\0132\032.google.protobuf.FieldMask\"$\n\024D"
          + "eleteProfileRequest\022\014\n\004name\030\001 \001(\t\"\374\002\n\025Se"
          + "archProfilesRequest\022\016\n\006parent\030\001 \001(\t\022F\n\020r"
          + "equest_metadata\030\002 \001(\0132,.google.cloud.tal"
          + "ent.v4beta1.RequestMetadata\022@\n\rprofile_q"
          + "uery\030\003 \001(\0132).google.cloud.talent.v4beta1"
          + ".ProfileQuery\022\021\n\tpage_size\030\004 \001(\005\022\022\n\npage"
          + "_token\030\005 \001(\t\022\016\n\006offset\030\006 \001(\005\022\033\n\023disable_"
          + "spell_check\030\007 \001(\010\022\020\n\010order_by\030\010 \001(\t\022\033\n\023c"
          + "ase_sensitive_sort\030\t \001(\010\022F\n\021histogram_qu"
          + "eries\030\n \003(\0132+.google.cloud.talent.v4beta"
          + "1.HistogramQuery\"\374\002\n\026SearchProfilesRespo"
          + "nse\022\034\n\024estimated_total_size\030\001 \001(\003\022I\n\020spe"
          + "ll_correction\030\002 \001(\0132/.google.cloud.talen"
          + "t.v4beta1.SpellingCorrection\022?\n\010metadata"
          + "\030\003 \001(\0132-.google.cloud.talent.v4beta1.Res"
          + "ponseMetadata\022\027\n\017next_page_token\030\004 \001(\t\022R"
          + "\n\027histogram_query_results\030\005 \003(\01321.google"
          + ".cloud.talent.v4beta1.HistogramQueryResu"
          + "lt\022K\n\023summarized_profiles\030\006 \003(\0132..google"
          + ".cloud.talent.v4beta1.SummarizedProfile\""
          + "\202\001\n\021SummarizedProfile\0226\n\010profiles\030\001 \003(\0132"
          + "$.google.cloud.talent.v4beta1.Profile\0225\n"
          + "\007summary\030\002 \001(\0132$.google.cloud.talent.v4b"
          + "eta1.Profile2\377\007\n\016ProfileService\022\254\001\n\014List"
          + "Profiles\0220.google.cloud.talent.v4beta1.L"
          + "istProfilesRequest\0321.google.cloud.talent"
          + ".v4beta1.ListProfilesResponse\"7\202\323\344\223\0021\022//"
          + "v4beta1/{parent=projects/*/tenants/*}/pr"
          + "ofiles\022\244\001\n\rCreateProfile\0221.google.cloud."
          + "talent.v4beta1.CreateProfileRequest\032$.go"
          + "ogle.cloud.talent.v4beta1.Profile\":\202\323\344\223\002"
          + "4\"//v4beta1/{parent=projects/*/tenants/*"
          + "}/profiles:\001*\022\233\001\n\nGetProfile\022..google.cl"
          + "oud.talent.v4beta1.GetProfileRequest\032$.g"
          + "oogle.cloud.talent.v4beta1.Profile\"7\202\323\344\223"
          + "\0021\022//v4beta1/{name=projects/*/tenants/*/"
          + "profiles/*}\022\254\001\n\rUpdateProfile\0221.google.c"
          + "loud.talent.v4beta1.UpdateProfileRequest"
          + "\032$.google.cloud.talent.v4beta1.Profile\"B"
          + "\202\323\344\223\002<27/v4beta1/{profile.name=projects/"
          + "*/tenants/*/profiles/*}:\001*\022\223\001\n\rDeletePro"
          + "file\0221.google.cloud.talent.v4beta1.Delet"
          + "eProfileRequest\032\026.google.protobuf.Empty\""
          + "7\202\323\344\223\0021*//v4beta1/{name=projects/*/tenan"
          + "ts/*/profiles/*}\022\263\001\n\016SearchProfiles\0222.go"
          + "ogle.cloud.talent.v4beta1.SearchProfiles"
          + "Request\0323.google.cloud.talent.v4beta1.Se"
          + "archProfilesResponse\"8\202\323\344\223\0022\"-/v4beta1/{"
          + "parent=projects/*/tenants/*}:search:\001*B\201"
          + "\001\n\037com.google.cloud.talent.v4beta1B\023Prof"
          + "ileServiceProtoP\001ZAgoogle.golang.org/gen"
          + "proto/googleapis/cloud/talent/v4beta1;ta"
          + "lent\242\002\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageToken", "PageSize", "FieldMask",
            });
    internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor,
            new java.lang.String[] {
              "Profiles", "NextPageToken",
            });
    internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Profile",
            });
    internal_static_google_cloud_talent_v4beta1_GetProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_GetProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_GetProfileRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_descriptor,
            new java.lang.String[] {
              "Profile", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "RequestMetadata",
              "ProfileQuery",
              "PageSize",
              "PageToken",
              "Offset",
              "DisableSpellCheck",
              "OrderBy",
              "CaseSensitiveSort",
              "HistogramQueries",
            });
    internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_descriptor,
            new java.lang.String[] {
              "EstimatedTotalSize",
              "SpellCorrection",
              "Metadata",
              "NextPageToken",
              "HistogramQueryResults",
              "SummarizedProfiles",
            });
    internal_static_google_cloud_talent_v4beta1_SummarizedProfile_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_SummarizedProfile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SummarizedProfile_descriptor,
            new java.lang.String[] {
              "Profiles", "Summary",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor();
    com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor();
    com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}