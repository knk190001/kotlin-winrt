package Windows.UI.Xaml.Media.Animation

import Windows.Foundation.TimeSpan
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
import java.lang.foreign.ValueLayout.JAVA_DOUBLE
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Double
import kotlin.jvm.JvmField

@ABIMarker(RepeatBehavior.ABI::class)
@Signature("struct(Windows.UI.Xaml.Media.Animation.RepeatBehavior;f8;struct(Windows.Foundation.TimeSpan;i8);enum(Windows.UI.Xaml.Media.Animation.RepeatBehaviorType;i4))")
@Structure.FieldOrder("Count, Duration, Type")
@WinRTByReference(brClass = RepeatBehavior.ByReference::class)
public open class RepeatBehavior(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Count: Double? = null

  @JvmField
  public var Duration: TimeSpan? = null

  @JvmField
  public var Type: RepeatBehaviorType? = null

  public class ByReference : RepeatBehavior(), Structure.ByReference, IByReference<RepeatBehavior> {
    public override fun getValue(): RepeatBehavior = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : RepeatBehavior(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(RepeatBehavior::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_DOUBLE, 
      TimeSpan.ABI.layout, 
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
