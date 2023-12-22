package Windows.UI.ViewManagement.Core

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

@ABIMarker(CoreInputViewOcclusion.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.Core.CoreInputViewOcclusion;{cc36ce06-3865-4177-b5f5-8b65e0b9ce84})")
@WinRTByReference(brClass = CoreInputViewOcclusion.ByReference::class)
public class CoreInputViewOcclusion(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreInputViewOcclusion.WithDefault, IWinRTObject {
  private val __863081232_Interface: ICoreInputViewOcclusion.WithDefault by lazy {
    as_863081232()
  }


  public override val __863081232_Ptr: JNAPointer? by lazy {
    __863081232_Interface.__863081232_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__863081232_Interface)

  private fun as_863081232(): ICoreInputViewOcclusion.WithDefault {
    if(pointer == NULL) {
      return(ICoreInputViewOcclusion.ABI.makeICoreInputViewOcclusion(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInputViewOcclusion>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInputViewOcclusion.ABI.makeICoreInputViewOcclusion(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreInputViewOcclusion> {
    public override fun getValue() = CoreInputViewOcclusion(pointer.getPointer(0))

    public fun setValue(value: CoreInputViewOcclusion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreInputViewOcclusion, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreInputViewOcclusion {
      val address = segment.toRawLongValue()
      return CoreInputViewOcclusion(Pointer(address))
    }

    public override fun toNative(obj: CoreInputViewOcclusion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
