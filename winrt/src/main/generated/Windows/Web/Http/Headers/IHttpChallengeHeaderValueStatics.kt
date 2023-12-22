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

@ABIMarker(IHttpChallengeHeaderValueStatics.ABI::class)
@Signature("{f3d38a72-fc01-4d01-a008-fcb7c459d635}")
@Guid("f3d38a72fc014d01a008fcb7c459d635")
@WinRTInterface("f3d38a72fc014d01a008fcb7c459d635")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpChallengeHeaderValueStatics.ByReference::class)
public interface IHttpChallengeHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpChallengeHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      challengeHeaderValue: Windows.Web.Http.Headers.HttpChallengeHeaderValue.ByReference?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpChallengeHeaderValueStatics> {
    public override fun getValue() = ABI.makeIHttpChallengeHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpChallengeHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpChallengeHeaderValueStatics {
    public val __1074159720_Ptr: Pointer?

    public val _1074159720_VtblPtr: Pointer?
      get() = __1074159720_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpChallengeHeaderValue? {
      val fnPtr = _1074159720_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpChallengeHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1074159720_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpChallengeHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        challengeHeaderValue: Windows.Web.Http.Headers.HttpChallengeHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _1074159720_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1074159720_Ptr, marshalToNative(input),
          marshalToNative(challengeHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpChallengeHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1074159720_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpChallengeHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3d38a72fc014d01a008fcb7c459d635")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpChallengeHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpChallengeHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpChallengeHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpChallengeHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpChallengeHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1074159720_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpChallengeHeaderValueStatics):
        Array<IHttpChallengeHeaderValueStatics?> = (elements as
        Array<IHttpChallengeHeaderValueStatics?>).castToImpl<IHttpChallengeHeaderValueStatics,IHttpChallengeHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpChallengeHeaderValueStatics?> =
        arrayOfNulls<IHttpChallengeHeaderValueStatics_Impl>(size) as
        Array<IHttpChallengeHeaderValueStatics?>
  }
}
