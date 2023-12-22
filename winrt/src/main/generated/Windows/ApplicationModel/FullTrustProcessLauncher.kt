package Windows.ApplicationModel

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

@ABIMarker(FullTrustProcessLauncher.ABI::class)
@WinRTByReference(brClass = FullTrustProcessLauncher.ByReference::class)
public class FullTrustProcessLauncher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FullTrustProcessLauncher> {
    public override fun getValue() = FullTrustProcessLauncher(pointer.getPointer(0))

    public fun setValue(value: FullTrustProcessLauncher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FullTrustProcessLauncher, MemoryAddress> {
    public val IFullTrustProcessLauncherStatics_Instance: IFullTrustProcessLauncherStatics by lazy {
      createIFullTrustProcessLauncherStatics()
    }


    public val IFullTrustProcessLauncherStatics2_Instance: IFullTrustProcessLauncherStatics2 by
        lazy {
      createIFullTrustProcessLauncherStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFullTrustProcessLauncherStatics(): IFullTrustProcessLauncherStatics {
      val refiid = Guid.REFIID(IFullTrustProcessLauncherStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.FullTrustProcessLauncher".toHandle(),refiid,interfacePtr)
      val result =
          IFullTrustProcessLauncherStatics.ABI.makeIFullTrustProcessLauncherStatics(interfacePtr.value)
      return result
    }

    public fun createIFullTrustProcessLauncherStatics2(): IFullTrustProcessLauncherStatics2 {
      val refiid = Guid.REFIID(IFullTrustProcessLauncherStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.FullTrustProcessLauncher".toHandle(),refiid,interfacePtr)
      val result =
          IFullTrustProcessLauncherStatics2.ABI.makeIFullTrustProcessLauncherStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FullTrustProcessLauncher {
      val address = segment.toRawLongValue()
      return FullTrustProcessLauncher(Pointer(address))
    }

    public override fun toNative(obj: FullTrustProcessLauncher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LaunchFullTrustProcessForCurrentAppAsync() =
        ABI.IFullTrustProcessLauncherStatics_Instance.LaunchFullTrustProcessForCurrentAppAsync()

    public fun LaunchFullTrustProcessForCurrentAppAsync(parameterGroupId: String) =
        ABI.IFullTrustProcessLauncherStatics_Instance.LaunchFullTrustProcessForCurrentAppAsync(parameterGroupId)

    public fun LaunchFullTrustProcessForAppAsync(fullTrustPackageRelativeAppId: String) =
        ABI.IFullTrustProcessLauncherStatics_Instance.LaunchFullTrustProcessForAppAsync(fullTrustPackageRelativeAppId)

    public fun LaunchFullTrustProcessForAppAsync(fullTrustPackageRelativeAppId: String,
        parameterGroupId: String) =
        ABI.IFullTrustProcessLauncherStatics_Instance.LaunchFullTrustProcessForAppAsync(fullTrustPackageRelativeAppId,
        parameterGroupId)

    public fun LaunchFullTrustProcessForCurrentAppWithArgumentsAsync(commandLine: String) =
        ABI.IFullTrustProcessLauncherStatics2_Instance.LaunchFullTrustProcessForCurrentAppWithArgumentsAsync(commandLine)

    public fun LaunchFullTrustProcessForAppWithArgumentsAsync(fullTrustPackageRelativeAppId: String,
        commandLine: String) =
        ABI.IFullTrustProcessLauncherStatics2_Instance.LaunchFullTrustProcessForAppWithArgumentsAsync(fullTrustPackageRelativeAppId,
        commandLine)
  }
}
