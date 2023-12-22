package Microsoft.Windows.AppNotifications

import Microsoft.Windows.AppNotifications.IAppNotificationProgressDataFactory.ABI.IID
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

@ABIMarker(AppNotificationProgressData.ABI::class)
@Signature("rc(Microsoft.Windows.AppNotifications.AppNotificationProgressData;{4debfac0-809d-55cb-b879-924821876b97})")
@WinRTByReference(brClass = AppNotificationProgressData.ByReference::class)
public class AppNotificationProgressData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppNotificationProgressData.WithDefault, IWinRTObject {
  private val __2024446956_Interface: IAppNotificationProgressData.WithDefault by lazy {
    as_2024446956()
  }


  public override val __2024446956_Ptr: JNAPointer? by lazy {
    __2024446956_Interface.__2024446956_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2024446956_Interface)

  public constructor(sequenceNumber: WinDef.UINT) : this(ABI.activate(sequenceNumber))

  private fun as_2024446956(): IAppNotificationProgressData.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationProgressData.ABI.makeIAppNotificationProgressData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationProgressData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationProgressData.ABI.makeIAppNotificationProgressData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppNotificationProgressData> {
    public override fun getValue() = AppNotificationProgressData(pointer.getPointer(0))

    public fun setValue(value: AppNotificationProgressData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppNotificationProgressData, MemoryAddress> {
    public val IAppNotificationProgressDataFactory_Instance: IAppNotificationProgressDataFactory by
        lazy {
      createIAppNotificationProgressDataFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppNotificationProgressDataFactory(): IAppNotificationProgressDataFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.AppNotificationProgressData".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppNotificationProgressDataFactory.ABI.makeIAppNotificationProgressDataFactory(factoryActivatorPtr.value))
    }

    public fun activate(sequenceNumber: WinDef.UINT): JNAPointer? =
        IAppNotificationProgressDataFactory_Instance.CreateInstance(sequenceNumber)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppNotificationProgressData {
      val address = segment.toRawLongValue()
      return AppNotificationProgressData(Pointer(address))
    }

    public override fun toNative(obj: AppNotificationProgressData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
