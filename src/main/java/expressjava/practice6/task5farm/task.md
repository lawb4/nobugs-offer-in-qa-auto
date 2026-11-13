# 5. Ферма

**Условие:**
На ферме содержится одно домашнее животное.
У каждого животного свои функции и нужды.

**Примеры:**

- Корова даёт молоко, нуждается в выпасе
- Курица несёт яйца, требует зерно

Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.

## My Notes
- Farm (system)
  - DomesticAnimal (1, already has the animal, no need to set/add it)
  - control() - управлять животным
  - getNeed() - получить потребность животного
- abstract DomesticAnimal
  - String need - потребность животного
  - function() - функция животного
- Cow extends DomesticAnimal
  - String need - нуждается в выпасе
  - function() - даёт молоко
- Hen extends DomesticAnimal
  - String need - требует зерно
  - function() - несёт яйца