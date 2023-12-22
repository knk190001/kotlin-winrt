package Windows.UI.Xaml.Media.Media3D

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
import java.lang.foreign.ValueLayout.JAVA_DOUBLE
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Double
import kotlin.jvm.JvmField

@ABIMarker(Matrix3D.ABI::class)
@Signature("struct(Windows.UI.Xaml.Media.Media3D.Matrix3D;f8;f8;f8;f8;f8;f8;f8;f8;f8;f8;f8;f8;f8;f8;f8;f8)")
@Structure.FieldOrder("M11, M12, M13, M14, M21, M22, M23, M24, M31, M32, M33, M34, OffsetX, OffsetY, OffsetZ, M44")
@WinRTByReference(brClass = Matrix3D.ByReference::class)
public open class Matrix3D(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var M11: Double? = null

  @JvmField
  public var M12: Double? = null

  @JvmField
  public var M13: Double? = null

  @JvmField
  public var M14: Double? = null

  @JvmField
  public var M21: Double? = null

  @JvmField
  public var M22: Double? = null

  @JvmField
  public var M23: Double? = null

  @JvmField
  public var M24: Double? = null

  @JvmField
  public var M31: Double? = null

  @JvmField
  public var M32: Double? = null

  @JvmField
  public var M33: Double? = null

  @JvmField
  public var M34: Double? = null

  @JvmField
  public var OffsetX: Double? = null

  @JvmField
  public var OffsetY: Double? = null

  @JvmField
  public var OffsetZ: Double? = null

  @JvmField
  public var M44: Double? = null

  public class ByReference : Matrix3D(), Structure.ByReference, IByReference<Matrix3D> {
    public override fun getValue(): Matrix3D = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : Matrix3D(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(Matrix3D::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
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
