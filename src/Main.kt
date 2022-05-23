

fun main(args:Array<String>) {


    val programmingCourses: MutableList<ProgramingCourse> = mutableListOf()
    val cookingCourses: MutableList<CookingCourse> = mutableListOf()

    var optMain: Int
    var optCookingCourse: Int
    var idCookingCourse: Int
    var updateCookingCourseValidation: String

    println("Bienvenido al   sistema de cursos (SOFC)")

    do {
        println("Seleccione un curso : \n1)Cursos de Cocina\n2)Cursos de Programación \n3)Obtener todos\n4)Salir")
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
                            var curso:CookingCourse = CookingCourse(name,description)
                            if(curso!=null)
                                println(CompanionObject.SUCCESS_MESSAGE)
                            else
                                println(CompanionObject.ERROR_MESSAGE)
                        }
                        2->{
                            if(cookingCourses.size != 0){


                                println("¿Cuál curso desea editar?")
                                for(i in 0 until  cookingCourses.size){
                                    println("${i + 1}) ${cookingCourses[i].name} ")
                                }
                                idCookingCourse = readLine().toString().toInt()
                                println("¿Cuál es el nuevo nombre del curso?")
                                updateCookingCourseValidation = readLine().toString()
                                cookingCourses[idCookingCourse-1].name  = updateCookingCourseValidation
                                println("¿Cuál es la nueva descripción del curso?")
                                cookingCourses[idCookingCourse].name = readLine().toString()

                                if(cookingCourses[idCookingCourse].name.equals(updateCookingCourseValidation)){
                                    println(CompanionObject.SUCCESS_MESSAGE)
                                }else{
                                    println(CompanionObject.ERROR_MESSAGE)
                                }


                            }else{
                                println(CompanionObject.LIST_NULL)
                            }
                        }
                        3->{
                            println("¿Cuál desea eliminar?")
                            println("Ingresa el id de el curso desea eliminar:")
                            var id:Int = readLine().toString().toInt()
                            var isDelete:Boolean=false
                            for(i in 0 until cookingCourses.size){
                                if(cookingCourses[i].id ==id){
                                    cookingCourses.remove(cookingCourses[i])
                                    isDelete=true
                                }
                            }

                            if(isDelete)
                                println(CompanionObject.SUCCESS_MESSAGE)
                            else
                                println(CompanionObject.ERROR_MESSAGE)
                        }
                        4->{
                            if (cookingCourses.size == 0){
                                println(CompanionObject.EMPTY_LIST)
                            }else{
                                println("Cursos de cocina: ")
                                for(i in 0 until cookingCourses.size){
                                    println("${i+1}).-${cookingCourses[i]}")
                                }
                            }
                        }
                        5 ->{
                            println(CompanionObject.MESSAGE_OUT_MENU)
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
                    when (optProgramming) {
                            1 -> {
                                println("======= Añadir curso =======")
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
                                println("======= Editar curso =======")
                                for(i in 0 until programmingCourses.size){
                                    println("${i+1}) ${programmingCourses[i]}")
                                }
                                println("Selecciona el número del curso: ")
                                var index : Int = readLine().toString().toInt()
                                var newNameCourse : String
                                var newDescriptionCourse : String
                                if (index >= 0 || index <= programmingCourses.size){
                                    println("Introduce el nuevo nombre del curso de programación: ")
                                    newNameCourse = readLine().toString()
                                    println("Introduce la nueva descripcion del curso de programación: ")
                                    newDescriptionCourse = readLine().toString()
                                    programmingCourses[index - 1].name = newNameCourse
                                    programmingCourses[index - 1].description = newDescriptionCourse
                                    println(CompanionObject.SUCCESS_MESSAGE)
                                }else{
                                    println(CompanionObject.INFO_ID_MESSAGE)
                                }
                            }
                            3 -> {
                                println("======= Eliminar curso =======")
                                for (i in 0 until programmingCourses.size) {
                                    println("${i+1}) ${programmingCourses[i]}")
                                }
                                println("Selecciona el número del curso a eliminar:")
                                var index : Int = readLine().toString().toInt()
                                if (index >= 0 || index <= programmingCourses.size){
                                    programmingCourses.removeAt(index - 1)
                                    println(CompanionObject.SUCCESS_MESSAGE)
                                }else{
                                    println(CompanionObject.INFO_ID_MESSAGE)
                                }

                            }
                            4 -> {
                                if (programmingCourses.size == 0){
                                    println(CompanionObject.EMPTY_LIST)
                                }else{
                                    println("Cursos de programación: ")
                                    for(i in 0 until programmingCourses.size){
                                        println("${i+1}).-${programmingCourses[i]}")
                                    }
                                }
                            }
                            5 ->{
                                println(CompanionObject.MESSAGE_OUT_MENU)
                            }
                            else -> {
                                println(CompanionObject.ERROR_MESSAGE)

                            }
                        }
                }while(optProgramming!=5)

                // End ProgrammingCourse

            }
            3 -> {
                println("Cursos de cocina: ")
                if(cookingCourses.size == 0){
                    println(CompanionObject.EMPTY_LIST)
                }else{
                    for(i in 0 until cookingCourses.size){
                        println("${i+1}).-${cookingCourses[i]}")
                    }
                }
                println("Cursos de programación: ")
                if(programmingCourses.size == 0){
                    println(CompanionObject.EMPTY_LIST)
                }else{
                    for(i in 0 until programmingCourses.size){
                        println("${i+1}).-${programmingCourses[i]}")
                    }
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

