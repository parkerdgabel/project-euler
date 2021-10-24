(ns project-euler.problems.problem-8-test
  (:require [clojure.test :refer :all]
            [project-euler.problems.problem-8 :refer [solution]]))

(deftest problem-8-answer
  (testing "The correct answer returned for problem 6"
    (is (= 23514624000 solution))))
