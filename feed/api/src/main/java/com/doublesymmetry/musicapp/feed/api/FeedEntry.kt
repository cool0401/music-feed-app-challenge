package com.doublesymmetry.musicapp.feed.api

import com.doublesymmetry.musicapp.feed.api.seam.FeedAction
import com.doublesymmetry.musicapp.feed.api.seam.FeedEffect
import com.doublesymmetry.musicapp.feed.api.seam.FeedState
import com.doublesymmetry.musicapp.navigation.MviComposableFeatureEntry

abstract class FeedEntry : MviComposableFeatureEntry<FeedState, FeedEffect, FeedAction> {

    final override val featureRoute: String
        get() = "feed"

}
