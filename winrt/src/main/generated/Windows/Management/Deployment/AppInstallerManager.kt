package Windows.Management.Deployment

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppInstallerManager.ABI::class)
@Signature("rc(Windows.Management.Deployment.AppInstallerManager;{e7ee21c3-2103-53ee-9b18-68afeab0033d})")
@WinRTByReference(brClass = AppInstallerManager.ByReference::class)
public class AppInstallerManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInstallerManager.WithDefault, IWinRTObject {
  private val __1078209598_Interface: IAppInstallerManager.WithDefault by lazy {
    as_1078209598()
  }


  public override val __1078209598_Ptr: JNAPointer? by lazy {
    __1078209598_Interface.__1078209598_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1078209598_Interface)

  private fun as_1078209598(): IAppInstallerManager.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallerManager.ABI.makeIAppInstallerManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallerManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallerManager.ABI.makeIAppInstallerManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppInstallerManager> {
    public override fun getValue() = AppInstallerManager(pointer.getPointer(0))

    public fun setValue(value: AppInstallerManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppInstallerManager, MemoryAddress> {
    public val IAppInstallerManagerStatics_Instance: IAppInstallerManagerStatics by lazy {
      createIAppInstallerManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppInstallerManagerStatics(): IAppInstallerManagerStatics {
      val refiid = Guid.REFIID(IAppInstallerManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.AppInstallerManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppInstallerManagerStatics.ABI.makeIAppInstallerManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppInstallerManager {
      val address = segment.toRawLongValue()
      return AppInstallerManager(Pointer(address))
    }

    public override fun toNative(obj: AppInstallerManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IAppInstallerManagerStatics_Instance.GetDefault()

    public fun GetForSystem() = ABI.IAppInstallerManagerStatics_Instance.GetForSystem()
  }
}
