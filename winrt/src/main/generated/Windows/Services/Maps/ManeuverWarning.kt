package Windows.Services.Maps

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

@ABIMarker(ManeuverWarning.ABI::class)
@Signature("rc(Windows.Services.Maps.ManeuverWarning;{c1a36d8a-2630-4378-9e4a-6e44253dceba})")
@WinRTByReference(brClass = ManeuverWarning.ByReference::class)
public class ManeuverWarning(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IManeuverWarning.WithDefault, IWinRTObject {
  private val __1836597290_Interface: IManeuverWarning.WithDefault by lazy {
    as_1836597290()
  }


  public override val __1836597290_Ptr: JNAPointer? by lazy {
    __1836597290_Interface.__1836597290_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1836597290_Interface)

  private fun as_1836597290(): IManeuverWarning.WithDefault {
    if(pointer == NULL) {
      return(IManeuverWarning.ABI.makeIManeuverWarning(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManeuverWarning>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManeuverWarning.ABI.makeIManeuverWarning(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManeuverWarning> {
    public override fun getValue() = ManeuverWarning(pointer.getPointer(0))

    public fun setValue(value: ManeuverWarning): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManeuverWarning, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ManeuverWarning {
      val address = segment.toRawLongValue()
      return ManeuverWarning(Pointer(address))
    }

    public override fun toNative(obj: ManeuverWarning): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
