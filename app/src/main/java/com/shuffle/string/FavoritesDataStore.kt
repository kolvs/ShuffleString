package com.shuffle.string

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "favorites")
private val FAVORITES_KEY = stringSetPreferencesKey("favorites_set")

class FavoritesDataStore(private val context: Context) {

    val favoritesFlow: Flow<Set<String>> = context.dataStore.data.map { preferences ->
        preferences[FAVORITES_KEY] ?: emptySet()
    }

    suspend fun addFavorite(item: String) {
        context.dataStore.edit { preferences ->
            val currentFavorites = preferences[FAVORITES_KEY] ?: emptySet()
            preferences[FAVORITES_KEY] = currentFavorites + item
        }
    }

    suspend fun removeFavorite(item: String) {
        context.dataStore.edit { preferences ->
            val currentFavorites = preferences[FAVORITES_KEY] ?: emptySet()
            preferences[FAVORITES_KEY] = currentFavorites - item
        }
    }

    suspend fun clearAllFavorites() {
        context.dataStore.edit { preferences ->
            preferences[FAVORITES_KEY] = emptySet()
        }
    }
}
