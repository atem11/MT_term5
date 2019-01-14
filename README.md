# MT_term5
Тут будут появляться Лабораторные работы по курсу Методы Трансляции

Варианты [тут][1] 

### Laboratory №2
##### Ручное построение нисходящих синтаксических анализаторов

> [Условие задачи][2]

> [Реализация][21]
> 1. Парсер находится в классе `\parserLab2\Parser.java`.
> 1. Запуск происходит через класс `\Lab2.java`. Входные данные берутся из файла `test.txt`, а дерово выводится в файл `Tree.png`.
> 1. Тесты запускаются из класса `\testParserLab2\Tests.java`.


### Laboratory №3
##### Использование автоматических генераторов анализаторов

> [Условие задачи][3]

> [Реализация][31]
> 1. Грамматика находится в файле `\grammar\Calc.g4`.
> 1. Сгенерированная грамматика находится в дериктории `\grammar\output`.
> 1. Класс `Lab3.class` обрабатывает входные данные из файла `test.txt`.

### Laboratory №4
##### Упрощенный аналог генератора трансляторов

> [Условие задачи][4]

> [Реализация][41]
> 1. Грамматика для парсера грамматик `grammar\parser`.
> 2. Генераторы классов `grammar\genegator`
> 3. Структура грамматики `grammar\term`
> 4. Исполняемы класс `Lab4.class`
>       * Класс принимает 2 или 3 агрумента. Первый - это путь до файла с грамматикой. Второй - это директория для output. Третий - это путь до файла со входными данными.
> 5. [Готовые парсеры][5]

[1]: https://neerc.ifmo.ru/~sta/2018-2019/3-parsing/

[2]: https://neerc.ifmo.ru/~sta/2018-2019/3-parsing/02-recursive-parsing.pdf
[21]: https://github.com/atem11/MT_term5/tree/master/src/Lab2

[3]: https://neerc.ifmo.ru/~sta/2018-2019/3-parsing/03-bison-antlr.pdf
[31]: https://github.com/atem11/MT_term5/tree/master/src/Lab3

[4]: https://neerc.ifmo.ru/~sta/2018-2019/3-parsing/lab4.html
[41]: https://github.com/atem11/MT_term5/tree/master/src/Lab4

[5]: https://github.com/atem11/MT_term5/tree/master/src/grammar/result
