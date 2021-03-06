/*******************************************************************************
 * Copyright (c) 2006, 2009 Abstratt Technologies
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rafael Chaves (Abstratt Technologies) - initial API and implementation
 *******************************************************************************/ 
package com.abstratt.mdd.modelrenderer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Clients should not implement or extend.
 */
public interface IRenderingSession<E extends EObject> {
	public boolean isShallow();
	public boolean render(E toRender);
	public boolean render(E toRender, boolean deep);	
	public E getRoot();
	public E getCurrent();
	public E getPrevious(EClass eClass);
	public IRenderingSettings getSettings();
}
