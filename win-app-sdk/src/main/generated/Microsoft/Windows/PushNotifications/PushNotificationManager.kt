package Microsoft.Windows.PushNotifications

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(PushNotificationManager.ABI::class)
@Signature("rc(Microsoft.Windows.PushNotifications.PushNotificationManager;{902f4aba-ff63-5dfe-a88f-15cc6bed55ff})")
@WinRTByReference(brClass = PushNotificationManager.ByReference::class)
public class PushNotificationManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPushNotificationManager.WithDefault, IWinRTObject {
  private val __246923042_Interface: IPushNotificationManager.WithDefault by lazy {
    as_246923042()
  }


  public override val __246923042_Ptr: JNAPointer? by lazy {
    __246923042_Interface.__246923042_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__246923042_Interface)

  private fun as_246923042(): IPushNotificationManager.WithDefault {
    if(pointer == NULL) {
      return(IPushNotificationManager.ABI.makeIPushNotificationManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPushNotificationManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPushNotificationManager.ABI.makeIPushNotificationManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PushNotificationManager> {
    public override fun getValue() = PushNotificationManager(pointer.getPointer(0))

    public fun setValue(value: PushNotificationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PushNotificationManager, MemoryAddress> {
    public val IPushNotificationManagerStatics_Instance: IPushNotificationManagerStatics by lazy {
      createIPushNotificationManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPushNotificationManagerStatics(): IPushNotificationManagerStatics {
      val refiid = Guid.REFIID(IPushNotificationManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.PushNotifications.PushNotificationManager".toHandle(),refiid,interfacePtr)
      val result =
          IPushNotificationManagerStatics.ABI.makeIPushNotificationManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PushNotificationManager {
      val address = segment.toRawLongValue()
      return PushNotificationManager(Pointer(address))
    }

    public override fun toNative(obj: PushNotificationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.IPushNotificationManagerStatics_Instance.IsSupported()

    public fun get_Default() = ABI.IPushNotificationManagerStatics_Instance.get_Default()
  }
}
