/*
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.

Должно выполняться условие:
если cat1.fight(cat2) = true,
то cat2.fight(cat1) = false


Требования:
1. Класс Cat должен содержать конструктор без параметров.
2. Метод fight не должен считывать данные с клавиатуры.
3. Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
4. Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
5. Метод fight не должен выводить данные на экран.
*/

public class Solution {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return strength > anotherCat.strength;
    }

    public static void main(String[] args) {

    }
}
