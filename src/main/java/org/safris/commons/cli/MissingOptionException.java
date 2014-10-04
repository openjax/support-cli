/* Copyright (c) 2008 Seva Safris
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * You should have received a copy of The MIT License (MIT) along with this
 * program. If not, see <http://opensource.org/licenses/MIT/>.
 */

package org.safris.commons.cli;

public final class MissingOptionException extends OptionsException {
  private static final long serialVersionUID = 1752296328335010992L;

  public MissingOptionException() {
    super();
  }

  public MissingOptionException(final String message) {
    super();
  }

  public MissingOptionException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public MissingOptionException(final Throwable cause) {
    super(cause);
  }
}