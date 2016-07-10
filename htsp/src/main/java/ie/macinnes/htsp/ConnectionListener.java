/*
 * Copyright (c) 2016 Kiall Mac Innes <kiall@macinnes.ie>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package ie.macinnes.htsp;

import android.os.Handler;

public class ConnectionListener implements IConnectionListener {
    private static final String TAG = MessageListener.class.getName();

    private Handler mHandler;

    public ConnectionListener() {}

    public ConnectionListener(Handler handler) {
        mHandler = handler;
    }

    @Override
    public void onStateChange(int state, int previous) {

    }
}
