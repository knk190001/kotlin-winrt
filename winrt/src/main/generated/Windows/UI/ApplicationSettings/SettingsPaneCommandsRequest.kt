package Windows.UI.ApplicationSettings

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

@ABIMarker(SettingsPaneCommandsRequest.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest;{44df23ae-5d6e-4068-a168-f47643182114})")
@WinRTByReference(brClass = SettingsPaneCommandsRequest.ByReference::class)
public class SettingsPaneCommandsRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISettingsPaneCommandsRequest.WithDefault, IWinRTObject {
  private val __575703095_Interface: ISettingsPaneCommandsRequest.WithDefault by lazy {
    as_575703095()
  }


  public override val __575703095_Ptr: JNAPointer? by lazy {
    __575703095_Interface.__575703095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__575703095_Interface)

  private fun as_575703095(): ISettingsPaneCommandsRequest.WithDefault {
    if(pointer == NULL) {
      return(ISettingsPaneCommandsRequest.ABI.makeISettingsPaneCommandsRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISettingsPaneCommandsRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISettingsPaneCommandsRequest.ABI.makeISettingsPaneCommandsRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SettingsPaneCommandsRequest> {
    public override fun getValue() = SettingsPaneCommandsRequest(pointer.getPointer(0))

    public fun setValue(value: SettingsPaneCommandsRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SettingsPaneCommandsRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SettingsPaneCommandsRequest {
      val address = segment.toRawLongValue()
      return SettingsPaneCommandsRequest(Pointer(address))
    }

    public override fun toNative(obj: SettingsPaneCommandsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
