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

import org.waveprotocol.wave.concurrencycontrol.TransportAuthenticationRequestUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Builder for TransportAuthenticationRequests.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
public final class TransportAuthenticationRequestBuilder {

  /** Factory to pass to {@link #build()}. */
  public interface Factory {
    TransportAuthenticationRequest create();
  }

  private String token;
  public TransportAuthenticationRequestBuilder() {
  }

  public TransportAuthenticationRequestBuilder setToken(String value) {
    this.token = value;
    return this;
  }

  /** Builds a {@link TransportAuthenticationRequest} using this builder and a factory. */
  public TransportAuthenticationRequest build(Factory factory) {
    TransportAuthenticationRequest message = factory.create();
    message.setToken(token);
    return message;
  }

}