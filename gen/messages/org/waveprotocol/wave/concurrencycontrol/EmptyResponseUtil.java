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

import org.waveprotocol.wave.concurrencycontrol.EmptyResponse.*;
import org.waveprotocol.wave.communication.Blob;
import java.util.Iterator;
import java.util.List;

/**
 * Compares {@link EmptyResponse}s for equality.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
public final class EmptyResponseUtil {
  private EmptyResponseUtil() {
  }

  /** Returns true if m1 and m2 are structurally equal. */
  public static boolean isEqual(EmptyResponse m1, EmptyResponse m2) {
    return true;
  }

  /** Returns true if m1 and m2 are equal according to isEqual. */
  public static boolean areAllEqual(List<? extends EmptyResponse> m1,
  List<? extends EmptyResponse> m2) {
    if (m1.size() != m2.size()) return false;
    Iterator<? extends EmptyResponse> i1 = m1.iterator();
    Iterator<? extends EmptyResponse> i2 = m2.iterator();
    while (i1.hasNext()) {
      if (!isEqual(i1.next(), i2.next())) return false;
    }
    return true;
  }

  /** Returns a structural hash code of message. */
  public static int getHashCode(EmptyResponse message) {
    int result = 1;
    return result;
  }

}