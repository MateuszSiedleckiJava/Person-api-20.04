package pl.kurs.java.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRetirement is a Querydsl query type for Retirement
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRetirement extends EntityPathBase<Retirement> {

    private static final long serialVersionUID = 1132446969L;

    public static final QRetirement retirement = new QRetirement("retirement");

    public final QPerson _super = new QPerson(this);

    public final NumberPath<Double> amount = createNumber("amount", Double.class);

    //inherited
    public final DatePath<java.time.LocalDate> birthDate = _super.birthDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final StringPath pesel = _super.pesel;

    //inherited
    public final StringPath surname = _super.surname;

    public final NumberPath<Integer> yearsOfExperience = createNumber("yearsOfExperience", Integer.class);

    public QRetirement(String variable) {
        super(Retirement.class, forVariable(variable));
    }

    public QRetirement(Path<? extends Retirement> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRetirement(PathMetadata metadata) {
        super(Retirement.class, metadata);
    }

}

