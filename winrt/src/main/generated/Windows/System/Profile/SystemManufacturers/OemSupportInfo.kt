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

@ABIMarker(OemSupportInfo.ABI::class)
@Signature("rc(Windows.System.Profile.SystemManufacturers.OemSupportInfo;{8d2eae55-87ef-4266-86d0-c4afbeb29bb9})")
@WinRTByReference(brClass = OemSupportInfo.ByReference::class)
public class OemSupportInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOemSupportInfo.WithDefault, IWinRTObject {
  private val __1658405781_Interface: IOemSupportInfo.WithDefault by lazy {
    as_1658405781()
  }


  public override val __1658405781_Ptr: JNAPointer? by lazy {
    __1658405781_Interface.__1658405781_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1658405781_Interface)

  private fun as_1658405781(): IOemSupportInfo.WithDefault {
    if(pointer == NULL) {
      return(IOemSupportInfo.ABI.makeIOemSupportInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOemSupportInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOemSupportInfo.ABI.makeIOemSupportInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<OemSupportInfo>
      {
    public override fun getValue() = OemSupportInfo(pointer.getPointer(0))

    public fun setValue(value: OemSupportInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OemSupportInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OemSupportInfo {
      val address = segment.toRawLongValue()
      return OemSupportInfo(Pointer(address))
    }

    public override fun toNative(obj: OemSupportInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
