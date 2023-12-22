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

@ABIMarker(SystemIdentificationInfo.ABI::class)
@Signature("rc(Windows.System.Profile.SystemIdentificationInfo;{0c659e7d-c3c2-4d33-a2df-21bc41916eb3})")
@WinRTByReference(brClass = SystemIdentificationInfo.ByReference::class)
public class SystemIdentificationInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemIdentificationInfo.WithDefault, IWinRTObject {
  private val __1484112897_Interface: ISystemIdentificationInfo.WithDefault by lazy {
    as_1484112897()
  }


  public override val __1484112897_Ptr: JNAPointer? by lazy {
    __1484112897_Interface.__1484112897_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1484112897_Interface)

  private fun as_1484112897(): ISystemIdentificationInfo.WithDefault {
    if(pointer == NULL) {
      return(ISystemIdentificationInfo.ABI.makeISystemIdentificationInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemIdentificationInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemIdentificationInfo.ABI.makeISystemIdentificationInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemIdentificationInfo> {
    public override fun getValue() = SystemIdentificationInfo(pointer.getPointer(0))

    public fun setValue(value: SystemIdentificationInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemIdentificationInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemIdentificationInfo {
      val address = segment.toRawLongValue()
      return SystemIdentificationInfo(Pointer(address))
    }

    public override fun toNative(obj: SystemIdentificationInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
