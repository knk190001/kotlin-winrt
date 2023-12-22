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
import kotlin.jvm.JvmField

@ABIMarker(FlightStickReading.ABI::class)
@Signature("struct(Windows.Gaming.Input.FlightStickReading;u8;enum(Windows.Gaming.Input.FlightStickButtons;u4);enum(Windows.Gaming.Input.GameControllerSwitchPosition;i4);f8;f8;f8;f8)")
@Structure.FieldOrder("Timestamp, Buttons, HatSwitch, Roll, Pitch, Yaw, Throttle")
@WinRTByReference(brClass = FlightStickReading.ByReference::class)
public open class FlightStickReading(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Timestamp: WinDef.ULONG? = null

  @JvmField
  public var Buttons: FlightStickButtons? = null

  @JvmField
  public var HatSwitch: GameControllerSwitchPosition? = null

  @JvmField
  public var Roll: Double? = null

  @JvmField
  public var Pitch: Double? = null

  @JvmField
  public var Yaw: Double? = null

  @JvmField
  public var Throttle: Double? = null

  public class ByReference : FlightStickReading(), Structure.ByReference,
      IByReference<FlightStickReading> {
    public override fun getValue(): FlightStickReading = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : FlightStickReading(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(FlightStickReading::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_LONG, 
      JAVA_INT, 
      JAVA_INT, 
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
