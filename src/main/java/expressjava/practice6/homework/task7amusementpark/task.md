# 7. Парк развлечений

**Условие:**
В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.

**Примеры:**

- Американские горки — проверка безопасности
- Карусель — техническое обслуживание

Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.

- AmusementPark
  - Ride (1) - constructor
  - control() -> ride.provideMaintenance()
  - printInfo() -> ride.print()
- abstract Ride
  - abstract provideMaintenance()
  - abstract printInfo()
- RollerCoaster
  - provideMaintenance() - Проверка безопасности проведена
  - printInfo() - Описание американских горок с предлагаемыми ощущениями
- Carousel
  - provideMaintenance() - Техническое обслуживание проведено
  - printInfo() - Описание карусели с предлагаемыми ощущениями