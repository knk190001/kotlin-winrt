package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
import Windows.UI.Notifications.IScheduledTileNotificationFactory.ABI.IID
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

@ABIMarker(ScheduledTileNotification.ABI::class)
@Signature("rc(Windows.UI.Notifications.ScheduledTileNotification;{0abca6d5-99dc-4c78-a11c-c9e7f86d7ef7})")
@WinRTByReference(brClass = ScheduledTileNotification.ByReference::class)
public class ScheduledTileNotification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScheduledTileNotification.WithDefault, IWinRTObject {
  private val __1098247958_Interface: IScheduledTileNotification.WithDefault by lazy {
    as_1098247958()
  }


  public override val __1098247958_Ptr: JNAPointer? by lazy {
    __1098247958_Interface.__1098247958_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1098247958_Interface)

  public constructor(content: XmlDocument, deliveryTime: DateTime) : this(ABI.activate(content,
      deliveryTime))

  private fun as_1098247958(): IScheduledTileNotification.WithDefault {
    if(pointer == NULL) {
      return(IScheduledTileNotification.ABI.makeIScheduledTileNotification(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScheduledTileNotification>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledTileNotification.ABI.makeIScheduledTileNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScheduledTileNotification> {
    public override fun getValue() = ScheduledTileNotification(pointer.getPointer(0))

    public fun setValue(value: ScheduledTileNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScheduledTileNotification, MemoryAddress> {
    public val IScheduledTileNotificationFactory_Instance: IScheduledTileNotificationFactory by
        lazy {
      createIScheduledTileNotificationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScheduledTileNotificationFactory(): IScheduledTileNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ScheduledTileNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScheduledTileNotificationFactory.ABI.makeIScheduledTileNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument, deliveryTime: DateTime): JNAPointer? =
        IScheduledTileNotificationFactory_Instance.CreateScheduledTileNotification(content,
        deliveryTime)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScheduledTileNotification {
      val address = segment.toRawLongValue()
      return ScheduledTileNotification(Pointer(address))
    }

    public override fun toNative(obj: ScheduledTileNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
