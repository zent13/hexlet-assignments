### Hexlet tests and linter status:
[![Actions Status](https://github.com/zent13/java-project-61/workflows/hexlet-check/badge.svg)](https://github.com/zent13/java-project-61/actions)
<a href="https://codeclimate.com/github/zent13/java-project-61/maintainability"><img src="https://api.codeclimate.com/v1/badges/ff945c168b50546e87d1/maintainability" /></a>

# Коллекции

## main/java/exercise/App.java

## Задачи

Скрэббл (от англ. Scrabble — «рыться в поисках чего-либо») — настольная игра, в которой игроки соревнуются в образовании слов из плиток с буквами.

Реализуйте публичный статический метод `scrabble()`, который принимает на вход два параметра: набор символов для составления слова в нижнем регистре (в виде строки) и слово. Метод проверяет, можно ли из переданного набора составить это слово. В результате вызова функция возвращает `true` или `false`.

При проверке учитывается количество символов, нужных для составления слова и не учитывается их регистр (заглавные и строчные символы считаются одинаковыми).

```java
App.scrabble("rkqodlw", "world"); // true
App.scrabble("ajv", "java"); // false
App.scrabble("avjafff", "JaVa"); // true
App.scrabble("", "hexlet"); // false
```
