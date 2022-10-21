import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {//Esto lllamamos clase main
        
        //inicio clase 1//
       System.out.println("Hola mundo desde Java");
       //fin clase 1//

       //inicio clase 2//
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en progración";
        System.out.println(miVariableCadena);
        //fin clase 2// 

        //inicio clase 3//

        //var - inferencia de tipo en java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        
        //rdefinir una variable Java
        // no se le puede poner numero para empezar variable ej: 2dia (mal)
        //tampoco puede tener caracteres especiales */ pero si puede tener $ o _
        //usar acentos se puede pero no es recomendable porq siempre hay q acordarse 
        //no se puede utilizar # es ilegal
        
        
         var miVariableEjemplo = 45; 
         
         
         
         
         
        //Ejercicio de concatenacion
        //Ejercicio 1
        var usuario = "carlos";
        var titulo = "medico";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(a + b); //aca suma
        System.out.println(usuario + a + b); //aca concatena (siempre evalua de izquierda a derecha y hace asi)
        System.out.println(usuario + (a + b)); //aca sumo porq le pusimos parentesis para prioridad sumo y luego concateno

        //Ejercicio 2
        //FORMAT TE PERMITE ORGANIZAR TODO EL CODIGO
        
        
        
        //caracteres especiales con Java
        var nombre = "Natalia";
        System.out.println(nombre);
        System.out.println("Nueva linea: \n" +nombre); 
        System.out.println("\nNueva linea: \n" +nombre); 
        System.out.println("Tabulador = \t" +nombre); 
        System.out.println("\t.:MENÚ:.");
        System.out.println("\t\t.:MENÚ:.");
        System.out.println("Retroceso: \b" +nombre);
        System.out.println("Retroceso: \b\b" +nombre);
        System.out.println("Comillas simples: \'"+nombre+"\'");
        System.out.println("Comillas Dobles: \""+nombre+"\""); 
        
        
        
        
        //Clase Scanner
        
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();// lee un string cargado por usuario
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " +titulo2+ " "+usuario2);

        //---------------------------------------------------------------------------------------------
        //EJERCICIO 1 / clase 3
        System.out.println("Ingrese el titulo del libro");

        var titulo = entrada.nextLine();

        System.out.println("Ingrese el autor del libro");

        var autor = entrada.nextLine();

        System.out.println("El nombre del libro es:" + titulo + "Fue escrito por: " + autor);
        
        
        //---------------------------------------------------------------------------------------------
        
        //fin clase 3 //

       
        //inicio clase 4 //
        
        
        //Tipos numericos enteros 
        byte numEnteroByte = 10;
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);

        byte numEnteroByte2 = (byte) 127;
        System.out.println("numEnteroByte2 = " + numEnteroByte2);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);

        short numEnteroShort = 10;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);

        short numEnteroShort1 = (short) 32768; //no entra en un short
        System.out.println("numEnteroShort1 = " + numEnteroShort1);
        System.out.println("Valor minimo del short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo del short:" + Short.MAX_VALUE);
        
        
        
         
        int numEnteroInt = (int) 21454841;// se puede poner int para sacar el erro
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int:" + Integer.MAX_VALUE);

        int numEnteroInt3 = (int) 2145434435L; 
        System.out.println("numEnteroInt3 = " + numEnteroInt3);
        System.out.println("Valor minimo del int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int:" + Integer.MAX_VALUE);

        long numEnteroLong = 214543443548754857L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo del long:" + Long.MAX_VALUE);
         
       
        
        //tipos primitimos flotantes 
        float numFloat = (float) 10.0; 
        float numFloat = 10.0F; #otro ejemplo
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float:" + Float.MIN_VALUE);
        System.out.println("El valor maximo de float:" + Float.MAX_VALUE);

        float numFloat1 = (float) 3.4028235E38D; 
        float numFloat = 10.0F;
        System.out.println("numFloat1 = " + numFloat1);
        System.out.println("El valor minimo de float:" + Float.MIN_VALUE);
        System.out.println("El valor maximo de float:" + Float.MAX_VALUE);
         
         
        
        double numDouble = 10;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El Valos minimo de double:"+ Double.MIN_VALUE);
        System.out.println("El Valos maximo de double:"+ Double.MAX_VALUE);
        
        double numDouble1 = 1.7976931348623157E308D;
        System.out.println("numDouble1 = " + numDouble1);
        System.out.println("El valor minimo de double:"+ Double.MIN_VALUE);
        System.out.println("El valor maximo de double:"+ Double.MAX_VALUE);

        //fin clase 4-- --------//

        //---------------------- inicio clase 5----------------------//
        
        //Inferenciar de tipos var y tipos primitivos
        var numEntero = 20; //variables a la espera de una asignacion   
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //al agregar punto se transforma en float
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);

        
        
         //Tipos primitivos char
         
        char miVariable = 'a';
        System.out.println("miVariable = " + miVariable);

        char varCaracter = '\u0024'; // codigo unicode
        System.out.println("varCaracter = " + varCaracter);

        char varCaracterDecimal = 36; // valor decimar del juego de caracteres unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterSimbolo = '$'; //Un caracter especial, pordemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

       
        int varEnteroChar = '$';//muestra el valor decimal en el codigo unicode
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);

        //fin clase 5 -------------//
        
 
        
        //inicio clase 6//
        
        //tipos primitivos tipos booleanos; bandera, true o flase, 1 o 0
        boolean varBool = true; //palabras reservadas pero en minuscula
        System.out.println("varBool = " + varBool);
        
        if(varBool){//se hace una comparacion, en este caso preguntando si varbool es true
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        
         boolean varBool1 = false; 
        System.out.println("varBool = " + varBool1);
        
        
        
        
        //Algoritmo es mayor de edad?
        var edad = 30; 
        var adulto = edad >= 18; // da una asignacion booleana
       if (adulto) {
            System.out.println("Eres mayor de edad");
    }
        else {
            System.out.println("Eres menor de edad");
    }
       
       
       
    
       
       var edad = 15;
       var adulto = edad >= 18; 
       if (adulto) {
            System.out.println("Eres mayor de edad");
    }
       else {
            System.out.println("Eres menor de edad");
    }   
       
               
        var edad = 18; 
        var adulto = edad >= 18; 
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
    }
        else {
            System.out.println("Eres menor de edad");
    }
        
    
        //conversiones de tipos primitivos 
        var edad = Integer.parseInt("20"); //sin convertir, tomaria el 20 com un string 
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //pedir valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        edad = Integer.parseInt( entrada.nextLine());
        System.out.println("edad = " + edad);
         
 
        //conversion de tipos primitivos en java parte 2
        
        var edadTexto = String.valueOf(10); 
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(0);
        System.out.println("fraseChar " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);\

        //ejercicio clase 6 libros//---------------------------------
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el nombre del libro :");
        String nombreLibro = entrada.nextLine();
        System.out.println("ingrese el id del libro :");
        Int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("ingrese el precio del libro :");
        Double precioLibro =  Double.parseDouble(entrada.nextLine());  
        System.out.println("confirme si el envio es gratuito :");
        Boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        System.out.println(nombreLibro+" #"+idLibro);
        System.out.println("precio del libro : $"+precioLibro);
        System.out.println("el envio del libro gratuito es: "+envioGratuito);


        
        
        
        //fin ejercicio clase 6//------------------------------------

        //fin clase 6 //--------------------------------
        
        // inicio clase 7 //--------------------------------
        
        int num1 = 5, num2 = 4;
        //var num1 =5;// en inferencia debe ir separado por punto y coma
        //var num2 =3;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);

        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);

        solucion = num1 * num2;
        System.out.println("solucion de la multiplicación es = " + solucion);

        solucion = num1 / num2;
        System.out.println("solucion de la división es = " + solucion);

        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la división = " + solucion2);

        solucion = num1 % num2;
        System.out.println("solucion = " + solucion);

        if (num1 % 2 == 0) 
        
            System.out.println("Es un número par = ");// con una linea no faltan llaves
         else 
            System.out.println("Es un número impar");
        
        
        int varNum1 = 1, varNum2 =4, varNum4 = 10;
        int varNum3 = varNum1 + 6 - varNum2; 
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 +=1; 
        System.out.println("varNum1 = " + varNum1);
        
        varNum2 -=2; 
        System.out.println("varNum2 = " + varNum2);
        
        varNum3 *=5; 
        System.out.println("varNum3 = " + varNum3);
        
        varNum4 /=2; 
        System.out.println("varNum4 = " + varNum4);
        
        varNum4 %=2; 
        System.out.println("varNum4 = " + varNum4);

        /*Hacer un programa que calcule e imprima el salario de un empleado, a partir de  sus horas semanales  trabajadas y  de su salario por hora. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el apellido del empleado: ");
        String apellidoEmpleado = sc.nextLine();
        System.out.println("Ingrese el salario por hora del empleado: ");
        double salarioPorHora = sc.nextDouble();
        System.out.println("Ingrese las horas trabajadas del empleado: ");
        double horasTrabajadas = sc.nextDouble();
        double salarioEmpleado = salarioPorHora * horasTrabajadas;
        System.out.println("El empleado " + nombreEmpleado + " " + apellidoEmpleado + " gana " + salarioEmpleado + " por hora");
        
        // fin clase 7 //=---------

        //inicio clase  8//=---------

   
        //Operadores unarios: cambio de signos
        
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); // El resultador sera un numero negativo //operaciones de negacion

        var varC = true;
        var varD = !varC;
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        //Operadores unarios de Incremento: Preincremento
        var varE = 9; //modifica
        var varF = ++varE; 
        
        System.out.println("varE = " + varE); // Se incrementa en la unidad      
        System.out.println("varF = " + varF);// va a sumar uno

        //Postincremento (el simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //operadores unarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); //La variable ya esta con decremento
        System.out.println("varJ = " + varJ);

        //Postdecremento 
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego queda el decremento 
        System.out.println("varK = " + varK);//aqui vaa decrementar en 1
        System.out.println("varL = " + varL);
        
        
        //Operadores de igualdad y relacionales
        
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB; //comparacion  de referencia de objetos
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);//esto compara lo que tiene dentro a ver si es igual
        System.out.println("fVar = " + fVar);

        //Operadores relacionales indican si es igual o mayor o menor a otro
        var gVar = aNum > bNum; // >=  == < <=  !=
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }

        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
        
        
        //Operadores condicionales 
        
        var valorA = 7;
        var valorMinimo = 0; //rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }

        var vacaciones = false;
        var diaLibre = false;
        
        if (vacaciones || diaLibre) {
            System.out.println("Papa puede asistir al juego de su hijo");
        } else {
            System.out.println("Papa no puede asistir al juego de su hijo");
        }
        
        //operador ternario 
        
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);
                 
        
        
        
        
        
        
        //prioridad de los operadores

        var x = 5;
        var y = 10;
        var z = ++x + y--;//se evalua de izq a derecha
        //es 16
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9   
        System.out.println("z = " + z);//16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + 30 / 3 =  4 + 10 = 14 
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5 ) * 6 / 3; // 9 * 6 / 3 = 54 / 3 = 18  
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        //-----ejercicios clase 8 ----//
        //Se solicita calcular el área  y el perímetro de un rectángulo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el alto del rectangulo: ");
        int alto = sc.nextInt();
        System.out.println("Ingrese el ancho del rectangulo: ");
        int ancho = sc.nextInt();
        double area = alto * ancho;
        double perimetro = (alto + ancho) * 2;
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        /*Concluir el mayor de dos numeros */

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else {
            System.out.println("El numero mayor es: " + num2);
        }

        //fin clase  8//

        //inicio clase 9//

        // ejercicios clase 9//

        // ej6 programa que calcule e imprima la suma de 3 calificaciones
        // el programa debe solicitar las 3 notas

        float nota1,nota2,nota3,sumatoria;
        System.out.println("ingrese las 3 calificaciones");
        nota1 = Float.parseFloat(entrada.nextLine());
        nota2 = Float.parseFloat(entrada.nextLine());
        nota3 = Float.parseFloat(entrada.nextLine());
        sumatoria = nota1+nota2+nota3;
        System.out.println("sumatoria: " + sumatoria);

        //ej7  una compania paga a su personal un salario de 1000 mensuales
        // mas una comision de 150 por carro vendido, mas el 5% del valor de cada carro
        //cada mes se ingresan los datos en la computadora para calcular el salario mensual

        final int salario = 1000;
        int comision = 150,venta;
        float salarioMensual,ventaCarro,porcVenta, totalPrecio;

        System.out.println("digite la cantida de carros vencidos");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el precio de un carrro:");
        ventaCarro = Float.parseFloat(entrada.nextLine());

        comision *= venta;
        totalPrecio = ventaCarro* venta;
        porcVenta = totalprecio * 0.05f;
        salarioMensual = salario + comision + porcVenta;
        System.out.println("el salario es :"+salarioMensual);

        // fin 9 ----------//
        
    }
}
