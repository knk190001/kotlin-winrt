package Microsoft.Windows.AppLifecycle

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

@ABIMarker(ActivationRegistrationManager.ABI::class)
@WinRTByReference(brClass = ActivationRegistrationManager.ByReference::class)
public class ActivationRegistrationManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ActivationRegistrationManager> {
    public override fun getValue() = ActivationRegistrationManager(pointer.getPointer(0))

    public fun setValue(value: ActivationRegistrationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivationRegistrationManager, MemoryAddress> {
    public val IActivationRegistrationManagerStatics_Instance: IActivationRegistrationManagerStatics
        by lazy {
      createIActivationRegistrationManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIActivationRegistrationManagerStatics():
        IActivationRegistrationManagerStatics {
      val refiid = Guid.REFIID(IActivationRegistrationManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppLifecycle.ActivationRegistrationManager".toHandle(),refiid,interfacePtr)
      val result =
          IActivationRegistrationManagerStatics.ABI.makeIActivationRegistrationManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ActivationRegistrationManager {
      val address = segment.toRawLongValue()
      return ActivationRegistrationManager(Pointer(address))
    }

    public override fun toNative(obj: ActivationRegistrationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RegisterForFileTypeActivation(
      supportedFileTypes: Array<String?>,
      logo: String,
      displayName: String,
      supportedVerbs: Array<String?>,
      exePath: String
    ) =
        ABI.IActivationRegistrationManagerStatics_Instance.RegisterForFileTypeActivation(supportedFileTypes,
        logo, displayName, supportedVerbs, exePath)

    public fun RegisterForProtocolActivation(
      scheme: String,
      logo: String,
      displayName: String,
      exePath: String
    ) = ABI.IActivationRegistrationManagerStatics_Instance.RegisterForProtocolActivation(scheme,
        logo, displayName, exePath)

    public fun RegisterForStartupActivation(taskId: String, exePath: String) =
        ABI.IActivationRegistrationManagerStatics_Instance.RegisterForStartupActivation(taskId,
        exePath)

    public fun UnregisterForFileTypeActivation(fileTypes: Array<String?>, exePath: String) =
        ABI.IActivationRegistrationManagerStatics_Instance.UnregisterForFileTypeActivation(fileTypes,
        exePath)

    public fun UnregisterForProtocolActivation(scheme: String, exePath: String) =
        ABI.IActivationRegistrationManagerStatics_Instance.UnregisterForProtocolActivation(scheme,
        exePath)

    public fun UnregisterForStartupActivation(taskId: String) =
        ABI.IActivationRegistrationManagerStatics_Instance.UnregisterForStartupActivation(taskId)
  }
}
