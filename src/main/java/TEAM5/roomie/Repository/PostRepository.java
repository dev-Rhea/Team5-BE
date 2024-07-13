package TEAM5.roomie.Repository;

import TEAM5.roomie.Model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Posts, Integer> {

    List<Posts> findByTag(String groupBuyPosts);
}
