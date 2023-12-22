package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ListPickerFlyoutPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ListPickerFlyoutPresenter;{7dcc91ab-8694-517b-a4e6-04767410c60b})")
@WinRTByReference(brClass = ListPickerFlyoutPresenter.ByReference::class)
public class ListPickerFlyoutPresenter(
  ptr: JNAPointer? = NULL
) : Control(ptr), IListPickerFlyoutPresenter.WithDefault, IWinRTObject {
  private val __1932426598_Interface: IListPickerFlyoutPresenter.WithDefault by lazy {
    as_1932426598()
  }


  public override val __1932426598_Ptr: JNAPointer? by lazy {
    __1932426598_Interface.__1932426598_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1932426598_Interface)

  private fun as_1932426598(): IListPickerFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(IListPickerFlyoutPresenter.ABI.makeIListPickerFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListPickerFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListPickerFlyoutPresenter.ABI.makeIListPickerFlyoutPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListPickerFlyoutPresenter> {
    public override fun getValue() = ListPickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: ListPickerFlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListPickerFlyoutPresenter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ListPickerFlyoutPresenter {
      val address = segment.toRawLongValue()
      return ListPickerFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: ListPickerFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
