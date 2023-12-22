package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.RoutedEventArgs
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

@ABIMarker(ContextMenuEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ContextMenuEventArgs;{65637bb3-e279-5507-bd16-6f7ba6705f31})")
@WinRTByReference(brClass = ContextMenuEventArgs.ByReference::class)
public class ContextMenuEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IContextMenuEventArgs.WithDefault, IWinRTObject {
  private val __250057424_Interface: IContextMenuEventArgs.WithDefault by lazy {
    as_250057424()
  }


  public override val __250057424_Ptr: JNAPointer? by lazy {
    __250057424_Interface.__250057424_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__250057424_Interface)

  private fun as_250057424(): IContextMenuEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContextMenuEventArgs.ABI.makeIContextMenuEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContextMenuEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContextMenuEventArgs.ABI.makeIContextMenuEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContextMenuEventArgs> {
    public override fun getValue() = ContextMenuEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContextMenuEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContextMenuEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContextMenuEventArgs {
      val address = segment.toRawLongValue()
      return ContextMenuEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContextMenuEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
