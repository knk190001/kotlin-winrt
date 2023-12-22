package Windows.Management.Core

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

@ABIMarker(ApplicationDataManager.ABI::class)
@Signature("rc(Windows.Management.Core.ApplicationDataManager;{74d10432-2e99-4000-9a3a-64307e858129})")
@WinRTByReference(brClass = ApplicationDataManager.ByReference::class)
public class ApplicationDataManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplicationDataManager.WithDefault, IWinRTObject {
  private val __1658492643_Interface: IApplicationDataManager.WithDefault by lazy {
    as_1658492643()
  }


  public override val __1658492643_Ptr: JNAPointer? by lazy {
    __1658492643_Interface.__1658492643_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1658492643_Interface)

  private fun as_1658492643(): IApplicationDataManager.WithDefault {
    if(pointer == NULL) {
      return(IApplicationDataManager.ABI.makeIApplicationDataManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationDataManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationDataManager.ABI.makeIApplicationDataManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationDataManager> {
    public override fun getValue() = ApplicationDataManager(pointer.getPointer(0))

    public fun setValue(value: ApplicationDataManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationDataManager, MemoryAddress> {
    public val IApplicationDataManagerStatics_Instance: IApplicationDataManagerStatics by lazy {
      createIApplicationDataManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIApplicationDataManagerStatics(): IApplicationDataManagerStatics {
      val refiid = Guid.REFIID(IApplicationDataManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Core.ApplicationDataManager".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationDataManagerStatics.ABI.makeIApplicationDataManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ApplicationDataManager {
      val address = segment.toRawLongValue()
      return ApplicationDataManager(Pointer(address))
    }

    public override fun toNative(obj: ApplicationDataManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForPackageFamily(packageFamilyName: String) =
        ABI.IApplicationDataManagerStatics_Instance.CreateForPackageFamily(packageFamilyName)
  }
}
