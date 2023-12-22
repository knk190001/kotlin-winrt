package Windows.Web.Http

import Windows.Storage.Streams.UnicodeEncoding
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

@ABIMarker(IHttpStringContentFactory.ABI::class)
@Signature("{46649d5b-2e93-48eb-8e61-19677878e57f}")
@Guid("46649d5b2e9348eb8e6119677878e57f")
@WinRTInterface("46649d5b2e9348eb8e6119677878e57f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpStringContentFactory.ByReference::class)
public interface IHttpStringContentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromString(content: String?): HttpStringContent?

  @InterfaceMethod(1)
  public fun CreateFromStringWithEncoding(content: String?, encoding: UnicodeEncoding?):
      HttpStringContent?

  @InterfaceMethod(2)
  public fun CreateFromStringWithEncodingAndMediaType(
    content: String?,
    encoding: UnicodeEncoding?,
    mediaType: String?
  ): HttpStringContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpStringContentFactory> {
    public override fun getValue() = ABI.makeIHttpStringContentFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpStringContentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpStringContentFactory {
    public val __150310182_Ptr: Pointer?

    public val _150310182_VtblPtr: Pointer?
      get() = __150310182_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromString(content: String?): HttpStringContent? {
      val fnPtr = _150310182_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpStringContent>()
      val hr = fn.invokeHR(arrayOf(__150310182_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpStringContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromStringWithEncoding(content: String?, encoding: UnicodeEncoding?):
        HttpStringContent? {
      val fnPtr = _150310182_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpStringContent>()
      val hr = fn.invokeHR(arrayOf(__150310182_Ptr, marshalToNative(content),
          marshalToNative(encoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpStringContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromStringWithEncodingAndMediaType(
      content: String?,
      encoding: UnicodeEncoding?,
      mediaType: String?
    ): HttpStringContent? {
      val fnPtr = _150310182_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpStringContent>()
      val hr = fn.invokeHR(arrayOf(__150310182_Ptr, marshalToNative(content),
          marshalToNative(encoding), marshalToNative(mediaType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpStringContent>(result.getValue())
      return resultValue
    }
  }

  public class IHttpStringContentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __150310182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpStringContentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46649d5b2e9348eb8e6119677878e57f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpStringContentFactory(ptr: Pointer?): WithDefault =
        IHttpStringContentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpStringContentFactory {
      val address = segment.toRawLongValue()
      return makeIHttpStringContentFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpStringContentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__150310182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpStringContentFactory):
        Array<IHttpStringContentFactory?> = (elements as
        Array<IHttpStringContentFactory?>).castToImpl<IHttpStringContentFactory,IHttpStringContentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpStringContentFactory?> =
        arrayOfNulls<IHttpStringContentFactory_Impl>(size) as Array<IHttpStringContentFactory?>
  }
}
