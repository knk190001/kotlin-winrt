package Windows.Web.Http.Headers

import Windows.Foundation.IReference
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHttpContentRangeHeaderValue.ABI::class)
@Signature("{04d967d3-a4f6-495c-9530-8579fcba8aa9}")
@Guid("04d967d3a4f6495c95308579fcba8aa9")
@WinRTInterface("04d967d3a4f6495c95308579fcba8aa9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentRangeHeaderValue.ByReference::class)
public interface IHttpContentRangeHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FirstBytePosition(): IReference<WinDef.ULONG>?

  @InterfaceMethod(1)
  public fun get_LastBytePosition(): IReference<WinDef.ULONG>?

  @InterfaceMethod(2)
  public fun get_Length(): IReference<WinDef.ULONG>?

  @InterfaceMethod(3)
  public fun get_Unit(): String?

  @InterfaceMethod(4)
  public fun put_Unit(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentRangeHeaderValue> {
    public override fun getValue() = ABI.makeIHttpContentRangeHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpContentRangeHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentRangeHeaderValue {
    public val __1010176108_Ptr: Pointer?

    public val _1010176108_VtblPtr: Pointer?
      get() = __1010176108_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FirstBytePosition(): IReference<WinDef.ULONG>? {
      val fnPtr = _1010176108_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1010176108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LastBytePosition(): IReference<WinDef.ULONG>? {
      val fnPtr = _1010176108_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1010176108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Length(): IReference<WinDef.ULONG>? {
      val fnPtr = _1010176108_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1010176108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Unit(): String? {
      val fnPtr = _1010176108_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1010176108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Unit(value: String?): Unit {
      val fnPtr = _1010176108_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1010176108_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpContentRangeHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1010176108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentRangeHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04d967d3a4f6495c95308579fcba8aa9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentRangeHeaderValue(ptr: Pointer?): WithDefault =
        IHttpContentRangeHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpContentRangeHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpContentRangeHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentRangeHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1010176108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentRangeHeaderValue):
        Array<IHttpContentRangeHeaderValue?> = (elements as
        Array<IHttpContentRangeHeaderValue?>).castToImpl<IHttpContentRangeHeaderValue,IHttpContentRangeHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentRangeHeaderValue?> =
        arrayOfNulls<IHttpContentRangeHeaderValue_Impl>(size) as
        Array<IHttpContentRangeHeaderValue?>
  }
}
