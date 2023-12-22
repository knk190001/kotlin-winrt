package Windows.Media.DialProtocol

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

@ABIMarker(DialDevicePickerFilter.ABI::class)
@Signature("rc(Windows.Media.DialProtocol.DialDevicePickerFilter;{c17c93ba-86c0-485d-b8d6-0f9a8f641590})")
@WinRTByReference(brClass = DialDevicePickerFilter.ByReference::class)
public class DialDevicePickerFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDialDevicePickerFilter.WithDefault, IWinRTObject {
  private val __1377476632_Interface: IDialDevicePickerFilter.WithDefault by lazy {
    as_1377476632()
  }


  public override val __1377476632_Ptr: JNAPointer? by lazy {
    __1377476632_Interface.__1377476632_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1377476632_Interface)

  private fun as_1377476632(): IDialDevicePickerFilter.WithDefault {
    if(pointer == NULL) {
      return(IDialDevicePickerFilter.ABI.makeIDialDevicePickerFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDialDevicePickerFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDialDevicePickerFilter.ABI.makeIDialDevicePickerFilter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DialDevicePickerFilter> {
    public override fun getValue() = DialDevicePickerFilter(pointer.getPointer(0))

    public fun setValue(value: DialDevicePickerFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DialDevicePickerFilter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DialDevicePickerFilter {
      val address = segment.toRawLongValue()
      return DialDevicePickerFilter(Pointer(address))
    }

    public override fun toNative(obj: DialDevicePickerFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
