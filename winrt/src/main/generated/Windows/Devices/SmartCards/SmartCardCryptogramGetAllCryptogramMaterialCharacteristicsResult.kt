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

@ABIMarker(SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult;{2798e029-d687-4c92-86c6-399e9a0ecb09})")
@WinRTByReference(brClass =
    SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult.ByReference::class)
public class SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult.WithDefault,
    IWinRTObject {
  private val __653669075_Interface:
      ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult.WithDefault by lazy {
    as_653669075()
  }


  public override val __653669075_Ptr: JNAPointer? by lazy {
    __653669075_Interface.__653669075_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__653669075_Interface)

  public constructor() : this(ABI.activate())

  private fun as_653669075():
      ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult.ABI.makeISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult(NULL))
    }
    val refiid =
        Guid.REFIID(guidOf<ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult.ABI.makeISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult> {
    public override fun getValue() =
        SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult(pointer.getPointer(0))

    public fun setValue(value: SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult,
      MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult".toHandle(),
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
        SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult {
      val address = segment.toRawLongValue()
      return SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult(Pointer(address))
    }

    public override
        fun toNative(obj: SmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
