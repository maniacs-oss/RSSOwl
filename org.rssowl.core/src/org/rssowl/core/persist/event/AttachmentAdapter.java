/*   **********************************************************************  **
 **   Copyright notice                                                       **
 **                                                                          **
 **   (c) 2005-2009 RSSOwl Development Team                                  **
 **   http://www.rssowl.org/                                                 **
 **                                                                          **
 **   All rights reserved                                                    **
 **                                                                          **
 **   This program and the accompanying materials are made available under   **
 **   the terms of the Eclipse Public License v1.0 which accompanies this    **
 **   distribution, and is available at:                                     **
 **   http://www.rssowl.org/legal/epl-v10.html                               **
 **                                                                          **
 **   A copy is found in the file epl-v10.html and important notices to the  **
 **   license from the team is found in the textfile LICENSE.txt distributed **
 **   in this package.                                                       **
 **                                                                          **
 **   This copyright notice MUST APPEAR in all copies of the file!           **
 **                                                                          **
 **   Contributors:                                                          **
 **     RSSOwl Development Team - initial API and implementation             **
 **                                                                          **
 **  **********************************************************************  */

package org.rssowl.core.persist.event;

import java.util.Set;

/**
 * Provides an empty implementation of <code>AttachmentListener</code>.
 * Useful if the client only needs to implement a subset of the interface.
 *
 * @author bpasero
 */
public class AttachmentAdapter implements AttachmentListener {

  /*
   * @see org.rssowl.core.model.events.AttachmentListener#attachmentAdded(java.util.List)
   */
  public void entitiesAdded(Set<AttachmentEvent> events) { }

  /*
   * @see org.rssowl.core.model.events.AttachmentListener#attachmentDeleted(java.util.List)
   */
  public void entitiesDeleted(Set<AttachmentEvent> events) { }

  /*
   * @see org.rssowl.core.model.events.AttachmentListener#attachmentUpdated(java.util.List)
   */
  public void entitiesUpdated(Set<AttachmentEvent> event) { }
}