package Windows.Foundation.Numerics

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.Pointer
import com.sun.jna.Structure
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_BYTE
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Float
import kotlin.jvm.JvmField

@ABIMarker(Matrix4x4.ABI::class)
@Signature("struct(Windows.Foundation.Numerics.Matrix4x4;f4;f4;f4;f4;f4;f4;f4;f4;f4;f4;f4;f4;f4;f4;f4;f4)")
@Structure.FieldOrder("M11, M12, M13, M14, M21, M22, M23, M24, M31, M32, M33, M34, M41, M42, M43, M44")
@WinRTByReference(brClass = Matrix4x4.ByReference::class)
public open class Matrix4x4(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var M11: Float? = null

  @JvmField
  public var M12: Float? = null

  @JvmField
  public var M13: Float? = null

  @JvmField
  public var M14: Float? = null

  @JvmField
  public var M21: Float? = null

  @JvmField
  public var M22: Float? = null

  @JvmField
  public var M23: Float? = null

  @JvmField
  public var M24: Float? = null

  @JvmField
  public var M31: Float? = null

  @JvmField
  public var M32: Float? = null

  @JvmField
  public var M33: Float? = null

  @JvmField
  public var M34: Float? = null

  @JvmField
  public var M41: Float? = null

  @JvmField
  public var M42: Float? = null

  @JvmField
  public var M43: Float? = null

  @JvmField
  public var M44: Float? = null

  public class ByReference : Matrix4x4(), Structure.ByReference, IByReference<Matrix4x4> {
    public override fun getValue(): Matrix4x4 = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : Matrix4x4(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(Matrix4x4::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
      JAVA_BYTE, 
    )


    public override fun fromNative(segment: MemorySegment): ByValue {
      val address = segment.address().toRawLongValue()
      return ByValue(Pointer(address))
    }

    public override fun toNative(obj: ByValue): MemorySegment {
      obj.write()
      val address  = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
      return MemorySegment.ofAddress(address, layout.byteSize(), MemorySession.global())
    }
  }
}
