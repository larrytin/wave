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

import org.waveprotocol.wave.concurrencycontrol.DocumentSnapshot.*;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.Iterator;
import java.util.List;

/**
 * Compares {@link DocumentSnapshot}s for equality.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
public final class DocumentSnapshotUtil {
  private DocumentSnapshotUtil() {
  }

  /** Returns true if m1 and m2 are structurally equal. */
  public static boolean isEqual(DocumentSnapshot m1, DocumentSnapshot m2) {
    if (!m1.getDocumentId().equals(m2.getDocumentId())) return false;
    if (!ProtocolDocumentOperationUtil.isEqual(m1.getDocumentOperation(), m2.getDocumentOperation())) return false;
    if (!m1.getAuthor().equals(m2.getAuthor())) return false;
    if (!m1.getContributor().equals(m2.getContributor())) return false;
    if (m1.getLastModifiedVersion() != m2.getLastModifiedVersion()) return false;
    if (m1.getLastModifiedTime() != m2.getLastModifiedTime()) return false;
    return true;
  }

  /** Returns true if m1 and m2 are equal according to isEqual. */
  public static boolean areAllEqual(List<? extends DocumentSnapshot> m1,
  List<? extends DocumentSnapshot> m2) {
    if (m1.size() != m2.size()) return false;
    Iterator<? extends DocumentSnapshot> i1 = m1.iterator();
    Iterator<? extends DocumentSnapshot> i2 = m2.iterator();
    while (i1.hasNext()) {
      if (!isEqual(i1.next(), i2.next())) return false;
    }
    return true;
  }

  /** Returns a structural hash code of message. */
  public static int getHashCode(DocumentSnapshot message) {
    int result = 1;
    result = (31 * result) + message.getDocumentId().hashCode();
    result = (31 * result) + message.getDocumentOperation().hashCode();
    result = (31 * result) + message.getAuthor().hashCode();
    result = (31 * result) + message.getContributor().hashCode();
    result = (31 * result) + Long.valueOf(message.getLastModifiedVersion()).hashCode();
    result = (31 * result) + Long.valueOf(message.getLastModifiedTime()).hashCode();
    return result;
  }

}