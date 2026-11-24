# 8. Музей

**Условие:**
В музее выставлен экспонат.
У каждого экспоната своя история и условия хранения.

**Примеры:**

- Манускрипт — требует контролируемой влажности
- Скульптура — нуждается в реставрации

Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.

- Museum
  - Exhibit (1) - constructor
  - control() -> exhibit.satisfyStorageConditions()
  - printInfo() -> exhibit.printInfo()
- abstract Exhibit
  - String description (история)
  - String storageConditions (условия хранения)
  - abstract satisfyStorageConditions()
  - toString()
- Manuscript extends Exhibit
  - storageConditions - требует контролируемой влажности
  - satisfyStorageConditions() -> Контролируемая влажность для манускрипта предоставлена
- Sculpture extends Exhibit
  - storageConditions - нуждается в реставрации
  - satisfyStorageConditions() -> Скульптура отреставрирована
