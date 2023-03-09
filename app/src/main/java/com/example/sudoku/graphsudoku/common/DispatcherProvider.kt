package com.example.sudoku.graphsudoku.common

import kotlin.coroutines.CoroutineContext

interface DispatcherProvider {
    fun provideUIContext():CoroutineContext
    fun provideIOContext():CoroutineContext
}