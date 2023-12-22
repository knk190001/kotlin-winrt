package Windows.Devices.Printers

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

@ABIMarker(IppSetAttributesResult.ABI::class)
@Signature("rc(Windows.Devices.Printers.IppSetAttributesResult;{7d1c7f55-aa9d-58a3-90e9-17bdc5281f07})")
@WinRTByReference(brClass = IppSetAttributesResult.ByReference::class)
public class IppSetAttributesResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIppSetAttributesResult.WithDefault, IWinRTObject {
  private val __1330180095_Interface: IIppSetAttributesResult.WithDefault by lazy {
    as_1330180095()
  }


  public override val __1330180095_Ptr: JNAPointer? by lazy {
    __1330180095_Interface.__1330180095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1330180095_Interface)

  private fun as_1330180095(): IIppSetAttributesResult.WithDefault {
    if(pointer == NULL) {
      return(IIppSetAttributesResult.ABI.makeIIppSetAttributesResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIppSetAttributesResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIppSetAttributesResult.ABI.makeIIppSetAttributesResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IppSetAttributesResult> {
    public override fun getValue() = IppSetAttributesResult(pointer.getPointer(0))

    public fun setValue(value: IppSetAttributesResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IppSetAttributesResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IppSetAttributesResult {
      val address = segment.toRawLongValue()
      return IppSetAttributesResult(Pointer(address))
    }

    public override fun toNative(obj: IppSetAttributesResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
