package Windows.Devices.SmartCards

import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult.ABI::class)
@Signature("{8c7ce857-a7e7-489d-b9d6-368061515012}")
@Guid("8c7ce857a7e7489db9d6368061515012")
@WinRTInterface("8c7ce857a7e7489db9d6368061515012")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult.ByReference::class)
public interface ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OperationStatus(): SmartCardCryptogramGeneratorOperationStatus?

  @InterfaceMethod(1)
  public fun get_Characteristics(): IVectorView<SmartCardCryptogramStorageKeyCharacteristics?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult(pointer.getPointer(0))

    public
        fun setValue(value: ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult
      {
    public val __943194320_Ptr: Pointer?

    public val _943194320_VtblPtr: Pointer?
      get() = __943194320_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OperationStatus(): SmartCardCryptogramGeneratorOperationStatus? {
      val fnPtr = _943194320_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramGeneratorOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__943194320_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardCryptogramGeneratorOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Characteristics():
        IVectorView<SmartCardCryptogramStorageKeyCharacteristics?>? {
      val fnPtr = _943194320_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SmartCardCryptogramStorageKeyCharacteristics?>>()
      val hr = fn.invokeHR(arrayOf(__943194320_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramStorageKeyCharacteristics?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __943194320_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c7ce857a7e7489db9d6368061515012")

    public override val layout: ValueLayout = ADDRESS

    public
        fun makeISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult(ptr: Pointer?):
        WithDefault = ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult(Pointer(address))
    }

    public override
        fun toNative(obj: ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__943194320_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult):
        Array<ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult?> = (elements as
        Array<ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult?>).castToImpl<ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult,ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult?> =
        arrayOfNulls<ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult_Impl>(size)
        as Array<ISmartCardCryptogramGetAllCryptogramStorageKeyCharacteristicsResult?>
  }
}
