(ns fizzy.core
  (:gen-class))

(def triple? (comp zero? #(mod % 3)))
(def quintuple? (comp zero? #(mod % 5)))

(defn fizz-buzz [n]
  {:pre [(number? n)]}
  (case [(triple? n) (quintuple? n)]
    [true false] "fizz"
    [false true] "buzz"
    [true true] "fizzbuzz"
    n))

(defn -main
  "Fizz buzz first 100"
  [& args]
  (map fizz-buzz (range 1 101)))
