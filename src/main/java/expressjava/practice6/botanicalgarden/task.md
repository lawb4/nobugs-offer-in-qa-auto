# 6. Ботанический сад

**Условие:**
В ботаническом саду содержится одно растение.
У разных растений — разные требования к уходу.

**Примеры:**

- Орхидея — высокая влажность и тень
- Кактус — много света, редкий полив

Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.

## My Notes
- BotanicalGarden (system)
  - Plant (1)
  - setPlant(Plant) - only one plant can exist in botanicalGarden
  - provideCare() - call method to provide plant's need
- abstract Plant
  - satisfyNeed()
- Orchid
  - satisfyNeed() - высокая влажность и тень
- Cactus
  - satisfyNeed() - много света, редкий полив