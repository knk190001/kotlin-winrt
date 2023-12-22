package Microsoft.Windows.ApplicationModel.WindowsAppRuntime

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DeploymentManager.ABI::class)
@WinRTByReference(brClass = DeploymentManager.ByReference::class)
public class DeploymentManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeploymentManager> {
    public override fun getValue() = DeploymentManager(pointer.getPointer(0))

    public fun setValue(value: DeploymentManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeploymentManager, MemoryAddress> {
    public val IDeploymentManagerStatics_Instance: IDeploymentManagerStatics by lazy {
      createIDeploymentManagerStatics()
    }


    public val IDeploymentManagerStatics2_Instance: IDeploymentManagerStatics2 by lazy {
      createIDeploymentManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeploymentManagerStatics(): IDeploymentManagerStatics {
      val refiid = Guid.REFIID(IDeploymentManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.WindowsAppRuntime.DeploymentManager".toHandle(),refiid,interfacePtr)
      val result = IDeploymentManagerStatics.ABI.makeIDeploymentManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIDeploymentManagerStatics2(): IDeploymentManagerStatics2 {
      val refiid = Guid.REFIID(IDeploymentManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.WindowsAppRuntime.DeploymentManager".toHandle(),refiid,interfacePtr)
      val result = IDeploymentManagerStatics2.ABI.makeIDeploymentManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DeploymentManager {
      val address = segment.toRawLongValue()
      return DeploymentManager(Pointer(address))
    }

    public override fun toNative(obj: DeploymentManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetStatus() = ABI.IDeploymentManagerStatics_Instance.GetStatus()

    public fun Initialize() = ABI.IDeploymentManagerStatics_Instance.Initialize()

    public fun Initialize(deploymentInitializeOptions: DeploymentInitializeOptions) =
        ABI.IDeploymentManagerStatics2_Instance.Initialize(deploymentInitializeOptions)
  }
}
