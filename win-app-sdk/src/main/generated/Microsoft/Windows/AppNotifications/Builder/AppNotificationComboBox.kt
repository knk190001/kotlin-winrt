package Microsoft.Windows.AppNotifications.Builder

import Microsoft.Windows.AppNotifications.Builder.IAppNotificationComboBoxFactory.ABI.IID
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

@ABIMarker(AppNotificationComboBox.ABI::class)
@Signature("rc(Microsoft.Windows.AppNotifications.Builder.AppNotificationComboBox;{4547c9e2-4815-538c-be26-040ce17f8b62})")
@WinRTByReference(brClass = AppNotificationComboBox.ByReference::class)
public class AppNotificationComboBox(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppNotificationComboBox.WithDefault, IWinRTObject {
  private val __636631329_Interface: IAppNotificationComboBox.WithDefault by lazy {
    as_636631329()
  }


  public override val __636631329_Ptr: JNAPointer? by lazy {
    __636631329_Interface.__636631329_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__636631329_Interface)

  public constructor(id: String) : this(ABI.activate(id))

  private fun as_636631329(): IAppNotificationComboBox.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationComboBox.ABI.makeIAppNotificationComboBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationComboBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationComboBox.ABI.makeIAppNotificationComboBox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppNotificationComboBox> {
    public override fun getValue() = AppNotificationComboBox(pointer.getPointer(0))

    public fun setValue(value: AppNotificationComboBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppNotificationComboBox, MemoryAddress> {
    public val IAppNotificationComboBoxFactory_Instance: IAppNotificationComboBoxFactory by lazy {
      createIAppNotificationComboBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppNotificationComboBoxFactory(): IAppNotificationComboBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.Builder.AppNotificationComboBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppNotificationComboBoxFactory.ABI.makeIAppNotificationComboBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(id: String): JNAPointer? =
        IAppNotificationComboBoxFactory_Instance.CreateInstance(id)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppNotificationComboBox {
      val address = segment.toRawLongValue()
      return AppNotificationComboBox(Pointer(address))
    }

    public override fun toNative(obj: AppNotificationComboBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
