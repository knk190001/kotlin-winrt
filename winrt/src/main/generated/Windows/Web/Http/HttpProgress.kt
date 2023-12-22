package Windows.Web.Http

import Windows.Foundation.IReference
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
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.foreign.ValueLayout.JAVA_LONG
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.jvm.JvmField

@ABIMarker(HttpProgress.ABI::class)
@Signature("struct(Windows.Web.Http.HttpProgress;enum(Windows.Web.Http.HttpProgressStage;i4);u8;pinterface({61c17706-2d65-11e0-9ae8-d48564015472};u8);u8;pinterface({61c17706-2d65-11e0-9ae8-d48564015472};u8);u4)")
@Structure.FieldOrder("Stage, BytesSent, TotalBytesToSend, BytesReceived, TotalBytesToReceive, Retries")
@WinRTByReference(brClass = HttpProgress.ByReference::class)
public open class HttpProgress(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Stage: HttpProgressStage? = null

  @JvmField
  public var BytesSent: WinDef.ULONG? = null

  @JvmField
  public var TotalBytesToSend: IReference<WinDef.ULONG>? = null

  @JvmField
  public var BytesReceived: WinDef.ULONG? = null

  @JvmField
  public var TotalBytesToReceive: IReference<WinDef.ULONG>? = null

  @JvmField
  public var Retries: WinDef.UINT? = null

  public class ByReference : HttpProgress(), Structure.ByReference, IByReference<HttpProgress> {
    public override fun getValue(): HttpProgress = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : HttpProgress(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(HttpProgress::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
      JAVA_LONG, 
      ADDRESS, 
      JAVA_LONG, 
      ADDRESS, 
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
