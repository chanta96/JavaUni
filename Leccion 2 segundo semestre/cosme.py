lista_nombres = []
print('hello world'*5)
agg_nombre = True
while agg_nombre:
    lista_nombres.append(input('ingrese el nombre del usuario'))
    print ('desea seguir agregando usuarios?')
    option = input('')
    if option != 'yes':
        agg_nombre = False
        
print (lista_nombres*2)