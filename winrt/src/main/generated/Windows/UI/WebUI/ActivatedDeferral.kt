package Windows.UI.WebUI

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

@ABIMarker(ActivatedDeferral.ABI::class)
@Signature("rc(Windows.UI.WebUI.ActivatedDeferral;{c3bd1978-a431-49d8-a76a-395a4e03dcf3})")
@WinRTByReference(brClass = ActivatedDeferral.ByReference::class)
public class ActivatedDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivatedDeferral.WithDefault, IWinRTObject {
  private val __908651244_Interface: IActivatedDeferral.WithDefault by lazy {
    as_908651244()
  }


  public override val __908651244_Ptr: JNAPointer? by lazy {
    __908651244_Interface.__908651244_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__908651244_Interface)

  private fun as_908651244(): IActivatedDeferral.WithDefault {
    if(pointer == NULL) {
      return(IActivatedDeferral.ABI.makeIActivatedDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedDeferral.ABI.makeIActivatedDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ActivatedDeferral> {
    public override fun getValue() = ActivatedDeferral(pointer.getPointer(0))

    public fun setValue(value: ActivatedDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivatedDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ActivatedDeferral {
      val address = segment.toRawLongValue()
      return ActivatedDeferral(Pointer(address))
    }

    public override fun toNative(obj: ActivatedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
