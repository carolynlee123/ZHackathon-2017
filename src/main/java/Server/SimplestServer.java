//
//========================================================================
//Copyright (c) 1995-2017 Mort Bay Consulting Pty. Ltd.
//------------------------------------------------------------------------
//All rights reserved. This program and the accompanying materials
//are made available under the terms of the Eclipse Public License v1.0
//and Apache License v2.0 which accompanies this distribution.
//
//  The Eclipse Public License is available at
//  http://www.eclipse.org/legal/epl-v10.html
//
//  The Apache License v2.0 is available at
//  http://www.opensource.org/licenses/apache2.0.php
//
//You may elect to redistribute this code under either of these licenses.
//========================================================================
//
package Server;

import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;

/**
* The simplest possible Jetty server.
*/
public class SimplestServer {
	
    private static final Logger logger = Logger.getLogger(SimplestServer.class);

	public static void main( String[] args ) throws Exception {
	    Server server = new Server(8081);
	    server.start();
	    logger.debug("Started jetty server");
	    server.dumpStdErr();
	    server.join();
	}
}
