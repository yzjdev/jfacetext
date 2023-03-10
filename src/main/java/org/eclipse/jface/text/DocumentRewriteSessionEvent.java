/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
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

import org.eclipse.core.runtime.Assert;


/**
 * Description of the state of document rewrite sessions.
 *
 * @see IDocument
 * @see IDocumentExtension4
 * @see IDocumentRewriteSessionListener
 * @since 3.1
 */
public class DocumentRewriteSessionEvent {

	public final static Object SESSION_START= new Object();
	public final static Object SESSION_STOP= new Object();

	/** The changed document */
	public IDocument fDocument;
	/** The session */
	public DocumentRewriteSession fSession;
	/** The change type */
	public Object fChangeType;

	/**
	 * Creates a new document event.
	 *
	 * @param doc the changed document
	 * @param session the session
	 * @param changeType the change type. This is either
	 *            {@link DocumentRewriteSessionEvent#SESSION_START} or
	 *            {@link DocumentRewriteSessionEvent#SESSION_STOP}.
	 */
	public DocumentRewriteSessionEvent(IDocument doc, DocumentRewriteSession session, Object changeType) {
		Assert.isNotNull(doc);
		Assert.isNotNull(session);

		fDocument= doc;
		fSession= session;
		fChangeType= changeType;
	}

	/**
	 * Returns the changed document.
	 *
	 * @return the changed document
	 */
	public IDocument getDocument() {
		return fDocument;
	}

	/**
	 * Returns the change type of this event. This is either
	 * {@link DocumentRewriteSessionEvent#SESSION_START}or
	 * {@link DocumentRewriteSessionEvent#SESSION_STOP}.
	 *
	 * @return the change type of this event
	 */
	public Object getChangeType() {
		return fChangeType;
	}

	/**
	 * Returns the rewrite session.
	 *
	 * @return the rewrite session
	 */
	public DocumentRewriteSession getSession() {
		return fSession;
	}
}
