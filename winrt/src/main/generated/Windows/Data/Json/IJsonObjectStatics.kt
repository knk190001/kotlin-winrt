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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IJsonObjectStatics.ABI::class)
@Signature("{2289f159-54de-45d8-abcc-22603fa066a0}")
@Guid("2289f15954de45d8abcc22603fa066a0")
@WinRTInterface("2289f15954de45d8abcc22603fa066a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJsonObjectStatics.ByReference::class)
public interface IJsonObjectStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): JsonObject?

  @InterfaceMethod(1)
  public fun TryParse(input: String?, result: Windows.Data.Json.JsonObject.ByReference?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJsonObjectStatics> {
    public override fun getValue() = ABI.makeIJsonObjectStatics(pointer.getPointer(0))

    public fun setValue(value: IJsonObjectStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJsonObjectStatics {
    public val __609252054_Ptr: Pointer?

    public val _609252054_VtblPtr: Pointer?
      get() = __609252054_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): JsonObject? {
      val fnPtr = _609252054_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonObject>()
      val hr = fn.invokeHR(arrayOf(__609252054_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?, result: Windows.Data.Json.JsonObject.ByReference?):
        Boolean {
      val fnPtr = _609252054_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__609252054_Ptr, marshalToNative(input), marshalToNative(result),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IJsonObjectStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __609252054_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJsonObjectStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2289f15954de45d8abcc22603fa066a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJsonObjectStatics(ptr: Pointer?): WithDefault = IJsonObjectStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJsonObjectStatics {
      val address = segment.toRawLongValue()
      return makeIJsonObjectStatics(Pointer(address))
    }

    public override fun toNative(obj: IJsonObjectStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__609252054_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonObjectStatics): Array<IJsonObjectStatics?> =
        (elements as
        Array<IJsonObjectStatics?>).castToImpl<IJsonObjectStatics,IJsonObjectStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonObjectStatics?> =
        arrayOfNulls<IJsonObjectStatics_Impl>(size) as Array<IJsonObjectStatics?>
  }
}
