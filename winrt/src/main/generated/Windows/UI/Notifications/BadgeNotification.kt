package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.UI.Notifications.IBadgeNotificationFactory.ABI.IID
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

@ABIMarker(BadgeNotification.ABI::class)
@Signature("rc(Windows.UI.Notifications.BadgeNotification;{075cb4ca-d08a-4e2f-9233-7e289c1f7722})")
@WinRTByReference(brClass = BadgeNotification.ByReference::class)
public class BadgeNotification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBadgeNotification.WithDefault, IWinRTObject {
  private val __285542978_Interface: IBadgeNotification.WithDefault by lazy {
    as_285542978()
  }


  public override val __285542978_Ptr: JNAPointer? by lazy {
    __285542978_Interface.__285542978_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__285542978_Interface)

  public constructor(content: XmlDocument) : this(ABI.activate(content))

  private fun as_285542978(): IBadgeNotification.WithDefault {
    if(pointer == NULL) {
      return(IBadgeNotification.ABI.makeIBadgeNotification(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBadgeNotification>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBadgeNotification.ABI.makeIBadgeNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BadgeNotification> {
    public override fun getValue() = BadgeNotification(pointer.getPointer(0))

    public fun setValue(value: BadgeNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BadgeNotification, MemoryAddress> {
    public val IBadgeNotificationFactory_Instance: IBadgeNotificationFactory by lazy {
      createIBadgeNotificationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBadgeNotificationFactory(): IBadgeNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.BadgeNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBadgeNotificationFactory.ABI.makeIBadgeNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument): JNAPointer? =
        IBadgeNotificationFactory_Instance.CreateBadgeNotification(content)?.pointer

    public override fun fromNative(segment: MemoryAddress): BadgeNotification {
      val address = segment.toRawLongValue()
      return BadgeNotification(Pointer(address))
    }

    public override fun toNative(obj: BadgeNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
