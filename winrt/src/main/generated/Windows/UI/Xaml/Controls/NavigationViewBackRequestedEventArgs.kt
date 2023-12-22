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

@ABIMarker(NavigationViewBackRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.NavigationViewBackRequestedEventArgs;{446700e1-9a9d-4500-a71d-25c15809b879})")
@WinRTByReference(brClass = NavigationViewBackRequestedEventArgs.ByReference::class)
public class NavigationViewBackRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INavigationViewBackRequestedEventArgs.WithDefault, IWinRTObject {
  private val __963644315_Interface: INavigationViewBackRequestedEventArgs.WithDefault by lazy {
    as_963644315()
  }


  public override val __963644315_Ptr: JNAPointer? by lazy {
    __963644315_Interface.__963644315_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__963644315_Interface)

  private fun as_963644315(): INavigationViewBackRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewBackRequestedEventArgs.ABI.makeINavigationViewBackRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewBackRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewBackRequestedEventArgs.ABI.makeINavigationViewBackRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewBackRequestedEventArgs> {
    public override fun getValue() = NavigationViewBackRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NavigationViewBackRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewBackRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NavigationViewBackRequestedEventArgs {
      val address = segment.toRawLongValue()
      return NavigationViewBackRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewBackRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
