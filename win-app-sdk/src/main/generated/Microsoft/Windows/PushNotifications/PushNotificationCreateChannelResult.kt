package Microsoft.Windows.PushNotifications

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PushNotificationCreateChannelResult.ABI::class)
@Signature("rc(Microsoft.Windows.PushNotifications.PushNotificationCreateChannelResult;{4df3717f-5d33-56e9-b381-1b350c95722e})")
@WinRTByReference(brClass = PushNotificationCreateChannelResult.ByReference::class)
public class PushNotificationCreateChannelResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPushNotificationCreateChannelResult.WithDefault, IWinRTObject {
  private val __789664601_Interface: IPushNotificationCreateChannelResult.WithDefault by lazy {
    as_789664601()
  }


  public override val __789664601_Ptr: JNAPointer? by lazy {
    __789664601_Interface.__789664601_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__789664601_Interface)

  private fun as_789664601(): IPushNotificationCreateChannelResult.WithDefault {
    if(pointer == NULL) {
      return(IPushNotificationCreateChannelResult.ABI.makeIPushNotificationCreateChannelResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPushNotificationCreateChannelResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPushNotificationCreateChannelResult.ABI.makeIPushNotificationCreateChannelResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PushNotificationCreateChannelResult> {
    public override fun getValue() = PushNotificationCreateChannelResult(pointer.getPointer(0))

    public fun setValue(value: PushNotificationCreateChannelResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PushNotificationCreateChannelResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PushNotificationCreateChannelResult {
      val address = segment.toRawLongValue()
      return PushNotificationCreateChannelResult(Pointer(address))
    }

    public override fun toNative(obj: PushNotificationCreateChannelResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
