/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ftl.*

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext ctx) {
		fsa.generateFile(res.URI.trimFileExtension.appendFileExtension("sh").lastSegment,
			res.allContents.filter(Program).toIterable.head.compile.toString)
	}
	
	def dispatch compile(Instruction inst) ''' Pas content '''
	
	def dispatch compile(Program program) '''
	�FOR stream : program.streams�
		�stream.compile�
	�ENDFOR�
	�FOR transform : program.transforms�
		�transform.compile�
	�ENDFOR�
	'''
	
	def dispatch compile(In in) '''
	�in.name� = "�in.path�";
	
	'''
	
	def dispatch compile(Transform transform) '''
	ffmpeg �transform.output� 
	�FOR instruction : transform.instruction�
		�instruction.compile�
	�ENDFOR�
	'''
	
	def dispatch compile(Sepia sepia) '''
	colorchannelmixer=.393:.769:.189:0:.349:.686:.168:0:.272:.534:.131,eq=1.0:0:1.3:2.4:1.0:1.0:1.0:1.0
	'''
	
	def dispatch compile(Video video) '''
	-i �video.input� 
	'''
}
