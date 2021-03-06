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

import org.waveprotocol.wave.communication.Blob;
import org.waveprotocol.wave.communication.ProtoEnums;
import java.util.List;

/**
 * Model interface for RpcFinished.
 *
 * Generated from org/waveprotocol/box/server/rpc/rpc.proto. Do not edit.
 */
public interface RpcFinished {

  /** Does a deep copy from model. */
  void copyFrom(RpcFinished model);

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

  /** Returns failed, or null if hasn't been set. */
  boolean getFailed();

  /** Sets failed. */
  void setFailed(boolean failed);

  /** Returns whether errorText has been set. */
  boolean hasErrorText();

  /** Clears the value of errorText. */
  void clearErrorText();

  /** Returns errorText, or null if hasn't been set. */
  String getErrorText();

  /** Sets errorText. */
  void setErrorText(String errorText);
}