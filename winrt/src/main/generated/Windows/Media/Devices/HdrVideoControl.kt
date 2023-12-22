package Windows.Media.Devices

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

@ABIMarker(HdrVideoControl.ABI::class)
@Signature("rc(Windows.Media.Devices.HdrVideoControl;{55d8e2d0-30c0-43bf-9b9a-9799d70ced94})")
@WinRTByReference(brClass = HdrVideoControl.ByReference::class)
public class HdrVideoControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHdrVideoControl.WithDefault, IWinRTObject {
  private val __242325705_Interface: IHdrVideoControl.WithDefault by lazy {
    as_242325705()
  }


  public override val __242325705_Ptr: JNAPointer? by lazy {
    __242325705_Interface.__242325705_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__242325705_Interface)

  private fun as_242325705(): IHdrVideoControl.WithDefault {
    if(pointer == NULL) {
      return(IHdrVideoControl.ABI.makeIHdrVideoControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHdrVideoControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHdrVideoControl.ABI.makeIHdrVideoControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HdrVideoControl> {
    public override fun getValue() = HdrVideoControl(pointer.getPointer(0))

    public fun setValue(value: HdrVideoControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HdrVideoControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HdrVideoControl {
      val address = segment.toRawLongValue()
      return HdrVideoControl(Pointer(address))
    }

    public override fun toNative(obj: HdrVideoControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
