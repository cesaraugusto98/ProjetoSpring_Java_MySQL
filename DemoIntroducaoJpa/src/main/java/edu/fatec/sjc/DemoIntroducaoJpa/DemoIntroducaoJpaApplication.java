package edu.fatec.sjc.DemoIntroducaoJpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.fatec.sjc.DemoIntroducaoJpa.dao.Dao;
import edu.fatec.sjc.DemoIntroducaoJpa.model.Student;

@SpringBootApplication
public class DemoIntroducaoJpaApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory
			.getLogger(DemoIntroducaoJpaApplication.class);
	
	@Autowired
	Dao<Student, Long> dao; 
	
	public static void main(String[] args) {
		SpringApplication.run(DemoIntroducaoJpaApplication.class, args);
	}
	
	
	public void run(String... args) {
		log.info("Querying for student records where "
				+ "first_name = 'Lucas':");
		Student st = dao.get(1l);
		log.info(st.toString());
//        jdbcTemplate.query(
//                "SELECT id, first_name, last_name, "
//                + "email FROM student WHERE first_name like ?", 
//                new Object[] { "%Lucas%" },
//                (rs, rowNum) -> new Student(rs.getInt("id"), 
//                		rs.getString("first_name"), 
//                		rs.getString("last_name"), 
//                		rs.getString("email"))
//        ).forEach(student -> System.out.println(student.toString()));
	}
}
