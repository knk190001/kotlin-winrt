package Windows.Management.Deployment

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

@ABIMarker(CreateSharedPackageContainerOptions.ABI::class)
@Signature("rc(Windows.Management.Deployment.CreateSharedPackageContainerOptions;{c2ab6ece-f664-5c8e-a4b3-2a33276d3dde})")
@WinRTByReference(brClass = CreateSharedPackageContainerOptions.ByReference::class)
public class CreateSharedPackageContainerOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICreateSharedPackageContainerOptions.WithDefault, IWinRTObject {
  private val __538738174_Interface: ICreateSharedPackageContainerOptions.WithDefault by lazy {
    as_538738174()
  }


  public override val __538738174_Ptr: JNAPointer? by lazy {
    __538738174_Interface.__538738174_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__538738174_Interface)

  public constructor() : this(ABI.activate())

  private fun as_538738174(): ICreateSharedPackageContainerOptions.WithDefault {
    if(pointer == NULL) {
      return(ICreateSharedPackageContainerOptions.ABI.makeICreateSharedPackageContainerOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateSharedPackageContainerOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateSharedPackageContainerOptions.ABI.makeICreateSharedPackageContainerOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CreateSharedPackageContainerOptions> {
    public override fun getValue() = CreateSharedPackageContainerOptions(pointer.getPointer(0))

    public fun setValue(value: CreateSharedPackageContainerOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CreateSharedPackageContainerOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.CreateSharedPackageContainerOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CreateSharedPackageContainerOptions {
      val address = segment.toRawLongValue()
      return CreateSharedPackageContainerOptions(Pointer(address))
    }

    public override fun toNative(obj: CreateSharedPackageContainerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
