package com.davega.domain.model

import com.davega.domain.util.Constant

class Recipe(
    var id: String = String(),
    var name: String = String(),
    var description: String = String(),
    var preparation: String = String(),
    var preparationTime: String = String(),
    var numberOfDishes: Int = Constant.Number.ZERO,
    var imageUrl: String = String(),
    var ingredients: List<String> = emptyList(),
    var originLocation: Location = Location(),
)
