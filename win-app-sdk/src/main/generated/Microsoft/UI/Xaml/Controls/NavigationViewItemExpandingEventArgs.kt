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

@ABIMarker(NavigationViewItemExpandingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NavigationViewItemExpandingEventArgs;{6f0941be-e991-52f8-8315-f08389497976})")
@WinRTByReference(brClass = NavigationViewItemExpandingEventArgs.ByReference::class)
public class NavigationViewItemExpandingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INavigationViewItemExpandingEventArgs.WithDefault, IWinRTObject {
  private val __248117602_Interface: INavigationViewItemExpandingEventArgs.WithDefault by lazy {
    as_248117602()
  }


  public override val __248117602_Ptr: JNAPointer? by lazy {
    __248117602_Interface.__248117602_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__248117602_Interface)

  private fun as_248117602(): INavigationViewItemExpandingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemExpandingEventArgs.ABI.makeINavigationViewItemExpandingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemExpandingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemExpandingEventArgs.ABI.makeINavigationViewItemExpandingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemExpandingEventArgs> {
    public override fun getValue() = NavigationViewItemExpandingEventArgs(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemExpandingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemExpandingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NavigationViewItemExpandingEventArgs {
      val address = segment.toRawLongValue()
      return NavigationViewItemExpandingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemExpandingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
