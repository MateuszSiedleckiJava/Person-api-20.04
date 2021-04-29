package pl.kurs.java.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStudent is a Querydsl query type for Student
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStudent extends EntityPathBase<Student> {

    private static final long serialVersionUID = 548306235L;

    public static final QStudent student = new QStudent("student");

    public final QPerson _super = new QPerson(this);

    public final NumberPath<Double> average = createNumber("average", Double.class);

    //inherited
    public final DatePath<java.time.LocalDate> birthDate = _super.birthDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final StringPath pesel = _super.pesel;

    public final NumberPath<Integer> semester = createNumber("semester", Integer.class);

    public final StringPath specialization = createString("specialization");

    public final StringPath studyDirection = createString("studyDirection");

    //inherited
    public final StringPath surname = _super.surname;

    public QStudent(String variable) {
        super(Student.class, forVariable(variable));
    }

    public QStudent(Path<? extends Student> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStudent(PathMetadata metadata) {
        super(Student.class, metadata);
    }

}

