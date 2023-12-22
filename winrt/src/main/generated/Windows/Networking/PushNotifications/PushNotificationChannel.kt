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

@ABIMarker(PushNotificationChannel.ABI::class)
@Signature("rc(Windows.Networking.PushNotifications.PushNotificationChannel;{2b28102e-ef0b-4f39-9b8a-a3c194de7081})")
@WinRTByReference(brClass = PushNotificationChannel.ByReference::class)
public class PushNotificationChannel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPushNotificationChannel.WithDefault, IWinRTObject {
  private val __123604916_Interface: IPushNotificationChannel.WithDefault by lazy {
    as_123604916()
  }


  public override val __123604916_Ptr: JNAPointer? by lazy {
    __123604916_Interface.__123604916_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__123604916_Interface)

  private fun as_123604916(): IPushNotificationChannel.WithDefault {
    if(pointer == NULL) {
      return(IPushNotificationChannel.ABI.makeIPushNotificationChannel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPushNotificationChannel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPushNotificationChannel.ABI.makeIPushNotificationChannel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PushNotificationChannel> {
    public override fun getValue() = PushNotificationChannel(pointer.getPointer(0))

    public fun setValue(value: PushNotificationChannel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PushNotificationChannel, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PushNotificationChannel {
      val address = segment.toRawLongValue()
      return PushNotificationChannel(Pointer(address))
    }

    public override fun toNative(obj: PushNotificationChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
