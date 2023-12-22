package Windows.Devices.Display.Core

import Windows.Foundation.Numerics.Rational
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
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.jvm.JvmField

@ABIMarker(DisplayPresentationRate.ABI::class)
@Signature("struct(Windows.Devices.Display.Core.DisplayPresentationRate;struct(Windows.Foundation.Numerics.Rational;u4;u4);i4)")
@Structure.FieldOrder("VerticalSyncRate, VerticalSyncsPerPresentation")
@WinRTByReference(brClass = DisplayPresentationRate.ByReference::class)
public open class DisplayPresentationRate(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var VerticalSyncRate: Rational? = null

  @JvmField
  public var VerticalSyncsPerPresentation: Int? = null

  public class ByReference : DisplayPresentationRate(), Structure.ByReference,
      IByReference<DisplayPresentationRate> {
    public override fun getValue(): DisplayPresentationRate = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : DisplayPresentationRate(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(DisplayPresentationRate::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      Rational.ABI.layout, 
      JAVA_INT, 
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
