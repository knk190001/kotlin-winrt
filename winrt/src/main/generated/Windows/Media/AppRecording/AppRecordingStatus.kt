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

@ABIMarker(AppRecordingStatus.ABI::class)
@Signature("rc(Windows.Media.AppRecording.AppRecordingStatus;{1d0cc82c-bc18-4b8a-a6ef-127efab3b5d9})")
@WinRTByReference(brClass = AppRecordingStatus.ByReference::class)
public class AppRecordingStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppRecordingStatus.WithDefault, IWinRTObject {
  private val __819918682_Interface: IAppRecordingStatus.WithDefault by lazy {
    as_819918682()
  }


  public override val __819918682_Ptr: JNAPointer? by lazy {
    __819918682_Interface.__819918682_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__819918682_Interface)

  private fun as_819918682(): IAppRecordingStatus.WithDefault {
    if(pointer == NULL) {
      return(IAppRecordingStatus.ABI.makeIAppRecordingStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppRecordingStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppRecordingStatus.ABI.makeIAppRecordingStatus(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppRecordingStatus> {
    public override fun getValue() = AppRecordingStatus(pointer.getPointer(0))

    public fun setValue(value: AppRecordingStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppRecordingStatus, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppRecordingStatus {
      val address = segment.toRawLongValue()
      return AppRecordingStatus(Pointer(address))
    }

    public override fun toNative(obj: AppRecordingStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
