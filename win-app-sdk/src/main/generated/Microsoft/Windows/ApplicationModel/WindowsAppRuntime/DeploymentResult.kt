package Microsoft.Windows.ApplicationModel.WindowsAppRuntime

import Microsoft.Windows.ApplicationModel.WindowsAppRuntime.IDeploymentResultFactory.ABI.IID
import Windows.Foundation.HResult
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

@ABIMarker(DeploymentResult.ABI::class)
@Signature("rc(Microsoft.Windows.ApplicationModel.WindowsAppRuntime.DeploymentResult;{27203f62-463d-587a-8eb7-870098901078})")
@WinRTByReference(brClass = DeploymentResult.ByReference::class)
public class DeploymentResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeploymentResult.WithDefault, IWinRTObject {
  private val __784640187_Interface: IDeploymentResult.WithDefault by lazy {
    as_784640187()
  }


  public override val __784640187_Ptr: JNAPointer? by lazy {
    __784640187_Interface.__784640187_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__784640187_Interface)

  public constructor(status: DeploymentStatus, extendedError: HResult) : this(ABI.activate(status,
      extendedError))

  private fun as_784640187(): IDeploymentResult.WithDefault {
    if(pointer == NULL) {
      return(IDeploymentResult.ABI.makeIDeploymentResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeploymentResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeploymentResult.ABI.makeIDeploymentResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeploymentResult> {
    public override fun getValue() = DeploymentResult(pointer.getPointer(0))

    public fun setValue(value: DeploymentResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeploymentResult, MemoryAddress> {
    public val IDeploymentResultFactory_Instance: IDeploymentResultFactory by lazy {
      createIDeploymentResultFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeploymentResultFactory(): IDeploymentResultFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.WindowsAppRuntime.DeploymentResult".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDeploymentResultFactory.ABI.makeIDeploymentResultFactory(factoryActivatorPtr.value))
    }

    public fun activate(status: DeploymentStatus, extendedError: HResult): JNAPointer? =
        IDeploymentResultFactory_Instance.CreateInstance(status, extendedError)?.pointer

    public override fun fromNative(segment: MemoryAddress): DeploymentResult {
      val address = segment.toRawLongValue()
      return DeploymentResult(Pointer(address))
    }

    public override fun toNative(obj: DeploymentResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
