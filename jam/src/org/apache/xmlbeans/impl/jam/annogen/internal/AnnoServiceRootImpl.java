/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.xmlbeans.impl.jam.annogen.internal;

import org.apache.xmlbeans.impl.jam.annogen.AnnoServiceRoot;
import org.apache.xmlbeans.impl.jam.annogen.JavadocAnnoService;
import org.apache.xmlbeans.impl.jam.annogen.ReflectAnnoService;

/**
 * @author Patrick Calahan &lt;email: pcal-at-bea-dot-com&gt;
 */
public class AnnoServiceRootImpl implements AnnoServiceRoot {


  // ========================================================================
  // Variables

  private AnnoServiceParamsImpl mParams;
  private ReflectAnnoService mReflectService = null;

  // ========================================================================
  // Constructors

  public AnnoServiceRootImpl(AnnoServiceParamsImpl params) {
    mParams = params;
  }

  // ========================================================================
  // AnnotationServiceRoot implementation

  public JavadocAnnoService getJavadocService() {
    throw new IllegalStateException("NYI");
  }

  public ReflectAnnoService getReflectService() {
    return (mReflectService != null) ? mReflectService :
        (mReflectService = new ReflectAnnoServiceImpl(mParams));
  }
}
