package factory.solution2;

import factory.solution1.ICompiler;

public class LeetCodeCompiler implements ICompiler {

    @Override
    public void compile(final String code, final String language) {
        ILanguageCompiler languageCompiler = LanguageFactory.chooseCompiler(language);
        if(languageCompiler != null) {
            languageCompiler.compileWithLanguage(code);
        }
    }

}
