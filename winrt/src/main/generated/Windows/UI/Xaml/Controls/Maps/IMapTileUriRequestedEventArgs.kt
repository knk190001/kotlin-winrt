package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapTileUriRequestedEventArgs.ABI::class)
@Signature("{d2147b43-1bbf-4b98-8dd3-b7834e407e0d}")
@Guid("d2147b431bbf4b988dd3b7834e407e0d")
@WinRTInterface("d2147b431bbf4b988dd3b7834e407e0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileUriRequestedEventArgs.ByReference::class)
public interface IMapTileUriRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_X(): Int

  @InterfaceMethod(1)
  public fun get_Y(): Int

  @InterfaceMethod(2)
  public fun get_ZoomLevel(): Int

  @InterfaceMethod(3)
  public fun get_Request(): MapTileUriRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileUriRequestedEventArgs> {
    public override fun getValue() = ABI.makeIMapTileUriRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapTileUriRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileUriRequestedEventArgs {
    public val __667039972_Ptr: Pointer?

    public val _667039972_VtblPtr: Pointer?
      get() = __667039972_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_X(): Int {
      val fnPtr = _667039972_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__667039972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Y(): Int {
      val fnPtr = _667039972_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__667039972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ZoomLevel(): Int {
      val fnPtr = _667039972_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__667039972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Request(): MapTileUriRequest? {
      val fnPtr = _667039972_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileUriRequest>()
      val hr = fn.invokeHR(arrayOf(__667039972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileUriRequest>(result.getValue())
      return resultValue
    }
  }

  public class IMapTileUriRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __667039972_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileUriRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2147b431bbf4b988dd3b7834e407e0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileUriRequestedEventArgs(ptr: Pointer?): WithDefault =
        IMapTileUriRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileUriRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapTileUriRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapTileUriRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__667039972_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileUriRequestedEventArgs):
        Array<IMapTileUriRequestedEventArgs?> = (elements as
        Array<IMapTileUriRequestedEventArgs?>).castToImpl<IMapTileUriRequestedEventArgs,IMapTileUriRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileUriRequestedEventArgs?> =
        arrayOfNulls<IMapTileUriRequestedEventArgs_Impl>(size) as
        Array<IMapTileUriRequestedEventArgs?>
  }
}
