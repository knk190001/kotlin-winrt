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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IJsonValueStatics.ABI::class)
@Signature("{5f6b544a-2f53-48e1-91a3-f78b50a6345c}")
@Guid("5f6b544a2f5348e191a3f78b50a6345c")
@WinRTInterface("5f6b544a2f5348e191a3f78b50a6345c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJsonValueStatics.ByReference::class)
public interface IJsonValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): JsonValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?, result: Windows.Data.Json.JsonValue.ByReference?): Boolean

  @InterfaceMethod(2)
  public fun CreateBooleanValue(input: Boolean): JsonValue?

  @InterfaceMethod(3)
  public fun CreateNumberValue(input: Double): JsonValue?

  @InterfaceMethod(4)
  public fun CreateStringValue(input: String?): JsonValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJsonValueStatics> {
    public override fun getValue() = ABI.makeIJsonValueStatics(pointer.getPointer(0))

    public fun setValue(value: IJsonValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJsonValueStatics {
    public val __765999044_Ptr: Pointer?

    public val _765999044_VtblPtr: Pointer?
      get() = __765999044_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): JsonValue? {
      val fnPtr = _765999044_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonValue>()
      val hr = fn.invokeHR(arrayOf(__765999044_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?, result: Windows.Data.Json.JsonValue.ByReference?):
        Boolean {
      val fnPtr = _765999044_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__765999044_Ptr, marshalToNative(input), marshalToNative(result),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun CreateBooleanValue(input: Boolean): JsonValue? {
      val fnPtr = _765999044_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonValue>()
      val hr = fn.invokeHR(arrayOf(__765999044_Ptr, input, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateNumberValue(input: Double): JsonValue? {
      val fnPtr = _765999044_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonValue>()
      val hr = fn.invokeHR(arrayOf(__765999044_Ptr, input, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateStringValue(input: String?): JsonValue? {
      val fnPtr = _765999044_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonValue>()
      val hr = fn.invokeHR(arrayOf(__765999044_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonValue>(result.getValue())
      return resultValue
    }
  }

  public class IJsonValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __765999044_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJsonValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f6b544a2f5348e191a3f78b50a6345c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJsonValueStatics(ptr: Pointer?): WithDefault = IJsonValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJsonValueStatics {
      val address = segment.toRawLongValue()
      return makeIJsonValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IJsonValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__765999044_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonValueStatics): Array<IJsonValueStatics?> = (elements
        as Array<IJsonValueStatics?>).castToImpl<IJsonValueStatics,IJsonValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonValueStatics?> =
        arrayOfNulls<IJsonValueStatics_Impl>(size) as Array<IJsonValueStatics?>
  }
}
