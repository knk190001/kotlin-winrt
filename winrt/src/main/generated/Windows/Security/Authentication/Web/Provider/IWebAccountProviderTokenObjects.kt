package Windows.Security.Authentication.Web.Provider

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

@ABIMarker(IWebAccountProviderTokenObjects.ABI::class)
@Signature("{408f284b-1328-42db-89a4-0bce7a717d8e}")
@Guid("408f284b132842db89a40bce7a717d8e")
@WinRTInterface("408f284b132842db89a40bce7a717d8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderTokenObjects.ByReference::class)
public interface IWebAccountProviderTokenObjects : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Operation(): IWebAccountProviderOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderTokenObjects> {
    public override fun getValue() = ABI.makeIWebAccountProviderTokenObjects(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderTokenObjects_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderTokenObjects {
    public val __2031009776_Ptr: Pointer?

    public val _2031009776_VtblPtr: Pointer?
      get() = __2031009776_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Operation(): IWebAccountProviderOperation? {
      val fnPtr = _2031009776_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IWebAccountProviderOperation>()
      val hr = fn.invokeHR(arrayOf(__2031009776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IWebAccountProviderOperation>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderTokenObjects_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2031009776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderTokenObjects, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("408f284b132842db89a40bce7a717d8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderTokenObjects(ptr: Pointer?): WithDefault =
        IWebAccountProviderTokenObjects_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderTokenObjects {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderTokenObjects(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderTokenObjects): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2031009776_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderTokenObjects):
        Array<IWebAccountProviderTokenObjects?> = (elements as
        Array<IWebAccountProviderTokenObjects?>).castToImpl<IWebAccountProviderTokenObjects,IWebAccountProviderTokenObjects_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderTokenObjects?> =
        arrayOfNulls<IWebAccountProviderTokenObjects_Impl>(size) as
        Array<IWebAccountProviderTokenObjects?>
  }
}
