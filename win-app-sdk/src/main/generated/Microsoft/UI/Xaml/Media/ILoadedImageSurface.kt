package Microsoft.UI.Xaml.Media

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Size
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILoadedImageSurface.ABI::class)
@Signature("{b5275540-1706-5851-95cc-498ee81fb183}")
@Guid("b52755401706585195cc498ee81fb183")
@WinRTInterface("b52755401706585195cc498ee81fb183")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoadedImageSurface.ByReference::class)
public interface ILoadedImageSurface : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DecodedPhysicalSize(): Size?

  @InterfaceMethod(1)
  public fun get_DecodedSize(): Size?

  @InterfaceMethod(2)
  public fun get_NaturalSize(): Size?

  @InterfaceMethod(3)
  public fun add_LoadCompleted(handler: TypedEventHandler<LoadedImageSurface?,
      LoadedImageSourceLoadCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_LoadCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoadedImageSurface> {
    public override fun getValue() = ABI.makeILoadedImageSurface(pointer.getPointer(0))

    public fun setValue(value: ILoadedImageSurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoadedImageSurface {
    public val __1563754136_Ptr: Pointer?

    public val _1563754136_VtblPtr: Pointer?
      get() = __1563754136_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DecodedPhysicalSize(): Size? {
      val fnPtr = _1563754136_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1563754136_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DecodedSize(): Size? {
      val fnPtr = _1563754136_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1563754136_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NaturalSize(): Size? {
      val fnPtr = _1563754136_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1563754136_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_LoadCompleted(handler: TypedEventHandler<LoadedImageSurface?,
        LoadedImageSourceLoadCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1563754136_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1563754136_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_LoadCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1563754136_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1563754136_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILoadedImageSurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1563754136_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoadedImageSurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b52755401706585195cc498ee81fb183")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoadedImageSurface(ptr: Pointer?): WithDefault = ILoadedImageSurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoadedImageSurface {
      val address = segment.toRawLongValue()
      return makeILoadedImageSurface(Pointer(address))
    }

    public override fun toNative(obj: ILoadedImageSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1563754136_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoadedImageSurface): Array<ILoadedImageSurface?> =
        (elements as
        Array<ILoadedImageSurface?>).castToImpl<ILoadedImageSurface,ILoadedImageSurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoadedImageSurface?> =
        arrayOfNulls<ILoadedImageSurface_Impl>(size) as Array<ILoadedImageSurface?>
  }
}
