# Facebook simulator
Implemenation of a Facebook simulator with OOP basics.  
The project is a console application.  
Language = [RO]
## Functional requirements
    Create a Java application to simulate a Facebook-like app. In the application, we will have Users 
    with a username (email), password, full name, and a relationship status (married, single, 
    in a relationship). Each user has a list of friends (who are also Users) and a list of liked Pages.
    
    A Page will have a name, an activity domain (sports, education, beauty, news, etc.), a description, 
    and a user who manages the page.
    
    A user can add or remove other users from the friends list and can like/dislike certain pages 
    in the application.
    
    In a main method, create users and a page. Then, implement the following scenarios:
    
    1. For a specific user (of your choice), display their friends who have the "single" status.
    2. The user dislikes pages with the political or economic activity domain.
    3. The user adds all the administrators of the pages they follow (liked) as friends. 
    Display the friends list after this action.
[Link to the original requirements (in romanian)](./Tema2_POO.pdf)

## Modules
- `Main.java`
  - has some hardcoded users and pages with follows and friends
  - manages most of the console application interface experience
- `Pagina.java` creates a class Pagina (eng. Page) 
- `Utilizator.java` creates a class Utilizator (eng. User)
- `Service.java`
  - intermediates an "Add a friend" action for both the requester and the receiver
  - displays the command options in command prompt