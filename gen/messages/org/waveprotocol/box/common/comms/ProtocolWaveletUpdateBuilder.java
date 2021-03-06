/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.waveprotocol.box.common.comms;

import org.waveprotocol.wave.federation.ProtocolWaveletDelta;
import org.waveprotocol.wave.federation.ProtocolHashedVersion;
import org.waveprotocol.box.common.comms.WaveletSnapshot;
import org.waveprotocol.wave.federation.ProtocolWaveletDeltaBuilder;
import org.waveprotocol.wave.federation.ProtocolHashedVersionBuilder;
import org.waveprotocol.box.common.comms.WaveletSnapshotBuilder;
import org.waveprotocol.box.common.comms.ProtocolWaveletUpdateUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Builder for ProtocolWaveletUpdates.
 *
 * Generated from org/waveprotocol/box/common/comms/waveclient-rpc.proto. Do not edit.
 */
public final class ProtocolWaveletUpdateBuilder {

  /** Factory to pass to {@link #build()}. */
  public interface Factory {
    ProtocolWaveletUpdate create();
  }

  private String waveletName;
  private final List<ProtocolWaveletDelta> appliedDelta = new ArrayList<ProtocolWaveletDelta>();
  private ProtocolHashedVersion commitNotice;
  private ProtocolHashedVersion resultingVersion;
  private WaveletSnapshot snapshot;
  private Boolean marker;
  private String channelId;
  public ProtocolWaveletUpdateBuilder() {
  }

  public ProtocolWaveletUpdateBuilder setWaveletName(String value) {
    this.waveletName = value;
    return this;
  }

  public ProtocolWaveletUpdateBuilder addAllAppliedDelta(List<? extends ProtocolWaveletDelta> messages) {
    for (ProtocolWaveletDelta message : messages) {
      addAppliedDelta(message);
    }
    return this;
  }

  public ProtocolWaveletUpdateBuilder setAppliedDelta(int n, ProtocolWaveletDelta message) {
    this.appliedDelta.set(n, message);
    return this;
  }

  public ProtocolWaveletUpdateBuilder addAppliedDelta(ProtocolWaveletDelta message) {
    this.appliedDelta.add(message);
    return this;
  }

  public ProtocolWaveletUpdateBuilder clearAppliedDelta() {
    appliedDelta.clear();
    return this;
  }

  public ProtocolWaveletUpdateBuilder clearCommitNotice() {
    commitNotice = null;
    return this;
  }

  public ProtocolWaveletUpdateBuilder setCommitNotice(ProtocolHashedVersion message) {
    this.commitNotice = message;
    return this;
  }

  public ProtocolWaveletUpdateBuilder clearResultingVersion() {
    resultingVersion = null;
    return this;
  }

  public ProtocolWaveletUpdateBuilder setResultingVersion(ProtocolHashedVersion message) {
    this.resultingVersion = message;
    return this;
  }

  public ProtocolWaveletUpdateBuilder clearSnapshot() {
    snapshot = null;
    return this;
  }

  public ProtocolWaveletUpdateBuilder setSnapshot(WaveletSnapshot message) {
    this.snapshot = message;
    return this;
  }

  public ProtocolWaveletUpdateBuilder clearMarker() {
    marker = null;
    return this;
  }

  public ProtocolWaveletUpdateBuilder setMarker(boolean value) {
    this.marker = value;
    return this;
  }

  public ProtocolWaveletUpdateBuilder clearChannelId() {
    channelId = null;
    return this;
  }

  public ProtocolWaveletUpdateBuilder setChannelId(String value) {
    this.channelId = value;
    return this;
  }

  /** Builds a {@link ProtocolWaveletUpdate} using this builder and a factory. */
  public ProtocolWaveletUpdate build(Factory factory) {
    ProtocolWaveletUpdate message = factory.create();
    message.setWaveletName(waveletName);
    message.clearAppliedDelta();
    message.addAllAppliedDelta(appliedDelta);
    message.setCommitNotice(commitNotice);
    message.setResultingVersion(resultingVersion);
    message.setSnapshot(snapshot);
    message.setMarker(marker);
    message.setChannelId(channelId);
    return message;
  }

}