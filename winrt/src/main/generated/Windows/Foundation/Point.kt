package Windows.Foundation

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

@ABIMarker(Point.ABI::class)
@Signature("struct(Windows.Foundation.Point;f4;f4)")
@Structure.FieldOrder("X, Y")
@WinRTByReference(brClass = Point.ByReference::class)
public open class Point(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var X: Float? = null

  @JvmField
  public var Y: Float? = null

  public class ByReference : Point(), Structure.ByReference, IByReference<Point> {
    public override fun getValue(): Point = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : Point(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle = MethodHandles.lookup().findStatic(Point::class.java,
        "fromNative", MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
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
