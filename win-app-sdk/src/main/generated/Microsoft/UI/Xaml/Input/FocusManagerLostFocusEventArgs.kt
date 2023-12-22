package Microsoft.UI.Xaml.Input

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
@Signature("rc(Microsoft.UI.Xaml.Input.FocusManagerLostFocusEventArgs;{fdaf2c3f-a22e-5902-abce-b60758fbed1e})")
@WinRTByReference(brClass = FocusManagerLostFocusEventArgs.ByReference::class)
public class FocusManagerLostFocusEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFocusManagerLostFocusEventArgs.WithDefault, IWinRTObject {
  private val __1068338499_Interface: IFocusManagerLostFocusEventArgs.WithDefault by lazy {
    as_1068338499()
  }


  public override val __1068338499_Ptr: JNAPointer? by lazy {
    __1068338499_Interface.__1068338499_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1068338499_Interface)

  private fun as_1068338499(): IFocusManagerLostFocusEventArgs.WithDefault {
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
