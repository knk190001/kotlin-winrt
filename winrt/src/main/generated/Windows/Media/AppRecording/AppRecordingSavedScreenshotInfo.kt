package Windows.Media.AppRecording

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

@ABIMarker(AppRecordingSavedScreenshotInfo.ABI::class)
@Signature("rc(Windows.Media.AppRecording.AppRecordingSavedScreenshotInfo;{9b642d0a-189a-4d00-bf25-e1bb1249d594})")
@WinRTByReference(brClass = AppRecordingSavedScreenshotInfo.ByReference::class)
public class AppRecordingSavedScreenshotInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppRecordingSavedScreenshotInfo.WithDefault, IWinRTObject {
  private val __119371417_Interface: IAppRecordingSavedScreenshotInfo.WithDefault by lazy {
    as_119371417()
  }


  public override val __119371417_Ptr: JNAPointer? by lazy {
    __119371417_Interface.__119371417_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__119371417_Interface)

  private fun as_119371417(): IAppRecordingSavedScreenshotInfo.WithDefault {
    if(pointer == NULL) {
      return(IAppRecordingSavedScreenshotInfo.ABI.makeIAppRecordingSavedScreenshotInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppRecordingSavedScreenshotInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppRecordingSavedScreenshotInfo.ABI.makeIAppRecordingSavedScreenshotInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppRecordingSavedScreenshotInfo> {
    public override fun getValue() = AppRecordingSavedScreenshotInfo(pointer.getPointer(0))

    public fun setValue(value: AppRecordingSavedScreenshotInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppRecordingSavedScreenshotInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppRecordingSavedScreenshotInfo {
      val address = segment.toRawLongValue()
      return AppRecordingSavedScreenshotInfo(Pointer(address))
    }

    public override fun toNative(obj: AppRecordingSavedScreenshotInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
