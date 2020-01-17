package com.react.reacttest.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "question", schema = "ii302782", catalog = "")
public class QuestionEntity {
    private int idQuestion;
    private String contents;
    private int number;
    private Collection<AnswerEntity> anwers;
    private QuestionnaireEntity questionnaire;

    @Id
    @Column(name = "idQuestion")
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Basic
    @Column(name = "contents")
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Basic
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionEntity that = (QuestionEntity) o;

        if (idQuestion != that.idQuestion) return false;
        if (number != that.number) return false;
        if (contents != null ? !contents.equals(that.contents) : that.contents != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idQuestion;
        result = 31 * result + (contents != null ? contents.hashCode() : 0);
        result = 31 * result + number;
        return result;
    }

    @OneToMany(mappedBy = "question")
    public Collection<AnswerEntity> getAnwers() {
        return anwers;
    }

    public void setAnwers(Collection<AnswerEntity> answersByIdQuestion) {
        this.anwers = answersByIdQuestion;
    }

    @ManyToOne
    @JoinColumn(name = "questionnaire_idQuestionnaire", referencedColumnName = "idQuestionnaire", nullable = false)
    public QuestionnaireEntity getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(QuestionnaireEntity questionnaireEntity) {
        this.questionnaire = questionnaireEntity;
    }
}
