package Microsoft.UI.Input

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

@ABIMarker(PointerPointProperties.ABI::class)
@Signature("rc(Microsoft.UI.Input.PointerPointProperties;{d760ed77-4b10-57a5-b3cc-d9bf3413e996})")
@WinRTByReference(brClass = PointerPointProperties.ByReference::class)
public class PointerPointProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPointerPointProperties.WithDefault, IWinRTObject {
  private val __872207457_Interface: IPointerPointProperties.WithDefault by lazy {
    as_872207457()
  }


  public override val __872207457_Ptr: JNAPointer? by lazy {
    __872207457_Interface.__872207457_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__872207457_Interface)

  private fun as_872207457(): IPointerPointProperties.WithDefault {
    if(pointer == NULL) {
      return(IPointerPointProperties.ABI.makeIPointerPointProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerPointProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerPointProperties.ABI.makeIPointerPointProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PointerPointProperties> {
    public override fun getValue() = PointerPointProperties(pointer.getPointer(0))

    public fun setValue(value: PointerPointProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointerPointProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PointerPointProperties {
      val address = segment.toRawLongValue()
      return PointerPointProperties(Pointer(address))
    }

    public override fun toNative(obj: PointerPointProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
