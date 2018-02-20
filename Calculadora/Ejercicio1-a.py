#!/usr/bin/env python2
#encoding: UTF-8

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

numero = int(raw_input('Ingrese el numero del cual se desee la tabla de multiplicar: '))
rango = range(1,11)
for elemento in rango:
	producto = numero *elemento
	print numero, " X ", elemento, ' = ', producto
print "Esta fue la tabla de multiplicar del numero elegido"