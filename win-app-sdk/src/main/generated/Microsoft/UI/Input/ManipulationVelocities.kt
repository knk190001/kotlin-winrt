package Microsoft.UI.Input

import Windows.Foundation.Point
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

@ABIMarker(ManipulationVelocities.ABI::class)
@Signature("struct(Microsoft.UI.Input.ManipulationVelocities;struct(Windows.Foundation.Point;f4;f4);f4;f4)")
@Structure.FieldOrder("Linear, Angular, Expansion")
@WinRTByReference(brClass = ManipulationVelocities.ByReference::class)
public open class ManipulationVelocities(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Linear: Point? = null

  @JvmField
  public var Angular: Float? = null

  @JvmField
  public var Expansion: Float? = null

  public class ByReference : ManipulationVelocities(), Structure.ByReference,
      IByReference<ManipulationVelocities> {
    public override fun getValue(): ManipulationVelocities = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : ManipulationVelocities(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(ManipulationVelocities::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      Point.ABI.layout, 
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
