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
 * Represents the attempt to refer to a non-existing document partitioning.
 * <p>
 * This class is not intended to be serialized.
 * </p>
 *
 * @see IDocument
 * @see IDocumentExtension3
 * @since 3.0
 */
public class BadPartitioningException extends Exception {

	/**
	 * Serial version UID for this class.
	 * <p>
	 * Note: This class is not intended to be serialized.
	 * </p>
	 * @since 3.1
	 */
	private static final long serialVersionUID= 3256439205327876408L;

	/**
	 * Creates a new bad partitioning exception.
	 */
	public BadPartitioningException() {
	}

	/**
	 * Creates a new bad partitioning exception.
	 *
	 * @param message message describing the exception
	 */
	public BadPartitioningException(String message) {
		super(message);
	}
}
