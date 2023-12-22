package Windows.Security.Cryptography.Core

import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(KeyDerivationParameters.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Core.KeyDerivationParameters;{7bf05967-047b-4a8c-964a-469ffd5522e2})")
@WinRTByReference(brClass = KeyDerivationParameters.ByReference::class)
public class KeyDerivationParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyDerivationParameters.WithDefault, IKeyDerivationParameters2.WithDefault,
    IWinRTObject {
  private val __1487468853_Interface: IKeyDerivationParameters.WithDefault by lazy {
    as_1487468853()
  }


  private val __1133105763_Interface: IKeyDerivationParameters2.WithDefault by lazy {
    as_1133105763()
  }


  public override val __1487468853_Ptr: JNAPointer? by lazy {
    __1487468853_Interface.__1487468853_Ptr
  }


  public override val __1133105763_Ptr: JNAPointer? by lazy {
    __1133105763_Interface.__1133105763_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1487468853_Interface, __1133105763_Interface)

  private fun as_1487468853(): IKeyDerivationParameters.WithDefault {
    if(pointer == NULL) {
      return(IKeyDerivationParameters.ABI.makeIKeyDerivationParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyDerivationParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyDerivationParameters.ABI.makeIKeyDerivationParameters(ref.value))
  }

  private fun as_1133105763(): IKeyDerivationParameters2.WithDefault {
    if(pointer == NULL) {
      return(IKeyDerivationParameters2.ABI.makeIKeyDerivationParameters2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyDerivationParameters2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyDerivationParameters2.ABI.makeIKeyDerivationParameters2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyDerivationParameters> {
    public override fun getValue() = KeyDerivationParameters(pointer.getPointer(0))

    public fun setValue(value: KeyDerivationParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyDerivationParameters, MemoryAddress> {
    public val IKeyDerivationParametersStatics2_Instance: IKeyDerivationParametersStatics2 by lazy {
      createIKeyDerivationParametersStatics2()
    }


    public val IKeyDerivationParametersStatics_Instance: IKeyDerivationParametersStatics by lazy {
      createIKeyDerivationParametersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyDerivationParametersStatics2(): IKeyDerivationParametersStatics2 {
      val refiid = Guid.REFIID(IKeyDerivationParametersStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.KeyDerivationParameters".toHandle(),refiid,interfacePtr)
      val result =
          IKeyDerivationParametersStatics2.ABI.makeIKeyDerivationParametersStatics2(interfacePtr.value)
      return result
    }

    public fun createIKeyDerivationParametersStatics(): IKeyDerivationParametersStatics {
      val refiid = Guid.REFIID(IKeyDerivationParametersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.KeyDerivationParameters".toHandle(),refiid,interfacePtr)
      val result =
          IKeyDerivationParametersStatics.ABI.makeIKeyDerivationParametersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KeyDerivationParameters {
      val address = segment.toRawLongValue()
      return KeyDerivationParameters(Pointer(address))
    }

    public override fun toNative(obj: KeyDerivationParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun BuildForCapi1Kdf(capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm) =
        ABI.IKeyDerivationParametersStatics2_Instance.BuildForCapi1Kdf(capi1KdfTargetAlgorithm)

    public fun BuildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: WinDef.UINT) =
        ABI.IKeyDerivationParametersStatics_Instance.BuildForPbkdf2(pbkdf2Salt, iterationCount)

    public fun BuildForSP800108(label: IBuffer, context: IBuffer) =
        ABI.IKeyDerivationParametersStatics_Instance.BuildForSP800108(label, context)

    public fun BuildForSP80056a(
      algorithmId: IBuffer,
      partyUInfo: IBuffer,
      partyVInfo: IBuffer,
      suppPubInfo: IBuffer,
      suppPrivInfo: IBuffer
    ) = ABI.IKeyDerivationParametersStatics_Instance.BuildForSP80056a(algorithmId, partyUInfo,
        partyVInfo, suppPubInfo, suppPrivInfo)
  }
}
