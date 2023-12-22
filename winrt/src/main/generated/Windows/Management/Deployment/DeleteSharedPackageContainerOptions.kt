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

@ABIMarker(DeleteSharedPackageContainerOptions.ABI::class)
@Signature("rc(Windows.Management.Deployment.DeleteSharedPackageContainerOptions;{9d81865f-986e-5138-8b5d-384d8e66ed6c})")
@WinRTByReference(brClass = DeleteSharedPackageContainerOptions.ByReference::class)
public class DeleteSharedPackageContainerOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeleteSharedPackageContainerOptions.WithDefault, IWinRTObject {
  private val __33592401_Interface: IDeleteSharedPackageContainerOptions.WithDefault by lazy {
    as_33592401()
  }


  public override val __33592401_Ptr: JNAPointer? by lazy {
    __33592401_Interface.__33592401_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__33592401_Interface)

  public constructor() : this(ABI.activate())

  private fun as_33592401(): IDeleteSharedPackageContainerOptions.WithDefault {
    if(pointer == NULL) {
      return(IDeleteSharedPackageContainerOptions.ABI.makeIDeleteSharedPackageContainerOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeleteSharedPackageContainerOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeleteSharedPackageContainerOptions.ABI.makeIDeleteSharedPackageContainerOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeleteSharedPackageContainerOptions> {
    public override fun getValue() = DeleteSharedPackageContainerOptions(pointer.getPointer(0))

    public fun setValue(value: DeleteSharedPackageContainerOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeleteSharedPackageContainerOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.DeleteSharedPackageContainerOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DeleteSharedPackageContainerOptions {
      val address = segment.toRawLongValue()
      return DeleteSharedPackageContainerOptions(Pointer(address))
    }

    public override fun toNative(obj: DeleteSharedPackageContainerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
