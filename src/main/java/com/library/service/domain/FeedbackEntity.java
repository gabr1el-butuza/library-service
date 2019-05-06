package com.library.service.domain;

import com.library.service.dto.FeedbackViewModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "feedback")
public class FeedbackEntity extends BaseEntity {
    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String feedback;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public static FeedbackViewModel toFeedback(FeedbackEntity feedbackEntity){
        FeedbackViewModel model = new FeedbackViewModel();

        model.setId(feedbackEntity.getId());
        model.setName(feedbackEntity.getName());
        model.setEmail(feedbackEntity.getEmail());
        model.setFeedback(feedbackEntity.getFeedback());
        return model;
    }
}
