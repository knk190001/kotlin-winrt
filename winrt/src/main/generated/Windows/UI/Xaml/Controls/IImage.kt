package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Media.PlayTo.PlayToSource
import Windows.UI.Xaml.ExceptionRoutedEventHandler
import Windows.UI.Xaml.Media.ImageSource
import Windows.UI.Xaml.Media.Stretch
import Windows.UI.Xaml.RoutedEventHandler
import Windows.UI.Xaml.Thickness
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

@ABIMarker(IImage.ABI::class)
@Signature("{495b7402-9af3-4e50-aa90-03388f3086d2}")
@Guid("495b74029af34e50aa9003388f3086d2")
@WinRTInterface("495b74029af34e50aa9003388f3086d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImage.ByReference::class)
public interface IImage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): ImageSource?

  @InterfaceMethod(1)
  public fun put_Source(value: ImageSource?): Unit

  @InterfaceMethod(2)
  public fun get_Stretch(): Stretch?

  @InterfaceMethod(3)
  public fun put_Stretch(value: Stretch?): Unit

  @InterfaceMethod(4)
  public fun get_NineGrid(): Thickness?

  @InterfaceMethod(5)
  public fun put_NineGrid(value: Thickness?): Unit

  @InterfaceMethod(6)
  public fun get_PlayToSource(): PlayToSource?

  @InterfaceMethod(7)
  public fun add_ImageFailed(handler: ExceptionRoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_ImageFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_ImageOpened(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_ImageOpened(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IImage> {
    public override fun getValue() = ABI.makeIImage(pointer.getPointer(0))

    public fun setValue(value: IImage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImage {
    public val __14515903_Ptr: Pointer?

    public val _14515903_VtblPtr: Pointer?
      get() = __14515903_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): ImageSource? {
      val fnPtr = _14515903_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: ImageSource?): Unit {
      val fnPtr = _14515903_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Stretch(): Stretch? {
      val fnPtr = _14515903_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stretch>()
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Stretch(value: Stretch?): Unit {
      val fnPtr = _14515903_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_NineGrid(): Thickness? {
      val fnPtr = _14515903_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_NineGrid(value: Thickness?): Unit {
      val fnPtr = _14515903_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PlayToSource(): PlayToSource? {
      val fnPtr = _14515903_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToSource>()
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun add_ImageFailed(handler: ExceptionRoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _14515903_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_ImageFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _14515903_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_ImageOpened(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _14515903_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_ImageOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _14515903_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__14515903_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IImage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __14515903_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("495b74029af34e50aa9003388f3086d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImage(ptr: Pointer?): WithDefault = IImage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImage {
      val address = segment.toRawLongValue()
      return makeIImage(Pointer(address))
    }

    public override fun toNative(obj: IImage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__14515903_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImage): Array<IImage?> = (elements as
        Array<IImage?>).castToImpl<IImage,IImage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImage?> = arrayOfNulls<IImage_Impl>(size) as
        Array<IImage?>
  }
}
