package factory.solution1;

public class LeetCodeCompiler implements ICompiler{
    @Override
    public void compile(final String code, final String language) {
        if(language.equalsIgnoreCase("JAVA")) {
            this.compileUsingJava(code);
        } else if(language.equalsIgnoreCase("PYTHON")) {
            this.compileUsingPython(code);
        } else if(language.equalsIgnoreCase("CPP")) {
            this.compileUsingCpp(code);
        } else {
            System.out.println("Language is not supported by compiler");
        }
    }

    public void compileUsingJava(final String code) {
        // compile using java
    }

    public void compileUsingPython(final String code) {
        // compile using python
    }

    public void compileUsingCpp(final String code) {
        //  compile using cpp
    }
}
