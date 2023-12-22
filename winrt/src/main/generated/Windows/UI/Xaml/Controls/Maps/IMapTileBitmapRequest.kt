package Windows.UI.Xaml.Controls.Maps

import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IMapTileBitmapRequest.ABI::class)
@Signature("{46733fbc-d89d-472b-b5f6-d7066b0584f4}")
@Guid("46733fbcd89d472bb5f6d7066b0584f4")
@WinRTInterface("46733fbcd89d472bb5f6d7066b0584f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileBitmapRequest.ByReference::class)
public interface IMapTileBitmapRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PixelData(): IRandomAccessStreamReference?

  @InterfaceMethod(1)
  public fun put_PixelData(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): MapTileBitmapRequestDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileBitmapRequest> {
    public override fun getValue() = ABI.makeIMapTileBitmapRequest(pointer.getPointer(0))

    public fun setValue(value: IMapTileBitmapRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileBitmapRequest {
    public val __189016281_Ptr: Pointer?

    public val _189016281_VtblPtr: Pointer?
      get() = __189016281_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PixelData(): IRandomAccessStreamReference? {
      val fnPtr = _189016281_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__189016281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PixelData(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _189016281_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__189016281_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): MapTileBitmapRequestDeferral? {
      val fnPtr = _189016281_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileBitmapRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__189016281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileBitmapRequestDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IMapTileBitmapRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __189016281_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileBitmapRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46733fbcd89d472bb5f6d7066b0584f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileBitmapRequest(ptr: Pointer?): WithDefault =
        IMapTileBitmapRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileBitmapRequest {
      val address = segment.toRawLongValue()
      return makeIMapTileBitmapRequest(Pointer(address))
    }

    public override fun toNative(obj: IMapTileBitmapRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__189016281_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileBitmapRequest): Array<IMapTileBitmapRequest?> =
        (elements as
        Array<IMapTileBitmapRequest?>).castToImpl<IMapTileBitmapRequest,IMapTileBitmapRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileBitmapRequest?> =
        arrayOfNulls<IMapTileBitmapRequest_Impl>(size) as Array<IMapTileBitmapRequest?>
  }
}
