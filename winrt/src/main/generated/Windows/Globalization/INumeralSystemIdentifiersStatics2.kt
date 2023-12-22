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

@ABIMarker(INumeralSystemIdentifiersStatics2.ABI::class)
@Signature("{7f003228-9ddb-4a34-9104-0260c091a7c7}")
@Guid("7f0032289ddb4a3491040260c091a7c7")
@WinRTInterface("7f0032289ddb4a3491040260c091a7c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumeralSystemIdentifiersStatics2.ByReference::class)
public interface INumeralSystemIdentifiersStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Brah(): String?

  @InterfaceMethod(1)
  public fun get_Osma(): String?

  @InterfaceMethod(2)
  public fun get_MathBold(): String?

  @InterfaceMethod(3)
  public fun get_MathDbl(): String?

  @InterfaceMethod(4)
  public fun get_MathSans(): String?

  @InterfaceMethod(5)
  public fun get_MathSanb(): String?

  @InterfaceMethod(6)
  public fun get_MathMono(): String?

  @InterfaceMethod(7)
  public fun get_ZmthBold(): String?

  @InterfaceMethod(8)
  public fun get_ZmthDbl(): String?

  @InterfaceMethod(9)
  public fun get_ZmthSans(): String?

  @InterfaceMethod(10)
  public fun get_ZmthSanb(): String?

  @InterfaceMethod(11)
  public fun get_ZmthMono(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumeralSystemIdentifiersStatics2> {
    public override fun getValue() =
        ABI.makeINumeralSystemIdentifiersStatics2(pointer.getPointer(0))

    public fun setValue(value: INumeralSystemIdentifiersStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumeralSystemIdentifiersStatics2 {
    public val __1158997731_Ptr: Pointer?

    public val _1158997731_VtblPtr: Pointer?
      get() = __1158997731_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Brah(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Osma(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MathBold(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MathDbl(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MathSans(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MathSanb(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MathMono(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ZmthBold(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ZmthDbl(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ZmthSans(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ZmthSanb(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_ZmthMono(): String? {
      val fnPtr = _1158997731_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1158997731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class INumeralSystemIdentifiersStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1158997731_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumeralSystemIdentifiersStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f0032289ddb4a3491040260c091a7c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumeralSystemIdentifiersStatics2(ptr: Pointer?): WithDefault =
        INumeralSystemIdentifiersStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumeralSystemIdentifiersStatics2 {
      val address = segment.toRawLongValue()
      return makeINumeralSystemIdentifiersStatics2(Pointer(address))
    }

    public override fun toNative(obj: INumeralSystemIdentifiersStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1158997731_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumeralSystemIdentifiersStatics2):
        Array<INumeralSystemIdentifiersStatics2?> = (elements as
        Array<INumeralSystemIdentifiersStatics2?>).castToImpl<INumeralSystemIdentifiersStatics2,INumeralSystemIdentifiersStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumeralSystemIdentifiersStatics2?> =
        arrayOfNulls<INumeralSystemIdentifiersStatics2_Impl>(size) as
        Array<INumeralSystemIdentifiersStatics2?>
  }
}
