package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.Uri
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

@ABIMarker(IMapTileUriRequest.ABI::class)
@Signature("{17402335-3127-45b8-87a7-99f87d4e2745}")
@Guid("17402335312745b887a799f87d4e2745")
@WinRTInterface("17402335312745b887a799f87d4e2745")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileUriRequest.ByReference::class)
public interface IMapTileUriRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun put_Uri(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): MapTileUriRequestDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileUriRequest> {
    public override fun getValue() = ABI.makeIMapTileUriRequest(pointer.getPointer(0))

    public fun setValue(value: IMapTileUriRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileUriRequest {
    public val __1826881564_Ptr: Pointer?

    public val _1826881564_VtblPtr: Pointer?
      get() = __1826881564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1826881564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1826881564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Uri(value: Uri?): Unit {
      val fnPtr = _1826881564_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1826881564_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): MapTileUriRequestDeferral? {
      val fnPtr = _1826881564_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileUriRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__1826881564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileUriRequestDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IMapTileUriRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1826881564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileUriRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17402335312745b887a799f87d4e2745")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileUriRequest(ptr: Pointer?): WithDefault = IMapTileUriRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileUriRequest {
      val address = segment.toRawLongValue()
      return makeIMapTileUriRequest(Pointer(address))
    }

    public override fun toNative(obj: IMapTileUriRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1826881564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileUriRequest): Array<IMapTileUriRequest?> =
        (elements as
        Array<IMapTileUriRequest?>).castToImpl<IMapTileUriRequest,IMapTileUriRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileUriRequest?> =
        arrayOfNulls<IMapTileUriRequest_Impl>(size) as Array<IMapTileUriRequest?>
  }
}
