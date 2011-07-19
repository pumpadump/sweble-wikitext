/**
 * Copyright 2011 The Open Source Research Group,
 *                University of Erlangen-Nürnberg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sweble.wikitext.engine.dom;

/**
 * Denotes a single line break.
 * 
 * Corresponds to the XHTML 1.0 Transitional element "br".
 */
public interface DomBreak
        extends
            DomInlineElement,
            DomCoreAttributes
{
	/**
	 * Get the sides on which floating elements are not allowed.
	 * 
	 * Corresponds to the XHTML 1.0 Transitional attribute "clear".
	 * 
	 * @return The sides on which floating elements are not allowed.
	 */
	public DomClear getClear();
	
	/**
	 * Set the sides on which floating elements are not allowed.
	 * 
	 * Corresponds to the XHTML 1.0 Transitional attribute "clear".
	 * 
	 * @param clear
	 *            The new sides on which floating elements are not allowed.
	 * 
	 * @return The old sides on which floating elements are not allowed.
	 */
	public DomClear setClear(DomClear clear);
}
