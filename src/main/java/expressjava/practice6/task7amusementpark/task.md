# 7. Парк развлечений

**Условие:**
В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.

**Примеры:**

- Американские горки — проверка безопасности
- Карусель — техническое обслуживание

Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.

## My Notes
- AmusementPark (system)
  - one Ride (already exists in AmusementPark)
  - control() - управлять аттракционом (обслуживание)
  - printInfo() about Ride
- abstract Ride
  - abstract printInfo()
  - abstract performMaintenance()
- RollerCoaster extends Ride
  - printInfo() - информация об аттракционе
  - performMaintenance() - проверка безопасности
- Carousel extends Ride
  - printInfo() - информация об аттракционе
  - performMaintenance() - техническое обслуживание
