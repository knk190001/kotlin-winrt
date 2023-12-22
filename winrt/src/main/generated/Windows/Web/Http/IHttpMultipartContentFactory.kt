package Windows.Web.Http

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

@ABIMarker(IHttpMultipartContentFactory.ABI::class)
@Signature("{7eb42e62-0222-4f20-b372-47d5db5d33b4}")
@Guid("7eb42e6202224f20b37247d5db5d33b4")
@WinRTInterface("7eb42e6202224f20b37247d5db5d33b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMultipartContentFactory.ByReference::class)
public interface IHttpMultipartContentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithSubtype(subtype: String?): HttpMultipartContent?

  @InterfaceMethod(1)
  public fun CreateWithSubtypeAndBoundary(subtype: String?, boundary: String?):
      HttpMultipartContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMultipartContentFactory> {
    public override fun getValue() = ABI.makeIHttpMultipartContentFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpMultipartContentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMultipartContentFactory {
    public val __1622877383_Ptr: Pointer?

    public val _1622877383_VtblPtr: Pointer?
      get() = __1622877383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithSubtype(subtype: String?): HttpMultipartContent? {
      val fnPtr = _1622877383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMultipartContent>()
      val hr = fn.invokeHR(arrayOf(__1622877383_Ptr, marshalToNative(subtype), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMultipartContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithSubtypeAndBoundary(subtype: String?, boundary: String?):
        HttpMultipartContent? {
      val fnPtr = _1622877383_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMultipartContent>()
      val hr = fn.invokeHR(arrayOf(__1622877383_Ptr, marshalToNative(subtype),
          marshalToNative(boundary), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMultipartContent>(result.getValue())
      return resultValue
    }
  }

  public class IHttpMultipartContentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1622877383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMultipartContentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7eb42e6202224f20b37247d5db5d33b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMultipartContentFactory(ptr: Pointer?): WithDefault =
        IHttpMultipartContentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMultipartContentFactory {
      val address = segment.toRawLongValue()
      return makeIHttpMultipartContentFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpMultipartContentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1622877383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMultipartContentFactory):
        Array<IHttpMultipartContentFactory?> = (elements as
        Array<IHttpMultipartContentFactory?>).castToImpl<IHttpMultipartContentFactory,IHttpMultipartContentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMultipartContentFactory?> =
        arrayOfNulls<IHttpMultipartContentFactory_Impl>(size) as
        Array<IHttpMultipartContentFactory?>
  }
}
