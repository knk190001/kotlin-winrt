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

@ABIMarker(CameraOcclusionInfo.ABI::class)
@Signature("rc(Windows.Media.Devices.CameraOcclusionInfo;{af6c4ad0-a84d-5db6-be58-a5da21cfe011})")
@WinRTByReference(brClass = CameraOcclusionInfo.ByReference::class)
public class CameraOcclusionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICameraOcclusionInfo.WithDefault, IWinRTObject {
  private val __1398738443_Interface: ICameraOcclusionInfo.WithDefault by lazy {
    as_1398738443()
  }


  public override val __1398738443_Ptr: JNAPointer? by lazy {
    __1398738443_Interface.__1398738443_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1398738443_Interface)

  private fun as_1398738443(): ICameraOcclusionInfo.WithDefault {
    if(pointer == NULL) {
      return(ICameraOcclusionInfo.ABI.makeICameraOcclusionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICameraOcclusionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICameraOcclusionInfo.ABI.makeICameraOcclusionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CameraOcclusionInfo> {
    public override fun getValue() = CameraOcclusionInfo(pointer.getPointer(0))

    public fun setValue(value: CameraOcclusionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CameraOcclusionInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CameraOcclusionInfo {
      val address = segment.toRawLongValue()
      return CameraOcclusionInfo(Pointer(address))
    }

    public override fun toNative(obj: CameraOcclusionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
