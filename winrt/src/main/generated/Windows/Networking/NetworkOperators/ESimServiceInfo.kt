package Windows.Networking.NetworkOperators

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

@ABIMarker(ESimServiceInfo.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimServiceInfo;{f16aabcf-7f59-4a51-8494-bd89d5ff50ee})")
@WinRTByReference(brClass = ESimServiceInfo.ByReference::class)
public class ESimServiceInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimServiceInfo.WithDefault, IWinRTObject {
  private val __1983053736_Interface: IESimServiceInfo.WithDefault by lazy {
    as_1983053736()
  }


  public override val __1983053736_Ptr: JNAPointer? by lazy {
    __1983053736_Interface.__1983053736_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1983053736_Interface)

  private fun as_1983053736(): IESimServiceInfo.WithDefault {
    if(pointer == NULL) {
      return(IESimServiceInfo.ABI.makeIESimServiceInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimServiceInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimServiceInfo.ABI.makeIESimServiceInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ESimServiceInfo> {
    public override fun getValue() = ESimServiceInfo(pointer.getPointer(0))

    public fun setValue(value: ESimServiceInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimServiceInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimServiceInfo {
      val address = segment.toRawLongValue()
      return ESimServiceInfo(Pointer(address))
    }

    public override fun toNative(obj: ESimServiceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
