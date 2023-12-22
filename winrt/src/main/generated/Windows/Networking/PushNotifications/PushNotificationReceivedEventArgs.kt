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

@ABIMarker(PushNotificationReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs;{d1065e0c-36cd-484c-b935-0a99b753cf00})")
@WinRTByReference(brClass = PushNotificationReceivedEventArgs.ByReference::class)
public class PushNotificationReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPushNotificationReceivedEventArgs.WithDefault, IWinRTObject {
  private val __2025634009_Interface: IPushNotificationReceivedEventArgs.WithDefault by lazy {
    as_2025634009()
  }


  public override val __2025634009_Ptr: JNAPointer? by lazy {
    __2025634009_Interface.__2025634009_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2025634009_Interface)

  private fun as_2025634009(): IPushNotificationReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPushNotificationReceivedEventArgs.ABI.makeIPushNotificationReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPushNotificationReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPushNotificationReceivedEventArgs.ABI.makeIPushNotificationReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PushNotificationReceivedEventArgs> {
    public override fun getValue() = PushNotificationReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PushNotificationReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PushNotificationReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PushNotificationReceivedEventArgs {
      val address = segment.toRawLongValue()
      return PushNotificationReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PushNotificationReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
