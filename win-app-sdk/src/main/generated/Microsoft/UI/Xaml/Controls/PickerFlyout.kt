package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.PickerFlyoutBase
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

@ABIMarker(PickerFlyout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PickerFlyout;{f73f69a0-92d3-5144-8459-a7a05a53bcd2})")
@WinRTByReference(brClass = PickerFlyout.ByReference::class)
public class PickerFlyout(
  ptr: JNAPointer? = NULL
) : PickerFlyoutBase(ptr), IPickerFlyout.WithDefault, IWinRTObject {
  private val __1588062352_Interface: IPickerFlyout.WithDefault by lazy {
    as_1588062352()
  }


  public override val __1588062352_Ptr: JNAPointer? by lazy {
    __1588062352_Interface.__1588062352_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1588062352_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1588062352(): IPickerFlyout.WithDefault {
    if(pointer == NULL) {
      return(IPickerFlyout.ABI.makeIPickerFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPickerFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPickerFlyout.ABI.makeIPickerFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PickerFlyout> {
    public override fun getValue() = PickerFlyout(pointer.getPointer(0))

    public fun setValue(value: PickerFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PickerFlyout, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPickerFlyoutStatics_Instance: IPickerFlyoutStatics by lazy {
      createIPickerFlyoutStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PickerFlyout".toHandle(),
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

    public fun createIPickerFlyoutStatics(): IPickerFlyoutStatics {
      val refiid = Guid.REFIID(IPickerFlyoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PickerFlyout".toHandle(),refiid,interfacePtr)
      val result = IPickerFlyoutStatics.ABI.makeIPickerFlyoutStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PickerFlyout {
      val address = segment.toRawLongValue()
      return PickerFlyout(Pointer(address))
    }

    public override fun toNative(obj: PickerFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ContentProperty() = ABI.IPickerFlyoutStatics_Instance.get_ContentProperty()

    public fun get_ConfirmationButtonsVisibleProperty() =
        ABI.IPickerFlyoutStatics_Instance.get_ConfirmationButtonsVisibleProperty()
  }
}
