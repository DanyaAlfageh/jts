/*
 * Copyright (c) 2016 Vivid Solutions.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v20.html
 * and the Eclipse Distribution License is available at
 *
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.locationtech.jts.index;

import java.util.ArrayList;

/**
 * Builds an array of all visited items.
 * 
 * @version 1.7
 */
public class ArrayListVisitor
    implements ItemVisitor
{

  private ArrayList items = new ArrayList();
  
  /**
   * Creates a new instance.
   */
  public ArrayListVisitor() {
  }

  /**
   * Visits an item.
   * 
   * @param item the item to visit
   */
  public void visitItem(Object item)
  {
    items.add(item);
  }

  /**
   * Gets the array of visited items.
   * 
   * @return the array of items
   */
  public ArrayList getItems() { return items; }

}
