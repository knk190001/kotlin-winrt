package Windows.UI.Input.Preview.Injection

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
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.jvm.JvmField

@ABIMarker(InjectedInputRectangle.ABI::class)
@Signature("struct(Windows.UI.Input.Preview.Injection.InjectedInputRectangle;i4;i4;i4;i4)")
@Structure.FieldOrder("Left, Top, Bottom, Right")
@WinRTByReference(brClass = InjectedInputRectangle.ByReference::class)
public open class InjectedInputRectangle(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Left: Int? = null

  @JvmField
  public var Top: Int? = null

  @JvmField
  public var Bottom: Int? = null

  @JvmField
  public var Right: Int? = null

  public class ByReference : InjectedInputRectangle(), Structure.ByReference,
      IByReference<InjectedInputRectangle> {
    public override fun getValue(): InjectedInputRectangle = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : InjectedInputRectangle(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(InjectedInputRectangle::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
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
