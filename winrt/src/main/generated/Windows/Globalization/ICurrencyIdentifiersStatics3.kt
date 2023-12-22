package Windows.Globalization

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

@ABIMarker(ICurrencyIdentifiersStatics3.ABI::class)
@Signature("{4fb23bfa-ed25-4f4d-857f-237f1748c21c}")
@Guid("4fb23bfaed254f4d857f237f1748c21c")
@WinRTInterface("4fb23bfaed254f4d857f237f1748c21c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrencyIdentifiersStatics3.ByReference::class)
public interface ICurrencyIdentifiersStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MRU(): String?

  @InterfaceMethod(1)
  public fun get_SSP(): String?

  @InterfaceMethod(2)
  public fun get_STN(): String?

  @InterfaceMethod(3)
  public fun get_VES(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrencyIdentifiersStatics3> {
    public override fun getValue() = ABI.makeICurrencyIdentifiersStatics3(pointer.getPointer(0))

    public fun setValue(value: ICurrencyIdentifiersStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrencyIdentifiersStatics3 {
    public val __1580886988_Ptr: Pointer?

    public val _1580886988_VtblPtr: Pointer?
      get() = __1580886988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MRU(): String? {
      val fnPtr = _1580886988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1580886988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SSP(): String? {
      val fnPtr = _1580886988_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1580886988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_STN(): String? {
      val fnPtr = _1580886988_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1580886988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_VES(): String? {
      val fnPtr = _1580886988_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1580886988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICurrencyIdentifiersStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1580886988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrencyIdentifiersStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4fb23bfaed254f4d857f237f1748c21c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrencyIdentifiersStatics3(ptr: Pointer?): WithDefault =
        ICurrencyIdentifiersStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrencyIdentifiersStatics3 {
      val address = segment.toRawLongValue()
      return makeICurrencyIdentifiersStatics3(Pointer(address))
    }

    public override fun toNative(obj: ICurrencyIdentifiersStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1580886988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrencyIdentifiersStatics3):
        Array<ICurrencyIdentifiersStatics3?> = (elements as
        Array<ICurrencyIdentifiersStatics3?>).castToImpl<ICurrencyIdentifiersStatics3,ICurrencyIdentifiersStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrencyIdentifiersStatics3?> =
        arrayOfNulls<ICurrencyIdentifiersStatics3_Impl>(size) as
        Array<ICurrencyIdentifiersStatics3?>
  }
}
