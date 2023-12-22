package Windows.Security.Cryptography.Certificates

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

@ABIMarker(ChainBuildingParameters.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.ChainBuildingParameters;{422ba922-7c8d-47b7-b59b-b12703733ac3})")
@WinRTByReference(brClass = ChainBuildingParameters.ByReference::class)
public class ChainBuildingParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChainBuildingParameters.WithDefault, IWinRTObject {
  private val __2081792335_Interface: IChainBuildingParameters.WithDefault by lazy {
    as_2081792335()
  }


  public override val __2081792335_Ptr: JNAPointer? by lazy {
    __2081792335_Interface.__2081792335_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2081792335_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2081792335(): IChainBuildingParameters.WithDefault {
    if(pointer == NULL) {
      return(IChainBuildingParameters.ABI.makeIChainBuildingParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChainBuildingParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChainBuildingParameters.ABI.makeIChainBuildingParameters(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChainBuildingParameters> {
    public override fun getValue() = ChainBuildingParameters(pointer.getPointer(0))

    public fun setValue(value: ChainBuildingParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChainBuildingParameters, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.ChainBuildingParameters".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ChainBuildingParameters {
      val address = segment.toRawLongValue()
      return ChainBuildingParameters(Pointer(address))
    }

    public override fun toNative(obj: ChainBuildingParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
