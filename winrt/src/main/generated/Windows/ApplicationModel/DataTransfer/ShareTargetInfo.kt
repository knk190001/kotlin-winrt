package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(ShareTargetInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ShareTargetInfo;{385be607-c6e8-4114-b294-28f3bb6f9904})")
@WinRTByReference(brClass = ShareTargetInfo.ByReference::class)
public class ShareTargetInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IShareTargetInfo.WithDefault, IWinRTObject {
  private val __579319532_Interface: IShareTargetInfo.WithDefault by lazy {
    as_579319532()
  }


  public override val __579319532_Ptr: JNAPointer? by lazy {
    __579319532_Interface.__579319532_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__579319532_Interface)

  private fun as_579319532(): IShareTargetInfo.WithDefault {
    if(pointer == NULL) {
      return(IShareTargetInfo.ABI.makeIShareTargetInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareTargetInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareTargetInfo.ABI.makeIShareTargetInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ShareTargetInfo> {
    public override fun getValue() = ShareTargetInfo(pointer.getPointer(0))

    public fun setValue(value: ShareTargetInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShareTargetInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ShareTargetInfo {
      val address = segment.toRawLongValue()
      return ShareTargetInfo(Pointer(address))
    }

    public override fun toNative(obj: ShareTargetInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
