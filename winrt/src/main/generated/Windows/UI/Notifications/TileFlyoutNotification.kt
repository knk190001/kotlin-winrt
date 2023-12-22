package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.UI.Notifications.ITileFlyoutNotificationFactory.ABI.IID
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

@ABIMarker(TileFlyoutNotification.ABI::class)
@Signature("rc(Windows.UI.Notifications.TileFlyoutNotification;{9a53b261-c70c-42be-b2f3-f42aa97d34e5})")
@WinRTByReference(brClass = TileFlyoutNotification.ByReference::class)
public class TileFlyoutNotification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITileFlyoutNotification.WithDefault, IWinRTObject {
  private val __231979452_Interface: ITileFlyoutNotification.WithDefault by lazy {
    as_231979452()
  }


  public override val __231979452_Ptr: JNAPointer? by lazy {
    __231979452_Interface.__231979452_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__231979452_Interface)

  public constructor(content: XmlDocument) : this(ABI.activate(content))

  private fun as_231979452(): ITileFlyoutNotification.WithDefault {
    if(pointer == NULL) {
      return(ITileFlyoutNotification.ABI.makeITileFlyoutNotification(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITileFlyoutNotification>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileFlyoutNotification.ABI.makeITileFlyoutNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TileFlyoutNotification> {
    public override fun getValue() = TileFlyoutNotification(pointer.getPointer(0))

    public fun setValue(value: TileFlyoutNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TileFlyoutNotification, MemoryAddress> {
    public val ITileFlyoutNotificationFactory_Instance: ITileFlyoutNotificationFactory by lazy {
      createITileFlyoutNotificationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITileFlyoutNotificationFactory(): ITileFlyoutNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.TileFlyoutNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITileFlyoutNotificationFactory.ABI.makeITileFlyoutNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument): JNAPointer? =
        ITileFlyoutNotificationFactory_Instance.CreateTileFlyoutNotification(content)?.pointer

    public override fun fromNative(segment: MemoryAddress): TileFlyoutNotification {
      val address = segment.toRawLongValue()
      return TileFlyoutNotification(Pointer(address))
    }

    public override fun toNative(obj: TileFlyoutNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
