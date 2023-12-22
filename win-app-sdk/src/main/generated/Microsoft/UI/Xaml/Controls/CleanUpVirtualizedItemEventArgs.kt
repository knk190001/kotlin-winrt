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

@ABIMarker(CleanUpVirtualizedItemEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.CleanUpVirtualizedItemEventArgs;{76155ad9-e394-5313-832f-e21cf7b7fb0e})")
@WinRTByReference(brClass = CleanUpVirtualizedItemEventArgs.ByReference::class)
public class CleanUpVirtualizedItemEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), ICleanUpVirtualizedItemEventArgs.WithDefault, IWinRTObject {
  private val __1475737178_Interface: ICleanUpVirtualizedItemEventArgs.WithDefault by lazy {
    as_1475737178()
  }


  public override val __1475737178_Ptr: JNAPointer? by lazy {
    __1475737178_Interface.__1475737178_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1475737178_Interface)

  private fun as_1475737178(): ICleanUpVirtualizedItemEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICleanUpVirtualizedItemEventArgs.ABI.makeICleanUpVirtualizedItemEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICleanUpVirtualizedItemEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICleanUpVirtualizedItemEventArgs.ABI.makeICleanUpVirtualizedItemEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CleanUpVirtualizedItemEventArgs> {
    public override fun getValue() = CleanUpVirtualizedItemEventArgs(pointer.getPointer(0))

    public fun setValue(value: CleanUpVirtualizedItemEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CleanUpVirtualizedItemEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CleanUpVirtualizedItemEventArgs {
      val address = segment.toRawLongValue()
      return CleanUpVirtualizedItemEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CleanUpVirtualizedItemEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
