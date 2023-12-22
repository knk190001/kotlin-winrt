package Microsoft.Windows.ApplicationModel.WindowsAppRuntime

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

@ABIMarker(DeploymentInitializeOptions.ABI::class)
@Signature("rc(Microsoft.Windows.ApplicationModel.WindowsAppRuntime.DeploymentInitializeOptions;{578a5fd4-9d7f-5e01-97b8-d8ea61db4027})")
@WinRTByReference(brClass = DeploymentInitializeOptions.ByReference::class)
public class DeploymentInitializeOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeploymentInitializeOptions.WithDefault,
    IDeploymentInitializeOptions2.WithDefault, IWinRTObject {
  private val __137141872_Interface: IDeploymentInitializeOptions.WithDefault by lazy {
    as_137141872()
  }


  private val __43569314_Interface: IDeploymentInitializeOptions2.WithDefault by lazy {
    as_43569314()
  }


  public override val __137141872_Ptr: JNAPointer? by lazy {
    __137141872_Interface.__137141872_Ptr
  }


  public override val __43569314_Ptr: JNAPointer? by lazy {
    __43569314_Interface.__43569314_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__137141872_Interface, __43569314_Interface)

  public constructor() : this(ABI.activate())

  private fun as_137141872(): IDeploymentInitializeOptions.WithDefault {
    if(pointer == NULL) {
      return(IDeploymentInitializeOptions.ABI.makeIDeploymentInitializeOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeploymentInitializeOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeploymentInitializeOptions.ABI.makeIDeploymentInitializeOptions(ref.value))
  }

  private fun as_43569314(): IDeploymentInitializeOptions2.WithDefault {
    if(pointer == NULL) {
      return(IDeploymentInitializeOptions2.ABI.makeIDeploymentInitializeOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeploymentInitializeOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeploymentInitializeOptions2.ABI.makeIDeploymentInitializeOptions2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeploymentInitializeOptions> {
    public override fun getValue() = DeploymentInitializeOptions(pointer.getPointer(0))

    public fun setValue(value: DeploymentInitializeOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeploymentInitializeOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.WindowsAppRuntime.DeploymentInitializeOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DeploymentInitializeOptions {
      val address = segment.toRawLongValue()
      return DeploymentInitializeOptions(Pointer(address))
    }

    public override fun toNative(obj: DeploymentInitializeOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
