package Windows.Management.Deployment

import Windows.ApplicationModel.AppInstallerInfo
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(AutoUpdateSettingsOptions.ABI::class)
@Signature("rc(Windows.Management.Deployment.AutoUpdateSettingsOptions;{67491d87-35e1-512a-8968-1ae88d1be6d3})")
@WinRTByReference(brClass = AutoUpdateSettingsOptions.ByReference::class)
public class AutoUpdateSettingsOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutoUpdateSettingsOptions.WithDefault, IWinRTObject {
  private val __294232575_Interface: IAutoUpdateSettingsOptions.WithDefault by lazy {
    as_294232575()
  }


  public override val __294232575_Ptr: JNAPointer? by lazy {
    __294232575_Interface.__294232575_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__294232575_Interface)

  public constructor() : this(ABI.activate())

  private fun as_294232575(): IAutoUpdateSettingsOptions.WithDefault {
    if(pointer == NULL) {
      return(IAutoUpdateSettingsOptions.ABI.makeIAutoUpdateSettingsOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoUpdateSettingsOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoUpdateSettingsOptions.ABI.makeIAutoUpdateSettingsOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutoUpdateSettingsOptions> {
    public override fun getValue() = AutoUpdateSettingsOptions(pointer.getPointer(0))

    public fun setValue(value: AutoUpdateSettingsOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutoUpdateSettingsOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAutoUpdateSettingsOptionsStatics_Instance: IAutoUpdateSettingsOptionsStatics by
        lazy {
      createIAutoUpdateSettingsOptionsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.AutoUpdateSettingsOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIAutoUpdateSettingsOptionsStatics(): IAutoUpdateSettingsOptionsStatics {
      val refiid = Guid.REFIID(IAutoUpdateSettingsOptionsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.AutoUpdateSettingsOptions".toHandle(),refiid,interfacePtr)
      val result =
          IAutoUpdateSettingsOptionsStatics.ABI.makeIAutoUpdateSettingsOptionsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AutoUpdateSettingsOptions {
      val address = segment.toRawLongValue()
      return AutoUpdateSettingsOptions(Pointer(address))
    }

    public override fun toNative(obj: AutoUpdateSettingsOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromAppInstallerInfo(appInstallerInfo: AppInstallerInfo) =
        ABI.IAutoUpdateSettingsOptionsStatics_Instance.CreateFromAppInstallerInfo(appInstallerInfo)
  }
}
