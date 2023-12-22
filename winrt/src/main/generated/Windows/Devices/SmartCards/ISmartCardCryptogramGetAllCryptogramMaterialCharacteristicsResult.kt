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

@ABIMarker(ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult.ABI::class)
@Signature("{2798e029-d687-4c92-86c6-399e9a0ecb09}")
@Guid("2798e029d6874c9286c6399e9a0ecb09")
@WinRTInterface("2798e029d6874c9286c6399e9a0ecb09")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult.ByReference::class)
public interface ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OperationStatus(): SmartCardCryptogramGeneratorOperationStatus?

  @InterfaceMethod(1)
  public fun get_Characteristics(): IVectorView<SmartCardCryptogramMaterialCharacteristics?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult(pointer.getPointer(0))

    public
        fun setValue(value: ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult {
    public val __653669075_Ptr: Pointer?

    public val _653669075_VtblPtr: Pointer?
      get() = __653669075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OperationStatus(): SmartCardCryptogramGeneratorOperationStatus? {
      val fnPtr = _653669075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramGeneratorOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__653669075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardCryptogramGeneratorOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Characteristics():
        IVectorView<SmartCardCryptogramMaterialCharacteristics?>? {
      val fnPtr = _653669075_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SmartCardCryptogramMaterialCharacteristics?>>()
      val hr = fn.invokeHR(arrayOf(__653669075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SmartCardCryptogramMaterialCharacteristics?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __653669075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2798e029d6874c9286c6399e9a0ecb09")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult(ptr: Pointer?):
        WithDefault = ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult(Pointer(address))
    }

    public override
        fun toNative(obj: ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__653669075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult):
        Array<ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult?> = (elements as
        Array<ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult?>).castToImpl<ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult,ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult?> =
        arrayOfNulls<ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult_Impl>(size)
        as Array<ISmartCardCryptogramGetAllCryptogramMaterialCharacteristicsResult?>
  }
}
