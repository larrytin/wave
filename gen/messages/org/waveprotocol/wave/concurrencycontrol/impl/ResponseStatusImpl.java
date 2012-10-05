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

import org.waveprotocol.wave.concurrencycontrol.ResponseStatus.ResponseCode;
import org.waveprotocol.wave.concurrencycontrol.ResponseStatus;
import org.waveprotocol.wave.concurrencycontrol.ResponseStatusUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pojo implementation of ResponseStatus.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
public class ResponseStatusImpl implements ResponseStatus {
  private ResponseCode status;
  private String failureReason;
  public ResponseStatusImpl() {
  }

  public ResponseStatusImpl(ResponseStatus message) {
    copyFrom(message);
  }

  @Override
  public void copyFrom(ResponseStatus message) {
    setStatus(message.getStatus());
    if (message.hasFailureReason()) {
      setFailureReason(message.getFailureReason());
    } else {
      clearFailureReason();
    }
  }

  @Override
  public ResponseCode getStatus() {
    return status;
  }

  @Override
  public void setStatus(ResponseCode value) {
    this.status = value;
  }

  @Override
  public boolean hasFailureReason() {
    return failureReason != null;
  }

  @Override
  public void clearFailureReason() {
    failureReason = null;
  }

  @Override
  public String getFailureReason() {
    return failureReason;
  }

  @Override
  public void setFailureReason(String value) {
    this.failureReason = value;
  }

  /** Provided to subclasses to clear all fields, for example when deserializing. */
  protected void reset() {
    this.status = null;
    this.failureReason = null;
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof ResponseStatusImpl) && isEqualTo(o);
  }

  @Override
  public boolean isEqualTo(Object o) {
    if (o == this) {
      return true;
    } else if (o instanceof ResponseStatus) {
      return ResponseStatusUtil.isEqual(this, (ResponseStatus) o);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return ResponseStatusUtil.getHashCode(this);
  }

}