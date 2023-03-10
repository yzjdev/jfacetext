/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.text;


/**
 * A document rewrite session.
 *
 * @see IDocument
 * @see IDocumentExtension4
 * @see IDocumentRewriteSessionListener
 * @since 3.1
 */
public class DocumentRewriteSession {

	private DocumentRewriteSessionType fSessionType;

	/**
	 * Prohibit package external object creation.
	 *
	 * @param sessionType the type of this session
	 */
	protected DocumentRewriteSession(DocumentRewriteSessionType sessionType) {
		fSessionType= sessionType;
	}

	/**
	 * Returns the type of this session.
	 *
	 * @return the type of this session
	 */
	public DocumentRewriteSessionType getSessionType() {
		return fSessionType;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(hashCode()).toString();
	}
}
