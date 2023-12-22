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

@ABIMarker(UpdateSharedPackageContainerOptions.ABI::class)
@Signature("rc(Windows.Management.Deployment.UpdateSharedPackageContainerOptions;{80672e83-7194-59f9-b5b9-daa5375f130a})")
@WinRTByReference(brClass = UpdateSharedPackageContainerOptions.ByReference::class)
public class UpdateSharedPackageContainerOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUpdateSharedPackageContainerOptions.WithDefault, IWinRTObject {
  private val __1665316177_Interface: IUpdateSharedPackageContainerOptions.WithDefault by lazy {
    as_1665316177()
  }


  public override val __1665316177_Ptr: JNAPointer? by lazy {
    __1665316177_Interface.__1665316177_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1665316177_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1665316177(): IUpdateSharedPackageContainerOptions.WithDefault {
    if(pointer == NULL) {
      return(IUpdateSharedPackageContainerOptions.ABI.makeIUpdateSharedPackageContainerOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUpdateSharedPackageContainerOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUpdateSharedPackageContainerOptions.ABI.makeIUpdateSharedPackageContainerOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UpdateSharedPackageContainerOptions> {
    public override fun getValue() = UpdateSharedPackageContainerOptions(pointer.getPointer(0))

    public fun setValue(value: UpdateSharedPackageContainerOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UpdateSharedPackageContainerOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.UpdateSharedPackageContainerOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): UpdateSharedPackageContainerOptions {
      val address = segment.toRawLongValue()
      return UpdateSharedPackageContainerOptions(Pointer(address))
    }

    public override fun toNative(obj: UpdateSharedPackageContainerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
