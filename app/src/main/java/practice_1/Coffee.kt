package practice_1

enum class Coffee(val recipe: Recipe) {
    Эспрессо(Recipe(60, 0, 10)),
    Американо(Recipe(120,0,10)),
    Капучино(Recipe(120,60,20)),
    Латте(Recipe(240,120,20))
}