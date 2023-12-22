package Windows.System.Update

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

@ABIMarker(SystemUpdateLastErrorInfo.ABI::class)
@Signature("rc(Windows.System.Update.SystemUpdateLastErrorInfo;{7ee887f7-8a44-5b6e-bd07-7aece4116ea9})")
@WinRTByReference(brClass = SystemUpdateLastErrorInfo.ByReference::class)
public class SystemUpdateLastErrorInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemUpdateLastErrorInfo.WithDefault, IWinRTObject {
  private val __1995472508_Interface: ISystemUpdateLastErrorInfo.WithDefault by lazy {
    as_1995472508()
  }


  public override val __1995472508_Ptr: JNAPointer? by lazy {
    __1995472508_Interface.__1995472508_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1995472508_Interface)

  private fun as_1995472508(): ISystemUpdateLastErrorInfo.WithDefault {
    if(pointer == NULL) {
      return(ISystemUpdateLastErrorInfo.ABI.makeISystemUpdateLastErrorInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemUpdateLastErrorInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemUpdateLastErrorInfo.ABI.makeISystemUpdateLastErrorInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemUpdateLastErrorInfo> {
    public override fun getValue() = SystemUpdateLastErrorInfo(pointer.getPointer(0))

    public fun setValue(value: SystemUpdateLastErrorInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemUpdateLastErrorInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemUpdateLastErrorInfo {
      val address = segment.toRawLongValue()
      return SystemUpdateLastErrorInfo(Pointer(address))
    }

    public override fun toNative(obj: SystemUpdateLastErrorInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
