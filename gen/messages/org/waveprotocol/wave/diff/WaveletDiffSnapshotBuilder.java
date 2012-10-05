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

package org.waveprotocol.wave.diff;

import org.waveprotocol.wave.diff.DocumentDiffSnapshot;
import org.waveprotocol.wave.federation.ProtocolHashedVersion;
import org.waveprotocol.wave.diff.DocumentDiffSnapshotBuilder;
import org.waveprotocol.wave.federation.ProtocolHashedVersionBuilder;
import org.waveprotocol.wave.diff.WaveletDiffSnapshotUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Builder for WaveletDiffSnapshots.
 *
 * Generated from org/waveprotocol/wave/diff/diff.proto. Do not edit.
 */
public final class WaveletDiffSnapshotBuilder {

  /** Factory to pass to {@link #build()}. */
  public interface Factory {
    WaveletDiffSnapshot create();
  }

  private String waveletId;
  private final List<String> participant = new ArrayList<String>();
  private final List<String> addedParticipant = new ArrayList<String>();
  private final List<String> removedParticipant = new ArrayList<String>();
  private final List<DocumentDiffSnapshot> document = new ArrayList<DocumentDiffSnapshot>();
  private ProtocolHashedVersion version;
  private Double lastModifiedTime;
  private String creator;
  private Double creationTime;
  public WaveletDiffSnapshotBuilder() {
  }

  public WaveletDiffSnapshotBuilder setWaveletId(String value) {
    this.waveletId = value;
    return this;
  }

  public WaveletDiffSnapshotBuilder addAllParticipant(List<String> values) {
    this.participant.addAll(values);
    return this;
  }

  public WaveletDiffSnapshotBuilder setParticipant(int n, String value) {
    this.participant.set(n, value);
    return this;
  }

  public WaveletDiffSnapshotBuilder addParticipant(String value) {
    this.participant.add(value);
    return this;
  }

  public WaveletDiffSnapshotBuilder clearParticipant() {
    participant.clear();
    return this;
  }

  public WaveletDiffSnapshotBuilder addAllAddedParticipant(List<String> values) {
    this.addedParticipant.addAll(values);
    return this;
  }

  public WaveletDiffSnapshotBuilder setAddedParticipant(int n, String value) {
    this.addedParticipant.set(n, value);
    return this;
  }

  public WaveletDiffSnapshotBuilder addAddedParticipant(String value) {
    this.addedParticipant.add(value);
    return this;
  }

  public WaveletDiffSnapshotBuilder clearAddedParticipant() {
    addedParticipant.clear();
    return this;
  }

  public WaveletDiffSnapshotBuilder addAllRemovedParticipant(List<String> values) {
    this.removedParticipant.addAll(values);
    return this;
  }

  public WaveletDiffSnapshotBuilder setRemovedParticipant(int n, String value) {
    this.removedParticipant.set(n, value);
    return this;
  }

  public WaveletDiffSnapshotBuilder addRemovedParticipant(String value) {
    this.removedParticipant.add(value);
    return this;
  }

  public WaveletDiffSnapshotBuilder clearRemovedParticipant() {
    removedParticipant.clear();
    return this;
  }

  public WaveletDiffSnapshotBuilder addAllDocument(List<? extends DocumentDiffSnapshot> messages) {
    for (DocumentDiffSnapshot message : messages) {
      addDocument(message);
    }
    return this;
  }

  public WaveletDiffSnapshotBuilder setDocument(int n, DocumentDiffSnapshot message) {
    this.document.set(n, message);
    return this;
  }

  public WaveletDiffSnapshotBuilder addDocument(DocumentDiffSnapshot message) {
    this.document.add(message);
    return this;
  }

  public WaveletDiffSnapshotBuilder clearDocument() {
    document.clear();
    return this;
  }

  public WaveletDiffSnapshotBuilder setVersion(ProtocolHashedVersion message) {
    this.version = message;
    return this;
  }

  public WaveletDiffSnapshotBuilder setLastModifiedTime(double value) {
    this.lastModifiedTime = value;
    return this;
  }

  public WaveletDiffSnapshotBuilder setCreator(String value) {
    this.creator = value;
    return this;
  }

  public WaveletDiffSnapshotBuilder setCreationTime(double value) {
    this.creationTime = value;
    return this;
  }

  /** Builds a {@link WaveletDiffSnapshot} using this builder and a factory. */
  public WaveletDiffSnapshot build(Factory factory) {
    WaveletDiffSnapshot message = factory.create();
    message.setWaveletId(waveletId);
    message.clearParticipant();
    message.addAllParticipant(participant);
    message.clearAddedParticipant();
    message.addAllAddedParticipant(addedParticipant);
    message.clearRemovedParticipant();
    message.addAllRemovedParticipant(removedParticipant);
    message.clearDocument();
    message.addAllDocument(document);
    message.setVersion(version);
    message.setLastModifiedTime(lastModifiedTime);
    message.setCreator(creator);
    message.setCreationTime(creationTime);
    return message;
  }

}