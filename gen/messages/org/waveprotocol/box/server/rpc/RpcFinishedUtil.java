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

package org.waveprotocol.box.server.rpc;

import org.waveprotocol.box.server.rpc.RpcFinished.*;
import org.waveprotocol.wave.communication.Blob;
import java.util.Iterator;
import java.util.List;

/**
 * Compares {@link RpcFinished}s for equality.
 *
 * Generated from org/waveprotocol/box/server/rpc/rpc.proto. Do not edit.
 */
public final class RpcFinishedUtil {
  private RpcFinishedUtil() {
  }

  /** Returns true if m1 and m2 are structurally equal. */
  public static boolean isEqual(RpcFinished m1, RpcFinished m2) {
    if (m1.getFailed() != m2.getFailed()) return false;
    if (m1.hasErrorText() != m2.hasErrorText()) return false;
    if (m1.hasErrorText() && !m1.getErrorText().equals(m2.getErrorText())) return false;
    return true;
  }

  /** Returns true if m1 and m2 are equal according to isEqual. */
  public static boolean areAllEqual(List<? extends RpcFinished> m1,
  List<? extends RpcFinished> m2) {
    if (m1.size() != m2.size()) return false;
    Iterator<? extends RpcFinished> i1 = m1.iterator();
    Iterator<? extends RpcFinished> i2 = m2.iterator();
    while (i1.hasNext()) {
      if (!isEqual(i1.next(), i2.next())) return false;
    }
    return true;
  }

  /** Returns a structural hash code of message. */
  public static int getHashCode(RpcFinished message) {
    int result = 1;
    result = (31 * result) + Boolean.valueOf(message.getFailed()).hashCode();
    result = (31 * result) + (message.hasErrorText() ? message.getErrorText().hashCode() : 0);
    return result;
  }

}