import java.util.*;

public class main
{
    public static void main(String[] args)
    {

        Set<vertex> graph = new HashSet<>() ;

        graph.add(new vertex(0, new vertex(1, new vertex(4, null)))) ;
        graph.add(new vertex(1, new vertex(0, new vertex(4, new vertex(3, new vertex(2, null)))))) ;
        graph.add(new vertex(2, new vertex(1, new vertex(3, null)))) ;
        graph.add(new vertex(3, new vertex(1, new vertex(2, new vertex(4, null))))) ;
        graph.add(new vertex(4, new vertex(0, new vertex(1, new vertex(3, null))))) ;

        System.out.println("~~~Storing a graph with a HashSet of Vertexes (nodes)~~~~");
        System.out.println("~~~~~~~~Adjacency List~~~~~~~~~~~\n");
        System.out.println("~~~~~~~~advantagous - Size is flexible, and specific to each vertex's needs, memory need not be contiguous~~~~~~~~~~~\n");

        for(vertex v : graph)
        {
            printVertex(v);
            System.out.println();
        }

        int array[][] = new int[5][5] ;
        for (int i = 0 ; i <= 4 ; i++)
            for (int j = 0 ; j <= 4 ; j++)
                array[i][j] = 0 ;

        array[0][1] = 1 ;
        array[0][4] = 1 ;
        array[1][0] = 1 ;
        array[1][2] = 1 ;
        array[1][3] = 1 ;
        array[1][4] = 1 ;
        array[2][1] = 1 ;
        array[2][3] = 1 ;
        array[3][1] = 1 ;
        array[3][2] = 1 ;
        array[3][4] = 1 ;
        array[4][0] = 1 ;
        array[4][1] = 1 ;
        array[4][3] = 1 ;

        System.out.println("\n\n~~~ Storing a graph in a multidimensional array~~~~~");
        System.out.println("~~~~~~~~~Adjacency Matrix~~~~~~~~~\n");
        System.out.println("~~~~~~~~~Advantages - faster access speeds to linear data~~~~~~~~~\n");

        for (int i = 0 ; i <= 4 ; i++)
        {
            for (int j = 0 ; j <= 4 ; j++)
            System.out.print(array[i][j]);
            System.out.println();
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");





    }
    static class vertex
    {
        private int vertexNumber ;
        private vertex next ;
        public vertex(int vertexNumber, vertex next)
        {
            this.vertexNumber = vertexNumber ;
            this.next = next ;
        }
        public int getVertexNumber()
        {
            return vertexNumber ;
        }
        public vertex getNext()
        {
            return next ;
        }

    }
    public static void printVertex(vertex v)
    {
        System.out.print(v.vertexNumber + " ");
        if(v.next != null)
            printVertex(v.next);
    }

}
