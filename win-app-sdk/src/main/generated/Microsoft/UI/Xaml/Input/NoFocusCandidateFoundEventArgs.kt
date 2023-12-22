package Microsoft.UI.Xaml.Input

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

@ABIMarker(NoFocusCandidateFoundEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.NoFocusCandidateFoundEventArgs;{a2d7153a-cd2a-59cb-a574-ac82e30b9201})")
@WinRTByReference(brClass = NoFocusCandidateFoundEventArgs.ByReference::class)
public class NoFocusCandidateFoundEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), INoFocusCandidateFoundEventArgs.WithDefault, IWinRTObject {
  private val __1893012428_Interface: INoFocusCandidateFoundEventArgs.WithDefault by lazy {
    as_1893012428()
  }


  public override val __1893012428_Ptr: JNAPointer? by lazy {
    __1893012428_Interface.__1893012428_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1893012428_Interface)

  private fun as_1893012428(): INoFocusCandidateFoundEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INoFocusCandidateFoundEventArgs.ABI.makeINoFocusCandidateFoundEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INoFocusCandidateFoundEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INoFocusCandidateFoundEventArgs.ABI.makeINoFocusCandidateFoundEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NoFocusCandidateFoundEventArgs> {
    public override fun getValue() = NoFocusCandidateFoundEventArgs(pointer.getPointer(0))

    public fun setValue(value: NoFocusCandidateFoundEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NoFocusCandidateFoundEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NoFocusCandidateFoundEventArgs {
      val address = segment.toRawLongValue()
      return NoFocusCandidateFoundEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NoFocusCandidateFoundEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
