(fn [state time-left]
  (def turn-directions [:right :left :about-face])

  (let [command-options [(repeat 10 {:action :move
                                     :metadata {}})
                         (repeat 2 {:action :turn
                                    :metadata {:direction (rand-nth turn-directions)}})
                         (repeat 4 {:action :shoot
                                      :metadata {}})
                         (repeat 3 {:action :smoke
                                    :metadata {}})]]

    #_{:command (rand-nth (flatten command-options))
       :state {:test true}}

    {:command {:action :smoke
               :metadata {}}
     :state {}}))
