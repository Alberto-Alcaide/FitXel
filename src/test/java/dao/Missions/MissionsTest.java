package dao.Missions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dao.Missions.Missions.Dificulty;
import dao.Missions.Missions.Reward;

<<<<<<< Updated upstream


=======
>>>>>>> Stashed changes
public class MissionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< Updated upstream
		MissionsImpl m1 = new MissionsImpl(600,"Mata al señor Oscuro","",Reward.gold,Dificulty.hard);
		MissionsImpl m2 = new MissionsImpl(600,"Adentrate en la mazmorra","",Reward.boots,Dificulty.normal);
		MissionsImpl m3 = new MissionsImpl(600,"Salva el mundo","",Reward.sword,Dificulty.easy);

=======
		MissionsImpl m1 = new MissionsImpl(200,"Mata al señor Oscuro","",Reward.gold,Dificulty.hard);
		MissionsImpl m2 = new MissionsImpl(1000,"Adentrate en la mazmorra","",Reward.boots,Dificulty.normal);
		MissionsImpl m3 = new MissionsImpl(600,"Salva el mundo","",Reward.sword,Dificulty.easy);
		MissionsRescueImpl m4 = new MissionsRescueImpl();
>>>>>>> Stashed changes
		
		List<Missions> misiones = new ArrayList<>();
		misiones.add(m1);
		misiones.add(m2);
		misiones.add(m3);
<<<<<<< Updated upstream

=======
		misiones.add(m4);
>>>>>>> Stashed changes
		
		m1.setDescription("Prueba");
		m1.setDificulty(Dificulty.easy);
		m1.setName("Prueba");
		m1.setRemainingTime(0);
		m1.setReward(Reward.sword);
		
		System.out.println("TO STRING:");
		System.out.println(m1.toString());
		
		System.out.println("GETS:");
		System.out.println(m1.getDescription());
		System.out.println(m1.getName());
		System.out.println(m1.getClass());
		System.out.println(m1.getRemainingTime());
		System.out.println(m1.getDificulty());
		System.out.println(m1.getReward());
		
		System.out.println("HASHCODE:");
		System.out.println(m1.hashCode());
		
		System.out.println("EQUALS:");
<<<<<<< Updated upstream

		m1 = m2;

		System.out.println("m1 = M2: " + m1.equals(m2));

		
		
		System.out.println("LISTA, ordenada por nombre:");
=======
		System.out.println("M1 = M2: " + m1.equals(m2));
		
		
		System.out.println("LISTA, ordenada por tiempo Restante:");
		
		System.out.println("ORDENANDO");
>>>>>>> Stashed changes
		Collections.sort(misiones, new MissionsComparator());
		
		for (Missions i : misiones) {
			System.out.println("Mision: " + i.toString());
		}
		
	}

}
