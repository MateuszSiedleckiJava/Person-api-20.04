package pl.kurs.java.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmployee is a Querydsl query type for Employee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployee extends EntityPathBase<Employee> {

    private static final long serialVersionUID = -864924754L;

    public static final QEmployee employee = new QEmployee("employee");

    public final QPerson _super = new QPerson(this);

    //inherited
    public final DatePath<java.time.LocalDate> birthDate = _super.birthDate;

    public final StringPath currentCompany = createString("currentCompany");

    public final StringPath currentPosition = createString("currentPosition");

    public final NumberPath<Double> currentSalary = createNumber("currentSalary", Double.class);

    public final DatePath<java.time.LocalDate> hireDate = createDate("hireDate", java.time.LocalDate.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final StringPath pesel = _super.pesel;

    //inherited
    public final StringPath surname = _super.surname;

    public QEmployee(String variable) {
        super(Employee.class, forVariable(variable));
    }

    public QEmployee(Path<? extends Employee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmployee(PathMetadata metadata) {
        super(Employee.class, metadata);
    }

}

