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

package org.waveprotocol.wave.federation;

import org.waveprotocol.wave.federation.ProtocolSignerInfo.HashAlgorithm;
import org.waveprotocol.wave.communication.Blob;
import org.waveprotocol.wave.communication.ProtoEnums;
import java.util.List;

/**
 * Model interface for ProtocolSignerInfo.
 *
 * Generated from org/waveprotocol/wave/federation/federation.protodevel. Do not edit.
 */
public interface ProtocolSignerInfo {

  enum HashAlgorithm implements ProtoEnums.HasIntValue {
    SHA256(1),
    SHA512(2),
    UNKNOWN(-1);
    private final int value;
    private HashAlgorithm(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }

  }

  /** Does a deep copy from model. */
  void copyFrom(ProtocolSignerInfo model);

  /**
   * Tests if this model is equal to another object.
   * "Equal" is recursively defined as:
   * <ul>
   * <li>both objects implement this interface,</li>
   * <li>all corresponding primitive fields of both objects have the same value, and</li>
   * <li>all corresponding nested-model fields of both objects are "equal".</li>
   * </ul>
   *
   * This is a coarser equivalence than provided by the equals() methods. Two
   * objects may not be equal() to each other, but may be isEqualTo() each other.
   */
  boolean isEqualTo(Object o);

  /** Returns hashAlgorithm, or null if hasn't been set. */
  HashAlgorithm getHashAlgorithm();

  /** Sets hashAlgorithm. */
  void setHashAlgorithm(HashAlgorithm hashAlgorithm);

  /** Returns domain, or null if hasn't been set. */
  String getDomain();

  /** Sets domain. */
  void setDomain(String domain);

  /** Returns certificate, or null if hasn't been set. */
  List<Blob> getCertificate();

  /** Adds an element to certificate. */
  void addCertificate(Blob value);

  /** Adds a list of elements to certificate. */
  void addAllCertificate(List<Blob> certificate);

  /** Returns the nth element of certificate. */
  Blob getCertificate(int n);

  /** Sets the nth element of certificate. */
  void setCertificate(int n, Blob value);

  /** Returns the length of certificate. */
  int getCertificateSize();

  /** Clears certificate. */
  void clearCertificate();
}