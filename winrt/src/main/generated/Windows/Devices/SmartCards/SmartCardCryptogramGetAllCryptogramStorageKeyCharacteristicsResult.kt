package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult;{8c7ce857-a7e7-489d-b9d6-368061515012})")
@WinRTByReference(brClass =
    SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult.ByReference::class)
public class SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr),
    ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult.WithDefault, IWinRTObject {
  private val __943194320_Interface:
      ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult.WithDefault by lazy {
    as_943194320()
  }


  public override val __943194320_Ptr: JNAPointer? by lazy {
    __943194320_Interface.__943194320_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__943194320_Interface)

  public constructor() : this(ABI.activate())

  private fun as_943194320():
      ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult.ABI.makeISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult(NULL))
    }
    val refiid =
        Guid.REFIID(guidOf<ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult.ABI.makeISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult> {
    public override fun getValue() =
        SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult(pointer.getPointer(0))

    public fun setValue(value: SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult,
      MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress):
        SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult {
      val address = segment.toRawLongValue()
      return SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult(Pointer(address))
    }

    public override
        fun toNative(obj: SmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
