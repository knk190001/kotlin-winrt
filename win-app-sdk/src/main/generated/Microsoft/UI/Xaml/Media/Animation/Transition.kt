package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(Transition.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.Transition;{e5b71956-8e44-5a38-b41e-274d706102bf})")
@WinRTByReference(brClass = Transition.ByReference::class)
public open class Transition(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITransition.WithDefault, IWinRTObject {
  private val __52338064_Interface: ITransition.WithDefault by lazy {
    as_52338064()
  }


  public override val __52338064_Ptr: JNAPointer? by lazy {
    __52338064_Interface.__52338064_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__52338064_Interface)

  private fun as_52338064(): ITransition.WithDefault {
    if(pointer == NULL) {
      return(ITransition.ABI.makeITransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITransition.ABI.makeITransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Transition> {
    public override fun getValue() = Transition(pointer.getPointer(0))

    public fun setValue(value: Transition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Transition, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Transition {
      val address = segment.toRawLongValue()
      return Transition(Pointer(address))
    }

    public override fun toNative(obj: Transition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
