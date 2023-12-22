package Windows.UI.Text.Core

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

@ABIMarker(CoreTextCompositionSegment.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextCompositionSegment;{776c6bd9-4ead-4da7-8f47-3a88b523cc34})")
@WinRTByReference(brClass = CoreTextCompositionSegment.ByReference::class)
public class CoreTextCompositionSegment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextCompositionSegment.WithDefault, IWinRTObject {
  private val __1149606573_Interface: ICoreTextCompositionSegment.WithDefault by lazy {
    as_1149606573()
  }


  public override val __1149606573_Ptr: JNAPointer? by lazy {
    __1149606573_Interface.__1149606573_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1149606573_Interface)

  private fun as_1149606573(): ICoreTextCompositionSegment.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextCompositionSegment.ABI.makeICoreTextCompositionSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextCompositionSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextCompositionSegment.ABI.makeICoreTextCompositionSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextCompositionSegment> {
    public override fun getValue() = CoreTextCompositionSegment(pointer.getPointer(0))

    public fun setValue(value: CoreTextCompositionSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextCompositionSegment, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextCompositionSegment {
      val address = segment.toRawLongValue()
      return CoreTextCompositionSegment(Pointer(address))
    }

    public override fun toNative(obj: CoreTextCompositionSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
