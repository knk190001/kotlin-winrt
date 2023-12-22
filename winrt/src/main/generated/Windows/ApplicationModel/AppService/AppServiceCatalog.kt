package Windows.ApplicationModel.AppService

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppServiceCatalog.ABI::class)
@WinRTByReference(brClass = AppServiceCatalog.ByReference::class)
public class AppServiceCatalog(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppServiceCatalog> {
    public override fun getValue() = AppServiceCatalog(pointer.getPointer(0))

    public fun setValue(value: AppServiceCatalog): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppServiceCatalog, MemoryAddress> {
    public val IAppServiceCatalogStatics_Instance: IAppServiceCatalogStatics by lazy {
      createIAppServiceCatalogStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppServiceCatalogStatics(): IAppServiceCatalogStatics {
      val refiid = Guid.REFIID(IAppServiceCatalogStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.AppService.AppServiceCatalog".toHandle(),refiid,interfacePtr)
      val result = IAppServiceCatalogStatics.ABI.makeIAppServiceCatalogStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppServiceCatalog {
      val address = segment.toRawLongValue()
      return AppServiceCatalog(Pointer(address))
    }

    public override fun toNative(obj: AppServiceCatalog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindAppServiceProvidersAsync(appServiceName: String) =
        ABI.IAppServiceCatalogStatics_Instance.FindAppServiceProvidersAsync(appServiceName)
  }
}
