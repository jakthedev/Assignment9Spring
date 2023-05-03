package com.coderscampus.demo;

import com.coderscampus.demo.service.FileService;
import com.coderscampus.demo.web.FileController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		FileController nunu = new FileController();
		FileService nene = new FileService();

		//nunu.readLines();

		new List<>() {
			@Override
			public int size() {
				return 0;
			}

			@Override
			public boolean isEmpty() {
				return false;
			}

			@Override
			public boolean contains(Object o) {
				return false;
			}

			@Override
			public Iterator<Object> iterator() {
				return null;
			}

			@Override
			public Object[] toArray() {
				return new Object[0];
			}

			@Override
			public <T> T[] toArray(T[] a) {
				return null;
			}

			@Override
			public boolean add(Object o) {
				return false;
			}

			@Override
			public boolean remove(Object o) {
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				return false;
			}

			@Override
			public boolean addAll(Collection<?> c) {
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<?> c) {
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				return false;
			}

			@Override
			public void clear() {

			}

			@Override
			public boolean equals(Object o) {
				return false;
			}

			@Override
			public int hashCode() {
				return 0;
			}

			@Override
			public Object get(int index) {
				return null;
			}

			@Override
			public Object set(int index, Object element) {
				return null;
			}

			@Override
			public void add(int index, Object element) {

			}

			@Override
			public Object remove(int index) {
				return null;
			}

			@Override
			public int indexOf(Object o) {
				return 0;
			}

			@Override
			public int lastIndexOf(Object o) {
				return 0;
			}

			@Override
			public ListIterator<Object> listIterator() {
				return null;
			}

			@Override
			public ListIterator<Object> listIterator(int index) {
				return null;
			}

			@Override
			public List<Object> subList(int fromIndex, int toIndex) {
				return null;
			}
		};
		List<String> ArrNene = nene.readFile("recipe.txt");

		for (String varNene : ArrNene ) {
			System.out.println(varNene);
		}


	}

}
