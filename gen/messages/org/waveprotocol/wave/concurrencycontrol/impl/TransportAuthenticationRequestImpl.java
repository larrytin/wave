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

package org.waveprotocol.wave.concurrencycontrol.impl;

import org.waveprotocol.wave.concurrencycontrol.TransportAuthenticationRequest;
import org.waveprotocol.wave.concurrencycontrol.TransportAuthenticationRequestUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pojo implementation of TransportAuthenticationRequest.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
public class TransportAuthenticationRequestImpl implements TransportAuthenticationRequest {
  private String token;
  public TransportAuthenticationRequestImpl() {
  }

  public TransportAuthenticationRequestImpl(TransportAuthenticationRequest message) {
    copyFrom(message);
  }

  @Override
  public void copyFrom(TransportAuthenticationRequest message) {
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
    return (o instanceof TransportAuthenticationRequestImpl) && isEqualTo(o);
  }

  @Override
  public boolean isEqualTo(Object o) {
    if (o == this) {
      return true;
    } else if (o instanceof TransportAuthenticationRequest) {
      return TransportAuthenticationRequestUtil.isEqual(this, (TransportAuthenticationRequest) o);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return TransportAuthenticationRequestUtil.getHashCode(this);
  }

}