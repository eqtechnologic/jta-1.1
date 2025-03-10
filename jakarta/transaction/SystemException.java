/*
 * The contents of this file are subject to the terms 
 * of the Common Development and Distribution License 
 * (the License).  You may not use this file except in
 * compliance with the License.
 * 
 * You can obtain a copy of the license at 
 * https://glassfish.dev.java.net/public/CDDLv1.0.html or
 * glassfish/bootstrap/legal/CDDLv1.0.txt.
 * See the License for the specific language governing 
 * permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL 
 * Header Notice in each file and include the License file 
 * at glassfish/bootstrap/legal/CDDLv1.0.txt.  
 * If applicable, add the following below the CDDL Header, 
 * with the fields enclosed by brackets [] replaced by
 * you own identifying information: 
 * "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 */

package jakarta.transaction;

/**
 * The SystemException is thrown by the transaction manager to 
 * indicate that it has encountered an unexpected error condition
 * that prevents future transaction services from proceeding.
 */
public class SystemException extends java.lang.Exception {


    /**
     * The error code with which to create the SystemException.
     *
     * @serial The error code for the exception
     */
    public int errorCode;

    public SystemException()
    {
    	super();
    }    
    
    /**
     * Create a SystemException with a given string.
     *
     * @param s The string message for the exception
     */
    public SystemException(String s)
    {
    	super(s);
    }
    
    /**
     * Create a SystemException with a given error code.
     *
     * @param errcode The error code for the exception
     */
    public SystemException(int errcode)
    {
    	super();
    	errorCode = errcode;
    }


}
