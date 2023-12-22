package Windows.ApplicationModel.Payments

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentMethodData.ABI::class)
@Signature("{d1d3caf4-de98-4129-b1b7-c3ad86237bf4}")
@Guid("d1d3caf4de984129b1b7c3ad86237bf4")
@WinRTInterface("d1d3caf4de984129b1b7c3ad86237bf4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentMethodData.ByReference::class)
public interface IPaymentMethodData : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedMethodIds(): IVectorView<String?>?

  @InterfaceMethod(1)
  public fun get_JsonData(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentMethodData> {
    public override fun getValue() = ABI.makeIPaymentMethodData(pointer.getPointer(0))

    public fun setValue(value: IPaymentMethodData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentMethodData {
    public val __17426497_Ptr: Pointer?

    public val _17426497_VtblPtr: Pointer?
      get() = __17426497_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedMethodIds(): IVectorView<String?>? {
      val fnPtr = _17426497_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__17426497_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_JsonData(): String? {
      val fnPtr = _17426497_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__17426497_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentMethodData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __17426497_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentMethodData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1d3caf4de984129b1b7c3ad86237bf4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentMethodData(ptr: Pointer?): WithDefault = IPaymentMethodData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentMethodData {
      val address = segment.toRawLongValue()
      return makeIPaymentMethodData(Pointer(address))
    }

    public override fun toNative(obj: IPaymentMethodData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__17426497_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentMethodData): Array<IPaymentMethodData?> =
        (elements as
        Array<IPaymentMethodData?>).castToImpl<IPaymentMethodData,IPaymentMethodData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentMethodData?> =
        arrayOfNulls<IPaymentMethodData_Impl>(size) as Array<IPaymentMethodData?>
  }
}
