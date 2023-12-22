package Microsoft.Windows.PushNotifications

import Windows.Foundation.HResult
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

@ABIMarker(PushNotificationCreateChannelStatus.ABI::class)
@Signature("struct(Microsoft.Windows.PushNotifications.PushNotificationCreateChannelStatus;enum(Microsoft.Windows.PushNotifications.PushNotificationChannelStatus;i4);struct(Windows.Foundation.HResult;i4);u4)")
@Structure.FieldOrder("status, extendedError, retryCount")
@WinRTByReference(brClass = PushNotificationCreateChannelStatus.ByReference::class)
public open class PushNotificationCreateChannelStatus(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var status: PushNotificationChannelStatus? = null

  @JvmField
  public var extendedError: HResult? = null

  @JvmField
  public var retryCount: WinDef.UINT? = null

  public class ByReference : PushNotificationCreateChannelStatus(), Structure.ByReference,
      IByReference<PushNotificationCreateChannelStatus> {
    public override fun getValue(): PushNotificationCreateChannelStatus = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : PushNotificationCreateChannelStatus(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(PushNotificationCreateChannelStatus::class.java,
        "fromNative", MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
      HResult.ABI.layout, 
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
