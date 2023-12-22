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

@ABIMarker(AppRecordingStatusDetails.ABI::class)
@Signature("rc(Windows.Media.AppRecording.AppRecordingStatusDetails;{b538a9b0-14ed-4412-ac45-6d672c9c9949})")
@WinRTByReference(brClass = AppRecordingStatusDetails.ByReference::class)
public class AppRecordingStatusDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppRecordingStatusDetails.WithDefault, IWinRTObject {
  private val __1060805308_Interface: IAppRecordingStatusDetails.WithDefault by lazy {
    as_1060805308()
  }


  public override val __1060805308_Ptr: JNAPointer? by lazy {
    __1060805308_Interface.__1060805308_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1060805308_Interface)

  private fun as_1060805308(): IAppRecordingStatusDetails.WithDefault {
    if(pointer == NULL) {
      return(IAppRecordingStatusDetails.ABI.makeIAppRecordingStatusDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppRecordingStatusDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppRecordingStatusDetails.ABI.makeIAppRecordingStatusDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppRecordingStatusDetails> {
    public override fun getValue() = AppRecordingStatusDetails(pointer.getPointer(0))

    public fun setValue(value: AppRecordingStatusDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppRecordingStatusDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppRecordingStatusDetails {
      val address = segment.toRawLongValue()
      return AppRecordingStatusDetails(Pointer(address))
    }

    public override fun toNative(obj: AppRecordingStatusDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
