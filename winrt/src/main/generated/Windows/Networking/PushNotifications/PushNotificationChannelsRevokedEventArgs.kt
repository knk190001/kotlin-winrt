package Windows.Networking.PushNotifications

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

@ABIMarker(PushNotificationChannelsRevokedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.PushNotifications.PushNotificationChannelsRevokedEventArgs;{20e1a24c-1a34-5beb-aae2-40c232c8c140})")
@WinRTByReference(brClass = PushNotificationChannelsRevokedEventArgs.ByReference::class)
public class PushNotificationChannelsRevokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPushNotificationChannelsRevokedEventArgs.WithDefault, IWinRTObject {
  private val __162785544_Interface: IPushNotificationChannelsRevokedEventArgs.WithDefault by lazy {
    as_162785544()
  }


  public override val __162785544_Ptr: JNAPointer? by lazy {
    __162785544_Interface.__162785544_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__162785544_Interface)

  private fun as_162785544(): IPushNotificationChannelsRevokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPushNotificationChannelsRevokedEventArgs.ABI.makeIPushNotificationChannelsRevokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPushNotificationChannelsRevokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPushNotificationChannelsRevokedEventArgs.ABI.makeIPushNotificationChannelsRevokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PushNotificationChannelsRevokedEventArgs> {
    public override fun getValue() = PushNotificationChannelsRevokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PushNotificationChannelsRevokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PushNotificationChannelsRevokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PushNotificationChannelsRevokedEventArgs {
      val address = segment.toRawLongValue()
      return PushNotificationChannelsRevokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PushNotificationChannelsRevokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
