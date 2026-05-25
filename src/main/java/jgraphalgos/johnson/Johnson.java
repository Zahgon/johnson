package jgraphalgos.johnson;

import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import java.util.*;
import jgraphalgos.WeightedEdge;
import jgraphalgos.tarjan.Tarjan;

public class Johnson {

    Map<Integer, Boolean> blocked;

    Map<Integer, List<Integer>> blockedNodes;

    List<Stack<Integer>> circuits;

    DirectedGraph<Integer, WeightedEdge> dg;

    public Johnson(DirectedGraph<Integer, WeightedEdge> dg) {
        blocked = new HashMap<>();
        blockedNodes = new HashMap<>();
        circuits = new ArrayList<>();
        this.dg = dg;
    }

    public void unblock(Integer u) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean circuit(DirectedGraph<Integer, WeightedEdge> dg, Integer v, Integer s, Stack<Integer> stack) throws JohnsonIllegalStateException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static DirectedGraph<Integer, WeightedEdge> leastSCC(DirectedGraph<Integer, WeightedEdge> dg) throws JohnsonIllegalStateException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer leastVertex(DirectedGraph<Integer, WeightedEdge> in) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static DirectedGraph<Integer, WeightedEdge> addEdges(List<Integer> list, DirectedGraph<Integer, WeightedEdge> dg) throws JohnsonIllegalStateException {
        if (list == null) {
            throw new JohnsonIllegalStateException();
        }
        if (dg == null) {
            throw new JohnsonIllegalStateException();
        }
        DirectedGraph<Integer, WeightedEdge> result = new DirectedSparseGraph<>();
        for (Integer i : list) {
            for (WeightedEdge edge : dg.getOutEdges(i)) {
                Integer to = dg.getOpposite(i, edge);
                if (list.contains(to)) {
                    result.addEdge(edge, i, to);
                }
            }
        }
        return result;
    }

    public static DirectedGraph<Integer, WeightedEdge> subGraphFrom(Integer i, DirectedGraph<Integer, WeightedEdge> in) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void findCircuits() throws JohnsonIllegalStateException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class JohnsonIllegalStateException extends Throwable {
    }
}
