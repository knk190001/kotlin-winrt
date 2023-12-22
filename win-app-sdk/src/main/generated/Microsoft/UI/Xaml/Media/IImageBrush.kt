package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.ExceptionRoutedEventHandler
import Microsoft.UI.Xaml.RoutedEventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IImageBrush.ABI::class)
@Signature("{edcd91a3-a868-5ba6-9489-5b12b4c29d85}")
@Guid("edcd91a3a8685ba694895b12b4c29d85")
@WinRTInterface("edcd91a3a8685ba694895b12b4c29d85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageBrush.ByReference::class)
public interface IImageBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ImageSource(): ImageSource?

  @InterfaceMethod(1)
  public fun put_ImageSource(value: ImageSource?): Unit

  @InterfaceMethod(2)
  public fun add_ImageFailed(handler: ExceptionRoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ImageFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_ImageOpened(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ImageOpened(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IImageBrush> {
    public override fun getValue() = ABI.makeIImageBrush(pointer.getPointer(0))

    public fun setValue(value: IImageBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageBrush {
    public val __1661350512_Ptr: Pointer?

    public val _1661350512_VtblPtr: Pointer?
      get() = __1661350512_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ImageSource(): ImageSource? {
      val fnPtr = _1661350512_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__1661350512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ImageSource(value: ImageSource?): Unit {
      val fnPtr = _1661350512_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1661350512_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ImageFailed(handler: ExceptionRoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1661350512_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1661350512_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ImageFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1661350512_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1661350512_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ImageOpened(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1661350512_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1661350512_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ImageOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1661350512_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1661350512_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IImageBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1661350512_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("edcd91a3a8685ba694895b12b4c29d85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageBrush(ptr: Pointer?): WithDefault = IImageBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageBrush {
      val address = segment.toRawLongValue()
      return makeIImageBrush(Pointer(address))
    }

    public override fun toNative(obj: IImageBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1661350512_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageBrush): Array<IImageBrush?> = (elements as
        Array<IImageBrush?>).castToImpl<IImageBrush,IImageBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageBrush?> =
        arrayOfNulls<IImageBrush_Impl>(size) as Array<IImageBrush?>
  }
}
