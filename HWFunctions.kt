//Umutcan Durbak Homework 2
package com.example.firstproject.homework2

class HWFunctions {


    // Interior Angle Sum
    fun calculateAngleSum(edge: Int): Double {
        return ((edge - 2) * 180).toDouble()
    }

    //Salary Calculation
    fun calculateSalary(daysWorked: Int): Int {
        val hoursPerDay = 8
        val regularHourlyWage = 40
        val overtimeHourlyWage = 80
        val regularHours = daysWorked * hoursPerDay
        val overtimeHours = if (regularHours > 150) regularHours - 150 else 0
        return (regularHours * regularHourlyWage) + (overtimeHours * (overtimeHourlyWage - regularHourlyWage))
    }

    //Parking Fee Calculation
    fun calculateParkingFee(hoursParked: Int): Int {
        val baseRate = 50
        val additionalRate = 10
        return if (hoursParked > 1) {
            baseRate + (hoursParked - 1) * additionalRate
        } else {
            baseRate
        }
    }

    //Kilometers to Miles
    fun convertKilometersToMiles(kilometers: Double): Double {
        return kilometers * 0.621
    }

    //Rectangle Are Calculation
    fun calculateRectangleArea(width: Int, height: Int): Int {
        return width * height
    }

    //Factorial Calculation
    fun calculateFactorial(number: Int): Long {
        var factorial: Long = 1
        for (i in 1..number) {
            factorial *= i
        }
        return factorial
    }

    //E letter in word
    fun countEInWord(word: String): Int {
        return word.count { it == 'e' || it == 'E' }
    }
}