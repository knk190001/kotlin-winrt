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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NavigationViewDisplayModeChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.NavigationViewDisplayModeChangedEventArgs;{b7c1ad35-5544-40c1-9b33-acfe1d6c8094})")
@WinRTByReference(brClass = NavigationViewDisplayModeChangedEventArgs.ByReference::class)
public class NavigationViewDisplayModeChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INavigationViewDisplayModeChangedEventArgs.WithDefault, IWinRTObject {
  private val __395223373_Interface: INavigationViewDisplayModeChangedEventArgs.WithDefault by
      lazy {
    as_395223373()
  }


  public override val __395223373_Ptr: JNAPointer? by lazy {
    __395223373_Interface.__395223373_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__395223373_Interface)

  private fun as_395223373(): INavigationViewDisplayModeChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewDisplayModeChangedEventArgs.ABI.makeINavigationViewDisplayModeChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewDisplayModeChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewDisplayModeChangedEventArgs.ABI.makeINavigationViewDisplayModeChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewDisplayModeChangedEventArgs> {
    public override fun getValue() =
        NavigationViewDisplayModeChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NavigationViewDisplayModeChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewDisplayModeChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        NavigationViewDisplayModeChangedEventArgs {
      val address = segment.toRawLongValue()
      return NavigationViewDisplayModeChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewDisplayModeChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
