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

import org.waveprotocol.wave.concurrencycontrol.ResponseStatus;
import org.waveprotocol.wave.concurrencycontrol.FetchWaveViewResponse.Wavelet;
import org.waveprotocol.wave.concurrencycontrol.WaveletSnapshot;
import org.waveprotocol.wave.concurrencycontrol.ResponseStatusBuilder;
import org.waveprotocol.wave.concurrencycontrol.FetchWaveViewResponseBuilder.WaveletBuilder;
import org.waveprotocol.wave.concurrencycontrol.WaveletSnapshotBuilder;
import org.waveprotocol.wave.concurrencycontrol.FetchWaveViewResponseUtil;
import org.waveprotocol.wave.concurrencycontrol.FetchWaveViewResponseUtil.WaveletUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Builder for FetchWaveViewResponses.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
public final class FetchWaveViewResponseBuilder {

  /** Factory to pass to {@link #build()}. */
  public interface Factory {
    FetchWaveViewResponse create();
  }

  public static final class WaveletBuilder {

    /** Factory to pass to {@link #build()}. */
    public interface Factory {
      Wavelet create();
    }

    private String waveletId;
    private WaveletSnapshot snapshot;
    public WaveletBuilder() {
    }

    public WaveletBuilder setWaveletId(String value) {
      this.waveletId = value;
      return this;
    }

    public WaveletBuilder clearSnapshot() {
      snapshot = null;
      return this;
    }

    public WaveletBuilder setSnapshot(WaveletSnapshot message) {
      this.snapshot = message;
      return this;
    }

    /** Builds a {@link Wavelet} using this builder and a factory. */
    public Wavelet build(Factory factory) {
      Wavelet message = factory.create();
      message.setWaveletId(waveletId);
      message.setSnapshot(snapshot);
      return message;
    }

  }

  private ResponseStatus status;
  private final List<Wavelet> wavelet = new ArrayList<Wavelet>();
  public FetchWaveViewResponseBuilder() {
  }

  public FetchWaveViewResponseBuilder setStatus(ResponseStatus message) {
    this.status = message;
    return this;
  }

  public FetchWaveViewResponseBuilder addAllWavelet(List<? extends Wavelet> messages) {
    for (Wavelet message : messages) {
      addWavelet(message);
    }
    return this;
  }

  public FetchWaveViewResponseBuilder setWavelet(int n, Wavelet message) {
    this.wavelet.set(n, message);
    return this;
  }

  public FetchWaveViewResponseBuilder addWavelet(Wavelet message) {
    this.wavelet.add(message);
    return this;
  }

  public FetchWaveViewResponseBuilder clearWavelet() {
    wavelet.clear();
    return this;
  }

  /** Builds a {@link FetchWaveViewResponse} using this builder and a factory. */
  public FetchWaveViewResponse build(Factory factory) {
    FetchWaveViewResponse message = factory.create();
    message.setStatus(status);
    message.clearWavelet();
    message.addAllWavelet(wavelet);
    return message;
  }

}