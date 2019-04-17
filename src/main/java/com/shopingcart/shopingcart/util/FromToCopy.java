/*
package com.shopingcart.shopingcart.util;

import static org.springframework.util.ReflectionUtils.findMethod;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.util.StringUtils;

*/
/**
 * This class is the utility to copy data from one object to other object. We have defined some
 * predefined conversions for To-From.
 *//*

public class FromToCopy {

    static final Map<String, List<FromToCopy>> FIELDS_MAP = new HashMap<>();

    private final Method fromMethod;
    private final Method toMethod;
    private final Class fromType;
    private final Class toType;
    private final FromToMapper mapper;

    private FromToCopy(Method fromMethod, Method toMethod, Class<?> fromType,
                       Class<?> toType, FromToMapper mapper) {
        this.fromMethod = fromMethod;
        this.toMethod = toMethod;
        this.fromType = fromType;
        this.toType = toType;
        this.mapper = mapper;
    }

    private static FromToCopy get(Method fromMethod, Object to) {
        if (!(fromMethod.getName().startsWith("get") || fromMethod.getName().startsWith("is"))) {
            return null;
        }
        if (fromMethod.getReturnType() == null) {
            return null;
        }

        Method toMethod;
        Class<?> toType;

        FromToMapper mapper = FromToMapper.get(fromMethod);
        if (mapper == null) {
            return null;
        }

        Class<?> fromType = fromMethod.getReturnType();

        toMethod = mapper.getSetter(fromMethod, to.getClass());

        if (toMethod == null || toMethod.getParameterCount() != 1) {
            return null;
        }
        toType = toMethod.getParameterTypes()[0];

        return new FromToCopy(fromMethod, toMethod, fromType, toType, mapper);
    }

    private void map(Object from, Object to) {
        try {
            if (Objects.nonNull(toMethod)) {
                Object value = fromMethod.invoke(from);
                if (toType.isEnum()) {
                    Method fromTypeMethod = toType.getMethod("fromType", String.class);
                    if (fromTypeMethod != null) {
                        toMethod
                                .invoke(to, fromTypeMethod.invoke(fromMethod.getReturnType(), value.toString()));
                    }
                } else {
                    toMethod.invoke(to, mapper.getValue(fromType, toType, value));
                }
            }
        } catch (Exception e) {
            MyLogger.log("FromToCopy", e.getMessage());
        }
    }

    public static void copy(final Object from, final Object to) {
        final Class<?> fromClass =
                (from instanceof HibernateProxy) ? ((HibernateProxy) from).getHibernateLazyInitializer()
                        .getImplementation().getClass() : from.getClass();

        String key = String.format("%s-%s", fromClass.getName(), to.getClass().getName());
        List<FromToCopy> fieldsMap = FIELDS_MAP.get(key);

        if (Objects.nonNull(fieldsMap)) {
            doCopy(from, to, fieldsMap);
            return;
        }

        fieldsMap = extractFieldMap(key, to, fromClass);
        doCopy(from, to, fieldsMap);
    }

    private static synchronized List<FromToCopy> extractFieldMap(String key, Object to,
                                                                 Class<?> fromClass) {

    */
/*if(fromClass.getSimpleName().equalsIgnoreCase("notificationdto"))
      System.out.println("key = " + key);*//*

        List<FromToCopy> fieldsMap = FIELDS_MAP.get(key);
        if (Objects.nonNull(fieldsMap)) {
            return fieldsMap;
        }

        fieldsMap = Arrays.stream(fromClass.getDeclaredFields())
                .filter(field -> Objects.isNull(field.getAnnotation(IgnoreToFrom.class)))
                .map(field -> {
                    String getter = null;
                    if (field.getType() == boolean.class) {
                        getter = "is" + StringUtils.capitalize(field.getName());
                    } else {
                        getter = "get" + StringUtils.capitalize(field.getName());
                    }
                    return findMethod(fromClass, getter);
                })
                .filter(Objects::nonNull)
                .map(method -> get(method, to))
                .filter(Objects::nonNull).collect(Collectors.toList());

        List<FromToCopy> unmodifiableFieldsMap = Collections.unmodifiableList(fieldsMap);
        FIELDS_MAP.put(key, unmodifiableFieldsMap);
        return unmodifiableFieldsMap;
    }

    private static void doCopy(Object from, Object to, List<FromToCopy> fieldsMap) {
        for (FromToCopy fromToCopy : fieldsMap) {
            fromToCopy.map(from, to);
        }
    }

    public static void extract(Class<?> aClass) {
        Arrays.stream(aClass.getDeclaredFields()).forEach(field -> {
            Class<?> newType = null;
            Class<?> type = field.getType();
            switch (type.getSimpleName()) {
                case "String":
                    newType = String.class;
                    break;
                case "LookupItem":
                    newType = LookupDataDTO.class;
                    break;
                case "float":
                    newType = float.class;
                    break;
                case "Float":
                    newType = Float.class;
                    break;
                case "double":
                    newType = double.class;
                    break;
                case "Double":
                    newType = Double.class;
                    break;
                case "int":
                    newType = int.class;
                    break;
                case "Integer":
                    newType = Integer.class;
                    break;
                case "long":
                    newType = long.class;
                    break;
                case "Long":
                    newType = Long.class;
                    break;
                case "BigDecimal":
                    newType = BigDecimal.class;
                    break;
                default:
                    newType = String.class;
            }

            MyLogger.printf("%s %s;%n", newType.getSimpleName(), field.getName());
        });
    }

    @Override
    public String toString() {
        return mapper + "{" +
                "fromType=" + fromType +
                ", fromMethod=" + fromMethod.getName() +
                ", fromType=" + fromType +
                ", toType=" + toType +
                '}';
    }

  */
/*public static void main(String[] args) {
    String reverse="Hello";
    StringBuffer sb=new StringBuffer();
    char[] charArray=reverse.toCharArray();
    for(int i=charArray.length-1;i>=0;i--)
    {
      sb.append(charArray[i]);
    }
    for(int i=reverse.length()-1;i>=0;i--)
      sb.append(reverse.charAt(i));

    System.out.println("sb = " +sb.toString());
    StringBuffer sbr=process("hello world", 5, String::substring);
    System.out.println("sbr = " + sbr);

  }
  public static StringBuffer process(String string, Integer i, BiFunction<String, Integer, String> processor)
  {
      return new StringBuffer(processor.apply(string,i));
  }*//*

}*/
