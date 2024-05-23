package practice_1

class CoffeeMachine {
    var water = 0
    var milk = 0
    var beans = 0

    fun start() {
        println("Кофемашинка готова к работе")
        while (true) {
            print("Введите команду: ")
            when (readLine()) {
                "выключить" -> {
                    println("До свидания")
                }
                "наполнить" -> {
                    water = 1500
                    milk = 900
                    beans = 250
                    println("Ингридиенты пополнены")
                }
                "статус" -> {
                    println("Ингридиентов осталось:")
                    println("$water мл воды")
                    println("$milk мл молока")
                    println("$beans гр кофе")
                }
                "кофе" -> {
                    print("Введите название напитка или 'назад' для возврата в главное меню: ")
                    when (val inp = readLine()) {
                        "назад" -> continue
                        else -> {
                            val type = Coffee.values().find { it.name.equals(inp, ignoreCase = true) }
                            if (type != null) {
                                val recipe = type.recipe
                                if (water < recipe.water) {
                                    println("Недостаточно воды!")
                                } else if (milk < recipe.milk) {
                                    println("Недостаточно молока!")
                                } else if (beans < recipe.beans) {
                                    println("Недостаточно кофе")
                                } else {
                                    water -= recipe.water
                                    milk -= recipe.milk
                                    beans -= recipe.beans
                                    println("${type.name} готов")
                                }
                            } else {
                                println("Рецепт не найден!")
                            }
                        }
                    }
                }
                else -> println("Команда не распознана")
            }
        }
    }
}