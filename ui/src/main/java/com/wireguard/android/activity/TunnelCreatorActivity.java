/*
 * Copyright © 2017-2019 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.wireguard.android.activity;

import android.os.Bundle;

import com.wireguard.android.fragment.TunnelEditorFragment;
import com.wireguard.android.model.ObservableTunnel;
import com.wireguard.util.NonNullForAll;

import androidx.annotation.Nullable;

/**
 * Standalone activity for creating tunnels.
 */

@NonNullForAll
public class TunnelCreatorActivity extends BaseActivity {
    @Override
    @SuppressWarnings("UnnecessaryFullyQualifiedName")
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportFragmentManager().findFragmentById(android.R.id.content) == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, new TunnelEditorFragment())
                    .commit();
        }
    }

    @Override
    protected void onSelectedTunnelChanged(@Nullable final ObservableTunnel oldTunnel, @Nullable final ObservableTunnel newTunnel) {
        finish();
    }
}
