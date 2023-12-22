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

@ABIMarker(RedirectVisual.ABI::class)
@Signature("rc(Microsoft.UI.Composition.RedirectVisual;{6c10081a-cde1-50d9-ac05-78d6845b656f})")
@WinRTByReference(brClass = RedirectVisual.ByReference::class)
public class RedirectVisual(
  ptr: JNAPointer? = NULL
) : ContainerVisual(ptr), IRedirectVisual.WithDefault, IWinRTObject {
  private val __1450000021_Interface: IRedirectVisual.WithDefault by lazy {
    as_1450000021()
  }


  public override val __1450000021_Ptr: JNAPointer? by lazy {
    __1450000021_Interface.__1450000021_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1450000021_Interface)

  private fun as_1450000021(): IRedirectVisual.WithDefault {
    if(pointer == NULL) {
      return(IRedirectVisual.ABI.makeIRedirectVisual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRedirectVisual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRedirectVisual.ABI.makeIRedirectVisual(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RedirectVisual>
      {
    public override fun getValue() = RedirectVisual(pointer.getPointer(0))

    public fun setValue(value: RedirectVisual): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RedirectVisual, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RedirectVisual {
      val address = segment.toRawLongValue()
      return RedirectVisual(Pointer(address))
    }

    public override fun toNative(obj: RedirectVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
