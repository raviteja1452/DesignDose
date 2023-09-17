package factory.solution2;

public class LanguageFactory {

    public static ILanguageCompiler chooseCompiler(final String language) {
        ILanguageCompiler languageCompiler = null;
        if(language.equalsIgnoreCase("JAVA")) {
            languageCompiler = new JavaCompiler();
        } else if(language.equalsIgnoreCase("PYTHON")) {
            languageCompiler = new PythonCompiler();
        } else if(language.equalsIgnoreCase("CPP")) {
            languageCompiler = new CppCompiler();
        } else {
            System.out.println("Language is not supported by compiler");
        }
        return languageCompiler;
    }
}
