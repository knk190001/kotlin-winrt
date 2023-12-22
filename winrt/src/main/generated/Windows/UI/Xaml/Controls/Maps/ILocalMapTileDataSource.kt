package Windows.UI.Xaml.Controls.Maps

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILocalMapTileDataSource.ABI::class)
@Signature("{616257b5-9108-4f12-8bf4-bb3c8f6274e5}")
@Guid("616257b591084f128bf4bb3c8f6274e5")
@WinRTInterface("616257b591084f128bf4bb3c8f6274e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocalMapTileDataSource.ByReference::class)
public interface ILocalMapTileDataSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UriFormatString(): String?

  @InterfaceMethod(1)
  public fun put_UriFormatString(value: String?): Unit

  @InterfaceMethod(2)
  public fun add_UriRequested(handler: TypedEventHandler<LocalMapTileDataSource?,
      MapTileUriRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_UriRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILocalMapTileDataSource> {
    public override fun getValue() = ABI.makeILocalMapTileDataSource(pointer.getPointer(0))

    public fun setValue(value: ILocalMapTileDataSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocalMapTileDataSource {
    public val __2088450197_Ptr: Pointer?

    public val _2088450197_VtblPtr: Pointer?
      get() = __2088450197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UriFormatString(): String? {
      val fnPtr = _2088450197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2088450197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_UriFormatString(value: String?): Unit {
      val fnPtr = _2088450197_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2088450197_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_UriRequested(handler: TypedEventHandler<LocalMapTileDataSource?,
        MapTileUriRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2088450197_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2088450197_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_UriRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2088450197_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2088450197_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILocalMapTileDataSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2088450197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocalMapTileDataSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("616257b591084f128bf4bb3c8f6274e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocalMapTileDataSource(ptr: Pointer?): WithDefault =
        ILocalMapTileDataSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocalMapTileDataSource {
      val address = segment.toRawLongValue()
      return makeILocalMapTileDataSource(Pointer(address))
    }

    public override fun toNative(obj: ILocalMapTileDataSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2088450197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocalMapTileDataSource): Array<ILocalMapTileDataSource?>
        = (elements as
        Array<ILocalMapTileDataSource?>).castToImpl<ILocalMapTileDataSource,ILocalMapTileDataSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocalMapTileDataSource?> =
        arrayOfNulls<ILocalMapTileDataSource_Impl>(size) as Array<ILocalMapTileDataSource?>
  }
}
