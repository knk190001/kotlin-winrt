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

@ABIMarker(ChainValidationParameters.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.ChainValidationParameters;{c4743b4a-7eb0-4b56-a040-b9c8e655ddf3})")
@WinRTByReference(brClass = ChainValidationParameters.ByReference::class)
public class ChainValidationParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChainValidationParameters.WithDefault, IWinRTObject {
  private val __594735478_Interface: IChainValidationParameters.WithDefault by lazy {
    as_594735478()
  }


  public override val __594735478_Ptr: JNAPointer? by lazy {
    __594735478_Interface.__594735478_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__594735478_Interface)

  public constructor() : this(ABI.activate())

  private fun as_594735478(): IChainValidationParameters.WithDefault {
    if(pointer == NULL) {
      return(IChainValidationParameters.ABI.makeIChainValidationParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChainValidationParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChainValidationParameters.ABI.makeIChainValidationParameters(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChainValidationParameters> {
    public override fun getValue() = ChainValidationParameters(pointer.getPointer(0))

    public fun setValue(value: ChainValidationParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChainValidationParameters, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.ChainValidationParameters".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ChainValidationParameters {
      val address = segment.toRawLongValue()
      return ChainValidationParameters(Pointer(address))
    }

    public override fun toNative(obj: ChainValidationParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
