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

import org.waveprotocol.box.common.comms.ProtocolAuthenticate;
import org.waveprotocol.box.common.comms.ProtocolAuthenticateUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pojo implementation of ProtocolAuthenticate.
 *
 * Generated from org/waveprotocol/box/common/comms/waveclient-rpc.proto. Do not edit.
 */
public class ProtocolAuthenticateImpl implements ProtocolAuthenticate {
  private String token;
  public ProtocolAuthenticateImpl() {
  }

  public ProtocolAuthenticateImpl(ProtocolAuthenticate message) {
    copyFrom(message);
  }

  @Override
  public void copyFrom(ProtocolAuthenticate message) {
    setToken(message.getToken());
  }

  @Override
  public String getToken() {
    return token;
  }

  @Override
  public void setToken(String value) {
    this.token = value;
  }

  /** Provided to subclasses to clear all fields, for example when deserializing. */
  protected void reset() {
    this.token = null;
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof ProtocolAuthenticateImpl) && isEqualTo(o);
  }

  @Override
  public boolean isEqualTo(Object o) {
    if (o == this) {
      return true;
    } else if (o instanceof ProtocolAuthenticate) {
      return ProtocolAuthenticateUtil.isEqual(this, (ProtocolAuthenticate) o);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return ProtocolAuthenticateUtil.getHashCode(this);
  }

}