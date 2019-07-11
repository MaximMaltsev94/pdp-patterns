package pdp.patterns.visitor;

//удобен тогда, когда часто появляются новые реализации Visitor, и редко добавляются A, B, C классы
public interface Visitor {
    void visit(A a);
    void visit(B b);
    void visit(C c);
}
