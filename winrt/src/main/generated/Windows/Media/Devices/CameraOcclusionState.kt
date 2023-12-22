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

@ABIMarker(CameraOcclusionState.ABI::class)
@Signature("rc(Windows.Media.Devices.CameraOcclusionState;{430adeb8-6842-5e55-9bde-04b4ef3a8a57})")
@WinRTByReference(brClass = CameraOcclusionState.ByReference::class)
public class CameraOcclusionState(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICameraOcclusionState.WithDefault, IWinRTObject {
  private val __401809366_Interface: ICameraOcclusionState.WithDefault by lazy {
    as_401809366()
  }


  public override val __401809366_Ptr: JNAPointer? by lazy {
    __401809366_Interface.__401809366_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__401809366_Interface)

  private fun as_401809366(): ICameraOcclusionState.WithDefault {
    if(pointer == NULL) {
      return(ICameraOcclusionState.ABI.makeICameraOcclusionState(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICameraOcclusionState>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICameraOcclusionState.ABI.makeICameraOcclusionState(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CameraOcclusionState> {
    public override fun getValue() = CameraOcclusionState(pointer.getPointer(0))

    public fun setValue(value: CameraOcclusionState): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CameraOcclusionState, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CameraOcclusionState {
      val address = segment.toRawLongValue()
      return CameraOcclusionState(Pointer(address))
    }

    public override fun toNative(obj: CameraOcclusionState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
