package Windows.Media.Casting

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

@ABIMarker(CastingDevicePickerFilter.ABI::class)
@Signature("rc(Windows.Media.Casting.CastingDevicePickerFilter;{be8c619c-b563-4354-ae33-9fdaad8c6291})")
@WinRTByReference(brClass = CastingDevicePickerFilter.ByReference::class)
public class CastingDevicePickerFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICastingDevicePickerFilter.WithDefault, IWinRTObject {
  private val __1171638620_Interface: ICastingDevicePickerFilter.WithDefault by lazy {
    as_1171638620()
  }


  public override val __1171638620_Ptr: JNAPointer? by lazy {
    __1171638620_Interface.__1171638620_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1171638620_Interface)

  private fun as_1171638620(): ICastingDevicePickerFilter.WithDefault {
    if(pointer == NULL) {
      return(ICastingDevicePickerFilter.ABI.makeICastingDevicePickerFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICastingDevicePickerFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICastingDevicePickerFilter.ABI.makeICastingDevicePickerFilter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CastingDevicePickerFilter> {
    public override fun getValue() = CastingDevicePickerFilter(pointer.getPointer(0))

    public fun setValue(value: CastingDevicePickerFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CastingDevicePickerFilter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CastingDevicePickerFilter {
      val address = segment.toRawLongValue()
      return CastingDevicePickerFilter(Pointer(address))
    }

    public override fun toNative(obj: CastingDevicePickerFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
