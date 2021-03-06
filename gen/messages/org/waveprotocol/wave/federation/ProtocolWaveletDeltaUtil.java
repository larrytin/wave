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

import org.waveprotocol.wave.federation.ProtocolWaveletDelta.*;
import org.waveprotocol.wave.federation.ProtocolHashedVersion;
import org.waveprotocol.wave.federation.ProtocolWaveletOperation;
import org.waveprotocol.wave.federation.ProtocolHashedVersionUtil;
import org.waveprotocol.wave.federation.ProtocolWaveletOperationUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.Iterator;
import java.util.List;

/**
 * Compares {@link ProtocolWaveletDelta}s for equality.
 *
 * Generated from org/waveprotocol/wave/federation/federation.protodevel. Do not edit.
 */
public final class ProtocolWaveletDeltaUtil {
  private ProtocolWaveletDeltaUtil() {
  }

  /** Returns true if m1 and m2 are structurally equal. */
  public static boolean isEqual(ProtocolWaveletDelta m1, ProtocolWaveletDelta m2) {
    if (!ProtocolHashedVersionUtil.isEqual(m1.getHashedVersion(), m2.getHashedVersion())) return false;
    if (!m1.getAuthor().equals(m2.getAuthor())) return false;
    if (!ProtocolWaveletOperationUtil.areAllEqual(m1.getOperation(), m2.getOperation())) return false;
    if (!m1.getAddressPath().equals(m2.getAddressPath())) return false;
    return true;
  }

  /** Returns true if m1 and m2 are equal according to isEqual. */
  public static boolean areAllEqual(List<? extends ProtocolWaveletDelta> m1,
  List<? extends ProtocolWaveletDelta> m2) {
    if (m1.size() != m2.size()) return false;
    Iterator<? extends ProtocolWaveletDelta> i1 = m1.iterator();
    Iterator<? extends ProtocolWaveletDelta> i2 = m2.iterator();
    while (i1.hasNext()) {
      if (!isEqual(i1.next(), i2.next())) return false;
    }
    return true;
  }

  /** Returns a structural hash code of message. */
  public static int getHashCode(ProtocolWaveletDelta message) {
    int result = 1;
    result = (31 * result) + message.getHashedVersion().hashCode();
    result = (31 * result) + message.getAuthor().hashCode();
    result = (31 * result) + message.getOperation().hashCode();
    result = (31 * result) + message.getAddressPath().hashCode();
    return result;
  }

}