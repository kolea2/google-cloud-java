// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface SpeakerDiarizationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.SpeakerDiarizationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * *Optional* If 'true', enables speaker detection for each recognized word in
   * the top alternative of the recognition result using a speaker_tag provided
   * in the WordInfo.
   * </pre>
   *
   * <code>bool enable_speaker_diarization = 1;</code>
   */
  boolean getEnableSpeakerDiarization();

  /**
   *
   *
   * <pre>
   * *Optional*
   * Minimum number of speakers in the conversation. This range gives you more
   * flexibility by allowing the system to automatically determine the correct
   * number of speakers. If not set, the default value is 2.
   * </pre>
   *
   * <code>int32 min_speaker_count = 2;</code>
   */
  int getMinSpeakerCount();

  /**
   *
   *
   * <pre>
   * *Optional*
   * Maximum number of speakers in the conversation. This range gives you more
   * flexibility by allowing the system to automatically determine the correct
   * number of speakers. If not set, the default value is 6.
   * </pre>
   *
   * <code>int32 max_speaker_count = 3;</code>
   */
  int getMaxSpeakerCount();

  /**
   *
   *
   * <pre>
   * Output only. A distinct integer value is assigned for every speaker within
   * the audio. This field specifies which one of those speakers was detected to
   * have spoken this word. Value ranges from '1' to diarization_speaker_count.
   * speaker_tag is set if enable_speaker_diarization = 'true' and only in the
   * top alternative.
   * </pre>
   *
   * <code>int32 speaker_tag = 5;</code>
   */
  int getSpeakerTag();
}