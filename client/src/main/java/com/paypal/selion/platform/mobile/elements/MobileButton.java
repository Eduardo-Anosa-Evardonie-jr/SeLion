/*-------------------------------------------------------------------------------------------------------------------*\
|  Copyright (C) 2016 PayPal                                                                                          |
|                                                                                                                     |
|  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance     |
|  with the License.                                                                                                  |
|                                                                                                                     |
|  You may obtain a copy of the License at                                                                            |
|                                                                                                                     |
|       http://www.apache.org/licenses/LICENSE-2.0                                                                    |
|                                                                                                                     |
|  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed   |
|  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for  |
|  the specific language governing permissions and limitations under the License.                                     |
\*-------------------------------------------------------------------------------------------------------------------*/

package com.paypal.selion.platform.mobile.elements;

import com.paypal.selion.platform.mobile.Implementor;
import com.paypal.selion.platform.mobile.android.UiButton;
import com.paypal.selion.platform.mobile.ios.UIAButton;

/**
 * <code>MobileButton</code> interface allows access to, and control of, button elements in your app.
 */
@Implementor(ios = UIAButton.class, android = UiButton.class)
public interface MobileButton extends MobileElement {

}
