package com.example.repositories;

public interface IRepository <T>{
    /**
     * creates an object T in the underlying layer using repository class
     * @param t
     * @return
     */
     T create(T t);

    /**
     *
     * @param t
     * @return
     */
     T update(T t);

    /**
     *
     * @param t
     * @return
     */
     boolean delete(T t);

    /**
     *
     * @param id
     * @return
     */
     T get(Integer id);
}
