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

@ABIMarker(NavigationViewItemBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.NavigationViewItemBase;{edf04eb1-37d1-471f-8570-3829ee5b2bc6})")
@WinRTByReference(brClass = NavigationViewItemBase.ByReference::class)
public open class NavigationViewItemBase(
  ptr: JNAPointer? = NULL
) : ListViewItem(ptr), INavigationViewItemBase.WithDefault, IWinRTObject {
  private val __608656793_Interface: INavigationViewItemBase.WithDefault by lazy {
    as_608656793()
  }


  public override val __608656793_Ptr: JNAPointer? by lazy {
    __608656793_Interface.__608656793_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__608656793_Interface)

  private fun as_608656793(): INavigationViewItemBase.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemBase.ABI.makeINavigationViewItemBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemBase.ABI.makeINavigationViewItemBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemBase> {
    public override fun getValue() = NavigationViewItemBase(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemBase, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NavigationViewItemBase {
      val address = segment.toRawLongValue()
      return NavigationViewItemBase(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
