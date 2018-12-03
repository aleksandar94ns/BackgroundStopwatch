DROP TABLE `route`;

CREATE TABLE `stopwatch_duration` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
  `duration` INTEGER NOT NULL,
  `favorite` BOOLEAN NOT NULL);

COMMIT;