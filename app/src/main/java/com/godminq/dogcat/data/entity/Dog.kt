package com.godminq.dogcat.data.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

/*
@Entity(tableName = "collected_dog")
data class Dog (
    @PrimaryKey(autoGenerate = true) @ColumnInfo
    var id: Long,

    @ColumnInfo
    var category_id: Long,

    @ColumnInfo
    var category_name: String,

    @Embedded
    var dogImage: DogImage? = null
) {
    override fun toString(): String {
        return "id = $id, category_id = $category_id, category_name = $category_name"
    }
}

data class DogImage (
    @ColumnInfo
    var like_check: Boolean = false
) {
    @ColumnInfo
    var image_id: String? = null

    @ColumnInfo
    var image_url: String? = null

    @ColumnInfo(name = "date")
    var datetime: Long? = null
}

 */