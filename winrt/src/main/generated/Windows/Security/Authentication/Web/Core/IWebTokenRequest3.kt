package Windows.Security.Authentication.Web.Core

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

@ABIMarker(IWebTokenRequest3.ABI::class)
@Signature("{5a755b51-3bb1-41a5-a63d-90bc32c7db9a}")
@Guid("5a755b513bb141a5a63d90bc32c7db9a")
@WinRTInterface("5a755b513bb141a5a63d90bc32c7db9a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebTokenRequest3.ByReference::class)
public interface IWebTokenRequest3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CorrelationId(): String?

  @InterfaceMethod(1)
  public fun put_CorrelationId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebTokenRequest3> {
    public override fun getValue() = ABI.makeIWebTokenRequest3(pointer.getPointer(0))

    public fun setValue(value: IWebTokenRequest3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebTokenRequest3 {
    public val __1300335834_Ptr: Pointer?

    public val _1300335834_VtblPtr: Pointer?
      get() = __1300335834_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CorrelationId(): String? {
      val fnPtr = _1300335834_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1300335834_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CorrelationId(value: String?): Unit {
      val fnPtr = _1300335834_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1300335834_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebTokenRequest3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1300335834_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebTokenRequest3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a755b513bb141a5a63d90bc32c7db9a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebTokenRequest3(ptr: Pointer?): WithDefault = IWebTokenRequest3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebTokenRequest3 {
      val address = segment.toRawLongValue()
      return makeIWebTokenRequest3(Pointer(address))
    }

    public override fun toNative(obj: IWebTokenRequest3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1300335834_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebTokenRequest3): Array<IWebTokenRequest3?> = (elements
        as Array<IWebTokenRequest3?>).castToImpl<IWebTokenRequest3,IWebTokenRequest3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebTokenRequest3?> =
        arrayOfNulls<IWebTokenRequest3_Impl>(size) as Array<IWebTokenRequest3?>
  }
}
