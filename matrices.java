public class Matrices2{
   public static void main(String[]a){
   int Matriz[][]=new int[10][10];
   int conta1[]=new int[10];
   int conta2[]=new int[10];
   float MatrizA[][]=new float[10][10];
   float MatrizB[][]=new float[10][10];
   float MatrizC[][]=new float[10][10];
   int Arreglo[]=new int[10];
   int numero=0,i=0,j=0,c=0,c1=0,c2=0,c3=0,c4=0,t=0,t2=0,opc=0,k=0,t4,wb=0,hwb=0,k1=1,ac=0,ac2=0,aux;
   System.out.print("*****Primer Parcial*****\n");
   System.out.print("1)Verificacion De Matriz Nula \n");
   System.out.print("2)Verificacion De Matriz Identidad \n");
   System.out.print("3)Verificacion De Matriz Diagonal \n");
   System.out.print("4)Verificacion De Matriz Escalar \n");
   System.out.print("5)Verificacion De Matriz Simetrica \n");
   System.out.print("6)Verificacion De Matriz Transpuesta \n");
   System.out.print("7)Verificacion De Matriz Triangular Superior \n");
   System.out.print("8)Verificacion De Matriz Triangular Inferior\n");
   System.out.print("9)Verificacion De Matriz Bandeada\n\n");
   System.out.print("*****Segundo Parcial*****\n");
   System.out.print("10)Determinante de la Diagonal de una Matriz\n");
   System.out.print("11)Verificacion de Matriz Dominante(Renglon-Columna)\n");
   System.out.print("12)Calculo de Menores: Metodo Cramer\n");
   System.out.print("13)Multiplicacion de Matrices\n");
   System.out.print("\n\n");
   System.out.println("Introduce La Opcion Del Menu");
   opc=leer.datoInt();
   switch(opc){
    case 1:
     System.out.println("Matriz Nula");
     System.out.print("Introduce el tamaño de la matriz [2-10]\n");
     numero=leer.datoInt();
     if(numero>=2&&numero<=10){
      System.out.print("Introduce los Datos\n");
     for(i=1;i<=numero;i++){
      for(j=1;j<=numero;j++){
       Matriz[i][j]=leer.datoInt();
      }
     }
     for(i=1;i<=numero;i++){
      System.out.print("\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+Matriz[i][j]);
        if(Matriz[i][j]==0){
         c=c+1;
       }
      }
     }
  System.out.print("\n");
  t=numero*numero;
     if(c==t){
      System.out.println("La Matriz Es Nula");
     }
     else{
      System.out.println("La Matriz No Es Nula");
     }
     }
     else{
  System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
 }
     break;
    case 2:
     System.out.println("Matriz Identidad");
     System.out.print("Introduce el tamaño de la matriz [2-10]\n");
     numero=leer.datoInt();
     if(numero>=2&&numero<=10){
      System.out.print("Introduce los Datos\n");
     for(i=1;i<=numero;i++){
      for(j=1;j<=numero;j++){
       Matriz[i][j]=leer.datoInt();
      }
     }
     for(i=1;i<=numero;i++){
      System.out.print("\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+Matriz[i][j]);
        if((i==j&&Matriz[i][j]!=0&&Matriz[i][j]==Matriz[i][j]&&Matriz[i][j]==1)){
         c1=c1+1;
        }
        if((i!=j)&&(Matriz[i][j]==0)){
         c2=c2+1;
        }
      }
     }
     t2=numero*numero-numero;
  System.out.println("\n");
  if(c1==numero && c2==t2){
   System.out.println("Es Matriz Identidad\n");
  }
  else{
   System.out.println("No Es Matriz Identidad\n");
  }
     }
     else{
  System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
  }
     break;
    case 3:
  System.out.println("Matriz Diagonal");
     System.out.print("Introduce el tamaño de la matriz [2-10]\n");
     numero=leer.datoInt();
     if(numero>=2&&numero<=10){
      System.out.print("Introduce los Datos\n");
     for(i=1;i<=numero;i++){
      for(j=1;j<=numero;j++){
       Matriz[i][j]=leer.datoInt();
      }
     }
     for(i=1;i<=numero;i++){
      System.out.print("\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+Matriz[i][j]);
        if((i==j)&&(Matriz[i][j]!=0)){
        c1=c1+1;
        }
        if((i!=j)&&(Matriz[i][j]==0)){
         c2=c2+1;
        }
      }
     }
     t2=numero*numero-numero;
  System.out.println("\n");
  if(c1==numero && c2==t2){
   System.out.println("Es Matriz Diagonal\n");
  }
  else{
   System.out.println("No Es Matriz Diagonal\n");
  }
     }
     else{
  System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
  }
     break;
     case 4:
     System.out.println("Matriz Escalar");
     System.out.print("Introduce el tamaño de la matriz [2-10]\n");
     numero=leer.datoInt();
     if(numero>=2&&numero<=10){
      System.out.print("Introduce los Datos\n");
     for(i=1;i<=numero;i++){
      for(j=1;j<=numero;j++){
       Matriz[i][j]=leer.datoInt();
      }
     }
     for(i=1;i<=numero;i++){
      System.out.print("\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+Matriz[i][j]);
        if((Matriz[i][j]==Matriz[1][1])&&(Matriz[i][j]!=0)){
        c1=c1+1;
        }
        if((i!=j)&&(Matriz[i][j]==0)){
         c2=c2+1;
        }
      }
     }
     t4=0;
     t4=numero*numero-numero;
     if((c1==numero)&&(t4==c2)){
      System.out.println("\nLa Matriz Es Escalar");
     }
     else
      System.out.println("\nLa Matriz No Es Escalar");
     }
     break;
     case 5:
     System.out.println("Matriz Simetrica");
     System.out.print("Introduce el tamaño de la matriz [2-10]\n");
     numero=leer.datoInt();
     System.out.print("\n");
  System.out.print("Introduce Los Datos:\n");
     if(numero>=2&&numero<=10){
     for(i=1;i<=numero;i++){
      for(j=1;j<=numero;j++){
       Matriz[i][j]=leer.datoInt();
      }
     }
     for(i=1;i<=numero;i++){
      System.out.print("\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+Matriz[i][j]);
        }
        }
     for(i=1;i<=numero;i++){
      System.out.print("\n");
       for(j=1;j<=numero;j++){
        if((Matriz[i][j]==Matriz[j][i])&&(i!=j)){
         c=c+1;
        }
       }
      }
      System.out.print("contador="+c);
      if((numero==2) && (c==2)){
       System.out.print("\n\nLa Matriz es Simetrica");
      }
      if((numero==3) && (c==6)){
       System.out.print("\n\nLa Matriz es Simetrica");
      }
      if((numero==4) && (c==12)){
       System.out.print("\n\nLa Matriz es Simetrica");
      }
      if((numero==5) && (c==18)){
       System.out.print("\n\nLa Matriz es Simetrica");
      }
      if((numero==6) && (c==24)){
       System.out.print("\n\nLa Matriz es Simetrica");
      }
      if((numero==7) && (c==30)){
       System.out.print("\n\nLa Matriz es Simetrica");
      }
      if((numero==8) && (c==36)){
       System.out.print("\n\nLa Matriz es Simetrica");
      }
      if((numero==9) && (c==42)){
       System.out.print("\n\nLa Matriz es Simetrica");
      }
      if((numero==10) && (c==48)){
       System.out.print("\n\nLa Matriz es Simetrica");
      }
      else{
       System.out.print("\n\nLa Matriz No Es Simetrica");
      }
     }//Cierre if
     else{
  System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
  }
     break;
     case 6:
     System.out.println("Matriz Transpuesta");
     System.out.print("Introduce el tamaño de la matriz [2-10]\n");
     numero=leer.datoInt();
     System.out.print("\n");
  System.out.print("Introduce Los Datos:\n");
     if(numero>=2&&numero<=10){
     for(i=1;i<=numero;i++){
      for(j=1;j<=numero;j++){
       Matriz[i][j]=leer.datoInt();
      }
     }
     for(i=1;i<=numero;i++){
      System.out.print("\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+Matriz[i][j]);
        }
        }
     System.out.print("\n\n\nMatriz Transpuesta:\n\n");
     for(i=1;i<=numero;i++){
      System.out.print("\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+Matriz[j][i]);
        }
        }
     }//Cierre if
     else{
  System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
  }
     break;
     case 7:
     System.out.println("\nMatriz Triangular Superior\n");
     System.out.print("Introduce el tamaño de la matriz [2-10]\n");
     numero=leer.datoInt();
     System.out.print("\n");
  System.out.print("Introduce Los Datos:\n");
     if(numero>=2&&numero<=10){
     for(i=1;i<=numero;i++){
      for(j=1;j<=numero;j++){
       Matriz[i][j]=leer.datoInt();
      }
     }
     for(i=1;i<=numero;i++){
      System.out.print("\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+Matriz[i][j]);
        if((Matriz[i][j]==0) && (i>j)){
         c1=c1+1;
        }
        if(Matriz[i][j]!=0 && i<=j){
          c2=c2+1;
         }
       }
       }
       if((numero==2) && (c1==1 && (c2==3))){
        System.out.print("\nLa Matriz Es Triangular Superior\n");
       }
       else{
       if((numero==3) && (c1==3) && (c2==6)){
        System.out.print("\nLa Matriz Es Triangular Superior\n");
       }
       else{
       if((numero==4) && (c1==6) && (c2==10)){
        System.out.print("\nLa Matriz Es Triangular Superior\n");
       }
       else{
       if((numero==5) && (c1==10 && (c2==15))){
        System.out.print("\nLa Matriz Es Triangular Superior\n");
       }
       else{
       if((numero==6) && (c1==15) && (c2==21)){
        System.out.print("\nLa Matriz Es Triangular Superior\n");
       }
       else{
       if((numero==7) && (c1==21)&& (c2==28)){
        System.out.print("\nLa Matriz Es Triangular Superior\n");
       }
       else{
       if((numero==8) && (c1==28) && (c2==36)){
        System.out.print("\nLa Matriz Es Triangular Superior\n");
       }
       else{
       if((numero==9) && (c1==36) && (c2==45)){
        System.out.print("\nLa Matriz Es Triangular Superior\n");
       }
       else{
       if((numero==10) && (c1==45) && (c2==55)){
        System.out.print("\nLa Matriz Es Triangular Superior\n");
       }
       else{
        System.out.print("\nLa Matriz No Es Triangular Superior\n");
       }
       }
       }
       }
       }
       }
       }
       }
       }

     }//Cierre if
     else{
   System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
  }
   break;
   case 8:
   System.out.print("\n\nMatriz Triangular Inferior\n\n");
      System.out.print("Introduce el tamaño de la matriz [2-10]\n");
      numero=leer.datoInt();
      System.out.print("\n");
   System.out.print("Introduce Los Datos:\n");
      if(numero>=2&&numero<=10){
      for(i=1;i<=numero;i++){
       for(j=1;j<=numero;j++){
        Matriz[i][j]=leer.datoInt();
       }
      }
      for(i=1;i<=numero;i++){
       System.out.print("\n");
        for(j=1;j<=numero;j++){
         System.out.print("\t"+Matriz[i][j]);
         if((Matriz[i][j]==0) && (i<j)){
          c1=c1+1;
         }
         if(Matriz[i][j]!=0 && i>=j){
          c2=c2+1;
         }
        }
        }
        if((numero==2) && (c1==1)&& (c2==3)){
        System.out.print("\nLa Matriz Es Triangular Inferior\n");
       }
       else{
       if((numero==3) && (c1==3) && (c2==6)){
        System.out.print("\nLa Matriz Es Triangular Inferior\n");
       }
       else{
       if((numero==4) && (c1==6) && (c2==10)){
        System.out.print("\nLa Matriz Es Triangular Inferior\n");
       }
       else{
       if((numero==5) && (c1==10) && (c2==15)){
        System.out.print("\nLa Matriz Es Triangular Inferior\n");
       }
       else{
       if((numero==6) && (c1==15) && (c2==21)){
        System.out.print("\nLa Matriz Es Triangular Inferior\n");
       }
       else{
       if((numero==7) && (c1==21) && (c2==28)){
        System.out.print("\nLa Matriz Es Triangular Inferior\n");
       }
       else{
       if((numero==8) && (c1==28) && (c2==36)){
        System.out.print("\nLa Matriz Es Triangular Inferior\n");
       }
       else{
       if((numero==9) && (c1==36) && (c2==45)){
        System.out.print("\nLa Matriz Es Triangular Inferior\n");
       }
       else{
       if((numero==10) && (c1==45) && (c2==55)){
        System.out.print("\nLa Matriz Es Triangular Inferior\n");
       }
       else{
        System.out.print("\nLa Matriz No Es Triangular Inferior\n");
       }
       }
       }
       }
       }
       }
       }
       }
       }

     }//Cierre if
     else{
  System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
  }
   break;
   case 9:
     System.out.println("\nMatriz Bandeada\n");
        System.out.print("Introduce el tamaño de la matriz [3-10]\n");
        numero=leer.datoInt();
        System.out.print("\n");
        if((numero>=3) && (numero<=10)){
         System.out.print("Introduce Los Datos:\n");
         for(i=1;i<=numero;i++){
          for(j=1;j<=numero;j++){
           Matriz[i][j]=leer.datoInt();
          }
         }
         for(i=1;i<=numero;i++){
          System.out.print("\n");
           for(j=1;j<=numero;j++){
            System.out.print("\t"+Matriz[i][j]);
           }
           }
         boolean b1=false,b2=false;
         k1=1;
      if(numero>2){
              for(i=0;i<numero;i++){
                  for(j=0;j<numero;j++){
                      if((j<i-k1) || (j>i+k1)){//calcula los 0 afuera de la banda
                          if(Matriz[i][j]==0){
                              b1=true;
                          }
                          else{
                              b2=true;
                              b1=false;
                              break;
                          }//fin del else
                      }//fin del if
                  }//fin del for j
              }//fin del for i
              }
              System.out.print("\n\n");
              System.out.print("K1="+k1);
              System.out.print("\n");
              System.out.print("K="+k);
              System.out.print("\n\n");
               if(b1==true&&b2==false){
                   System.out.println("es bandeada");
               }
               else{
                   System.out.println("no es bandeada");
               }
        }//Cierre if
        else{
     System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido o El Ancho De Banda Es Numero Par......\n");
     }
   break;
   case 10:
    System.out.println("Determinante de una Matriz/n");
       System.out.print("Introduce el tamaño de la matriz [2-10]\n");
       numero=leer.datoInt();
       if(numero>=2&&numero<=10){
        System.out.print("Introduce los Datos\n");
       for(i=1;i<=numero;i++){
        for(j=1;j<=numero;j++){
         Matriz[i][j]=leer.datoInt();
        }
       }
       c=1;
       for(i=1;i<=numero;i++){
        System.out.print("\n");
         for(j=1;j<=numero;j++){
          System.out.print("\t"+Matriz[i][j]);
         if(i==j){
          c=c*Matriz[i][j];
         }
        }
       }
    System.out.print("\n\n");
    System.out.print("El Determinante=\n"+c);
       }
       else{
    System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
   }
   break;
   case 11:
    System.out.println("Matriz Dominante\n");
       System.out.print("Introduce el tamaño de la matriz [2-10]\n");
       numero=leer.datoInt();
       if(numero>=2&&numero<=10){
        System.out.print("Introduce los Datos\n");
       for(i=1;i<=numero;i++){
        for(j=1;j<=numero;j++){
         Matriz[i][j]=leer.datoInt();
        }
       }
       for(i=1;i<=numero;i++){
        System.out.print("\n");
         for(j=1;j<=numero;j++){
          System.out.print("\t"+Matriz[i][j]);
        }
       }
    int d=0;
    for(i=1;i<=numero;i++){
     aux=0;
     for(j=1;j<=numero;j++){
      if(i!=j){
      aux=aux+Matriz[i][j];
      }
      if(Matriz[i][i]<aux){
       d=1;
      }
     }
    }

    if(d==0){
     System.out.print("\n\nDominante\n");
    }

       else{
        System.out.print("\n");
        System.out.print("La Matriz No es Dominante\n");
       }
       }
       else{
    System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
    }
   break;
   case 12:
    System.out.println("Calculo de Menores: Metodo Cramer\n");
       System.out.print("Introduce el tamaño de la matriz [2-10]\n");
       numero=leer.datoInt();
       if(numero>=2&&numero<=10){
        System.out.print("Introduce los Datos De Matriz Aumentada(n x n+1)\n");
       for(i=1;i<=numero;i++){
        for(j=1;j<=numero+1;j++){
         Matriz[i][j]=leer.datoInt();
        }
       }
       for(i=1;i<=numero;i++){
        System.out.print("\n");
         for(j=1;j<=numero+1;j++){
          if(j==numero+1){
           System.out.print("|\t"+Matriz[i][j]);
          }
          else
          System.out.print("\t"+Matriz[i][j]);
         }
        }
    System.out.print("\n");
       }
       else{
    System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
    }
   break;
  case 13:
  System.out.println("Multiplicacion de Matrices\n");
     System.out.print("Introduce el tamaño de la matriz 1 [2-10]\n");
     numero=leer.datoInt();
     if(numero>=2&&numero<=10){
      System.out.print("Introduce los Datos\n");
     for(i=1;i<=numero;i++){
      for(j=1;j<=numero;j++){
       MatrizA[i][j]=leer.datoFloat();
      }
     }
     }
     else{
  System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
  }
     System.out.print("Introduce el tamaño de la matriz 2 [2-10]\n");
     numero=leer.datoInt();
     if(numero>=2&&numero<=10){
      System.out.print("Introduce los Datos\n");
     for(i=1;i<=numero;i++){
      for(j=1;j<=numero;j++){
       MatrizB[i][j]=leer.datoFloat();
      }
     }
     }
     else{
  System.out.print("La Dimencion De La Matriz No Corresponde A Lo Establecido......\n");
  }
  System.out.print("\nMatriz 1\n");
     for(i=1;i<=numero;i++){
      System.out.print("\n\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+MatrizA[i][j]+"\t");
      }
     }
     System.out.print("\nMatriz 2\n");
     for(i=1;i<=numero;i++){
      System.out.print("\n\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+MatrizB[i][j]+"\t");
      }
     }
  System.out.print("\n");
  System.out.print("\nMatriz Resultado\n");
  for(i=0;i<=numero;i++){
   for(j=0;j<=numero;j++){
    for(k=0;k<=numero;k++){
     MatrizC[i][j]=MatrizC[i][j]+MatrizA[i][k]*MatrizB[k][j];
    }
   }
  }
  for(i=1;i<=numero;i++){
      System.out.print("\n\n");
       for(j=1;j<=numero;j++){
        System.out.print("\t"+MatrizC[i][j]+"\t");
      }
     }
     break;

      default:
        System.out.println("La Matriz No Corresponde A Ningun Registro\n");
      break;
 } //Cierre switch
   } //Cierre Void