### Author: Adnan Azad
[Personal Website](https://adnanaazad.github.io/)

# Medavie-Blue-Cross-Assesment-JAVA
    Java Assesment: Ceiling Fan

# Description
    This assesment aims to implement a simple ceiling fan
    with the characteristics listed below:
    •    The unit has 2 pull cords:
      One increases the speed each time it is pulled. There are 3 speed settings, and an “off” (speed 0) setting.
      If the cord is pulled on speed 3, the fan returns to the “off” setting.
      One reverses the direction of the fan at the current speed setting.
      Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
    •    Assume the unit is always powered (no wall switch)

# How the system works
This project utlises a CeilingFan Class and uses its methods to implement Cord 1, Cord 2, And Display of status of the fan.

The method 'IncreaseSpeed()' is implemented as Cord 1; that is, to increase the fan speed by 1. And when the fan speed is at maximum, the
next increment will set speed to OFF -> 0.

The method 'ToggleDirection()' is implemented as Cord 2; that is, to change direction the fan is spinning

The method 'CheckStatus()' is used to print out the speed and direction of the fan (current status) onto the console/terminal.
