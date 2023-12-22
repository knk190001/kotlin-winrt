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

@ABIMarker(StagePackageOptions.ABI::class)
@Signature("rc(Windows.Management.Deployment.StagePackageOptions;{0b110c9c-b95d-4c56-bd36-6d656800d06b})")
@WinRTByReference(brClass = StagePackageOptions.ByReference::class)
public class StagePackageOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStagePackageOptions.WithDefault, IWinRTObject {
  private val __1601357166_Interface: IStagePackageOptions.WithDefault by lazy {
    as_1601357166()
  }


  public override val __1601357166_Ptr: JNAPointer? by lazy {
    __1601357166_Interface.__1601357166_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1601357166_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1601357166(): IStagePackageOptions.WithDefault {
    if(pointer == NULL) {
      return(IStagePackageOptions.ABI.makeIStagePackageOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStagePackageOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStagePackageOptions.ABI.makeIStagePackageOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StagePackageOptions> {
    public override fun getValue() = StagePackageOptions(pointer.getPointer(0))

    public fun setValue(value: StagePackageOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StagePackageOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.StagePackageOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): StagePackageOptions {
      val address = segment.toRawLongValue()
      return StagePackageOptions(Pointer(address))
    }

    public override fun toNative(obj: StagePackageOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
