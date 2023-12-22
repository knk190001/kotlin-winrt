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

@ABIMarker(CoreTextLayoutBounds.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextLayoutBounds;{e972c974-4436-4917-80d0-a525e4ca6780})")
@WinRTByReference(brClass = CoreTextLayoutBounds.ByReference::class)
public class CoreTextLayoutBounds(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextLayoutBounds.WithDefault, IWinRTObject {
  private val __1031981571_Interface: ICoreTextLayoutBounds.WithDefault by lazy {
    as_1031981571()
  }


  public override val __1031981571_Ptr: JNAPointer? by lazy {
    __1031981571_Interface.__1031981571_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1031981571_Interface)

  private fun as_1031981571(): ICoreTextLayoutBounds.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextLayoutBounds.ABI.makeICoreTextLayoutBounds(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextLayoutBounds>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextLayoutBounds.ABI.makeICoreTextLayoutBounds(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextLayoutBounds> {
    public override fun getValue() = CoreTextLayoutBounds(pointer.getPointer(0))

    public fun setValue(value: CoreTextLayoutBounds): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextLayoutBounds, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextLayoutBounds {
      val address = segment.toRawLongValue()
      return CoreTextLayoutBounds(Pointer(address))
    }

    public override fun toNative(obj: CoreTextLayoutBounds): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
