
package com.exemple.carte;

import java.io.IOException;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import com.exemple.util.ResourceUtility;

public class Jeu {
	private ImageIcon[][] figures = loadImages();

	public Jeu() throws IOException {
	}

	public ImageIcon[][] loadImages() throws IOException {
		int rows = 4;
		int cols = 3;
		ImageIcon[][] images = ResourceUtility
				.splitImageIcon(ResourceUtility.loadBufferedImage("images/butterfly2.png"), rows, cols);

		return images;
	}

	public Deque<ImageIcon> creerPioche() {
		LinkedList<ImageIcon> cartes = new LinkedList<ImageIcon>();
		int rows = figures.length;
		int cols = figures[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				cartes.add(figures[i][j]);
				cartes.add(figures[i][j]);
			}
		}
		Collections.shuffle(cartes);
		return cartes;
	}
}
