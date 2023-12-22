package Windows.UI.Xaml.Navigation

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

@ABIMarker(NavigationEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Navigation.NavigationEventArgs;{b6aa9834-6691-44d1-bdf7-58820c27b0d0})")
@WinRTByReference(brClass = NavigationEventArgs.ByReference::class)
public class NavigationEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INavigationEventArgs.WithDefault, INavigationEventArgs2.WithDefault,
    IWinRTObject {
  private val __551908325_Interface: INavigationEventArgs.WithDefault by lazy {
    as_551908325()
  }


  private val __70711059_Interface: INavigationEventArgs2.WithDefault by lazy {
    as_70711059()
  }


  public override val __551908325_Ptr: JNAPointer? by lazy {
    __551908325_Interface.__551908325_Ptr
  }


  public override val __70711059_Ptr: JNAPointer? by lazy {
    __70711059_Interface.__70711059_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__551908325_Interface, __70711059_Interface)

  private fun as_551908325(): INavigationEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INavigationEventArgs.ABI.makeINavigationEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationEventArgs.ABI.makeINavigationEventArgs(ref.value))
  }

  private fun as_70711059(): INavigationEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(INavigationEventArgs2.ABI.makeINavigationEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationEventArgs2.ABI.makeINavigationEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationEventArgs> {
    public override fun getValue() = NavigationEventArgs(pointer.getPointer(0))

    public fun setValue(value: NavigationEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NavigationEventArgs {
      val address = segment.toRawLongValue()
      return NavigationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NavigationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
