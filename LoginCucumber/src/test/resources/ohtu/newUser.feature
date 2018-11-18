Feature: A new user account can be created if a proper unused username and password are given

    Scenario: creation is successful with valid username and password
        Given command new user is selected
        When  username "uuw" and password "uuus#issfF" are entered
        Then  system will respond with "new user registered"

    Scenario: creation fails with already taken username and valid password
        Given command new user is selected
        When  username "pekka" and password "kakka66666662!!" are entered
        Then  system will respond with "new user not registered"

    Scenario: creation fails with too short username and valid password
        Given command new user is selected
        When  username "2å" and password "uuus#issfF" are entered
        Then  system will respond with "new user not registered"

    Scenario: creation fails with valid username and too short password
        Given command new user is selected
        When  username "iholalala" and password "eee!" are entered
        Then  system will respond with "new user not registered"

    Scenario: creation fails with valid username and password enough long but consisting of only letters
        Given command new user is selected
        When  username "iholalala" and password "eeeeeeeee" are entered
        Then  system will respond with "new user not registered"

    Scenario: can login with successfully generated account
        Given user "eero" with password "salainen1" is created
        And   command login is selected
        When  username "eero" and password "salainen1" are entered
        Then  system will respond with "logged in"\n"komento (new tai login):" 
        #tää skenaario failaa jos on vaan "logged in", vaikka suorittamalla nään, että se sanoo logged in..
        #ja nyt se vaan skippaa ton vikan rivin...vaikka mul on jo @then snippet, mut se ei kai sit oo oikein :/