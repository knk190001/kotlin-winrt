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

@ABIMarker(NavigationViewItemCollapsedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NavigationViewItemCollapsedEventArgs;{b546f6a1-c66f-5ded-b5d7-bed0a26197e3})")
@WinRTByReference(brClass = NavigationViewItemCollapsedEventArgs.ByReference::class)
public class NavigationViewItemCollapsedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INavigationViewItemCollapsedEventArgs.WithDefault, IWinRTObject {
  private val __272733453_Interface: INavigationViewItemCollapsedEventArgs.WithDefault by lazy {
    as_272733453()
  }


  public override val __272733453_Ptr: JNAPointer? by lazy {
    __272733453_Interface.__272733453_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__272733453_Interface)

  private fun as_272733453(): INavigationViewItemCollapsedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemCollapsedEventArgs.ABI.makeINavigationViewItemCollapsedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemCollapsedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemCollapsedEventArgs.ABI.makeINavigationViewItemCollapsedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemCollapsedEventArgs> {
    public override fun getValue() = NavigationViewItemCollapsedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemCollapsedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemCollapsedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NavigationViewItemCollapsedEventArgs {
      val address = segment.toRawLongValue()
      return NavigationViewItemCollapsedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemCollapsedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
