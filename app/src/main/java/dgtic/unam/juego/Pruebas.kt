package dgtic.unam.juego

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.flow
import java.util.concurrent.Flow
import kotlin.concurrent.thread
import kotlin.random.Random

/*
fun main()
{
        funcionlambda( 3, 4, { regresa ->
            println( regresa )
        })

    funcionlambda( 12, 45, { variable ->
        println( variable )
    })
}

fun funcionlambda( a: Int, b: Int, callback:( result: String ) -> Unit )
{
    callback( ( a + b ).toString() )
}*/
/*
fun main()
{
    println( hilo( 4, 3 ) )
}

fun hilo( a: Int, b: Int ) : Int{
    var result = 0
    thread{
                Thread.sleep( Random.nextLong( 1000, 3000 ) )
                result = a + b
            }

            Thread.sleep( 4000 )
    return result
}*/
/*
fun main()
{
    hiloLambda( 3, 4 ){
        println( it )
    }
}

fun hiloLambda ( a: Int, b: Int, callback: ( result : Int ) -> Unit )
{
        var result = 0
        thread {
            Thread.sleep( Random.nextLong( 1000, 3000 ) )
            result  = a + b
            callback( result )
            println( "Ejecutar mas lineas" )
        }
}*/

fun main(){
    /*
    println( Thread.currentThread().name )
    coroutines()
    */
  coroutines()
    ///dispatchers()

}
/*
fun coroutines(){

    //Solo ejecuta lo que tengo como bloque
    /*runBlocking {
        ( 1.. 1000000 ).forEach {
            launch {
                delay( 1000 )
                print( "*" )
            }
        }
    }*/
/*
    //si quiero que siga viviendo hago un blobalscope
    GlobalScope.launch{
        while ( true )
            {
                println( "Codigo de la rutina ${ Thread.currentThread().name } ejecutando" )
            }
    }
    Thread.sleep( 2000 )
    */

    runBlocking{
        println( "inicia ${ Thread.currentThread().name }" )

        //El delay puedo declararlo dentro del bloque y es mas eficiente, es mejor usar el delay en lugar del sleep
            delay( 2000 )

        print( "Codigo Extra" )
        println( "Termina ${ Thread.currentThread().name } " )
    }

 */
        //Constructor
        fun  coroutines() {
       //// runBlocking {
        //Constructor launch
        /* launch {
                                println( "inicia ${ Thread.currentThread().name }" )

                                //El delay puedo declararlo dentro del bloque y es mas eficiente, es mejor usar el delay en lugar del sleep
                                delay( 3000 )

                                print( "Codigo Extra 3" )
                                println( "Termina ${ Thread.currentThread().name } " )
                    }
                    //Puedo levantar otro hilo
                    launch {
                                println( "inicia ${ Thread.currentThread().name }" )

                                //El delay puedo declararlo dentro del bloque y es mas eficiente, es mejor usar el delay en lugar del sleep
                                delay( 1000 )

                                print( "Codigo Extra 1" )
                                println( "Termina ${ Thread.currentThread().name } " )
                    }
                    launch {
                                println( "inicia ${ Thread.currentThread().name }" )

                                //El delay puedo declararlo dentro del bloque y es mas eficiente, es mejor usar el delay en lugar del sleep
                                delay( 2000 )

                                print( "Codigo Extra 2" )
                                println( "Termina ${ Thread.currentThread().name } " )
                    }*/

        /* val result = async{
                                println( "inicia ${ Thread.currentThread().name }" )

                                //El delay puedo declararlo dentro del bloque y es mas eficiente, es mejor usar el delay en lugar del sleep
                                delay( 2000 )

                                print( "Codigo Extra 2" )
                                println( "Termina ${ Thread.currentThread().name } " )
                                //La ultima linea que se tenga es lo que regresa el hilo
                               "Resultado de datos"
                            }
                    println(  "Esperando resultado ::: " )
                    println( "Resultado  = ${ result.await() }" )
                    delay( 2000 )
                    println( "Termina2 ${ Thread.currentThread().name } " ) */

        /* val job = launch {
                        println( "Inicia 1 ${ Thread.currentThread().name }" )
                            delay( 6000 )
                            println( "Ejecutando instrucciones ::: " )
                        println( "Termina 1 ${ Thread.currentThread().name }" )
                    }
                    launch {
                        while ( true ){
                            delay( 1000 )
                            println( "Esta activo ${ job.isActive }" )
                            println( "Esta cancelado ${ job.isCancelled }" )
                            println( "Esta completo ${ job.isCompleted }" )

                            //codigo para terminar el hilo
                                if ( ( 1..5 ).first() == 3 ){
                                    println( "Cancelar job" )
                                    job.cancel()
                                }
                        }
                        */
        /*
                            val deferred = async {
                                println( "Inicia 1 ${ Thread.currentThread().name }" )
                                delay( 6000 )
                                println( "Ejecutando instrucciones ::: " )
                                println( "Termina 1 ${ Thread.currentThread().name }" )
                                45
                            }

                            launch {
                                while ( true ){
                                    delay( 1000 )
                                    println( "Esta activo ${ deferred.isActive }" )
                                    println( "Esta cancelado ${ deferred.isCancelled }" )
                                    println( "Esta completo ${ deferred.isCompleted }" )

                                    //codigo para terminar el hilo
                                    if ( ( 1..5 ).first() == 3 ){
                                        println( "Cancelar job" )
                                        deferred.cancel()
                                    }

                                    if( ( 1..5 ).shuffled().first() == 1 ){
                                        println( "Esperando valor ${ deferred.await() }" )
                                    }
                                }
                    }
                }
                */

                    /*    runBlocking {
                            launch {
                                println( "Otro subproceso" )
                            }
                            launch( Dispatchers.Default ) {
                                println( "Default" )
                            }

                            launch( newSingleThreadContext( "Personalizado" ) ){
                                println( "${ Thread.currentThread().name }" )
                            }
                            newSingleThreadContext(  "Contexto dos " ).use { contexto ->
                                launch ( contexto ) {
                                    println( "${ Thread.currentThread().name }" )
                                }
                            }
                        }
                        */

                //Para poder cambiarme de contexto
        /*
                runBlocking {
                    println( "${ Thread.currentThread().name }" )
                    withContext( Dispatchers.IO ){
                        delay( 200 )
                        println( "${ Thread.currentThread().name }" )
                    }}

                        */




           } //Fin

 /*   fun crearSecuencias() : Sequence<Int>{
           return  sequence {
               (1..6).forEach {
                   println( "Elementos procesados" )
                   Thread.sleep( 2000 )
                   yield( it+Random.nextInt( 10, 50 ) )
               }
           }
    }*/

    fun flow(){
        runBlocking {
            launch {
                   // crearSecuenciasFlow().collect{

                    }
            }
        }
    //}

/*
   fun crearSecuenciasFlow() : Flow<Int>{
       return flow{
           (1..6).forEach {
               println("Procesando .... ")
               delay(2000)
               emit(it + Random.nextInt(10, 30))
           }
       }
   }


    fun dispatchers(){
        println( "Secuencias" )
        crearSecuencias().forEach {
            println( "$it datos regresados" )
        }

        */

    //}


