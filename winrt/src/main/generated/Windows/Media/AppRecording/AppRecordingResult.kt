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

@ABIMarker(AppRecordingResult.ABI::class)
@Signature("rc(Windows.Media.AppRecording.AppRecordingResult;{3a900864-c66d-46f9-b2d9-5bc2dad070d7})")
@WinRTByReference(brClass = AppRecordingResult.ByReference::class)
public class AppRecordingResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppRecordingResult.WithDefault, IWinRTObject {
  private val __861863727_Interface: IAppRecordingResult.WithDefault by lazy {
    as_861863727()
  }


  public override val __861863727_Ptr: JNAPointer? by lazy {
    __861863727_Interface.__861863727_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__861863727_Interface)

  private fun as_861863727(): IAppRecordingResult.WithDefault {
    if(pointer == NULL) {
      return(IAppRecordingResult.ABI.makeIAppRecordingResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppRecordingResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppRecordingResult.ABI.makeIAppRecordingResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppRecordingResult> {
    public override fun getValue() = AppRecordingResult(pointer.getPointer(0))

    public fun setValue(value: AppRecordingResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppRecordingResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppRecordingResult {
      val address = segment.toRawLongValue()
      return AppRecordingResult(Pointer(address))
    }

    public override fun toNative(obj: AppRecordingResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
