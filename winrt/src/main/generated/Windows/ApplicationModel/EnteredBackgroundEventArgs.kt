package Windows.ApplicationModel

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

@ABIMarker(EnteredBackgroundEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.EnteredBackgroundEventArgs;{f722dcc2-9827-403d-aaed-ecca9ac17398})")
@WinRTByReference(brClass = EnteredBackgroundEventArgs.ByReference::class)
public class EnteredBackgroundEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEnteredBackgroundEventArgs.WithDefault, IWinRTObject {
  private val __259902793_Interface: IEnteredBackgroundEventArgs.WithDefault by lazy {
    as_259902793()
  }


  public override val __259902793_Ptr: JNAPointer? by lazy {
    __259902793_Interface.__259902793_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__259902793_Interface)

  private fun as_259902793(): IEnteredBackgroundEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IEnteredBackgroundEventArgs.ABI.makeIEnteredBackgroundEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnteredBackgroundEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnteredBackgroundEventArgs.ABI.makeIEnteredBackgroundEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EnteredBackgroundEventArgs> {
    public override fun getValue() = EnteredBackgroundEventArgs(pointer.getPointer(0))

    public fun setValue(value: EnteredBackgroundEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EnteredBackgroundEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EnteredBackgroundEventArgs {
      val address = segment.toRawLongValue()
      return EnteredBackgroundEventArgs(Pointer(address))
    }

    public override fun toNative(obj: EnteredBackgroundEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
