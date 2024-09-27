public class Controller {
  
    public void createGroup(Teacher teacher, List<Student> students) {
      УчебнаяГруппаСервис service = new УчебнаяГруппаСервис();
      
      УчебнаяГруппа group = service.createGroup(teacher, students);
      
      // Далее можно использовать созданную учебную группу по своему усмотрению
    }
  }
  