(ns project-euler.utils.utils)

(defn find-first [f coll]
  (first (drop-while (complement f) coll)))