package Microsoft.UI.Xaml.Navigation

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

@ABIMarker(NavigatingCancelEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Navigation.NavigatingCancelEventArgs;{172fde12-e06f-5df6-930e-5facf7b3fbe7})")
@WinRTByReference(brClass = NavigatingCancelEventArgs.ByReference::class)
public class NavigatingCancelEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INavigatingCancelEventArgs.WithDefault, IWinRTObject {
  private val __1907275674_Interface: INavigatingCancelEventArgs.WithDefault by lazy {
    as_1907275674()
  }


  public override val __1907275674_Ptr: JNAPointer? by lazy {
    __1907275674_Interface.__1907275674_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1907275674_Interface)

  private fun as_1907275674(): INavigatingCancelEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INavigatingCancelEventArgs.ABI.makeINavigatingCancelEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigatingCancelEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigatingCancelEventArgs.ABI.makeINavigatingCancelEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigatingCancelEventArgs> {
    public override fun getValue() = NavigatingCancelEventArgs(pointer.getPointer(0))

    public fun setValue(value: NavigatingCancelEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigatingCancelEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NavigatingCancelEventArgs {
      val address = segment.toRawLongValue()
      return NavigatingCancelEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NavigatingCancelEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
