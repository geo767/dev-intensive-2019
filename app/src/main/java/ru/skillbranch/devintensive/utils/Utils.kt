package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?>{
        var parts: List<String>? = fullName?.trim()?.replace(Regex(" +"), " ")?.split(" ")
        var firstName = parts?.notEmptyOrNullAt(0)
        var lastName = parts?.notEmptyOrNullAt(1)

        return Pair(firstName, lastName)
    }

    private fun List<String>.notEmptyOrNullAt(index: Int) = getOrNull(index).let {
        if ("" == it) null
        else it
    }

}