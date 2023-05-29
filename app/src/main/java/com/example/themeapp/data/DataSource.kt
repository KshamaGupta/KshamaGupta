package com.example.themeapp.data

import com.example.themeapp.R
import com.example.themeapp.model.DogDetails

class DataSource {
    fun loaddata():List<DogDetails>{
        return listOf(DogDetails(R.string.dog_name_1,R.string.age1,R.string.dog_description_1,R.drawable.dog1),
            DogDetails(R.string.dog_name_1,R.string.age1,R.string.dog_description_1,R.drawable.dog1),
            DogDetails(R.string.dog_name_2,R.string.age2,R.string.dog_description_2,R.drawable.dog2),
            DogDetails(R.string.dog_name_8,R.string.age2,R.string.dog_description_8,R.drawable.dog3),
            DogDetails(R.string.dog_name_7,R.string.age3,R.string.dog_description_6,R.drawable.dog1),
            DogDetails(R.string.dog_name_9,R.string.age4,R.string.dog_description_1,R.drawable.dog2),
            DogDetails(R.string.dog_name_2,R.string.age5,R.string.dog_description_2,R.drawable.dog3),
            DogDetails(R.string.dog_name_3,R.string.age6,R.string.dog_description_5,R.drawable.dog1),
            DogDetails(R.string.dog_name_4,R.string.age7,R.string.dog_description_4,R.drawable.dog2),
            DogDetails(R.string.dog_name_9,R.string.age8,R.string.dog_description_3,R.drawable.dog3),
            DogDetails(R.string.dog_name_8,R.string.age1,R.string.dog_description_8,R.drawable.dog1),
            DogDetails(R.string.dog_name_7,R.string.age5,R.string.dog_description_7,R.drawable.dog2),
            DogDetails(R.string.dog_name_6,R.string.age3,R.string.dog_description_6,R.drawable.dog3),
            DogDetails(R.string.dog_name_5,R.string.age2,R.string.dog_description_5,R.drawable.dog1),
            )

    }
}