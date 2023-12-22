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

@ABIMarker(WindowEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.WindowEventArgs;{1140827c-fe0a-5268-bc2b-f4492c2ccb49})")
@WinRTByReference(brClass = WindowEventArgs.ByReference::class)
public class WindowEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindowEventArgs.WithDefault, IWinRTObject {
  private val __310402400_Interface: IWindowEventArgs.WithDefault by lazy {
    as_310402400()
  }


  public override val __310402400_Ptr: JNAPointer? by lazy {
    __310402400_Interface.__310402400_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__310402400_Interface)

  private fun as_310402400(): IWindowEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWindowEventArgs.ABI.makeIWindowEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowEventArgs.ABI.makeIWindowEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WindowEventArgs> {
    public override fun getValue() = WindowEventArgs(pointer.getPointer(0))

    public fun setValue(value: WindowEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WindowEventArgs {
      val address = segment.toRawLongValue()
      return WindowEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WindowEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
