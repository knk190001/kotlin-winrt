package Windows.Web.Http.Headers

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

@ABIMarker(IHttpCredentialsHeaderValueStatics.ABI::class)
@Signature("{a69b2be6-ce8c-4443-a35a-1b727b131036}")
@Guid("a69b2be6ce8c4443a35a1b727b131036")
@WinRTInterface("a69b2be6ce8c4443a35a1b727b131036")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpCredentialsHeaderValueStatics.ByReference::class)
public interface IHttpCredentialsHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpCredentialsHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      credentialsHeaderValue: Windows.Web.Http.Headers.HttpCredentialsHeaderValue.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpCredentialsHeaderValueStatics> {
    public override fun getValue() =
        ABI.makeIHttpCredentialsHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpCredentialsHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpCredentialsHeaderValueStatics {
    public val __1760500977_Ptr: Pointer?

    public val _1760500977_VtblPtr: Pointer?
      get() = __1760500977_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpCredentialsHeaderValue? {
      val fnPtr = _1760500977_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCredentialsHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1760500977_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCredentialsHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        credentialsHeaderValue: Windows.Web.Http.Headers.HttpCredentialsHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _1760500977_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1760500977_Ptr, marshalToNative(input),
          marshalToNative(credentialsHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpCredentialsHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1760500977_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpCredentialsHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a69b2be6ce8c4443a35a1b727b131036")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpCredentialsHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpCredentialsHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpCredentialsHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpCredentialsHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpCredentialsHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1760500977_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpCredentialsHeaderValueStatics):
        Array<IHttpCredentialsHeaderValueStatics?> = (elements as
        Array<IHttpCredentialsHeaderValueStatics?>).castToImpl<IHttpCredentialsHeaderValueStatics,IHttpCredentialsHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpCredentialsHeaderValueStatics?> =
        arrayOfNulls<IHttpCredentialsHeaderValueStatics_Impl>(size) as
        Array<IHttpCredentialsHeaderValueStatics?>
  }
}
