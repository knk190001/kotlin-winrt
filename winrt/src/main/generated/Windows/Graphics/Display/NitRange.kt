package Windows.Graphics.Display

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

@ABIMarker(NitRange.ABI::class)
@Signature("struct(Windows.Graphics.Display.NitRange;f4;f4;f4)")
@Structure.FieldOrder("MinNits, MaxNits, StepSizeNits")
@WinRTByReference(brClass = NitRange.ByReference::class)
public open class NitRange(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var MinNits: Float? = null

  @JvmField
  public var MaxNits: Float? = null

  @JvmField
  public var StepSizeNits: Float? = null

  public class ByReference : NitRange(), Structure.ByReference, IByReference<NitRange> {
    public override fun getValue(): NitRange = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : NitRange(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(NitRange::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
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
