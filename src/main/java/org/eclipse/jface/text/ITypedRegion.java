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
 * Describes a region of an indexed text store such as a document or a string.
 * The region consists of offset, length, and type. The region type is defined
 * as a string.
 * <p>
 * A typed region can, e.g., be used to described document partitions.</p>
 * <p>
 * Clients may implement this interface or use the standard implementation
 * {@link TypedRegion}.</p>
 */
public interface ITypedRegion extends IRegion {

	/**
	 * Returns the content type of the region.
	 *
	 * @return the content type of the region
	 */
	String getType();
}
