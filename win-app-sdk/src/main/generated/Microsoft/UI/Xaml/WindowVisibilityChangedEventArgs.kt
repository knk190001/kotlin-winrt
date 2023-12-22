package Microsoft.UI.Xaml

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

@ABIMarker(WindowVisibilityChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.WindowVisibilityChangedEventArgs;{7bb24a6d-070c-5cb6-8e9c-547905be8265})")
@WinRTByReference(brClass = WindowVisibilityChangedEventArgs.ByReference::class)
public class WindowVisibilityChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindowVisibilityChangedEventArgs.WithDefault, IWinRTObject {
  private val __1632965172_Interface: IWindowVisibilityChangedEventArgs.WithDefault by lazy {
    as_1632965172()
  }


  public override val __1632965172_Ptr: JNAPointer? by lazy {
    __1632965172_Interface.__1632965172_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1632965172_Interface)

  private fun as_1632965172(): IWindowVisibilityChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWindowVisibilityChangedEventArgs.ABI.makeIWindowVisibilityChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowVisibilityChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowVisibilityChangedEventArgs.ABI.makeIWindowVisibilityChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WindowVisibilityChangedEventArgs> {
    public override fun getValue() = WindowVisibilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WindowVisibilityChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowVisibilityChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WindowVisibilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return WindowVisibilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WindowVisibilityChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
