package com.example.demo.Favorites.FavoritesRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.Favorites.Favorites.Favorite;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository <Favorite,Integer> {
    List<Favorite> findByIdUser(Integer idUser);

}

