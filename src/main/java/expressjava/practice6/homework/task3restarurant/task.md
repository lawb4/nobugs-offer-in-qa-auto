# 3. Управление рестораном

**Условие:**
В меню ресторана добавляется блюдо.
У каждого блюда свои параметры отображения:

- Горячее блюдо — с температурой
- Напиток — с объёмом

Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.

- Menu
  - List<Dish> dishes
  - addDish(Dish)
  - print() -> loop dishes
- abstract Dish
  - parameter
  - abstract print()
- MainCourse extends Dish
  - parameter - температура
  - print() override
- Drink extends Dish
  - parameter - объём
  - print() override