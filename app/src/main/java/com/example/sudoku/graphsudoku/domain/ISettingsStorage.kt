package com.example.sudoku.graphsudoku.domain

interface ISettingsStorage {
    suspend fun getSettings():SettingsStorageResult
    suspend fun updateSettings(settings: Settings):SettingsStorageResult

}

sealed class SettingsStorageResult{
    data class OnSuccess(val settings: Settings): SettingsStorageResult()
    data class OnError(val exception: java.lang.Exception): SettingsStorageResult()
}