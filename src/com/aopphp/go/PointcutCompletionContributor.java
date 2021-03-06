package com.aopphp.go;

import com.aopphp.go.completion.DoctrineAnnotationCompletionProvider;
import com.aopphp.go.completion.MemberModifierCompletionProvider;
import com.aopphp.go.completion.PointcutKeywordCompletionProvider;
import com.aopphp.go.pattern.CodePattern;
import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;

public class PointcutCompletionContributor extends CompletionContributor {
    public PointcutCompletionContributor() {
        extend(
            CompletionType.BASIC,
            CodePattern.insideAnnotationPointcut(),
            new DoctrineAnnotationCompletionProvider()
        );

        extend(
            CompletionType.BASIC,
            CodePattern.insidePointcutLanguage(),
            new PointcutKeywordCompletionProvider()
        );

        extend(
            CompletionType.BASIC,
            CodePattern.startOfMemberModifiers(),
            new MemberModifierCompletionProvider()
        );
    }
}
