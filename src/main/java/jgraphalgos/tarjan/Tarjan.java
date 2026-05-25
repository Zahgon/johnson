package jgraphalgos.tarjan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import edu.uci.ics.jung.graph.DirectedGraph;

/**
 * From Wikipedia (http://en.wikipedia.org/wiki/Tarjan%27s_strongly_connected_components_algorithm):
 * algorithm tarjan is
 *   input: graph G = (V, E)
 *   output: set of strongly connected components (sets of vertices)
 *
 *   index := 0
 *   S := empty
 *   for each v in V do
 *     if (v.index is undefined) then
 *       strongconnect(v)
 *     end if
 *   repeat
 */
public class Tarjan<NodeType, EdgeType> {

    int index;

    DirectedGraph<NodeType, EdgeType> dg;

    Stack<NodeType> stack;

    Map<NodeType, Integer> indexMap;

    Map<NodeType, Integer> lowLinkMap;

    public List<List<NodeType>> tarjan() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Tarjan(DirectedGraph<NodeType, EdgeType> dg) {
        this.index = 0;
        this.dg = dg;
        this.indexMap = new HashMap<NodeType, Integer>();
        this.lowLinkMap = new HashMap<NodeType, Integer>();
    }

    public List<List<NodeType>> strongConnect(NodeType v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
/*
function strongconnect(v)
// Set the depth index for v to the smallest unused index
v.index := index
v.lowlink := index
index := index + 1
S.push(v)

// Consider successors of v
for each (v, w) in E do
  if (w.index is undefined) then
    // Successor w has not yet been visited; recurse on it
    strongconnect(w)
    v.lowlink := min(v.lowlink, w.lowlink)
  else if (w is in S) then
    // Successor w is in stack S and hence in the current SCC
    v.lowlink := min(v.lowlink, w.index)
  end if
repeat

// If v is a root node, pop the stack and generate an SCC
if (v.lowlink = v.index) then
  start a new strongly connected component
  repeat
    w := S.pop()
    add w to current strongly connected component
  until (w = v)
  output the current strongly connected component
end if
end function *
*/
