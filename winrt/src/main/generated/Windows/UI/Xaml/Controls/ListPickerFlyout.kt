package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.PickerFlyoutBase
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ListPickerFlyout.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ListPickerFlyout;{0f0cb9d7-e5f3-45e6-9063-ff7bbb193c47})")
@WinRTByReference(brClass = ListPickerFlyout.ByReference::class)
public class ListPickerFlyout(
  ptr: JNAPointer? = NULL
) : PickerFlyoutBase(ptr), IListPickerFlyout.WithDefault, IWinRTObject {
  private val __347105283_Interface: IListPickerFlyout.WithDefault by lazy {
    as_347105283()
  }


  public override val __347105283_Ptr: JNAPointer? by lazy {
    __347105283_Interface.__347105283_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__347105283_Interface)

  public constructor() : this(ABI.activate())

  private fun as_347105283(): IListPickerFlyout.WithDefault {
    if(pointer == NULL) {
      return(IListPickerFlyout.ABI.makeIListPickerFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListPickerFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListPickerFlyout.ABI.makeIListPickerFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListPickerFlyout> {
    public override fun getValue() = ListPickerFlyout(pointer.getPointer(0))

    public fun setValue(value: ListPickerFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListPickerFlyout, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IListPickerFlyoutStatics_Instance: IListPickerFlyoutStatics by lazy {
      createIListPickerFlyoutStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListPickerFlyout".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIListPickerFlyoutStatics(): IListPickerFlyoutStatics {
      val refiid = Guid.REFIID(IListPickerFlyoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListPickerFlyout".toHandle(),refiid,interfacePtr)
      val result = IListPickerFlyoutStatics.ABI.makeIListPickerFlyoutStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ListPickerFlyout {
      val address = segment.toRawLongValue()
      return ListPickerFlyout(Pointer(address))
    }

    public override fun toNative(obj: ListPickerFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemsSourceProperty() =
        ABI.IListPickerFlyoutStatics_Instance.get_ItemsSourceProperty()

    public fun get_ItemTemplateProperty() =
        ABI.IListPickerFlyoutStatics_Instance.get_ItemTemplateProperty()

    public fun get_DisplayMemberPathProperty() =
        ABI.IListPickerFlyoutStatics_Instance.get_DisplayMemberPathProperty()

    public fun get_SelectionModeProperty() =
        ABI.IListPickerFlyoutStatics_Instance.get_SelectionModeProperty()

    public fun get_SelectedIndexProperty() =
        ABI.IListPickerFlyoutStatics_Instance.get_SelectedIndexProperty()

    public fun get_SelectedItemProperty() =
        ABI.IListPickerFlyoutStatics_Instance.get_SelectedItemProperty()

    public fun get_SelectedValueProperty() =
        ABI.IListPickerFlyoutStatics_Instance.get_SelectedValueProperty()

    public fun get_SelectedValuePathProperty() =
        ABI.IListPickerFlyoutStatics_Instance.get_SelectedValuePathProperty()
  }
}
