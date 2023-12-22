package Windows.Graphics.Display.Core

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

@ABIMarker(HdmiDisplayHdr2086Metadata.ABI::class)
@Signature("struct(Windows.Graphics.Display.Core.HdmiDisplayHdr2086Metadata;u2;u2;u2;u2;u2;u2;u2;u2;u2;u2;u2;u2)")
@Structure.FieldOrder("RedPrimaryX, RedPrimaryY, GreenPrimaryX, GreenPrimaryY, BluePrimaryX, BluePrimaryY, WhitePointX, WhitePointY, MaxMasteringLuminance, MinMasteringLuminance, MaxContentLightLevel, MaxFrameAverageLightLevel")
@WinRTByReference(brClass = HdmiDisplayHdr2086Metadata.ByReference::class)
public open class HdmiDisplayHdr2086Metadata(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var RedPrimaryX: WinDef.USHORT? = null

  @JvmField
  public var RedPrimaryY: WinDef.USHORT? = null

  @JvmField
  public var GreenPrimaryX: WinDef.USHORT? = null

  @JvmField
  public var GreenPrimaryY: WinDef.USHORT? = null

  @JvmField
  public var BluePrimaryX: WinDef.USHORT? = null

  @JvmField
  public var BluePrimaryY: WinDef.USHORT? = null

  @JvmField
  public var WhitePointX: WinDef.USHORT? = null

  @JvmField
  public var WhitePointY: WinDef.USHORT? = null

  @JvmField
  public var MaxMasteringLuminance: WinDef.USHORT? = null

  @JvmField
  public var MinMasteringLuminance: WinDef.USHORT? = null

  @JvmField
  public var MaxContentLightLevel: WinDef.USHORT? = null

  @JvmField
  public var MaxFrameAverageLightLevel: WinDef.USHORT? = null

  public class ByReference : HdmiDisplayHdr2086Metadata(), Structure.ByReference,
      IByReference<HdmiDisplayHdr2086Metadata> {
    public override fun getValue(): HdmiDisplayHdr2086Metadata = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : HdmiDisplayHdr2086Metadata(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(HdmiDisplayHdr2086Metadata::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_SHORT, 
      JAVA_SHORT, 
      JAVA_SHORT, 
      JAVA_SHORT, 
      JAVA_SHORT, 
      JAVA_SHORT, 
      JAVA_SHORT, 
      JAVA_SHORT, 
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
