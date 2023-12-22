package Microsoft.Windows.AppNotifications

import Microsoft.Windows.AppNotifications.IAppNotificationFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppNotification.ABI::class)
@Signature("rc(Microsoft.Windows.AppNotifications.AppNotification;{373a6917-4116-5657-936a-15f99afdd667})")
@WinRTByReference(brClass = AppNotification.ByReference::class)
public class AppNotification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppNotification.WithDefault, IWinRTObject {
  private val __569960491_Interface: IAppNotification.WithDefault by lazy {
    as_569960491()
  }


  public override val __569960491_Ptr: JNAPointer? by lazy {
    __569960491_Interface.__569960491_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__569960491_Interface)

  public constructor(payload: String) : this(ABI.activate(payload))

  private fun as_569960491(): IAppNotification.WithDefault {
    if(pointer == NULL) {
      return(IAppNotification.ABI.makeIAppNotification(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotification>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotification.ABI.makeIAppNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppNotification> {
    public override fun getValue() = AppNotification(pointer.getPointer(0))

    public fun setValue(value: AppNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppNotification, MemoryAddress> {
    public val IAppNotificationFactory_Instance: IAppNotificationFactory by lazy {
      createIAppNotificationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppNotificationFactory(): IAppNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.AppNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppNotificationFactory.ABI.makeIAppNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(payload: String): JNAPointer? =
        IAppNotificationFactory_Instance.CreateInstance(payload)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppNotification {
      val address = segment.toRawLongValue()
      return AppNotification(Pointer(address))
    }

    public override fun toNative(obj: AppNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
