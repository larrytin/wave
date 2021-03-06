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

package org.waveprotocol.wave.federation.impl;

import org.waveprotocol.wave.federation.ProtocolHashedVersion;
import org.waveprotocol.wave.federation.ProtocolWaveletOperation;
import org.waveprotocol.wave.federation.impl.ProtocolHashedVersionImpl;
import org.waveprotocol.wave.federation.impl.ProtocolWaveletOperationImpl;
import org.waveprotocol.wave.federation.ProtocolWaveletDelta;
import org.waveprotocol.wave.federation.ProtocolWaveletDeltaUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pojo implementation of ProtocolWaveletDelta.
 *
 * Generated from org/waveprotocol/wave/federation/federation.protodevel. Do not edit.
 */
public class ProtocolWaveletDeltaImpl implements ProtocolWaveletDelta {
  private ProtocolHashedVersionImpl hashedVersion;
  private String author;
  private final List<ProtocolWaveletOperationImpl> operation = new ArrayList<ProtocolWaveletOperationImpl>();
  private final List<String> addressPath = new ArrayList<String>();
  public ProtocolWaveletDeltaImpl() {
  }

  public ProtocolWaveletDeltaImpl(ProtocolWaveletDelta message) {
    copyFrom(message);
  }

  @Override
  public void copyFrom(ProtocolWaveletDelta message) {
    setHashedVersion(message.getHashedVersion());
    setAuthor(message.getAuthor());
    clearOperation();
    for (ProtocolWaveletOperation field : message.getOperation()) {
      addOperation(new ProtocolWaveletOperationImpl(field));
    }
    clearAddressPath();
    for (String field : message.getAddressPath()) {
      addAddressPath(field);
    }
  }

  @Override
  public ProtocolHashedVersionImpl getHashedVersion() {
    return new ProtocolHashedVersionImpl(hashedVersion);
  }

  @Override
  public void setHashedVersion(ProtocolHashedVersion message) {
    this.hashedVersion = new ProtocolHashedVersionImpl(message);
  }

  @Override
  public String getAuthor() {
    return author;
  }

  @Override
  public void setAuthor(String value) {
    this.author = value;
  }

  @Override
  public List<ProtocolWaveletOperationImpl> getOperation() {
    return Collections.unmodifiableList(operation);
  }

  @Override
  public void addAllOperation(List<? extends ProtocolWaveletOperation> messages) {
    for (ProtocolWaveletOperation message : messages) {
      addOperation(message);
    }
  }

  @Override
  public ProtocolWaveletOperationImpl getOperation(int n) {
    return new ProtocolWaveletOperationImpl(operation.get(n));
  }

  @Override
  public void setOperation(int n, ProtocolWaveletOperation message) {
    this.operation.set(n, new ProtocolWaveletOperationImpl(message));
  }

  @Override
  public int getOperationSize() {
    return operation.size();
  }

  @Override
  public void addOperation(ProtocolWaveletOperation message) {
    this.operation.add(new ProtocolWaveletOperationImpl(message));
  }

  @Override
  public void clearOperation() {
    operation.clear();
  }

  @Override
  public List<String> getAddressPath() {
    return Collections.unmodifiableList(addressPath);
  }

  @Override
  public void addAllAddressPath(List<String> values) {
    this.addressPath.addAll(values);
  }

  @Override
  public String getAddressPath(int n) {
    return addressPath.get(n);
  }

  @Override
  public void setAddressPath(int n, String value) {
    this.addressPath.set(n, value);
  }

  @Override
  public int getAddressPathSize() {
    return addressPath.size();
  }

  @Override
  public void addAddressPath(String value) {
    this.addressPath.add(value);
  }

  @Override
  public void clearAddressPath() {
    addressPath.clear();
  }

  /** Provided to subclasses to clear all fields, for example when deserializing. */
  protected void reset() {
    this.hashedVersion = null;
    this.author = null;
    this.operation.clear();
    this.addressPath.clear();
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof ProtocolWaveletDeltaImpl) && isEqualTo(o);
  }

  @Override
  public boolean isEqualTo(Object o) {
    if (o == this) {
      return true;
    } else if (o instanceof ProtocolWaveletDelta) {
      return ProtocolWaveletDeltaUtil.isEqual(this, (ProtocolWaveletDelta) o);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return ProtocolWaveletDeltaUtil.getHashCode(this);
  }

}