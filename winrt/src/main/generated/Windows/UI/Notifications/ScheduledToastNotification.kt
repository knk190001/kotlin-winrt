package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
import Windows.UI.Notifications.IScheduledToastNotificationFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ScheduledToastNotification.ABI::class)
@Signature("rc(Windows.UI.Notifications.ScheduledToastNotification;{79f577f8-0de7-48cd-9740-9b370490c838})")
@WinRTByReference(brClass = ScheduledToastNotification.ByReference::class)
public class ScheduledToastNotification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScheduledToastNotification.WithDefault,
    IScheduledToastNotification2.WithDefault, IScheduledToastNotification3.WithDefault,
    IScheduledToastNotification4.WithDefault, IWinRTObject {
  private val __2039850997_Interface: IScheduledToastNotification.WithDefault by lazy {
    as_2039850997()
  }


  private val __1189128483_Interface: IScheduledToastNotification2.WithDefault by lazy {
    as_1189128483()
  }


  private val __1189128482_Interface: IScheduledToastNotification3.WithDefault by lazy {
    as_1189128482()
  }


  private val __1189128481_Interface: IScheduledToastNotification4.WithDefault by lazy {
    as_1189128481()
  }


  public override val __2039850997_Ptr: JNAPointer? by lazy {
    __2039850997_Interface.__2039850997_Ptr
  }


  public override val __1189128483_Ptr: JNAPointer? by lazy {
    __1189128483_Interface.__1189128483_Ptr
  }


  public override val __1189128482_Ptr: JNAPointer? by lazy {
    __1189128482_Interface.__1189128482_Ptr
  }


  public override val __1189128481_Ptr: JNAPointer? by lazy {
    __1189128481_Interface.__1189128481_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2039850997_Interface, __1189128483_Interface, __1189128482_Interface,
        __1189128481_Interface)

  public constructor(content: XmlDocument, deliveryTime: DateTime) : this(ABI.activate(content,
      deliveryTime))

  public constructor(
    content: XmlDocument,
    deliveryTime: DateTime,
    snoozeInterval: TimeSpan,
    maximumSnoozeCount: WinDef.UINT
  ) : this(ABI.activate(content, deliveryTime, snoozeInterval, maximumSnoozeCount))

  private fun as_2039850997(): IScheduledToastNotification.WithDefault {
    if(pointer == NULL) {
      return(IScheduledToastNotification.ABI.makeIScheduledToastNotification(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScheduledToastNotification>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotification.ABI.makeIScheduledToastNotification(ref.value))
  }

  private fun as_1189128483(): IScheduledToastNotification2.WithDefault {
    if(pointer == NULL) {
      return(IScheduledToastNotification2.ABI.makeIScheduledToastNotification2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScheduledToastNotification2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotification2.ABI.makeIScheduledToastNotification2(ref.value))
  }

  private fun as_1189128482(): IScheduledToastNotification3.WithDefault {
    if(pointer == NULL) {
      return(IScheduledToastNotification3.ABI.makeIScheduledToastNotification3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScheduledToastNotification3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotification3.ABI.makeIScheduledToastNotification3(ref.value))
  }

  private fun as_1189128481(): IScheduledToastNotification4.WithDefault {
    if(pointer == NULL) {
      return(IScheduledToastNotification4.ABI.makeIScheduledToastNotification4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScheduledToastNotification4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotification4.ABI.makeIScheduledToastNotification4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScheduledToastNotification> {
    public override fun getValue() = ScheduledToastNotification(pointer.getPointer(0))

    public fun setValue(value: ScheduledToastNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScheduledToastNotification, MemoryAddress> {
    public val IScheduledToastNotificationFactory_Instance: IScheduledToastNotificationFactory by
        lazy {
      createIScheduledToastNotificationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScheduledToastNotificationFactory(): IScheduledToastNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ScheduledToastNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScheduledToastNotificationFactory.ABI.makeIScheduledToastNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument, deliveryTime: DateTime): JNAPointer? =
        IScheduledToastNotificationFactory_Instance.CreateScheduledToastNotification(content,
        deliveryTime)?.pointer

    public fun activate(
      content: XmlDocument,
      deliveryTime: DateTime,
      snoozeInterval: TimeSpan,
      maximumSnoozeCount: WinDef.UINT
    ): JNAPointer? =
        IScheduledToastNotificationFactory_Instance.CreateScheduledToastNotificationRecurring(content,
        deliveryTime, snoozeInterval, maximumSnoozeCount)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScheduledToastNotification {
      val address = segment.toRawLongValue()
      return ScheduledToastNotification(Pointer(address))
    }

    public override fun toNative(obj: ScheduledToastNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
