package Windows.UI.Xaml.Controls.Maps

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IHttpMapTileDataSourceFactory.ABI::class)
@Signature("{53b4b107-84dc-4291-89f8-6d0bb612a055}")
@Guid("53b4b10784dc429189f86d0bb612a055")
@WinRTInterface("53b4b10784dc429189f86d0bb612a055")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMapTileDataSourceFactory.ByReference::class)
public interface IHttpMapTileDataSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      HttpMapTileDataSource?

  @InterfaceMethod(1)
  public fun CreateInstanceWithUriFormatString(
    uriFormatString: String?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): HttpMapTileDataSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMapTileDataSourceFactory> {
    public override fun getValue() = ABI.makeIHttpMapTileDataSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpMapTileDataSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMapTileDataSourceFactory {
    public val __102664788_Ptr: Pointer?

    public val _102664788_VtblPtr: Pointer?
      get() = __102664788_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        HttpMapTileDataSource? {
      val fnPtr = _102664788_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMapTileDataSource>()
      val hr = fn.invokeHR(arrayOf(__102664788_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMapTileDataSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithUriFormatString(
      uriFormatString: String?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): HttpMapTileDataSource? {
      val fnPtr = _102664788_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMapTileDataSource>()
      val hr = fn.invokeHR(arrayOf(__102664788_Ptr, marshalToNative(uriFormatString),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMapTileDataSource>(result.getValue())
      return resultValue
    }
  }

  public class IHttpMapTileDataSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __102664788_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMapTileDataSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53b4b10784dc429189f86d0bb612a055")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMapTileDataSourceFactory(ptr: Pointer?): WithDefault =
        IHttpMapTileDataSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMapTileDataSourceFactory {
      val address = segment.toRawLongValue()
      return makeIHttpMapTileDataSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpMapTileDataSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__102664788_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMapTileDataSourceFactory):
        Array<IHttpMapTileDataSourceFactory?> = (elements as
        Array<IHttpMapTileDataSourceFactory?>).castToImpl<IHttpMapTileDataSourceFactory,IHttpMapTileDataSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMapTileDataSourceFactory?> =
        arrayOfNulls<IHttpMapTileDataSourceFactory_Impl>(size) as
        Array<IHttpMapTileDataSourceFactory?>
  }
}
