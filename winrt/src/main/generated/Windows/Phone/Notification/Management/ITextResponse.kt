package Windows.Phone.Notification.Management

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

@ABIMarker(ITextResponse.ABI::class)
@Signature("{e9cb74c3-2457-4cdb-8110-72f5e8e883e8}")
@Guid("e9cb74c324574cdb811072f5e8e883e8")
@WinRTInterface("e9cb74c324574cdb811072f5e8e883e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextResponse.ByReference::class)
public interface ITextResponse : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Content(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextResponse>
      {
    public override fun getValue() = ABI.makeITextResponse(pointer.getPointer(0))

    public fun setValue(value: ITextResponse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextResponse {
    public val __912317156_Ptr: Pointer?

    public val _912317156_VtblPtr: Pointer?
      get() = __912317156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _912317156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__912317156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Content(): String? {
      val fnPtr = _912317156_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__912317156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ITextResponse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __912317156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextResponse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9cb74c324574cdb811072f5e8e883e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextResponse(ptr: Pointer?): WithDefault = ITextResponse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextResponse {
      val address = segment.toRawLongValue()
      return makeITextResponse(Pointer(address))
    }

    public override fun toNative(obj: ITextResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__912317156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextResponse): Array<ITextResponse?> = (elements as
        Array<ITextResponse?>).castToImpl<ITextResponse,ITextResponse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextResponse?> =
        arrayOfNulls<ITextResponse_Impl>(size) as Array<ITextResponse?>
  }
}
