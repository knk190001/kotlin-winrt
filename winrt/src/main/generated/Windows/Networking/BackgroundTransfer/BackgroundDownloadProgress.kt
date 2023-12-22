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
import java.lang.foreign.ValueLayout.JAVA_BOOLEAN
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.foreign.ValueLayout.JAVA_LONG
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Boolean
import kotlin.jvm.JvmField

@ABIMarker(BackgroundDownloadProgress.ABI::class)
@Signature("struct(Windows.Networking.BackgroundTransfer.BackgroundDownloadProgress;u8;u8;enum(Windows.Networking.BackgroundTransfer.BackgroundTransferStatus;i4);b1;b1)")
@Structure.FieldOrder("BytesReceived, TotalBytesToReceive, Status, HasResponseChanged, HasRestarted")
@WinRTByReference(brClass = BackgroundDownloadProgress.ByReference::class)
public open class BackgroundDownloadProgress(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var BytesReceived: WinDef.ULONG? = null

  @JvmField
  public var TotalBytesToReceive: WinDef.ULONG? = null

  @JvmField
  public var Status: BackgroundTransferStatus? = null

  @JvmField
  public var HasResponseChanged: Boolean? = null

  @JvmField
  public var HasRestarted: Boolean? = null

  public class ByReference : BackgroundDownloadProgress(), Structure.ByReference,
      IByReference<BackgroundDownloadProgress> {
    public override fun getValue(): BackgroundDownloadProgress = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : BackgroundDownloadProgress(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(BackgroundDownloadProgress::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_LONG, 
      JAVA_LONG, 
      JAVA_INT, 
      JAVA_BOOLEAN, 
      JAVA_BOOLEAN, 
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
