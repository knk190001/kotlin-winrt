package Microsoft.UI.Input.Experimental

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

@ABIMarker(ExpNavigateFocusRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.Experimental.ExpNavigateFocusRequestedEventArgs;{563b3f71-eca0-5652-b748-13c6d6794cee})")
@WinRTByReference(brClass = ExpNavigateFocusRequestedEventArgs.ByReference::class)
public class ExpNavigateFocusRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExpNavigateFocusRequestedEventArgs.WithDefault, IWinRTObject {
  private val __105050710_Interface: IExpNavigateFocusRequestedEventArgs.WithDefault by lazy {
    as_105050710()
  }


  public override val __105050710_Ptr: JNAPointer? by lazy {
    __105050710_Interface.__105050710_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__105050710_Interface)

  private fun as_105050710(): IExpNavigateFocusRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IExpNavigateFocusRequestedEventArgs.ABI.makeIExpNavigateFocusRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpNavigateFocusRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpNavigateFocusRequestedEventArgs.ABI.makeIExpNavigateFocusRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpNavigateFocusRequestedEventArgs> {
    public override fun getValue() = ExpNavigateFocusRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ExpNavigateFocusRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpNavigateFocusRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExpNavigateFocusRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ExpNavigateFocusRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ExpNavigateFocusRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
