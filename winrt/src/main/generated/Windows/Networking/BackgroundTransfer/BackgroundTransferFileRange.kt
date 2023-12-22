package Windows.Networking.BackgroundTransfer

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
import java.lang.foreign.ValueLayout.JAVA_LONG
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.jvm.JvmField

@ABIMarker(BackgroundTransferFileRange.ABI::class)
@Signature("struct(Windows.Networking.BackgroundTransfer.BackgroundTransferFileRange;u8;u8)")
@Structure.FieldOrder("Offset, Length")
@WinRTByReference(brClass = BackgroundTransferFileRange.ByReference::class)
public open class BackgroundTransferFileRange(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Offset: WinDef.ULONG? = null

  @JvmField
  public var Length: WinDef.ULONG? = null

  public class ByReference : BackgroundTransferFileRange(), Structure.ByReference,
      IByReference<BackgroundTransferFileRange> {
    public override fun getValue(): BackgroundTransferFileRange = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : BackgroundTransferFileRange(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(BackgroundTransferFileRange::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_LONG, 
      JAVA_LONG, 
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
