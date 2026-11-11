# 3. Управление рестораном

**Условие:**
В меню ресторана добавляется блюдо.
У каждого блюда свои параметры отображения:

- Горячее блюдо — с температурой
- Напиток — с объёмом

Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.

## My Notes
- Menu 
  - List<Dish>
  - addDish(dish)
  - printMenu() - output all dishes' descriptions that are included in menu
- abstract Dish
  - abstract getDescription
- MainCourse extends Dish
  - temperature
  - getDescription (with temperature)
- Drink extends Dish
  - volume
  - getDescription (with volume)