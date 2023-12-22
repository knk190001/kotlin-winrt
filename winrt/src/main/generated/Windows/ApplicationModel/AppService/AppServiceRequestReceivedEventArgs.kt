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

@ABIMarker(AppServiceRequestReceivedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppService.AppServiceRequestReceivedEventArgs;{6e122360-ff65-44ae-9e45-857fe4180681})")
@WinRTByReference(brClass = AppServiceRequestReceivedEventArgs.ByReference::class)
public class AppServiceRequestReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppServiceRequestReceivedEventArgs.WithDefault, IWinRTObject {
  private val __1218945062_Interface: IAppServiceRequestReceivedEventArgs.WithDefault by lazy {
    as_1218945062()
  }


  public override val __1218945062_Ptr: JNAPointer? by lazy {
    __1218945062_Interface.__1218945062_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1218945062_Interface)

  private fun as_1218945062(): IAppServiceRequestReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceRequestReceivedEventArgs.ABI.makeIAppServiceRequestReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceRequestReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceRequestReceivedEventArgs.ABI.makeIAppServiceRequestReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppServiceRequestReceivedEventArgs> {
    public override fun getValue() = AppServiceRequestReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppServiceRequestReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppServiceRequestReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppServiceRequestReceivedEventArgs {
      val address = segment.toRawLongValue()
      return AppServiceRequestReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppServiceRequestReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
