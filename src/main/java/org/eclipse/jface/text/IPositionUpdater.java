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
 * A position updater is responsible for adapting document positions. When
 * installed on a document, the position updater updates the document's
 * positions to changes applied to this document. Document updaters can be
 * selective, i.e. they might only update positions of a certain category.
 * <p>
 * Position updaters are of primary importance for the definition of the
 * semantics of positions.
 * <p>
 * Clients may implement this interface or use the standard implementation
 * {@link DefaultPositionUpdater}.
 * </p>
 *
 * @see IDocument
 * @see Position
 */
public interface IPositionUpdater {

	/**
	 * Adapts positions to the change specified by the document event.
	 * It is ensured that the document's partitioning has been adapted to
	 * this document change and that all the position updaters which have
	 * a smaller index in the document's position updater list have been called.
	 *
	 * @param event the document event describing the document change
	 */
	void update(DocumentEvent event);
}
