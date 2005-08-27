/**
 * $RCSfile$
 * $Revision: $
 * $Date: $
 *
 * Copyright 2003-2004 Jive Software.
 *
 * All rights reserved. Licensed under the Apache License, Version 2.0 (the "License");
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

package org.jivesoftware.smack;

/**
 * Convenience class to make it easier to connect to GoogleTalk. You can also use
 * XMPPConnection to connect to Google Talk by specifying the server name,
 * service name, and port.
 *
 * @author Matt Tucker
 */
public class GoogleTalkConnection extends XMPPConnection {

    public GoogleTalkConnection() throws XMPPException {
        super("talk.google.com", 5222, "gmail.com");
    }
}