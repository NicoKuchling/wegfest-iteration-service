package com.nicokuchling.wegfest.iteration_service.services;

import com.nicokuchling.wegfest.api.core.iteration.Iteration;
import com.nicokuchling.wegfest.api.core.iteration.IterationPosition;
import com.nicokuchling.wegfest.api.core.iteration.IterationService;
import com.nicokuchling.wegfest.shared.http.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@RestController
public class IterationServiceImpl implements IterationService {

    private static final Logger LOG = LoggerFactory.getLogger(IterationServiceImpl.class);

    private ServiceUtil serviceUtil;

    @Autowired
    public IterationServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }


    @Override
    public List<Iteration> getAllIterations() {
        LOG.debug("/iteration return all available iterations");

        Iteration iteration1 = new Iteration(1, 1, Arrays.asList(1,2,3));
        Iteration iteration2 = new Iteration(2, 2, Arrays.asList(4,5,6));

        List<Iteration> iterations = new ArrayList<>();
        iterations.add(iteration1);
        iterations.add(iteration2);

        return iterations;
    }

    @Override
    public List<Integer> getIterationQueue() {
        LOG.debug("/iteration/queue return current queue for iterations");

        return Arrays.asList(1, 2);
    }

    @Override
    public Iteration peakNextIteration() {
        LOG.debug("/iteration/next/peak return next iteration in queue but don't remove it");

        return new Iteration(1, 1, Arrays.asList(1,2,3));
    }

    @Override
    public Iteration popNextIteration() {
        LOG.debug("/iteration/next/pop return next iteration in queue and remove it");

        return new Iteration(1, 1, Arrays.asList(1,2,3));
    }
}
