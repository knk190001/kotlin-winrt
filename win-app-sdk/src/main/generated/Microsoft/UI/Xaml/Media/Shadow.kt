package Microsoft.UI.Xaml.Media

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

@ABIMarker(Shadow.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Shadow;{cc12fd6a-50aa-5eb3-9a0e-b938b454c439})")
@WinRTByReference(brClass = Shadow.ByReference::class)
public open class Shadow(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IShadow.WithDefault, IWinRTObject {
  private val __742537071_Interface: IShadow.WithDefault by lazy {
    as_742537071()
  }


  public override val __742537071_Ptr: JNAPointer? by lazy {
    __742537071_Interface.__742537071_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__742537071_Interface)

  private fun as_742537071(): IShadow.WithDefault {
    if(pointer == NULL) {
      return(IShadow.ABI.makeIShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShadow.ABI.makeIShadow(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Shadow> {
    public override fun getValue() = Shadow(pointer.getPointer(0))

    public fun setValue(value: Shadow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Shadow, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Shadow {
      val address = segment.toRawLongValue()
      return Shadow(Pointer(address))
    }

    public override fun toNative(obj: Shadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
