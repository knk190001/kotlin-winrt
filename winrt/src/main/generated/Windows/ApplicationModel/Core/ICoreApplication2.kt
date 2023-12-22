package Windows.ApplicationModel.Core

import Windows.ApplicationModel.Activation.BackgroundActivatedEventArgs
import Windows.ApplicationModel.EnteredBackgroundEventArgs
import Windows.ApplicationModel.LeavingBackgroundEventArgs
import Windows.Foundation.EventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreApplication2.ABI::class)
@Signature("{998681fb-1ab6-4b7f-be4a-9a0645224c04}")
@Guid("998681fb1ab64b7fbe4a9a0645224c04")
@WinRTInterface("998681fb1ab64b7fbe4a9a0645224c04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplication2.ByReference::class)
public interface ICoreApplication2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_BackgroundActivated(handler: EventHandler<BackgroundActivatedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_BackgroundActivated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_LeavingBackground(handler: EventHandler<LeavingBackgroundEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_LeavingBackground(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_EnteredBackground(handler: EventHandler<EnteredBackgroundEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_EnteredBackground(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun EnablePrelaunch(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplication2> {
    public override fun getValue() = ABI.makeICoreApplication2(pointer.getPointer(0))

    public fun setValue(value: ICoreApplication2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplication2 {
    public val __20388929_Ptr: Pointer?

    public val _20388929_VtblPtr: Pointer?
      get() = __20388929_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_BackgroundActivated(handler: EventHandler<BackgroundActivatedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _20388929_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__20388929_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_BackgroundActivated(token: EventRegistrationToken?): Unit {
      val fnPtr = _20388929_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20388929_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_LeavingBackground(handler: EventHandler<LeavingBackgroundEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _20388929_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__20388929_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_LeavingBackground(token: EventRegistrationToken?): Unit {
      val fnPtr = _20388929_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20388929_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_EnteredBackground(handler: EventHandler<EnteredBackgroundEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _20388929_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__20388929_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_EnteredBackground(token: EventRegistrationToken?): Unit {
      val fnPtr = _20388929_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20388929_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun EnablePrelaunch(value: Boolean): Unit {
      val fnPtr = _20388929_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20388929_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreApplication2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20388929_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplication2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("998681fb1ab64b7fbe4a9a0645224c04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplication2(ptr: Pointer?): WithDefault = ICoreApplication2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplication2 {
      val address = segment.toRawLongValue()
      return makeICoreApplication2(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplication2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20388929_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplication2): Array<ICoreApplication2?> = (elements
        as Array<ICoreApplication2?>).castToImpl<ICoreApplication2,ICoreApplication2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplication2?> =
        arrayOfNulls<ICoreApplication2_Impl>(size) as Array<ICoreApplication2?>
  }
}
