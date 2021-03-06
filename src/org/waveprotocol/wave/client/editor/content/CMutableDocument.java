/**
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.waveprotocol.wave.client.editor.content;

import org.waveprotocol.wave.model.document.MutableDocumentImpl;
import org.waveprotocol.wave.model.document.indexed.IndexedDocument;
import org.waveprotocol.wave.model.document.operation.Nindo;
import org.waveprotocol.wave.model.operation.OperationSequencer;

/**
 * Editor's concrete implementation of MutableDocument.
 *
 * Provides a method for turning on selection preservation.
 */
public class CMutableDocument extends MutableDocumentImpl<
    ContentNode, ContentElement, ContentTextNode> {

  public CMutableDocument(
      OperationSequencer<Nindo> sequencer,
      IndexedDocument<ContentNode, ContentElement, ContentTextNode> document) {
    super(sequencer, document);
  }
}
