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

package org.waveprotocol.wave.diff.impl;

import org.waveprotocol.wave.concurrencycontrol.ResponseStatus;
import org.waveprotocol.wave.diff.FetchDiffResponse.WaveletDiff;
import org.waveprotocol.wave.diff.WaveletDiffSnapshot;
import org.waveprotocol.wave.concurrencycontrol.impl.ResponseStatusImpl;
import org.waveprotocol.wave.diff.impl.FetchDiffResponseImpl.WaveletDiffImpl;
import org.waveprotocol.wave.diff.impl.WaveletDiffSnapshotImpl;
import org.waveprotocol.wave.diff.FetchDiffResponse;
import org.waveprotocol.wave.diff.FetchDiffResponseUtil;
import org.waveprotocol.wave.diff.FetchDiffResponse.WaveletDiff;
import org.waveprotocol.wave.diff.FetchDiffResponseUtil.WaveletDiffUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pojo implementation of FetchDiffResponse.
 *
 * Generated from org/waveprotocol/wave/diff/diff.proto. Do not edit.
 */
public class FetchDiffResponseImpl implements FetchDiffResponse {

  public static class WaveletDiffImpl implements WaveletDiff {
    private String waveletId;
    private WaveletDiffSnapshotImpl snapshot;
    public WaveletDiffImpl() {
    }

    public WaveletDiffImpl(WaveletDiff message) {
      copyFrom(message);
    }

    @Override
    public void copyFrom(WaveletDiff message) {
      setWaveletId(message.getWaveletId());
      if (message.hasSnapshot()) {
        setSnapshot(message.getSnapshot());
      } else {
        clearSnapshot();
      }
    }

    @Override
    public String getWaveletId() {
      return waveletId;
    }

    @Override
    public void setWaveletId(String value) {
      this.waveletId = value;
    }

    @Override
    public boolean hasSnapshot() {
      return snapshot != null;
    }

    @Override
    public void clearSnapshot() {
      snapshot = null;
    }

    @Override
    public WaveletDiffSnapshotImpl getSnapshot() {
      return new WaveletDiffSnapshotImpl(snapshot);
    }

    @Override
    public void setSnapshot(WaveletDiffSnapshot message) {
      this.snapshot = new WaveletDiffSnapshotImpl(message);
    }

    /** Provided to subclasses to clear all fields, for example when deserializing. */
    protected void reset() {
      this.waveletId = null;
      this.snapshot = null;
    }

    @Override
    public boolean equals(Object o) {
      return (o instanceof WaveletDiffImpl) && isEqualTo(o);
    }

    @Override
    public boolean isEqualTo(Object o) {
      if (o == this) {
        return true;
      } else if (o instanceof WaveletDiff) {
        return WaveletDiffUtil.isEqual(this, (WaveletDiff) o);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return WaveletDiffUtil.getHashCode(this);
    }

  }

  private ResponseStatusImpl status;
  private final List<WaveletDiffImpl> wavelet = new ArrayList<WaveletDiffImpl>();
  public FetchDiffResponseImpl() {
  }

  public FetchDiffResponseImpl(FetchDiffResponse message) {
    copyFrom(message);
  }

  @Override
  public void copyFrom(FetchDiffResponse message) {
    setStatus(message.getStatus());
    clearWavelet();
    for (WaveletDiff field : message.getWavelet()) {
      addWavelet(new WaveletDiffImpl(field));
    }
  }

  @Override
  public ResponseStatusImpl getStatus() {
    return new ResponseStatusImpl(status);
  }

  @Override
  public void setStatus(ResponseStatus message) {
    this.status = new ResponseStatusImpl(message);
  }

  @Override
  public List<WaveletDiffImpl> getWavelet() {
    return Collections.unmodifiableList(wavelet);
  }

  @Override
  public void addAllWavelet(List<? extends WaveletDiff> messages) {
    for (WaveletDiff message : messages) {
      addWavelet(message);
    }
  }

  @Override
  public WaveletDiffImpl getWavelet(int n) {
    return new WaveletDiffImpl(wavelet.get(n));
  }

  @Override
  public void setWavelet(int n, WaveletDiff message) {
    this.wavelet.set(n, new WaveletDiffImpl(message));
  }

  @Override
  public int getWaveletSize() {
    return wavelet.size();
  }

  @Override
  public void addWavelet(WaveletDiff message) {
    this.wavelet.add(new WaveletDiffImpl(message));
  }

  @Override
  public void clearWavelet() {
    wavelet.clear();
  }

  /** Provided to subclasses to clear all fields, for example when deserializing. */
  protected void reset() {
    this.status = null;
    this.wavelet.clear();
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof FetchDiffResponseImpl) && isEqualTo(o);
  }

  @Override
  public boolean isEqualTo(Object o) {
    if (o == this) {
      return true;
    } else if (o instanceof FetchDiffResponse) {
      return FetchDiffResponseUtil.isEqual(this, (FetchDiffResponse) o);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return FetchDiffResponseUtil.getHashCode(this);
  }

}