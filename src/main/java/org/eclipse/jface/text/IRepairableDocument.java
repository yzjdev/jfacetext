/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
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
 * Tagging interface to be implemented by
 * {@link IDocument} implementers that offer a line
 * repair method on the documents.
 * <p>
 * In order to provide backward compatibility for clients of
 * <code>IRepairableDocument</code>, extension interfaces are used to provide
 * a means of evolution. The following extension interfaces exist:
 * <ul>
 * <li> {@link IRepairableDocumentExtension} since version 3.4
 *      adds the ability to query whether the repairable document needs to be repaired.</li>
 * </ul>
 *
 *
 * @see IDocument
 * @see IRepairableDocumentExtension
 * @since 3.0
 */
public interface IRepairableDocument {

	/**
	 * Repairs the line information of the document implementing this interface.
	 */
	void repairLineInformation();
}
