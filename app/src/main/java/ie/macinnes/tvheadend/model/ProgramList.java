/* Copyright 2016 Kiall Mac Innes <kiall@macinnes.ie>

Licensed under the Apache License, Version 2.0 (the "License"); you may
not use this file except in compliance with the License. You may obtain
a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations
under the License.
*/
package ie.macinnes.tvheadend.model;

import android.accounts.Account;
import android.database.Cursor;

import java.util.ArrayList;

import ie.macinnes.tvheadend.client.TVHClient;

public class ProgramList extends ArrayList<Program> {
    public static ProgramList fromCursor(Cursor cursor) {
        ProgramList programList = new ProgramList();

        if (cursor == null || cursor.getCount() == 0) {
            return programList;
        }

        while (cursor.moveToNext()) {
            programList.add(Program.fromCursor(cursor));
        }

        return programList;
    }

    public static ProgramList fromClientEventList(TVHClient.EventList clientEventList, long channelId, Account account) {
        ProgramList programList = new ProgramList();

        for (TVHClient.Event event: clientEventList.entries) {
            programList.add(Program.fromClientEvent(event, channelId, account));
        }

        return programList;
    }
}
