# -*- coding: utf-8 -*-
"""

Programa que muestra la pérdidad de Asociatividad 

Created on Fri Sep 24 00:53:47 2021

@author: Roberto Méndez
"""

a = 1
b = 10**(-16)
c = -1

print("en algebra nos han dicho que (a + b) + c =  a + (b + c) \n" )
print("Entonces 1 + (-1 + 10^(-16))  = (1 - 1) + 10^(-16)   ")
print("Por lo tanto: ", (a + b) + c, " = ",  a + (b + c))


a = 1/3
b = 1/7
c = 2/3

e = (a + b) - c
d = (a - c) + b
print("\n" , c)
print(d)
