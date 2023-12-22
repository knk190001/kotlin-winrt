package Windows.Data.Json

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

@ABIMarker(IJsonValueStatics2.ABI::class)
@Signature("{1d9ecbe4-3fe8-4335-8392-93d8e36865f0}")
@Guid("1d9ecbe43fe84335839293d8e36865f0")
@WinRTInterface("1d9ecbe43fe84335839293d8e36865f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJsonValueStatics2.ByReference::class)
public interface IJsonValueStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateNullValue(): JsonValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJsonValueStatics2> {
    public override fun getValue() = ABI.makeIJsonValueStatics2(pointer.getPointer(0))

    public fun setValue(value: IJsonValueStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJsonValueStatics2 {
    public val __2023833362_Ptr: Pointer?

    public val _2023833362_VtblPtr: Pointer?
      get() = __2023833362_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateNullValue(): JsonValue? {
      val fnPtr = _2023833362_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonValue>()
      val hr = fn.invokeHR(arrayOf(__2023833362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonValue>(result.getValue())
      return resultValue
    }
  }

  public class IJsonValueStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2023833362_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJsonValueStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d9ecbe43fe84335839293d8e36865f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJsonValueStatics2(ptr: Pointer?): WithDefault = IJsonValueStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJsonValueStatics2 {
      val address = segment.toRawLongValue()
      return makeIJsonValueStatics2(Pointer(address))
    }

    public override fun toNative(obj: IJsonValueStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2023833362_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonValueStatics2): Array<IJsonValueStatics2?> =
        (elements as
        Array<IJsonValueStatics2?>).castToImpl<IJsonValueStatics2,IJsonValueStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonValueStatics2?> =
        arrayOfNulls<IJsonValueStatics2_Impl>(size) as Array<IJsonValueStatics2?>
  }
}
