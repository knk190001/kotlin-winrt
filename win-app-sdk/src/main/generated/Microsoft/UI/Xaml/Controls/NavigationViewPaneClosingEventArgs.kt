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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NavigationViewPaneClosingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NavigationViewPaneClosingEventArgs;{e8643304-6db4-5af5-bac2-62733ca037da})")
@WinRTByReference(brClass = NavigationViewPaneClosingEventArgs.ByReference::class)
public class NavigationViewPaneClosingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INavigationViewPaneClosingEventArgs.WithDefault, IWinRTObject {
  private val __111896938_Interface: INavigationViewPaneClosingEventArgs.WithDefault by lazy {
    as_111896938()
  }


  public override val __111896938_Ptr: JNAPointer? by lazy {
    __111896938_Interface.__111896938_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__111896938_Interface)

  private fun as_111896938(): INavigationViewPaneClosingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewPaneClosingEventArgs.ABI.makeINavigationViewPaneClosingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewPaneClosingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewPaneClosingEventArgs.ABI.makeINavigationViewPaneClosingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewPaneClosingEventArgs> {
    public override fun getValue() = NavigationViewPaneClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: NavigationViewPaneClosingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewPaneClosingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NavigationViewPaneClosingEventArgs {
      val address = segment.toRawLongValue()
      return NavigationViewPaneClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewPaneClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
