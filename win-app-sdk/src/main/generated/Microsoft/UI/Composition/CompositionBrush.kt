package Microsoft.UI.Composition

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

@ABIMarker(CompositionBrush.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionBrush;{483924e7-99a5-5377-968b-dec6d40bbccd})")
@WinRTByReference(brClass = CompositionBrush.ByReference::class)
public open class CompositionBrush(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionBrush.WithDefault, IWinRTObject {
  private val __529429047_Interface: ICompositionBrush.WithDefault by lazy {
    as_529429047()
  }


  public override val __529429047_Ptr: JNAPointer? by lazy {
    __529429047_Interface.__529429047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__529429047_Interface)

  private fun as_529429047(): ICompositionBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionBrush.ABI.makeICompositionBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionBrush.ABI.makeICompositionBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionBrush> {
    public override fun getValue() = CompositionBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionBrush {
      val address = segment.toRawLongValue()
      return CompositionBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
