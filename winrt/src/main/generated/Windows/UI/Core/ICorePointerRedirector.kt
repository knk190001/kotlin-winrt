package Windows.UI.Core

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICorePointerRedirector.ABI::class)
@Signature("{8f9d0c94-5688-4b0c-a9f1-f931f7fa3dc3}")
@Guid("8f9d0c9456884b0ca9f1f931f7fa3dc3")
@WinRTInterface("8f9d0c9456884b0ca9f1f931f7fa3dc3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICorePointerRedirector.ByReference::class)
public interface ICorePointerRedirector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PointerRoutedAway(handler: TypedEventHandler<ICorePointerRedirector?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PointerRoutedAway(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PointerRoutedTo(handler: TypedEventHandler<ICorePointerRedirector?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PointerRoutedTo(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_PointerRoutedReleased(handler: TypedEventHandler<ICorePointerRedirector?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PointerRoutedReleased(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICorePointerRedirector> {
    public override fun getValue() = ABI.makeICorePointerRedirector(pointer.getPointer(0))

    public fun setValue(value: ICorePointerRedirector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICorePointerRedirector {
    public val __683430402_Ptr: Pointer?

    public val _683430402_VtblPtr: Pointer?
      get() = __683430402_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PointerRoutedAway(handler: TypedEventHandler<ICorePointerRedirector?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _683430402_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__683430402_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PointerRoutedAway(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _683430402_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__683430402_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PointerRoutedTo(handler: TypedEventHandler<ICorePointerRedirector?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _683430402_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__683430402_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PointerRoutedTo(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _683430402_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__683430402_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_PointerRoutedReleased(handler: TypedEventHandler<ICorePointerRedirector?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _683430402_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__683430402_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PointerRoutedReleased(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _683430402_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__683430402_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICorePointerRedirector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __683430402_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICorePointerRedirector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f9d0c9456884b0ca9f1f931f7fa3dc3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICorePointerRedirector(ptr: Pointer?): WithDefault =
        ICorePointerRedirector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICorePointerRedirector {
      val address = segment.toRawLongValue()
      return makeICorePointerRedirector(Pointer(address))
    }

    public override fun toNative(obj: ICorePointerRedirector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__683430402_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICorePointerRedirector): Array<ICorePointerRedirector?> =
        (elements as
        Array<ICorePointerRedirector?>).castToImpl<ICorePointerRedirector,ICorePointerRedirector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICorePointerRedirector?> =
        arrayOfNulls<ICorePointerRedirector_Impl>(size) as Array<ICorePointerRedirector?>
  }
}
