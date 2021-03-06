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

package org.waveprotocol.box.common.comms.impl;

import org.waveprotocol.wave.federation.ProtocolWaveletDelta;
import org.waveprotocol.wave.federation.impl.ProtocolWaveletDeltaImpl;
import org.waveprotocol.box.common.comms.ProtocolSubmitRequest;
import org.waveprotocol.box.common.comms.ProtocolSubmitRequestUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pojo implementation of ProtocolSubmitRequest.
 *
 * Generated from org/waveprotocol/box/common/comms/waveclient-rpc.proto. Do not edit.
 */
public class ProtocolSubmitRequestImpl implements ProtocolSubmitRequest {
  private String waveletName;
  private ProtocolWaveletDeltaImpl delta;
  private String channelId;
  public ProtocolSubmitRequestImpl() {
  }

  public ProtocolSubmitRequestImpl(ProtocolSubmitRequest message) {
    copyFrom(message);
  }

  @Override
  public void copyFrom(ProtocolSubmitRequest message) {
    setWaveletName(message.getWaveletName());
    setDelta(message.getDelta());
    if (message.hasChannelId()) {
      setChannelId(message.getChannelId());
    } else {
      clearChannelId();
    }
  }

  @Override
  public String getWaveletName() {
    return waveletName;
  }

  @Override
  public void setWaveletName(String value) {
    this.waveletName = value;
  }

  @Override
  public ProtocolWaveletDeltaImpl getDelta() {
    return new ProtocolWaveletDeltaImpl(delta);
  }

  @Override
  public void setDelta(ProtocolWaveletDelta message) {
    this.delta = new ProtocolWaveletDeltaImpl(message);
  }

  @Override
  public boolean hasChannelId() {
    return channelId != null;
  }

  @Override
  public void clearChannelId() {
    channelId = null;
  }

  @Override
  public String getChannelId() {
    return channelId;
  }

  @Override
  public void setChannelId(String value) {
    this.channelId = value;
  }

  /** Provided to subclasses to clear all fields, for example when deserializing. */
  protected void reset() {
    this.waveletName = null;
    this.delta = null;
    this.channelId = null;
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof ProtocolSubmitRequestImpl) && isEqualTo(o);
  }

  @Override
  public boolean isEqualTo(Object o) {
    if (o == this) {
      return true;
    } else if (o instanceof ProtocolSubmitRequest) {
      return ProtocolSubmitRequestUtil.isEqual(this, (ProtocolSubmitRequest) o);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return ProtocolSubmitRequestUtil.getHashCode(this);
  }

}