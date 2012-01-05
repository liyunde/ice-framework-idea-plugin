package org.xblackcat.frozenice.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.xblackcat.frozenice.SliceLanguage;

/**
 * 04.01.12 12:23
 *
 * @author xBlackCat
 */
public class SliceElementType extends IElementType {
    public SliceElementType(@org.jetbrains.annotations.NotNull @org.jetbrains.annotations.NonNls String debugName) {
        super(debugName, Language.findInstance(SliceLanguage.class));
    }
}
