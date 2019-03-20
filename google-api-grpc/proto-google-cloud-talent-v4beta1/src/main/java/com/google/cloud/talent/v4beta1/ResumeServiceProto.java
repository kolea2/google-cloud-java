// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/resume_service.proto

package com.google.cloud.talent.v4beta1;

public final class ResumeServiceProto {
  private ResumeServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ParseResumeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ParseResumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ParseResumeOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ParseResumeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ParseResumeResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ParseResumeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/talent/v4beta1/resume_ser"
          + "vice.proto\022\033google.cloud.talent.v4beta1\032"
          + "\034google/api/annotations.proto\032)google/cl"
          + "oud/talent/v4beta1/profile.proto\"\242\001\n\022Par"
          + "seResumeRequest\022\016\n\006parent\030\001 \001(\t\022\016\n\006resum"
          + "e\030\002 \001(\014\022\023\n\013region_code\030\003 \001(\t\022\025\n\rlanguage"
          + "_code\030\004 \001(\t\022@\n\007options\030\005 \001(\0132/.google.cl"
          + "oud.talent.v4beta1.ParseResumeOptions\"M\n"
          + "\022ParseResumeOptions\022\022\n\nenable_ocr\030\001 \001(\010\022"
          + "#\n\033enable_full_skill_detection\030\002 \001(\010\"^\n\023"
          + "ParseResumeResponse\0225\n\007profile\030\001 \001(\0132$.g"
          + "oogle.cloud.talent.v4beta1.Profile\022\020\n\010ra"
          + "w_text\030\002 \001(\t2\271\001\n\rResumeService\022\247\001\n\013Parse"
          + "Resume\022/.google.cloud.talent.v4beta1.Par"
          + "seResumeRequest\0320.google.cloud.talent.v4"
          + "beta1.ParseResumeResponse\"5\202\323\344\223\002/\"*/v4be"
          + "ta1/{parent=projects/*}/resumes:parse:\001*"
          + "B\200\001\n\037com.google.cloud.talent.v4beta1B\022Re"
          + "sumeServiceProtoP\001ZAgoogle.golang.org/ge"
          + "nproto/googleapis/cloud/talent/v4beta1;t"
          + "alent\242\002\003CTSb\006proto3"
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
          com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_ParseResumeRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_ParseResumeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ParseResumeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Resume", "RegionCode", "LanguageCode", "Options",
            });
    internal_static_google_cloud_talent_v4beta1_ParseResumeOptions_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_ParseResumeOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ParseResumeOptions_descriptor,
            new java.lang.String[] {
              "EnableOcr", "EnableFullSkillDetection",
            });
    internal_static_google_cloud_talent_v4beta1_ParseResumeResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_ParseResumeResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ParseResumeResponse_descriptor,
            new java.lang.String[] {
              "Profile", "RawText",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}