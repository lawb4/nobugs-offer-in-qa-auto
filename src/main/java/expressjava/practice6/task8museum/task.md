# 8. Музей

**Условие:**
В музее выставлен экспонат.
У каждого экспоната своя история и условия хранения.

**Примеры:**

- Манускрипт — требует контролируемой влажности
- Скульптура — нуждается в реставрации

Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.

## My Notes
- Museum (system)
  - Exhibit (one, alredy exists in museum)
  - control()
  - printInfo()
- abstract Exhibit
  - String description - история экспоната
  - String storageConditions - условия хранения
  - abstract satisfyStorageConditions() - управление над экспонатом (через Museum)
- Manuscript extends Exhibit
  - storageConditions - требует контролируемой влажности
  - satisfyStorageConditions() - предоставить контролируемую влажность
- Sculpture extends Exhibit
  - storageConditions - нуждается в реставрации
  - satisfyStorageConditions() - отреставрировать