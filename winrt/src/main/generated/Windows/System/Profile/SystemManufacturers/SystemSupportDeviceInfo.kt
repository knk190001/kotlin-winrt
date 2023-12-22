package Windows.System.Profile.SystemManufacturers

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

@ABIMarker(SystemSupportDeviceInfo.ABI::class)
@Signature("rc(Windows.System.Profile.SystemManufacturers.SystemSupportDeviceInfo;{05880b99-8247-441b-a996-a1784bab79a8})")
@WinRTByReference(brClass = SystemSupportDeviceInfo.ByReference::class)
public class SystemSupportDeviceInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemSupportDeviceInfo.WithDefault, IWinRTObject {
  private val __573546357_Interface: ISystemSupportDeviceInfo.WithDefault by lazy {
    as_573546357()
  }


  public override val __573546357_Ptr: JNAPointer? by lazy {
    __573546357_Interface.__573546357_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__573546357_Interface)

  private fun as_573546357(): ISystemSupportDeviceInfo.WithDefault {
    if(pointer == NULL) {
      return(ISystemSupportDeviceInfo.ABI.makeISystemSupportDeviceInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemSupportDeviceInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemSupportDeviceInfo.ABI.makeISystemSupportDeviceInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemSupportDeviceInfo> {
    public override fun getValue() = SystemSupportDeviceInfo(pointer.getPointer(0))

    public fun setValue(value: SystemSupportDeviceInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemSupportDeviceInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemSupportDeviceInfo {
      val address = segment.toRawLongValue()
      return SystemSupportDeviceInfo(Pointer(address))
    }

    public override fun toNative(obj: SystemSupportDeviceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
