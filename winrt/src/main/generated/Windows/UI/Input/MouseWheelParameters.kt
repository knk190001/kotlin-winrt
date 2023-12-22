package Windows.UI.Input

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

@ABIMarker(MouseWheelParameters.ABI::class)
@Signature("rc(Windows.UI.Input.MouseWheelParameters;{ead0ca44-9ded-4037-8149-5e4cc2564468})")
@WinRTByReference(brClass = MouseWheelParameters.ByReference::class)
public class MouseWheelParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMouseWheelParameters.WithDefault, IWinRTObject {
  private val __1144863246_Interface: IMouseWheelParameters.WithDefault by lazy {
    as_1144863246()
  }


  public override val __1144863246_Ptr: JNAPointer? by lazy {
    __1144863246_Interface.__1144863246_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1144863246_Interface)

  private fun as_1144863246(): IMouseWheelParameters.WithDefault {
    if(pointer == NULL) {
      return(IMouseWheelParameters.ABI.makeIMouseWheelParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMouseWheelParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMouseWheelParameters.ABI.makeIMouseWheelParameters(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MouseWheelParameters> {
    public override fun getValue() = MouseWheelParameters(pointer.getPointer(0))

    public fun setValue(value: MouseWheelParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MouseWheelParameters, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MouseWheelParameters {
      val address = segment.toRawLongValue()
      return MouseWheelParameters(Pointer(address))
    }

    public override fun toNative(obj: MouseWheelParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
