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

import org.waveprotocol.box.common.comms.ProtocolAuthenticationResultUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Builder for ProtocolAuthenticationResults.
 *
 * Generated from org/waveprotocol/box/common/comms/waveclient-rpc.proto. Do not edit.
 */
public final class ProtocolAuthenticationResultBuilder {

  /** Factory to pass to {@link #build()}. */
  public interface Factory {
    ProtocolAuthenticationResult create();
  }

  public ProtocolAuthenticationResultBuilder() {
  }

  /** Builds a {@link ProtocolAuthenticationResult} using this builder and a factory. */
  public ProtocolAuthenticationResult build(Factory factory) {
    ProtocolAuthenticationResult message = factory.create();
    return message;
  }

}