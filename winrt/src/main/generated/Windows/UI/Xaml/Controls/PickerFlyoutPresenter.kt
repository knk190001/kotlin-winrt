package Windows.UI.Xaml.Controls

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PickerFlyoutPresenter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.PickerFlyoutPresenter;{5884c978-6b27-4b38-a9ae-677c2994652e})")
@WinRTByReference(brClass = PickerFlyoutPresenter.ByReference::class)
public class PickerFlyoutPresenter(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IPickerFlyoutPresenter.WithDefault, IWinRTObject {
  private val __921096675_Interface: IPickerFlyoutPresenter.WithDefault by lazy {
    as_921096675()
  }


  public override val __921096675_Ptr: JNAPointer? by lazy {
    __921096675_Interface.__921096675_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__921096675_Interface)

  private fun as_921096675(): IPickerFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(IPickerFlyoutPresenter.ABI.makeIPickerFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPickerFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPickerFlyoutPresenter.ABI.makeIPickerFlyoutPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PickerFlyoutPresenter> {
    public override fun getValue() = PickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: PickerFlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PickerFlyoutPresenter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PickerFlyoutPresenter {
      val address = segment.toRawLongValue()
      return PickerFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: PickerFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
