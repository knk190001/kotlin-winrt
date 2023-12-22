package Windows.Gaming.Input.Custom

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
import java.lang.foreign.ValueLayout.JAVA_SHORT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.jvm.JvmField

@ABIMarker(GameControllerVersionInfo.ABI::class)
@Signature("struct(Windows.Gaming.Input.Custom.GameControllerVersionInfo;u2;u2;u2;u2)")
@Structure.FieldOrder("Major, Minor, Build, Revision")
@WinRTByReference(brClass = GameControllerVersionInfo.ByReference::class)
public open class GameControllerVersionInfo(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Major: WinDef.USHORT? = null

  @JvmField
  public var Minor: WinDef.USHORT? = null

  @JvmField
  public var Build: WinDef.USHORT? = null

  @JvmField
  public var Revision: WinDef.USHORT? = null

  public class ByReference : GameControllerVersionInfo(), Structure.ByReference,
      IByReference<GameControllerVersionInfo> {
    public override fun getValue(): GameControllerVersionInfo = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : GameControllerVersionInfo(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(GameControllerVersionInfo::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_SHORT, 
      JAVA_SHORT, 
      JAVA_SHORT, 
      JAVA_SHORT, 
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
