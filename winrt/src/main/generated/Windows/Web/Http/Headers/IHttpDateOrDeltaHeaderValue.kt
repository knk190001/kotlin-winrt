package Windows.Web.Http.Headers

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(IHttpDateOrDeltaHeaderValue.ABI::class)
@Signature("{eafcaa6a-c4dc-49e2-a27d-043adf5867a3}")
@Guid("eafcaa6ac4dc49e2a27d043adf5867a3")
@WinRTInterface("eafcaa6ac4dc49e2a27d043adf5867a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpDateOrDeltaHeaderValue.ByReference::class)
public interface IHttpDateOrDeltaHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Date(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun get_Delta(): IReference<TimeSpan?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpDateOrDeltaHeaderValue> {
    public override fun getValue() = ABI.makeIHttpDateOrDeltaHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpDateOrDeltaHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpDateOrDeltaHeaderValue {
    public val __1548486071_Ptr: Pointer?

    public val _1548486071_VtblPtr: Pointer?
      get() = __1548486071_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Date(): IReference<DateTime?>? {
      val fnPtr = _1548486071_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1548486071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Delta(): IReference<TimeSpan?>? {
      val fnPtr = _1548486071_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1548486071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }
  }

  public class IHttpDateOrDeltaHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1548486071_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpDateOrDeltaHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eafcaa6ac4dc49e2a27d043adf5867a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpDateOrDeltaHeaderValue(ptr: Pointer?): WithDefault =
        IHttpDateOrDeltaHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpDateOrDeltaHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpDateOrDeltaHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpDateOrDeltaHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1548486071_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpDateOrDeltaHeaderValue):
        Array<IHttpDateOrDeltaHeaderValue?> = (elements as
        Array<IHttpDateOrDeltaHeaderValue?>).castToImpl<IHttpDateOrDeltaHeaderValue,IHttpDateOrDeltaHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpDateOrDeltaHeaderValue?> =
        arrayOfNulls<IHttpDateOrDeltaHeaderValue_Impl>(size) as Array<IHttpDateOrDeltaHeaderValue?>
  }
}
