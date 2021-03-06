package com.poll.dto.questionnaire;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class QuestionnaireCreateRequestDto {

    @NotNull
    @NotEmpty
    private final String name;

    @NotNull
    @NotEmpty
    private final String description;

    @NotNull
    @Valid
    private final List<QuestionCreateRequestDto> questions;

    @NotNull
    @NotEmpty
    private final Long userId;

    public static QuestionnaireCreateRequestDto of(
            final String name,
            final String description,
            final List<QuestionCreateRequestDto> questions,
            final Long userId) {
        return new QuestionnaireCreateRequestDto(name, description, questions, userId);
    }
}
