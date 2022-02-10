Feature: Добавяне на ново животно

 
 Scenario Outline: Добавяне на ново животно
    Given Потребителя отваря екрана за добавяне на ново животно
    When Въведе име на новото животно "<animalName>"
    And  Въведе име на майката на животноно "<animalMomName>"
    And  Въведе години на майката на животно "<momAge>"
    And  Въведе последната дада на която майката е имала бебе "<lastBirth>"
    And  Въведе име на бащата на животноно "<animalDadName>"
    And  Въведе години на бащата на животното "<dadAge>"
    And  Натисне бутона за добавяне 
    Then Вижда съобщение "<message>" 
    
    Examples:
     |animalName | animalMomName | momAge | lastBirth | animalDadName | dadAge | message                            |
     | Мими			 |  Мария        |   2    |       01/02/2021   |    Митко      |    2   | Успешно добавяне на ново животно!  |
     | Мими			 |  Мария        |   1.5  |       01/02/2021   |    Митко      |    2   | Женско животно под 2 години не може да е родител! |
     | Мими			 |  Мария        |   2    |       01/02/2021   |    Митко      |    1   | Мъжко животно под 2 години не може да е родител!  |
     | Мими			 |  Мария        |   2    |  01/02/2022        |    Митко      |    2   | Женско животно не може да ражда през период по – малък от 10 месеца!|
     |         	 |  Мария        |   2    |        01/02/2021  |    Митко      |    2   | Моля попълнете всички данни! |
		 | Мими			 |               |   2    |        01/02/2021  |    Митко      |    2   | Моля попълнете всички данни! |
     | Мими			 |  Мария        |        |        01/02/2021  |    Митко      |    2   | Моля попълнете всички данни! |
     | Мими			 |  Мария        |   2    |        01/02/2021  |               |    2   | Моля попълнете всички данни! |
	   | Мими			 |  Мария        |   2    |        01/02/2021  |    Митко      |        | Моля попълнете всички данни! |
	   | Mika 		 |  Mariq1			 |	 2.1  |        01/02/2021  |    Mitko1     |    2.1 | Това име е заето! |
	        