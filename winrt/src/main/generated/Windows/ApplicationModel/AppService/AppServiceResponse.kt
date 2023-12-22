package Windows.ApplicationModel.AppService

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

@ABIMarker(AppServiceResponse.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppService.AppServiceResponse;{8d503cec-9aa3-4e68-9559-9de63e372ce4})")
@WinRTByReference(brClass = AppServiceResponse.ByReference::class)
public class AppServiceResponse(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppServiceResponse.WithDefault, IWinRTObject {
  private val __1965201280_Interface: IAppServiceResponse.WithDefault by lazy {
    as_1965201280()
  }


  public override val __1965201280_Ptr: JNAPointer? by lazy {
    __1965201280_Interface.__1965201280_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1965201280_Interface)

  private fun as_1965201280(): IAppServiceResponse.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceResponse.ABI.makeIAppServiceResponse(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceResponse>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceResponse.ABI.makeIAppServiceResponse(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppServiceResponse> {
    public override fun getValue() = AppServiceResponse(pointer.getPointer(0))

    public fun setValue(value: AppServiceResponse): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppServiceResponse, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppServiceResponse {
      val address = segment.toRawLongValue()
      return AppServiceResponse(Pointer(address))
    }

    public override fun toNative(obj: AppServiceResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
