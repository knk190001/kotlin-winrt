package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.UI.Notifications.ITileNotificationFactory.ABI.IID
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

@ABIMarker(TileNotification.ABI::class)
@Signature("rc(Windows.UI.Notifications.TileNotification;{ebaec8fa-50ec-4c18-b4d0-3af02e5540ab})")
@WinRTByReference(brClass = TileNotification.ByReference::class)
public class TileNotification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITileNotification.WithDefault, IWinRTObject {
  private val __152023255_Interface: ITileNotification.WithDefault by lazy {
    as_152023255()
  }


  public override val __152023255_Ptr: JNAPointer? by lazy {
    __152023255_Interface.__152023255_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__152023255_Interface)

  public constructor(content: XmlDocument) : this(ABI.activate(content))

  private fun as_152023255(): ITileNotification.WithDefault {
    if(pointer == NULL) {
      return(ITileNotification.ABI.makeITileNotification(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITileNotification>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileNotification.ABI.makeITileNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TileNotification> {
    public override fun getValue() = TileNotification(pointer.getPointer(0))

    public fun setValue(value: TileNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TileNotification, MemoryAddress> {
    public val ITileNotificationFactory_Instance: ITileNotificationFactory by lazy {
      createITileNotificationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITileNotificationFactory(): ITileNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.TileNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITileNotificationFactory.ABI.makeITileNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument): JNAPointer? =
        ITileNotificationFactory_Instance.CreateTileNotification(content)?.pointer

    public override fun fromNative(segment: MemoryAddress): TileNotification {
      val address = segment.toRawLongValue()
      return TileNotification(Pointer(address))
    }

    public override fun toNative(obj: TileNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
