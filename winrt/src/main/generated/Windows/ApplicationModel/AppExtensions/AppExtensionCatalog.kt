package Windows.ApplicationModel.AppExtensions

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppExtensionCatalog.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppExtensions.AppExtensionCatalog;{97872032-8426-4ad1-9084-92e88c2da200})")
@WinRTByReference(brClass = AppExtensionCatalog.ByReference::class)
public class AppExtensionCatalog(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppExtensionCatalog.WithDefault, IWinRTObject {
  private val __758960413_Interface: IAppExtensionCatalog.WithDefault by lazy {
    as_758960413()
  }


  public override val __758960413_Ptr: JNAPointer? by lazy {
    __758960413_Interface.__758960413_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__758960413_Interface)

  private fun as_758960413(): IAppExtensionCatalog.WithDefault {
    if(pointer == NULL) {
      return(IAppExtensionCatalog.ABI.makeIAppExtensionCatalog(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppExtensionCatalog>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppExtensionCatalog.ABI.makeIAppExtensionCatalog(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppExtensionCatalog> {
    public override fun getValue() = AppExtensionCatalog(pointer.getPointer(0))

    public fun setValue(value: AppExtensionCatalog): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppExtensionCatalog, MemoryAddress> {
    public val IAppExtensionCatalogStatics_Instance: IAppExtensionCatalogStatics by lazy {
      createIAppExtensionCatalogStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppExtensionCatalogStatics(): IAppExtensionCatalogStatics {
      val refiid = Guid.REFIID(IAppExtensionCatalogStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.AppExtensions.AppExtensionCatalog".toHandle(),refiid,interfacePtr)
      val result =
          IAppExtensionCatalogStatics.ABI.makeIAppExtensionCatalogStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppExtensionCatalog {
      val address = segment.toRawLongValue()
      return AppExtensionCatalog(Pointer(address))
    }

    public override fun toNative(obj: AppExtensionCatalog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Open(appExtensionName: String) =
        ABI.IAppExtensionCatalogStatics_Instance.Open(appExtensionName)
  }
}
