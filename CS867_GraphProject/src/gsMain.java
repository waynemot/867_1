
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;


/*
 *  Cities - top 10 by population
 *  Omaha        408,958
 *  Lincoln      258,379
 *  Bellevue     50,137
 *  Grand Island 48,520
 *  Kearney      30,787
 *  Fremont      26,397
 *  Hastings     24,907
 *  North Platte 24,733
 *  Norfolk      24,210
 *  Columbus     22,111
 */
public class gsMain {

	public static void main(String args[]) {
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		Graph graph = new SingleGraph("Nebraska Cities");
		graph.addNode("Omaha");
		graph.getNode("Omaha").addAttribute("ui.label", "Omaha");
		graph.getNode("Omaha").addAttribute("x",80.0);
		graph.getNode("Omaha").addAttribute("y", 22.0);
		
		graph.addNode("Lincoln");
		graph.getNode("Lincoln").addAttribute("ui.label", "Lincoln");
		graph.getNode("Lincoln").addAttribute("x", 70.0);
		graph.getNode("Lincoln").addAttribute("y", 13.0);
		
		graph.addNode("Grand Island");
		graph.getNode("Grand Island").addAttribute("ui.label", "Grand Island");
		graph.getNode("Grand Island").addAttribute("x",45.0);
		graph.getNode("Grand Island").addAttribute("y",14.0);
		
		graph.addNode("Kearney");
		graph.getNode("Kearney").addAttribute("ui.label", "Kearney");
		graph.getNode("Kearney").addAttribute("x", 34.0);
		graph.getNode("Kearney").addAttribute("y", 10.0);
		
		graph.addNode("Hastings");
		graph.getNode("Hastings").addAttribute("ui.label", "Hastings");
		graph.getNode("Hastings").addAttribute("x", 45.0);
		graph.getNode("Hastings").addAttribute("y", 8.0);
		
		graph.addNode("North Platte");
		graph.getNode("North Platte").addAttribute("ui.label", "North Platte");
		graph.getNode("North Platte").addAttribute("x", 10.0);
		graph.getNode("North Platte").addAttribute("y", 18.0);
		
		graph.addNode("Columbus");
		graph.getNode("Columbus").addAttribute("ui.label", "Columbus");
		graph.getNode("Columbus").addAttribute("x", 58.0);
		graph.getNode("Columbus").addAttribute("y", 25.0);
		
		graph.addNode("Fremont");
		graph.getNode("Fremont").addAttribute("ui.label", "Fremont");
		graph.getNode("Fremont").addAttribute("x", 74.0);
		graph.getNode("Fremont").addAttribute("y", 25.0);
		
		graph.addNode("Bellevue");
		graph.getNode("Bellevue").addAttribute("ui.label", "Bellvue");
		graph.getNode("Bellevue").addAttribute("x", 81.0);
		graph.getNode("Bellevue").addAttribute("y", 18.0);
		
		graph.addNode("Norfolk");
		graph.getNode("Norfolk").addAttribute("ui.label", "Norfolk");
		graph.getNode("Norfolk").addAttribute("x", 54.0);
		graph.getNode("Norfolk").addAttribute("y", 40.0);
		
		graph.addEdge("I80", "Omaha", "Lincoln");
		graph.getEdge("I80").addAttribute("ui.label", "I-80");
		graph.addEdge("US75","Omaha", "Bellevue");
		graph.getEdge("US75").addAttribute("ui.label", "US-75");
		graph.addEdge("I80b","Lincoln","Grand Island");
		graph.getEdge("I80b").addAttribute("ui.label", "I-80");
		graph.addEdge("I80c","Grand Island","Kearney");
		graph.getEdge("I80c").addAttribute("ui.label", "I-80");
		graph.addEdge("I80d", "Kearney","North Platte");
		graph.getEdge("I80d").addAttribute("ui.label", "I-80");
		graph.addEdge("US275","Omaha","Fremont");
		graph.getEdge("US275").addAttribute("ui.label", "US-275");
		graph.addEdge("US30","Fremont","Columbus");
		graph.getEdge("US30").addAttribute("ui.label", "US-30");
		graph.addEdge("US81","Columbus","Norfolk");
		graph.getEdge("US81").addAttribute("ui.label", "US-81");
		graph.addEdge("US30b","Columbus","Grand Island");
		graph.getEdge("US30b").addAttribute("ui.label", "US-30");
		graph.addEdge("US77","Lincoln","Fremont");
		graph.getEdge("US77").addAttribute("ui.label", "US-77");
		graph.addEdge("US34", "Hastings", "Grand Island");
		graph.getEdge("US34").addAttribute("ui.label", "US-34");
		graph.addEdge("US6", "Lincoln", "Hastings");
		graph.getEdge("US6").addAttribute("ui.label", "US-6");
		graph.display(false);
		//Element O_x = graph.getNode("Omaha").getAttribute("x");
		//Element O_y = graph.getNode("Omaha").getAttribute("y");
		//String O_x_str = O_x.toString();
		//String O_y_str = O_y.toString();
		//System.out.println("Omaha X="+O_x_str+" Y="+O_y_str);
		System.out.println("# Nodes: "+graph.getNodeCount()+
				" # Edges: "+graph.getEdgeCount());
	}
}
