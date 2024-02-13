package com.example.firstproject.homework2

fun main() {

    val f = HWFunctions()
    val result1 = f.calculateAngleSum(5)
    val result2 = f.calculateSalary(30)
    val result3 = f.calculateParkingFee(4)
    val result4 = f.convertKilometersToMiles(374.5)
    val result5 = f.calculateRectangleArea(24,18)
    val result6 = f.calculateFactorial(7)
    val result7 = f.countEInWord("Hello Everyone!")

    println("Interior Angle Sum of 5 edges shape            : $result1")
    println("30 Days Total Salary                           : $result2")
    println("Parking fee of 4 hours parking                 : $result3")
    println("374.5 Kilometers to Miles                      : $result4")
    println("Rectangle Area of with width 24 and height 18  : $result5")
    println("Factorial of number 7                          : $result6")
    println("Number of 'E' letters in 'Hello Everyone'      : $result7")
}