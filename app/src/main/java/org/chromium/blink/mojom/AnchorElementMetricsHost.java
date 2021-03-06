
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/loader/navigation_predictor.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface AnchorElementMetricsHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends AnchorElementMetricsHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AnchorElementMetricsHost, AnchorElementMetricsHost.Proxy> MANAGER = AnchorElementMetricsHost_Internal.MANAGER;


    void reportAnchorElementMetricsOnClick(
AnchorElementMetrics metrics);



    void reportAnchorElementMetricsOnLoad(
AnchorElementMetrics[] metrics);


}
