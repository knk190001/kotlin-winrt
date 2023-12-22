package Windows.Phone.Notification.Management

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

@ABIMarker(VolumeInfo.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.VolumeInfo;{944dd118-7704-4481-b92e-d3ed3ece6322})")
@WinRTByReference(brClass = VolumeInfo.ByReference::class)
public class VolumeInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVolumeInfo.WithDefault, IWinRTObject {
  private val __583095030_Interface: IVolumeInfo.WithDefault by lazy {
    as_583095030()
  }


  public override val __583095030_Ptr: JNAPointer? by lazy {
    __583095030_Interface.__583095030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__583095030_Interface)

  private fun as_583095030(): IVolumeInfo.WithDefault {
    if(pointer == NULL) {
      return(IVolumeInfo.ABI.makeIVolumeInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVolumeInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVolumeInfo.ABI.makeIVolumeInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VolumeInfo> {
    public override fun getValue() = VolumeInfo(pointer.getPointer(0))

    public fun setValue(value: VolumeInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VolumeInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VolumeInfo {
      val address = segment.toRawLongValue()
      return VolumeInfo(Pointer(address))
    }

    public override fun toNative(obj: VolumeInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
