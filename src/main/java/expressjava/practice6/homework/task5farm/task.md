# 5. Ферма

**Условие:**
На ферме содержится одно домашнее животное.
У каждого животного свои функции и нужды.

**Примеры:**

- Корова даёт молоко, нуждается в выпасе
- Курица несёт яйца, требует зерно

Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.

- Farm
  - DomesticAnimal (1) - constructor
  - control() → print need, function()
- abstract DomesticAnimal
  - String need
  - abstract function()
- Cow extends DomesticAnimal
  - need - нуждается в выпасе
  - function() - даёт молоко
- Hen extends DomesticAnimal
  - need - требует зерно
  - function() - несёт яйца