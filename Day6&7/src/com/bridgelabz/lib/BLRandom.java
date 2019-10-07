/**
 * A library for generating various random distributions.
 */
package com.bridgelabz.lib;
import java.util.*;

/**
 * @author ayush
 *
 */
public class BLRandom {

	
    /**
     * Sets the seed of the pseudo-random number generator.
     * This method enables you to produce the same sequence of "random"
     * number for each execution of the program.
     * Ordinarily, you should call this method at most once per program.
     *
     * @param s the seed
     */
	public static void setSeed(long seed) {
		Random rno = new Random();
		rno.setSeed(seed);
		System.out.println("value of seed: " +seed);
	}
	
    /**
     * Returns a random real number uniformly in [0, 1).
     *
     * @return a random real number uniformly in [0, 1)
     */
	public static double uniform() {
		double t;
		Random rno = new Random();
		t = rno.nextInt();
		return t;
	}
	
    /**
     * Returns a random integer uniformly in [0, n).
     * 
     * @param n number of possible integers
     * @return a random integer uniformly between 0 (inclusive) and {@code n} (exclusive)
     * @throws IllegalArgumentException if {@code n <= 0}
     */
	
	public static int uniform(int n) {
		int t;
		Random rno = new Random();
		t = rno.nextInt(n);
		return t;
	}
	

    /**
     * Returns a random real number uniformly in [a, b).
     * 
     * @param  a the left endpoint
     * @param  b the right endpoint
     * @return a random real number uniformly in [a, b)
     * @throws IllegalArgumentException unless {@code a < b}
     */
	
	public static double uniform(double lo, double hi) {
		double temp,op;
		Random rno = new Random();
		temp = rno.nextDouble();
		op = lo + ((hi - lo)*temp);
		return op;
	}
	
    /**
     * Returns a random boolean from a Bernoulli distribution with success
     * probability <em>p</em>.
     *
     * @param  p the probability of returning {@code true}
     * @return {@code true} with probability {@code p} and
     *         {@code false} with probability {@code 1 - p}
     * @throws IllegalArgumentException unless {@code 0} &le; {@code p} &le; {@code 1.0}
     */
	public static boolean bernoulli(double p) {
		Random rno = new Random();
		if(!(p>=0.0 && p<1.0)) {
			throw new IllegalArgumentException("probability must be between 0.0 to 1.0....");
		}
		return rno.nextDouble() <p;
	}
	
    /**
     * Returns a random real number from a standard Gaussian distribution.
     * 
     * @return a random real number from a standard Gaussian distribution
     *         (mean 0 and standard deviation 1).
     */
	
	public static double gaussian() {
		Random rno = new Random();
		double temp;
		temp = rno.nextGaussian();
		System.out.println(" "+temp);
		return temp;
	}
	
    /**
     * Returns a random real number from a Gaussian distribution with mean &mu;
     * and standard deviation &sigma;.
     * 
     * @param  mu the mean
     * @param  sigma the standard deviation
     * @return a real number distributed according to the Gaussian distribution
     *         with mean {@code mu} and standard deviation {@code sigma}
     */
	public static double gaussian(double mu, double sigma) {
		return mu+sigma*gaussian();
	}
	
	 /**
     * Returns a random integer from the specified discrete distribution.
     *
     * @param  probabilities the probability of occurrence of each integer
     * @return a random integer from a discrete distribution:
     *         {@code i} with probability {@code probabilities[i]}
     * @throws IllegalArgumentException if {@code probabilities} is {@code null}
     * @throws IllegalArgumentException if sum of array entries is not (very nearly) equal to {@code 1.0}
     * @throws IllegalArgumentException unless {@code probabilities[i] >= 0.0} for each index {@code i}
	*/
	public static int discrete(double [] probabilities) {
		if(probabilities == null) {
			throw new IllegalArgumentException("\nno array inputted..\n");
		}
		double eps = 1e+14;
		double sum =0;
		for(int i =0 ;  i< probabilities.length; i++) {
			if(!(probabilities[i]>0)) {
				throw new IllegalArgumentException("invalid value in probabilities[]");
			}
			sum += probabilities[i];
		}
		if(sum>1.0+eps || sum<1.0-eps) {
			throw new IllegalArgumentException("sum of array elements not equal to 0");
		}
		while(true) {
			double r = uniform();
			double sum1 =0;
			for(int i=0;i<probabilities.length;i++) {
				sum += probabilities[i];
				if(sum>r)
					return i;
			}
		}
	}
	
	  /**
     * Rearranges the elements of the specified array in uniformly random order.
     *
     * @param  a the array to shuffle
     * @throws IllegalArgumentException if {@code a} is {@code null}
     */
	public static void shuffle(double [] a) {
		if(a==null) {
			throw new IllegalArgumentException("\nno array inputted..\n");
		}
		for(int i = 0; i<a.length;i++) {
			int r = i+uniform(a.length-1);
			double temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
}
