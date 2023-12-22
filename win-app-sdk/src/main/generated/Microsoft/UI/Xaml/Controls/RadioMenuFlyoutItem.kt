package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IRadioMenuFlyoutItemFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RadioMenuFlyoutItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RadioMenuFlyoutItem;{9d6f45f5-5532-5669-8f02-05735953026a})")
@WinRTByReference(brClass = RadioMenuFlyoutItem.ByReference::class)
public open class RadioMenuFlyoutItem(
  ptr: JNAPointer? = NULL
) : MenuFlyoutItem(ptr), IRadioMenuFlyoutItem.WithDefault, IWinRTObject {
  private val __1206709793_Interface: IRadioMenuFlyoutItem.WithDefault by lazy {
    as_1206709793()
  }


  public override val __1206709793_Ptr: JNAPointer? by lazy {
    __1206709793_Interface.__1206709793_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1206709793_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1206709793(): IRadioMenuFlyoutItem.WithDefault {
    if(pointer == NULL) {
      return(IRadioMenuFlyoutItem.ABI.makeIRadioMenuFlyoutItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadioMenuFlyoutItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadioMenuFlyoutItem.ABI.makeIRadioMenuFlyoutItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadioMenuFlyoutItem> {
    public override fun getValue() = RadioMenuFlyoutItem(pointer.getPointer(0))

    public fun setValue(value: RadioMenuFlyoutItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadioMenuFlyoutItem, MemoryAddress> {
    public val IRadioMenuFlyoutItemStatics2_Instance: IRadioMenuFlyoutItemStatics2 by lazy {
      createIRadioMenuFlyoutItemStatics2()
    }


    public val IRadioMenuFlyoutItemStatics_Instance: IRadioMenuFlyoutItemStatics by lazy {
      createIRadioMenuFlyoutItemStatics()
    }


    public val IRadioMenuFlyoutItemFactory_Instance: IRadioMenuFlyoutItemFactory by lazy {
      createIRadioMenuFlyoutItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadioMenuFlyoutItemStatics2(): IRadioMenuFlyoutItemStatics2 {
      val refiid = Guid.REFIID(IRadioMenuFlyoutItemStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RadioMenuFlyoutItem".toHandle(),refiid,interfacePtr)
      val result =
          IRadioMenuFlyoutItemStatics2.ABI.makeIRadioMenuFlyoutItemStatics2(interfacePtr.value)
      return result
    }

    public fun createIRadioMenuFlyoutItemStatics(): IRadioMenuFlyoutItemStatics {
      val refiid = Guid.REFIID(IRadioMenuFlyoutItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RadioMenuFlyoutItem".toHandle(),refiid,interfacePtr)
      val result =
          IRadioMenuFlyoutItemStatics.ABI.makeIRadioMenuFlyoutItemStatics(interfacePtr.value)
      return result
    }

    public fun createIRadioMenuFlyoutItemFactory(): IRadioMenuFlyoutItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RadioMenuFlyoutItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRadioMenuFlyoutItemFactory.ABI.makeIRadioMenuFlyoutItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRadioMenuFlyoutItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RadioMenuFlyoutItem {
      val address = segment.toRawLongValue()
      return RadioMenuFlyoutItem(Pointer(address))
    }

    public override fun toNative(obj: RadioMenuFlyoutItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AreCheckStatesEnabledProperty() =
        ABI.IRadioMenuFlyoutItemStatics2_Instance.get_AreCheckStatesEnabledProperty()

    public fun SetAreCheckStatesEnabled(`object`: MenuFlyoutSubItem, value: Boolean) =
        ABI.IRadioMenuFlyoutItemStatics2_Instance.SetAreCheckStatesEnabled(`object`, value)

    public fun GetAreCheckStatesEnabled(`object`: MenuFlyoutSubItem) =
        ABI.IRadioMenuFlyoutItemStatics2_Instance.GetAreCheckStatesEnabled(`object`)

    public fun get_IsCheckedProperty() =
        ABI.IRadioMenuFlyoutItemStatics_Instance.get_IsCheckedProperty()

    public fun get_GroupNameProperty() =
        ABI.IRadioMenuFlyoutItemStatics_Instance.get_GroupNameProperty()
  }
}
