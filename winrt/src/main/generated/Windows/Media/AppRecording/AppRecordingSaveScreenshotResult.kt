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

@ABIMarker(AppRecordingSaveScreenshotResult.ABI::class)
@Signature("rc(Windows.Media.AppRecording.AppRecordingSaveScreenshotResult;{9c5b8d0a-0abb-4457-aaee-24f9c12ec778})")
@WinRTByReference(brClass = AppRecordingSaveScreenshotResult.ByReference::class)
public class AppRecordingSaveScreenshotResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppRecordingSaveScreenshotResult.WithDefault, IWinRTObject {
  private val __797273716_Interface: IAppRecordingSaveScreenshotResult.WithDefault by lazy {
    as_797273716()
  }


  public override val __797273716_Ptr: JNAPointer? by lazy {
    __797273716_Interface.__797273716_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__797273716_Interface)

  private fun as_797273716(): IAppRecordingSaveScreenshotResult.WithDefault {
    if(pointer == NULL) {
      return(IAppRecordingSaveScreenshotResult.ABI.makeIAppRecordingSaveScreenshotResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppRecordingSaveScreenshotResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppRecordingSaveScreenshotResult.ABI.makeIAppRecordingSaveScreenshotResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppRecordingSaveScreenshotResult> {
    public override fun getValue() = AppRecordingSaveScreenshotResult(pointer.getPointer(0))

    public fun setValue(value: AppRecordingSaveScreenshotResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppRecordingSaveScreenshotResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppRecordingSaveScreenshotResult {
      val address = segment.toRawLongValue()
      return AppRecordingSaveScreenshotResult(Pointer(address))
    }

    public override fun toNative(obj: AppRecordingSaveScreenshotResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
