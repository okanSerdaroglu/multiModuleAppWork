package com.core.feature_api

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

/**
 * every feature is going to have it's own navigation graph
 * movieList feature has it's own nested navigation graph,
 * movieDetail feature has it's own nested navigation graph
 * we can call them subgraphs
 */

interface FeatureApi {

    fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    )

}