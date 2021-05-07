/*
    Input
    ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
    [[1, 1, 0], [1], [2], [3], [1]]
    Output
    [null, true, true, false, false]

    Explanation
    ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
    parkingSystem.addCar(1); // return true because there is 1 available slot for a big car
    parkingSystem.addCar(2); // return true because there is 1 available slot for a medium car
    parkingSystem.addCar(3); // return false because there is no available slot for a small car
    parkingSystem.addCar(1); // return false because there is no available slot for a big car. It is already occupied.

    ParkingSystem:
        Input: 3 integers
        Output: none
        Constraints: 0 <= big, medium, small <= 1000
        Edge cases: none

    addCar
        Input: 1 integer
        Output: boolean
        Constraints: carType is 1(big), 2(medium), 3(small)
        Edge cases: none
*/

class ParkingSystem {

    // data fields to store slots for each car type
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.big > 0) {
                    this.big--;
                    return true;
                }
                return false;
            case 2:
                if (this.medium > 0) {
                    this.medium--;
                    return true;
                }
                return false;
            default:
                if (this.small > 0) {
                    this.small--;
                    return true;
                }
                return false;
        }
    }
}

/*
    ALTERNATIVE SOLUTION:
    class ParkingSystem {
        int[] count;


        public ParkingSystem(int big, int medium, int small) {
            count = new int[]{big, medium, small};
        }

        public boolean addCar(int carType) {
            return count[carType - 1]-- > 0;
        }
    }
*/