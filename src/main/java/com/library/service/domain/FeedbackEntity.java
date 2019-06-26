package com.library.service.domain;

import com.library.service.dto.Feedback;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "feedback")
public class FeedbackEntity extends BaseEntity {
    @NotNull
    private String name;

    @Email
    private String mail;

    @NotNull
    private String feedback;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return mail;
    }

    public void setEmail(String email) {
        this.mail = mail;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public static Feedback toFeedback(FeedbackEntity feedbackEntity){
        Feedback model = new Feedback();

        model.setId(feedbackEntity.getId());
        model.setName(feedbackEntity.getName());
        model.setEmail(feedbackEntity.getEmail());
        model.setFeedback(feedbackEntity.getFeedback());
        return model;
    }
}
