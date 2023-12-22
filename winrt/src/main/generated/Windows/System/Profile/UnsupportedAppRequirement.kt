package Windows.System.Profile

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

@ABIMarker(UnsupportedAppRequirement.ABI::class)
@Signature("rc(Windows.System.Profile.UnsupportedAppRequirement;{6182445c-894b-5cbc-8976-a98e0a9b998d})")
@WinRTByReference(brClass = UnsupportedAppRequirement.ByReference::class)
public class UnsupportedAppRequirement(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUnsupportedAppRequirement.WithDefault, IWinRTObject {
  private val __764606397_Interface: IUnsupportedAppRequirement.WithDefault by lazy {
    as_764606397()
  }


  public override val __764606397_Ptr: JNAPointer? by lazy {
    __764606397_Interface.__764606397_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__764606397_Interface)

  private fun as_764606397(): IUnsupportedAppRequirement.WithDefault {
    if(pointer == NULL) {
      return(IUnsupportedAppRequirement.ABI.makeIUnsupportedAppRequirement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUnsupportedAppRequirement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUnsupportedAppRequirement.ABI.makeIUnsupportedAppRequirement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UnsupportedAppRequirement> {
    public override fun getValue() = UnsupportedAppRequirement(pointer.getPointer(0))

    public fun setValue(value: UnsupportedAppRequirement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UnsupportedAppRequirement, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UnsupportedAppRequirement {
      val address = segment.toRawLongValue()
      return UnsupportedAppRequirement(Pointer(address))
    }

    public override fun toNative(obj: UnsupportedAppRequirement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
