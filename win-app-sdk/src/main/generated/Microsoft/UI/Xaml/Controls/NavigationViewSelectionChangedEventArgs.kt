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

@ABIMarker(NavigationViewSelectionChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NavigationViewSelectionChangedEventArgs;{14a064a5-c79d-5f63-ac6e-1c313fe63566})")
@WinRTByReference(brClass = NavigationViewSelectionChangedEventArgs.ByReference::class)
public class NavigationViewSelectionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INavigationViewSelectionChangedEventArgs.WithDefault,
    INavigationViewSelectionChangedEventArgs2.WithDefault, IWinRTObject {
  private val __2137479023_Interface: INavigationViewSelectionChangedEventArgs.WithDefault by lazy {
    as_2137479023()
  }


  private val __1837340323_Interface: INavigationViewSelectionChangedEventArgs2.WithDefault by
      lazy {
    as_1837340323()
  }


  public override val __2137479023_Ptr: JNAPointer? by lazy {
    __2137479023_Interface.__2137479023_Ptr
  }


  public override val __1837340323_Ptr: JNAPointer? by lazy {
    __1837340323_Interface.__1837340323_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2137479023_Interface, __1837340323_Interface)

  private fun as_2137479023(): INavigationViewSelectionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewSelectionChangedEventArgs.ABI.makeINavigationViewSelectionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewSelectionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewSelectionChangedEventArgs.ABI.makeINavigationViewSelectionChangedEventArgs(ref.value))
  }

  private fun as_1837340323(): INavigationViewSelectionChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewSelectionChangedEventArgs2.ABI.makeINavigationViewSelectionChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewSelectionChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewSelectionChangedEventArgs2.ABI.makeINavigationViewSelectionChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewSelectionChangedEventArgs> {
    public override fun getValue() = NavigationViewSelectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NavigationViewSelectionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewSelectionChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        NavigationViewSelectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return NavigationViewSelectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewSelectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
