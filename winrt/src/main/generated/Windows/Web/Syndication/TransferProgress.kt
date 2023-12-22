package Windows.Web.Syndication

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

@ABIMarker(TransferProgress.ABI::class)
@Signature("struct(Windows.Web.Syndication.TransferProgress;u4;u4;u4;u4)")
@Structure.FieldOrder("BytesSent, TotalBytesToSend, BytesRetrieved, TotalBytesToRetrieve")
@WinRTByReference(brClass = TransferProgress.ByReference::class)
public open class TransferProgress(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var BytesSent: WinDef.UINT? = null

  @JvmField
  public var TotalBytesToSend: WinDef.UINT? = null

  @JvmField
  public var BytesRetrieved: WinDef.UINT? = null

  @JvmField
  public var TotalBytesToRetrieve: WinDef.UINT? = null

  public class ByReference : TransferProgress(), Structure.ByReference,
      IByReference<TransferProgress> {
    public override fun getValue(): TransferProgress = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : TransferProgress(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(TransferProgress::class.java, "fromNative",
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
