package vn.codegym.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Song;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class SongRepository implements ISongRepository{
    @Override
    public void create(Song song) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUntil.sessionFactory.openSession();
            transaction = session.beginTransaction();
           session.save(song);

           transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Song> display() {
        Session session=null;
        List<Song> songList;
        try {
            session=ConnectionUntil.sessionFactory.openSession();
           songList=session.createQuery("from Song ").getResultList();
        }finally {
            if (session !=null){
                session.close();
            }
        }
        return songList;
    }

    @Override
    public void edit(Song song) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUntil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            if (song.getId()==null){
                create(song);
            }else {
                Song origin = findOne(song.getId());
                origin.setName(song.getName());
                origin.setSinger(song.getSinger());
                origin.setType(song.getType());
                session.saveOrUpdate(origin);
            }

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    @Override
    public void delete(Song song) {
//        String queryStr = "delete from Song WHERE id = :id";
//        TypedQuery<Song> query = ConnectionUntil.entityManager.createQuery(queryStr, Song.class);
//        query.setParameter("id", song.getId());
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUntil.sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.remove(findOne(song.getId()));

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Song findOne(Integer id) {
        String queryStr = "SELECT s FROM Song AS s WHERE s.id = :id";
        TypedQuery<Song> query = ConnectionUntil.entityManager.createQuery(queryStr, Song.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

}
