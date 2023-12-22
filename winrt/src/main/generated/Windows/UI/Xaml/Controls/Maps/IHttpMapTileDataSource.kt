package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.Collections.IMap
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IHttpMapTileDataSource.ABI::class)
@Signature("{9d03cb5c-fd79-4795-87be-7e54ca0b37d0}")
@Guid("9d03cb5cfd79479587be7e54ca0b37d0")
@WinRTInterface("9d03cb5cfd79479587be7e54ca0b37d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMapTileDataSource.ByReference::class)
public interface IHttpMapTileDataSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UriFormatString(): String?

  @InterfaceMethod(1)
  public fun put_UriFormatString(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_AdditionalRequestHeaders(): IMap<String?, String?>?

  @InterfaceMethod(3)
  public fun get_AllowCaching(): Boolean

  @InterfaceMethod(4)
  public fun put_AllowCaching(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun add_UriRequested(handler: TypedEventHandler<HttpMapTileDataSource?,
      MapTileUriRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_UriRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMapTileDataSource> {
    public override fun getValue() = ABI.makeIHttpMapTileDataSource(pointer.getPointer(0))

    public fun setValue(value: IHttpMapTileDataSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMapTileDataSource {
    public val __156869078_Ptr: Pointer?

    public val _156869078_VtblPtr: Pointer?
      get() = __156869078_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UriFormatString(): String? {
      val fnPtr = _156869078_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__156869078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_UriFormatString(value: String?): Unit {
      val fnPtr = _156869078_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156869078_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AdditionalRequestHeaders(): IMap<String?, String?>? {
      val fnPtr = _156869078_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__156869078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AllowCaching(): Boolean {
      val fnPtr = _156869078_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156869078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_AllowCaching(value: Boolean): Unit {
      val fnPtr = _156869078_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156869078_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_UriRequested(handler: TypedEventHandler<HttpMapTileDataSource?,
        MapTileUriRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156869078_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156869078_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_UriRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _156869078_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156869078_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpMapTileDataSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __156869078_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMapTileDataSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d03cb5cfd79479587be7e54ca0b37d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMapTileDataSource(ptr: Pointer?): WithDefault =
        IHttpMapTileDataSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMapTileDataSource {
      val address = segment.toRawLongValue()
      return makeIHttpMapTileDataSource(Pointer(address))
    }

    public override fun toNative(obj: IHttpMapTileDataSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__156869078_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMapTileDataSource): Array<IHttpMapTileDataSource?> =
        (elements as
        Array<IHttpMapTileDataSource?>).castToImpl<IHttpMapTileDataSource,IHttpMapTileDataSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMapTileDataSource?> =
        arrayOfNulls<IHttpMapTileDataSource_Impl>(size) as Array<IHttpMapTileDataSource?>
  }
}
