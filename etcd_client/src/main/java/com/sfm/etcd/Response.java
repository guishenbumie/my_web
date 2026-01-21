package com.sfm.etcd;

public interface Response {

    /**
     * Returns the response header
     *
     * @return the header.
     */
    Header getHeader();

    interface Header {

        /**
         * Returns the cluster id
         *
         * @return the cluster id.
         */
        long getClusterId();

        /**
         * Returns the member id
         *
         * @return the member id.
         */
        long getMemberId();

        /**
         * Returns the revision id
         *
         * @return the revision.
         */
        long getRevision();

        /**
         * Returns the raft term
         *
         * @return theraft term.
         */
        long getRaftTerm();
    }
}
