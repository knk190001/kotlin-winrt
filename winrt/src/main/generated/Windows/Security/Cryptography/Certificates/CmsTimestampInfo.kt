package Windows.Security.Cryptography.Certificates

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

@ABIMarker(CmsTimestampInfo.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.CmsTimestampInfo;{2f5f00f2-2c18-4f88-8435-c534086076f5})")
@WinRTByReference(brClass = CmsTimestampInfo.ByReference::class)
public class CmsTimestampInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICmsTimestampInfo.WithDefault, IWinRTObject {
  private val __1567273481_Interface: ICmsTimestampInfo.WithDefault by lazy {
    as_1567273481()
  }


  public override val __1567273481_Ptr: JNAPointer? by lazy {
    __1567273481_Interface.__1567273481_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1567273481_Interface)

  private fun as_1567273481(): ICmsTimestampInfo.WithDefault {
    if(pointer == NULL) {
      return(ICmsTimestampInfo.ABI.makeICmsTimestampInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICmsTimestampInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICmsTimestampInfo.ABI.makeICmsTimestampInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CmsTimestampInfo> {
    public override fun getValue() = CmsTimestampInfo(pointer.getPointer(0))

    public fun setValue(value: CmsTimestampInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CmsTimestampInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CmsTimestampInfo {
      val address = segment.toRawLongValue()
      return CmsTimestampInfo(Pointer(address))
    }

    public override fun toNative(obj: CmsTimestampInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
