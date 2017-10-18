package youga.vincidao;

import vincidao.android.annotation.Entity;
import vincidao.android.annotation.Id;

/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/18 0018-14:35
 */
@Entity(nameInDb = "Student")
public class Student {

    @Id
    public Long id;

    public String name;
    public int gender;
}
