package Windows.UI.Composition

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

@ABIMarker(InsetClip.ABI::class)
@Signature("rc(Windows.UI.Composition.InsetClip;{1e73e647-84c7-477a-b474-5880e0442e15})")
@WinRTByReference(brClass = InsetClip.ByReference::class)
public class InsetClip(
  ptr: JNAPointer? = NULL
) : CompositionClip(ptr), IInsetClip.WithDefault, IWinRTObject {
  private val __362971617_Interface: IInsetClip.WithDefault by lazy {
    as_362971617()
  }


  public override val __362971617_Ptr: JNAPointer? by lazy {
    __362971617_Interface.__362971617_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__362971617_Interface)

  private fun as_362971617(): IInsetClip.WithDefault {
    if(pointer == NULL) {
      return(IInsetClip.ABI.makeIInsetClip(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInsetClip>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInsetClip.ABI.makeIInsetClip(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InsetClip> {
    public override fun getValue() = InsetClip(pointer.getPointer(0))

    public fun setValue(value: InsetClip): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InsetClip, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InsetClip {
      val address = segment.toRawLongValue()
      return InsetClip(Pointer(address))
    }

    public override fun toNative(obj: InsetClip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
