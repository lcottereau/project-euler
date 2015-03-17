/*
 * This file is part of Project-Euler.
 *
 * Foobar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
import static java.util.stream.IntStream.range;

/**
 * Find a solution to {@link https://projecteuler.net/problem=1}.
 */
public class MultiplesOfThreeAndFive {

    public static Integer solve(int upper) {
        return range(0, upper).filter((int value) -> value % 3 == 0 || value % 5 == 0).sum();
    }

    public static void main(String... args) {
        System.out.println("Pour les entiers jusqu'à 1000 : " + solve(1000));
    }

}
