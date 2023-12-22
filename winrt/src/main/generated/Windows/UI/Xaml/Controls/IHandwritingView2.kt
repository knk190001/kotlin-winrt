package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Core.CoreInputDeviceTypes
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHandwritingView2.ABI::class)
@Signature("{4bcf991b-0de1-5c9e-8970-37b9878fe171}")
@Guid("4bcf991b0de15c9e897037b9878fe171")
@WinRTInterface("4bcf991b0de15c9e897037b9878fe171")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandwritingView2.ByReference::class)
public interface IHandwritingView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSwitchToKeyboardEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsSwitchToKeyboardEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsCommandBarOpen(): Boolean

  @InterfaceMethod(3)
  public fun put_IsCommandBarOpen(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_InputDeviceTypes(): CoreInputDeviceTypes?

  @InterfaceMethod(5)
  public fun put_InputDeviceTypes(value: CoreInputDeviceTypes?): Unit

  @InterfaceMethod(6)
  public fun add_CandidatesChanged(handler: TypedEventHandler<HandwritingView?,
      HandwritingViewCandidatesChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_CandidatesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_TextSubmitted(handler: TypedEventHandler<HandwritingView?,
      HandwritingViewTextSubmittedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_TextSubmitted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun GetCandidates(candidatesSessionId: WinDef.UINT): IVectorView<String?>?

  @InterfaceMethod(11)
  public fun SelectCandidate(candidatesSessionId: WinDef.UINT, selectedCandidateIndex: WinDef.UINT):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandwritingView2> {
    public override fun getValue() = ABI.makeIHandwritingView2(pointer.getPointer(0))

    public fun setValue(value: IHandwritingView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandwritingView2 {
    public val __918449988_Ptr: Pointer?

    public val _918449988_VtblPtr: Pointer?
      get() = __918449988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSwitchToKeyboardEnabled(): Boolean {
      val fnPtr = _918449988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsSwitchToKeyboardEnabled(value: Boolean): Unit {
      val fnPtr = _918449988_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsCommandBarOpen(): Boolean {
      val fnPtr = _918449988_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsCommandBarOpen(value: Boolean): Unit {
      val fnPtr = _918449988_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_InputDeviceTypes(): CoreInputDeviceTypes? {
      val fnPtr = _918449988_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreInputDeviceTypes>()
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreInputDeviceTypes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_InputDeviceTypes(value: CoreInputDeviceTypes?): Unit {
      val fnPtr = _918449988_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_CandidatesChanged(handler: TypedEventHandler<HandwritingView?,
        HandwritingViewCandidatesChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _918449988_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_CandidatesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _918449988_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_TextSubmitted(handler: TypedEventHandler<HandwritingView?,
        HandwritingViewTextSubmittedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _918449988_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_TextSubmitted(token: EventRegistrationToken?): Unit {
      val fnPtr = _918449988_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun GetCandidates(candidatesSessionId: WinDef.UINT): IVectorView<String?>? {
      val fnPtr = _918449988_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr, candidatesSessionId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun SelectCandidate(candidatesSessionId: WinDef.UINT,
        selectedCandidateIndex: WinDef.UINT): Unit {
      val fnPtr = _918449988_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__918449988_Ptr, candidatesSessionId, selectedCandidateIndex,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHandwritingView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __918449988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandwritingView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bcf991b0de15c9e897037b9878fe171")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandwritingView2(ptr: Pointer?): WithDefault = IHandwritingView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandwritingView2 {
      val address = segment.toRawLongValue()
      return makeIHandwritingView2(Pointer(address))
    }

    public override fun toNative(obj: IHandwritingView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__918449988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandwritingView2): Array<IHandwritingView2?> = (elements
        as Array<IHandwritingView2?>).castToImpl<IHandwritingView2,IHandwritingView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandwritingView2?> =
        arrayOfNulls<IHandwritingView2_Impl>(size) as Array<IHandwritingView2?>
  }
}
