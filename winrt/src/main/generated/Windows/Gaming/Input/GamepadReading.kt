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

@ABIMarker(GamepadReading.ABI::class)
@Signature("struct(Windows.Gaming.Input.GamepadReading;u8;enum(Windows.Gaming.Input.GamepadButtons;u4);f8;f8;f8;f8;f8;f8)")
@Structure.FieldOrder("Timestamp, Buttons, LeftTrigger, RightTrigger, LeftThumbstickX, LeftThumbstickY, RightThumbstickX, RightThumbstickY")
@WinRTByReference(brClass = GamepadReading.ByReference::class)
public open class GamepadReading(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Timestamp: WinDef.ULONG? = null

  @JvmField
  public var Buttons: GamepadButtons? = null

  @JvmField
  public var LeftTrigger: Double? = null

  @JvmField
  public var RightTrigger: Double? = null

  @JvmField
  public var LeftThumbstickX: Double? = null

  @JvmField
  public var LeftThumbstickY: Double? = null

  @JvmField
  public var RightThumbstickX: Double? = null

  @JvmField
  public var RightThumbstickY: Double? = null

  public class ByReference : GamepadReading(), Structure.ByReference, IByReference<GamepadReading> {
    public override fun getValue(): GamepadReading = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : GamepadReading(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(GamepadReading::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_LONG, 
      JAVA_INT, 
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
