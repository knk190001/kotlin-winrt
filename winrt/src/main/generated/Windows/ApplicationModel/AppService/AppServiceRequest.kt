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

@ABIMarker(AppServiceRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppService.AppServiceRequest;{20e58d9d-18de-4b01-80ba-90a76204e3c8})")
@WinRTByReference(brClass = AppServiceRequest.ByReference::class)
public class AppServiceRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppServiceRequest.WithDefault, IWinRTObject {
  private val __1462334608_Interface: IAppServiceRequest.WithDefault by lazy {
    as_1462334608()
  }


  public override val __1462334608_Ptr: JNAPointer? by lazy {
    __1462334608_Interface.__1462334608_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1462334608_Interface)

  private fun as_1462334608(): IAppServiceRequest.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceRequest.ABI.makeIAppServiceRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceRequest.ABI.makeIAppServiceRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppServiceRequest> {
    public override fun getValue() = AppServiceRequest(pointer.getPointer(0))

    public fun setValue(value: AppServiceRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppServiceRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppServiceRequest {
      val address = segment.toRawLongValue()
      return AppServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: AppServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
