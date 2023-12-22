package Windows.Gaming.Input

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.platform.win32.WinDef
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_DOUBLE
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.foreign.ValueLayout.JAVA_LONG
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Double
import kotlin.Int
import kotlin.jvm.JvmField

@ABIMarker(RacingWheelReading.ABI::class)
@Signature("struct(Windows.Gaming.Input.RacingWheelReading;u8;enum(Windows.Gaming.Input.RacingWheelButtons;u4);i4;f8;f8;f8;f8;f8)")
@Structure.FieldOrder("Timestamp, Buttons, PatternShifterGear, Wheel, Throttle, Brake, Clutch, Handbrake")
@WinRTByReference(brClass = RacingWheelReading.ByReference::class)
public open class RacingWheelReading(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Timestamp: WinDef.ULONG? = null

  @JvmField
  public var Buttons: RacingWheelButtons? = null

  @JvmField
  public var PatternShifterGear: Int? = null

  @JvmField
  public var Wheel: Double? = null

  @JvmField
  public var Throttle: Double? = null

  @JvmField
  public var Brake: Double? = null

  @JvmField
  public var Clutch: Double? = null

  @JvmField
  public var Handbrake: Double? = null

  public class ByReference : RacingWheelReading(), Structure.ByReference,
      IByReference<RacingWheelReading> {
    public override fun getValue(): RacingWheelReading = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : RacingWheelReading(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(RacingWheelReading::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_LONG, 
      JAVA_INT, 
      JAVA_INT, 
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
