package lessons.lections.lection7;

import java.lang.reflect.Field;

public final class Validator {
    public static void validateInt(Class<?> someClass, Object object) {
//        Person person = (Person) object;
        Field[] declaredFields = someClass.getDeclaredFields();

//        Class<?> aClass = object.getClass();
//        System.out.println("Object class -" + aClass);
        for (Field declaredField : declaredFields) {
            if (declaredField.getType().equals(int.class)) {
                if (declaredField.isAnnotationPresent(ValidateInt.class)) {
                    try {
                        ValidateInt annotation = declaredField.getAnnotation(ValidateInt.class);
                        declaredField.setAccessible(true);

                        int fieldInt = declaredField.getInt(object);

                        if (fieldInt > annotation.max() || fieldInt < annotation.min()) {
                            System.out.println("WRONG VALUE - " + fieldInt);
                            declaredField.set(object, annotation.defaultVal());
                        }

//                    if (fieldInt < 0) {
//                        declaredField.set(person, Math.abs(fieldInt));


                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}

