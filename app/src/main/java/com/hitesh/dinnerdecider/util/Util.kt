package com.hitesh.dinnerdecider.util

class Util {

    companion object {
        public fun isNullOrEmpty(str: String?): Boolean {
            if (str != null && !str.isEmpty())
                return false
            return true
        }
    }
}