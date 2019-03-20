(ns fizzy.core
  (:gen-class))

(defn fizz-buzz [n]
  (let [mod3? (zero? (mod n 3))
        mod5? (zero? (mod n 5))]
    (case [mod3? mod5?]
      [true false] "fizz"
      [false true] "buzz"
      [true true] "fizzbuzz"
      n)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
