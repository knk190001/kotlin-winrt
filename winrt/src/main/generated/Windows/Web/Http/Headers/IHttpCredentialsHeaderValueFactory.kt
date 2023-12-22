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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpCredentialsHeaderValueFactory.ABI::class)
@Signature("{f21d9e91-4d1c-4182-bfd1-34470a62f950}")
@Guid("f21d9e914d1c4182bfd134470a62f950")
@WinRTInterface("f21d9e914d1c4182bfd134470a62f950")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpCredentialsHeaderValueFactory.ByReference::class)
public interface IHttpCredentialsHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromScheme(scheme: String?): HttpCredentialsHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromSchemeWithToken(scheme: String?, token: String?): HttpCredentialsHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpCredentialsHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpCredentialsHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpCredentialsHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpCredentialsHeaderValueFactory {
    public val __1729212874_Ptr: Pointer?

    public val _1729212874_VtblPtr: Pointer?
      get() = __1729212874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromScheme(scheme: String?): HttpCredentialsHeaderValue? {
      val fnPtr = _1729212874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCredentialsHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1729212874_Ptr, marshalToNative(scheme), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCredentialsHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromSchemeWithToken(scheme: String?, token: String?):
        HttpCredentialsHeaderValue? {
      val fnPtr = _1729212874_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCredentialsHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1729212874_Ptr, marshalToNative(scheme),
          marshalToNative(token), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCredentialsHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpCredentialsHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1729212874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpCredentialsHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f21d9e914d1c4182bfd134470a62f950")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpCredentialsHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpCredentialsHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpCredentialsHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpCredentialsHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpCredentialsHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1729212874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpCredentialsHeaderValueFactory):
        Array<IHttpCredentialsHeaderValueFactory?> = (elements as
        Array<IHttpCredentialsHeaderValueFactory?>).castToImpl<IHttpCredentialsHeaderValueFactory,IHttpCredentialsHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpCredentialsHeaderValueFactory?> =
        arrayOfNulls<IHttpCredentialsHeaderValueFactory_Impl>(size) as
        Array<IHttpCredentialsHeaderValueFactory?>
  }
}
