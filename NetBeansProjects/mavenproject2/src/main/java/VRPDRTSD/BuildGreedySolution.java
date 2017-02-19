/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VRPDRTSD;

import Algorithms.Algorithm;
import VRPDRTSD.IntanceReaderWithMySQL.AdjacenciesDataAcessObject;
import VRPDRTSD.IntanceReaderWithMySQL.NodeDataAcessObject;
import VRPDRTSD.IntanceReaderWithMySQL.NumberOfNodesDataAcessObject;
import VRPDRTSD.IntanceReaderWithMySQL.RequestDataAcessObject;
import VRPDRTSD.Node;
import VRPDRTSD.Request;
import java.time.Duration;
import java.util.List;

/**
 *
 * @author renansantos
 */
public class BuildGreedySolution implements Algorithm {

    private int numberOfNodes;
    private List<Node> nodes;
    private List<Request> listOfRequests;
    private Duration[][] duration;
    private double[][] distance;
    private String instanceName = "VRPDRTSD_requests110";

//    public BuildGreedySolution(){
//        this.readInstance();
//    }
    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Request> getListOfRequests() {
        return listOfRequests;
    }

    public Duration[][] getDuration() {
        return duration;
    }

    public double[][] getDistance() {
        return distance;
    }

    public String getInstanceName() {
        return instanceName;
    }

//    @Override
//    public Object builRandomSoltution() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Object reBuildSolution() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void evaluateSolution() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Object localSeach() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    @Override
    public void readInstance() {
        this.numberOfNodes = new NumberOfNodesDataAcessObject().getNumberOfNodes(this.instanceName);
        this.nodes = new NodeDataAcessObject().getListOfNodes();
        this.listOfRequests = new RequestDataAcessObject().getListOfRequestUsingNodesList(nodes, this.instanceName);
        this.duration = new AdjacenciesDataAcessObject().getDurationBetweenNodes(this.numberOfNodes);
        this.distance = new AdjacenciesDataAcessObject().getDistanceBetweenNodes(this.numberOfNodes);
    }

//    @Override
//    public <Candidates, ProblemSolution, ProblemData> List<Candidates> InitializeCandidateElementsSet(ProblemData... data) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    @Override
    public Object initializeCandidatesElementsSet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object actualizeCandidatesElementsSet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findBestCandidate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCandidateIntoSolution(Object solution, Object candidate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}