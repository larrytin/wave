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

import org.waveprotocol.box.common.comms.WaveletSnapshot.*;
import org.waveprotocol.box.common.comms.DocumentSnapshot;
import org.waveprotocol.wave.federation.ProtocolHashedVersion;
import org.waveprotocol.box.common.comms.DocumentSnapshotUtil;
import org.waveprotocol.wave.federation.ProtocolHashedVersionUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.Iterator;
import java.util.List;

/**
 * Compares {@link WaveletSnapshot}s for equality.
 *
 * Generated from org/waveprotocol/box/common/comms/waveclient-rpc.proto. Do not edit.
 */
public final class WaveletSnapshotUtil {
  private WaveletSnapshotUtil() {
  }

  /** Returns true if m1 and m2 are structurally equal. */
  public static boolean isEqual(WaveletSnapshot m1, WaveletSnapshot m2) {
    if (!m1.getWaveletId().equals(m2.getWaveletId())) return false;
    if (!m1.getParticipantId().equals(m2.getParticipantId())) return false;
    if (!DocumentSnapshotUtil.areAllEqual(m1.getDocument(), m2.getDocument())) return false;
    if (!ProtocolHashedVersionUtil.isEqual(m1.getVersion(), m2.getVersion())) return false;
    if (m1.getLastModifiedTime() != m2.getLastModifiedTime()) return false;
    if (!m1.getCreator().equals(m2.getCreator())) return false;
    if (m1.getCreationTime() != m2.getCreationTime()) return false;
    return true;
  }

  /** Returns true if m1 and m2 are equal according to isEqual. */
  public static boolean areAllEqual(List<? extends WaveletSnapshot> m1,
  List<? extends WaveletSnapshot> m2) {
    if (m1.size() != m2.size()) return false;
    Iterator<? extends WaveletSnapshot> i1 = m1.iterator();
    Iterator<? extends WaveletSnapshot> i2 = m2.iterator();
    while (i1.hasNext()) {
      if (!isEqual(i1.next(), i2.next())) return false;
    }
    return true;
  }

  /** Returns a structural hash code of message. */
  public static int getHashCode(WaveletSnapshot message) {
    int result = 1;
    result = (31 * result) + message.getWaveletId().hashCode();
    result = (31 * result) + message.getParticipantId().hashCode();
    result = (31 * result) + message.getDocument().hashCode();
    result = (31 * result) + message.getVersion().hashCode();
    result = (31 * result) + Long.valueOf(message.getLastModifiedTime()).hashCode();
    result = (31 * result) + message.getCreator().hashCode();
    result = (31 * result) + Long.valueOf(message.getCreationTime()).hashCode();
    return result;
  }

}