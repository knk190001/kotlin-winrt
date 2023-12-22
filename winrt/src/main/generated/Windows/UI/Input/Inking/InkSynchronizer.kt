package Windows.UI.Input.Inking

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

@ABIMarker(InkSynchronizer.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkSynchronizer;{9b9ea160-ae9b-45f9-8407-4b493b163661})")
@WinRTByReference(brClass = InkSynchronizer.ByReference::class)
public class InkSynchronizer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkSynchronizer.WithDefault, IWinRTObject {
  private val __260657330_Interface: IInkSynchronizer.WithDefault by lazy {
    as_260657330()
  }


  public override val __260657330_Ptr: JNAPointer? by lazy {
    __260657330_Interface.__260657330_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__260657330_Interface)

  private fun as_260657330(): IInkSynchronizer.WithDefault {
    if(pointer == NULL) {
      return(IInkSynchronizer.ABI.makeIInkSynchronizer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkSynchronizer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkSynchronizer.ABI.makeIInkSynchronizer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkSynchronizer> {
    public override fun getValue() = InkSynchronizer(pointer.getPointer(0))

    public fun setValue(value: InkSynchronizer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkSynchronizer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkSynchronizer {
      val address = segment.toRawLongValue()
      return InkSynchronizer(Pointer(address))
    }

    public override fun toNative(obj: InkSynchronizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
