/*
 * Copyright (C) 2011-2012 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * This file is part of AdAway.
 * 
 * AdAway is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AdAway is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AdAway.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.adawaycn.service;

import org.adawaycn.service.BootService;
import org.adawaycn.util.Constants;
import org.adawaycn.util.Log;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * This broadcast receiver is executed after boot
 */
public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            org.adawaycn.util.Log.i(org.adawaycn.util.Constants.TAG, "BootReceiver invoked, starting BootService in background");

            Intent bootIntent = new Intent(context, org.adawaycn.service.BootService.class);
            context.startService(bootIntent);
        }
    }
}
