package com.example.sudoku.ui.newgame.buildlogic

import android.content.Context
import com.example.sudoku.common.ProductionDispatcherProvider
import com.example.sudoku.persistence.*
import com.example.sudoku.ui.newgame.NewGameContainer
import com.example.sudoku.ui.newgame.NewGameViewModel
import com.example.sudoku.ui.newgame.NewGameLogic

internal fun buildNewGameLogic(
    container: NewGameContainer,
    viewModel: NewGameViewModel,
    context: Context
): NewGameLogic {
    return NewGameLogic(
        container,
        viewModel,
        GameRepositoryImpl(
            LocalGameStorageImpl(context.filesDir.path),
            LocalSettingsStorageImpl(context.settingsDataStore)
        ),
        LocalStatisticsStorageImpl(
            context.statsDataStore
        ),
        ProductionDispatcherProvider
    )
}