package io.github.aiwithab.newsapp.cache.converters

import androidx.room.TypeConverter
import io.github.aiwithab.newsapp.cache.models.Source

class SourceConverter {

    @TypeConverter
    fun fromSource(source: Source): String{
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name,name)
    }
}