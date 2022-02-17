package az.developia.spring;

import java.util.Objects;

public class Teacher {
    private Long id;
    private String name;
    private String lesson;

    public Teacher(Long id, String name, String lesson) {
        this.id = id;
        this.name = name;
        this.lesson = lesson;
    }

    public Teacher() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id)
                && Objects.equals(name, teacher.name)
                && Objects.equals(lesson, teacher.lesson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lesson);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lesson='" + lesson + '\'' +
                '}';
    }
}
