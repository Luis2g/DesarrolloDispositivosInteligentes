

fun main(args:Array<String>) {


    val programmingCourses: MutableList<ProgramingCourse> = mutableListOf()
    val cookingCourses: MutableList<CookingCourse> = mutableListOf()

    var optMain: Int
    var optCookingCourse: Int

    println("Bienvenido al   sistema de cursos (SOFC)")

    do {
        print("Seleccione un curso : \n1)Cursos de Cocina\n2)Cursos de Programación \n3)Obtener todos\n3)Salir")
        optMain = readLine().toString().toInt()
        when (optMain) {
            1 -> {
                do{
                    println("Curso de cocina\n1. Añadir curso\n2. Actualizar curso\n3. Eliminar curso\n4. Obtener curso\n5. Regresar al menú principal")
                    optCookingCourse = readLine().toString().toInt()
                    when(optCookingCourse){
                        1->{
                            println("Agregar nuevo curso de cocina.")
                            println("Ingresa el nombre del curso:")
                            var name:String = readLine().toString()
                            println("Ingresa la descripción del curso")
                            var description:String = readLine().toString()
                            var curso:CookingCourse = CookingCourse()
                            
                        }
                        2->{
                            println("Cual desea eliminar?")

                        }
                        3->{

                        }
                        4->{

                        }
                        else->{
                            println(CompanionObject.ERROR_MESSAGE)
                        }


                    }
                }while (optCookingCourse != 5)


            }
            2 -> {

                // ProgrammingCourse
                println("Curso de programación\n1. Añadir curso\n2. Actualizar curso\n3. Eliminar curso\n4. Obtener curso\n5. Regresar al menú principal")
                var optProgramming: Int = readLine().toString().toInt()
                do{
                    var flagProgramming : Boolean;
                    if(optProgramming == 1 || optProgramming == 2 || optProgramming == 3 || optProgramming == 4 || optProgramming == 5){
                        when (optProgramming) {
                            1 -> {
                                println("Ingresa el nombre del curso:")
                                var courseName : String = readLine().toString()
                                println("Ingresa una descripción del curso:")
                                var courseDescription : String = readLine().toString()

                                var programmingCourse = ProgramingCourse(courseName, courseDescription)

                                programmingCourses.add(programmingCourse)
                                if (programmingCourses.add(programmingCourse)) {
                                    println(CompanionObject.SUCCESS_MESSAGE)
                                } else {
                                    println(CompanionObject.ERROR_MESSAGE)
                                }

                            }
                            2 -> {
                                println("Ingresa el id del curso: ")
                                var idCourse : Int = readLine().toString().toInt()
                                var flagCourseExist : Boolean = false
                                var newNameCourse : String;
                                for (i in 0 .. programmingCourses.size){
                                    flagCourseExist = programmingCourses[i].id == idCourse;
                                }
                                if (flagCourseExist){
                                    println("Introduce el nuevo nombre del curso de programación: ")
                                    newNameCourse = readLine().toString()
                                    programmingCourses[idCourse].name = newNameCourse;

                                }
                            }
                            3 -> {

                            }
                            4 -> {

                            }
                        }
                        flagProgramming = false;
                    }else{
                        println(CompanionObject.ERROR_MESSAGE)
                        flagProgramming = true
                    }
                }while(flagProgramming)




                // End ProgrammingCourse

            }
            3 -> {
                println("Cursos de cocina: ")
                for(i in 0..cookingCourses.size){
                    println(cookingCourses[i])
                }
                println("Cursos de programación: ")
                for(i in 0..programmingCourses.size){
                    println(programmingCourses[i])
                }
            }
            4 ->{
                println("Saliendo del programa, hasta pronto!")
            }
            else->{
                println(CompanionObject.ERROR_MESSAGE)
            }
        }

    } while (optMain != 4)


    
}

