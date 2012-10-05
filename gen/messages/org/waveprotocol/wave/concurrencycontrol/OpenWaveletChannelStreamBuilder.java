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

package org.waveprotocol.wave.concurrencycontrol;

import org.waveprotocol.wave.concurrencycontrol.WaveletUpdate;
import org.waveprotocol.wave.federation.ProtocolHashedVersion;
import org.waveprotocol.wave.concurrencycontrol.WaveletChannelTerminator;
import org.waveprotocol.wave.concurrencycontrol.WaveletUpdateBuilder;
import org.waveprotocol.wave.federation.ProtocolHashedVersionBuilder;
import org.waveprotocol.wave.concurrencycontrol.WaveletChannelTerminatorBuilder;
import org.waveprotocol.wave.concurrencycontrol.OpenWaveletChannelStreamUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Builder for OpenWaveletChannelStreams.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
public final class OpenWaveletChannelStreamBuilder {

  /** Factory to pass to {@link #build()}. */
  public interface Factory {
    OpenWaveletChannelStream create();
  }

  private String channelId;
  private WaveletUpdate delta;
  private ProtocolHashedVersion commitVersion;
  private WaveletChannelTerminator terminator;
  public OpenWaveletChannelStreamBuilder() {
  }

  public OpenWaveletChannelStreamBuilder clearChannelId() {
    channelId = null;
    return this;
  }

  public OpenWaveletChannelStreamBuilder setChannelId(String value) {
    this.channelId = value;
    return this;
  }

  public OpenWaveletChannelStreamBuilder clearDelta() {
    delta = null;
    return this;
  }

  public OpenWaveletChannelStreamBuilder setDelta(WaveletUpdate message) {
    this.delta = message;
    return this;
  }

  public OpenWaveletChannelStreamBuilder clearCommitVersion() {
    commitVersion = null;
    return this;
  }

  public OpenWaveletChannelStreamBuilder setCommitVersion(ProtocolHashedVersion message) {
    this.commitVersion = message;
    return this;
  }

  public OpenWaveletChannelStreamBuilder clearTerminator() {
    terminator = null;
    return this;
  }

  public OpenWaveletChannelStreamBuilder setTerminator(WaveletChannelTerminator message) {
    this.terminator = message;
    return this;
  }

  /** Builds a {@link OpenWaveletChannelStream} using this builder and a factory. */
  public OpenWaveletChannelStream build(Factory factory) {
    OpenWaveletChannelStream message = factory.create();
    message.setChannelId(channelId);
    message.setDelta(delta);
    message.setCommitVersion(commitVersion);
    message.setTerminator(terminator);
    return message;
  }

}