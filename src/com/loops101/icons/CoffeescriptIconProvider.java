package com.loops101.icons;

import com.intellij.ide.IconProvider;
import com.intellij.openapi.util.IconLoader;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CoffeescriptIconProvider extends IconProvider {

    //private static final String ROUTE_URL = "/net/jangaroo/EXML-logo-16x16.png";
    //private static final String CTRL_URL = "/net/jangaroo/EXML-logo-16x16.png";
    //private static final String VIEW_URL = "/net/jangaroo/EXML-logo-16x16.png";
    private static final String TEST_URL = "/com/loops101/icons/coffeescript-test.png";

    public Icon getIcon(@NotNull PsiElement psiElement, int flags) {

        PsiFile containingFile = psiElement.getContainingFile();

        if (containingFile != null) {
            if (containingFile.getName().endsWith(".route")) {
                return null;
            } else if (containingFile.getName().endsWith(".ctrl")) {
                return null;
            } else if (containingFile.getName().endsWith(".view")) {
                return null;
            } else if (containingFile.getName().endsWith(".test")) {
                return IconLoader.getIcon(TEST_URL);
            }
        }

        return null;
    }
}