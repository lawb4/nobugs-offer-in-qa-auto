# 4. Аквариум

**Условие:**
В аквариуме может находиться одно морское существо.
В зависимости от существа, оно ведёт себя по-разному.

**Примеры:**

- Акула плавает быстро и агрессивно
- Морская звезда медленно ползает

Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.

## My Notes
- Aquarium (system)
  - SeaCreature (1)
  - setSeaCreature(SeaCreature)
  - showSeaCreatureBehavior()
- abstract SeaCreature
  - act()
- Shark extends SeaCreature
  - act() - плавает быстро и агрессивно
- Starfish extends SeaCreature
  - act() - медленно ползает