// This is a generated file. Not intended for manual editing.
package com.aopphp.go.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.aopphp.go.psi.PointcutTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aopphp.go.psi.*;

public class WithinPointcutImpl extends ASTWrapperPsiElement implements WithinPointcut {

  public WithinPointcutImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitWithinPointcut(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ClassFilter getClassFilter() {
    return findNotNullChildByClass(ClassFilter.class);
  }

}
