package Windows.Phone.Management.Deployment

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Uri
import Windows.Management.Deployment.DeploymentOptions
import Windows.Management.Deployment.RemovalOptions
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InstallationManager.ABI::class)
@WinRTByReference(brClass = InstallationManager.ByReference::class)
public class InstallationManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InstallationManager> {
    public override fun getValue() = InstallationManager(pointer.getPointer(0))

    public fun setValue(value: InstallationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InstallationManager, MemoryAddress> {
    public val IInstallationManagerStatics2_Instance: IInstallationManagerStatics2 by lazy {
      createIInstallationManagerStatics2()
    }


    public val IInstallationManagerStatics_Instance: IInstallationManagerStatics by lazy {
      createIInstallationManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInstallationManagerStatics2(): IInstallationManagerStatics2 {
      val refiid = Guid.REFIID(IInstallationManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.Management.Deployment.InstallationManager".toHandle(),refiid,interfacePtr)
      val result =
          IInstallationManagerStatics2.ABI.makeIInstallationManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIInstallationManagerStatics(): IInstallationManagerStatics {
      val refiid = Guid.REFIID(IInstallationManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.Management.Deployment.InstallationManager".toHandle(),refiid,interfacePtr)
      val result =
          IInstallationManagerStatics.ABI.makeIInstallationManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InstallationManager {
      val address = segment.toRawLongValue()
      return InstallationManager(Pointer(address))
    }

    public override fun toNative(obj: InstallationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RemovePackageAsync(packageFullName: String, removalOptions: RemovalOptions) =
        ABI.IInstallationManagerStatics2_Instance.RemovePackageAsync(packageFullName,
        removalOptions)

    public fun RegisterPackageAsync(
      manifestUri: Uri,
      dependencyPackageUris: IIterable<Uri?>,
      deploymentOptions: DeploymentOptions
    ) = ABI.IInstallationManagerStatics2_Instance.RegisterPackageAsync(manifestUri,
        dependencyPackageUris, deploymentOptions)

    public fun FindPackages(packageName: String, packagePublisher: String) =
        ABI.IInstallationManagerStatics2_Instance.FindPackages(packageName, packagePublisher)

    public fun AddPackageAsync(title: String, sourceLocation: Uri) =
        ABI.IInstallationManagerStatics_Instance.AddPackageAsync(title, sourceLocation)

    public fun AddPackageAsync(
      title: String,
      sourceLocation: Uri,
      instanceId: String,
      offerId: String,
      license: Uri
    ) = ABI.IInstallationManagerStatics_Instance.AddPackageAsync(title, sourceLocation, instanceId,
        offerId, license)

    public fun GetPendingPackageInstalls() =
        ABI.IInstallationManagerStatics_Instance.GetPendingPackageInstalls()

    public fun FindPackagesForCurrentPublisher() =
        ABI.IInstallationManagerStatics_Instance.FindPackagesForCurrentPublisher()

    public fun FindPackages() = ABI.IInstallationManagerStatics_Instance.FindPackages()
  }
}
