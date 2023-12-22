package Microsoft.UI.Xaml

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

@ABIMarker(CornerRadius.ABI::class)
@Signature("struct(Microsoft.UI.Xaml.CornerRadius;f8;f8;f8;f8)")
@Structure.FieldOrder("TopLeft, TopRight, BottomRight, BottomLeft")
@WinRTByReference(brClass = CornerRadius.ByReference::class)
public open class CornerRadius(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var TopLeft: Double? = null

  @JvmField
  public var TopRight: Double? = null

  @JvmField
  public var BottomRight: Double? = null

  @JvmField
  public var BottomLeft: Double? = null

  public class ByReference : CornerRadius(), Structure.ByReference, IByReference<CornerRadius> {
    public override fun getValue(): CornerRadius = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : CornerRadius(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(CornerRadius::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
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
