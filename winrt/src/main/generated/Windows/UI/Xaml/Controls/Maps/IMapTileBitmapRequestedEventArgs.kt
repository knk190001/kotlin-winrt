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

@ABIMarker(IMapTileBitmapRequestedEventArgs.ABI::class)
@Signature("{337f691d-9b02-4aa2-8b1e-cc4d91719bf3}")
@Guid("337f691d9b024aa28b1ecc4d91719bf3")
@WinRTInterface("337f691d9b024aa28b1ecc4d91719bf3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileBitmapRequestedEventArgs.ByReference::class)
public interface IMapTileBitmapRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_X(): Int

  @InterfaceMethod(1)
  public fun get_Y(): Int

  @InterfaceMethod(2)
  public fun get_ZoomLevel(): Int

  @InterfaceMethod(3)
  public fun get_Request(): MapTileBitmapRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileBitmapRequestedEventArgs> {
    public override fun getValue() = ABI.makeIMapTileBitmapRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapTileBitmapRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileBitmapRequestedEventArgs {
    public val __1519102769_Ptr: Pointer?

    public val _1519102769_VtblPtr: Pointer?
      get() = __1519102769_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_X(): Int {
      val fnPtr = _1519102769_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1519102769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Y(): Int {
      val fnPtr = _1519102769_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1519102769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ZoomLevel(): Int {
      val fnPtr = _1519102769_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1519102769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Request(): MapTileBitmapRequest? {
      val fnPtr = _1519102769_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileBitmapRequest>()
      val hr = fn.invokeHR(arrayOf(__1519102769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileBitmapRequest>(result.getValue())
      return resultValue
    }
  }

  public class IMapTileBitmapRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1519102769_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileBitmapRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("337f691d9b024aa28b1ecc4d91719bf3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileBitmapRequestedEventArgs(ptr: Pointer?): WithDefault =
        IMapTileBitmapRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileBitmapRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapTileBitmapRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapTileBitmapRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1519102769_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileBitmapRequestedEventArgs):
        Array<IMapTileBitmapRequestedEventArgs?> = (elements as
        Array<IMapTileBitmapRequestedEventArgs?>).castToImpl<IMapTileBitmapRequestedEventArgs,IMapTileBitmapRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileBitmapRequestedEventArgs?> =
        arrayOfNulls<IMapTileBitmapRequestedEventArgs_Impl>(size) as
        Array<IMapTileBitmapRequestedEventArgs?>
  }
}
