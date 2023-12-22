package Windows.Devices.Sms

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
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.jvm.JvmField

@ABIMarker(SmsEncodedLength.ABI::class)
@Signature("struct(Windows.Devices.Sms.SmsEncodedLength;u4;u4;u4;u4;u4)")
@Structure.FieldOrder("SegmentCount, CharacterCountLastSegment, CharactersPerSegment, ByteCountLastSegment, BytesPerSegment")
@WinRTByReference(brClass = SmsEncodedLength.ByReference::class)
public open class SmsEncodedLength(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var SegmentCount: WinDef.UINT? = null

  @JvmField
  public var CharacterCountLastSegment: WinDef.UINT? = null

  @JvmField
  public var CharactersPerSegment: WinDef.UINT? = null

  @JvmField
  public var ByteCountLastSegment: WinDef.UINT? = null

  @JvmField
  public var BytesPerSegment: WinDef.UINT? = null

  public class ByReference : SmsEncodedLength(), Structure.ByReference,
      IByReference<SmsEncodedLength> {
    public override fun getValue(): SmsEncodedLength = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : SmsEncodedLength(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(SmsEncodedLength::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
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
