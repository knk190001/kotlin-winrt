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

@ABIMarker(FindSharedPackageContainerOptions.ABI::class)
@Signature("rc(Windows.Management.Deployment.FindSharedPackageContainerOptions;{b40fc8fe-8384-54cc-817d-ae09d3b6a606})")
@WinRTByReference(brClass = FindSharedPackageContainerOptions.ByReference::class)
public class FindSharedPackageContainerOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFindSharedPackageContainerOptions.WithDefault, IWinRTObject {
  private val __291418783_Interface: IFindSharedPackageContainerOptions.WithDefault by lazy {
    as_291418783()
  }


  public override val __291418783_Ptr: JNAPointer? by lazy {
    __291418783_Interface.__291418783_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__291418783_Interface)

  public constructor() : this(ABI.activate())

  private fun as_291418783(): IFindSharedPackageContainerOptions.WithDefault {
    if(pointer == NULL) {
      return(IFindSharedPackageContainerOptions.ABI.makeIFindSharedPackageContainerOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFindSharedPackageContainerOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFindSharedPackageContainerOptions.ABI.makeIFindSharedPackageContainerOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FindSharedPackageContainerOptions> {
    public override fun getValue() = FindSharedPackageContainerOptions(pointer.getPointer(0))

    public fun setValue(value: FindSharedPackageContainerOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FindSharedPackageContainerOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.FindSharedPackageContainerOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): FindSharedPackageContainerOptions {
      val address = segment.toRawLongValue()
      return FindSharedPackageContainerOptions(Pointer(address))
    }

    public override fun toNative(obj: FindSharedPackageContainerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
