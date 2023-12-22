package Windows.Graphics.Printing.PrintTicket

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

@ABIMarker(IPrintTicketValue.ABI::class)
@Signature("{66b30a32-244d-4e22-a98b-bb3cf1f2dd91}")
@Guid("66b30a32244d4e22a98bbb3cf1f2dd91")
@WinRTInterface("66b30a32244d4e22a98bbb3cf1f2dd91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTicketValue.ByReference::class)
public interface IPrintTicketValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): PrintTicketValueType?

  @InterfaceMethod(1)
  public fun GetValueAsInteger(): Int

  @InterfaceMethod(2)
  public fun GetValueAsString(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTicketValue> {
    public override fun getValue() = ABI.makeIPrintTicketValue(pointer.getPointer(0))

    public fun setValue(value: IPrintTicketValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTicketValue {
    public val __1800478871_Ptr: Pointer?

    public val _1800478871_VtblPtr: Pointer?
      get() = __1800478871_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): PrintTicketValueType? {
      val fnPtr = _1800478871_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketValueType>()
      val hr = fn.invokeHR(arrayOf(__1800478871_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketValueType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetValueAsInteger(): Int {
      val fnPtr = _1800478871_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1800478871_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetValueAsString(): String? {
      val fnPtr = _1800478871_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1800478871_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTicketValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1800478871_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTicketValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66b30a32244d4e22a98bbb3cf1f2dd91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTicketValue(ptr: Pointer?): WithDefault = IPrintTicketValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTicketValue {
      val address = segment.toRawLongValue()
      return makeIPrintTicketValue(Pointer(address))
    }

    public override fun toNative(obj: IPrintTicketValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1800478871_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTicketValue): Array<IPrintTicketValue?> = (elements
        as Array<IPrintTicketValue?>).castToImpl<IPrintTicketValue,IPrintTicketValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTicketValue?> =
        arrayOfNulls<IPrintTicketValue_Impl>(size) as Array<IPrintTicketValue?>
  }
}
