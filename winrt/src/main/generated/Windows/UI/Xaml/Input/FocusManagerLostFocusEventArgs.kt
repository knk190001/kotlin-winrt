package Windows.UI.Xaml.Input

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

@ABIMarker(FocusManagerLostFocusEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.FocusManagerLostFocusEventArgs;{3e157e7a-9578-5cd3-aaa8-051b3d391978})")
@WinRTByReference(brClass = FocusManagerLostFocusEventArgs.ByReference::class)
public class FocusManagerLostFocusEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFocusManagerLostFocusEventArgs.WithDefault, IWinRTObject {
  private val __456503758_Interface: IFocusManagerLostFocusEventArgs.WithDefault by lazy {
    as_456503758()
  }


  public override val __456503758_Ptr: JNAPointer? by lazy {
    __456503758_Interface.__456503758_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__456503758_Interface)

  private fun as_456503758(): IFocusManagerLostFocusEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFocusManagerLostFocusEventArgs.ABI.makeIFocusManagerLostFocusEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusManagerLostFocusEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusManagerLostFocusEventArgs.ABI.makeIFocusManagerLostFocusEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FocusManagerLostFocusEventArgs> {
    public override fun getValue() = FocusManagerLostFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: FocusManagerLostFocusEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FocusManagerLostFocusEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FocusManagerLostFocusEventArgs {
      val address = segment.toRawLongValue()
      return FocusManagerLostFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: FocusManagerLostFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
