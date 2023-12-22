package Windows.Security.EnterpriseData

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

@ABIMarker(DataProtectionInfo.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.DataProtectionInfo;{8420b0c1-5e31-4405-9540-3f943af0cb26})")
@WinRTByReference(brClass = DataProtectionInfo.ByReference::class)
public class DataProtectionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataProtectionInfo.WithDefault, IWinRTObject {
  private val __2061310388_Interface: IDataProtectionInfo.WithDefault by lazy {
    as_2061310388()
  }


  public override val __2061310388_Ptr: JNAPointer? by lazy {
    __2061310388_Interface.__2061310388_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2061310388_Interface)

  private fun as_2061310388(): IDataProtectionInfo.WithDefault {
    if(pointer == NULL) {
      return(IDataProtectionInfo.ABI.makeIDataProtectionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataProtectionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataProtectionInfo.ABI.makeIDataProtectionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataProtectionInfo> {
    public override fun getValue() = DataProtectionInfo(pointer.getPointer(0))

    public fun setValue(value: DataProtectionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataProtectionInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataProtectionInfo {
      val address = segment.toRawLongValue()
      return DataProtectionInfo(Pointer(address))
    }

    public override fun toNative(obj: DataProtectionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
