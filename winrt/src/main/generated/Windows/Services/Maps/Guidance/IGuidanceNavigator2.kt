package Windows.Services.Maps.Guidance

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGuidanceNavigator2.ABI::class)
@Signature("{6cdc50d1-041c-4bf3-b633-a101fc2f6b57}")
@Guid("6cdc50d1041c4bf3b633a101fc2f6b57")
@WinRTInterface("6cdc50d1041c4bf3b633a101fc2f6b57")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceNavigator2.ByReference::class)
public interface IGuidanceNavigator2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_AudioNotificationRequested(value: TypedEventHandler<GuidanceNavigator?,
      GuidanceAudioNotificationRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AudioNotificationRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_IsGuidanceAudioMuted(): Boolean

  @InterfaceMethod(3)
  public fun put_IsGuidanceAudioMuted(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceNavigator2> {
    public override fun getValue() = ABI.makeIGuidanceNavigator2(pointer.getPointer(0))

    public fun setValue(value: IGuidanceNavigator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceNavigator2 {
    public val __1524014802_Ptr: Pointer?

    public val _1524014802_VtblPtr: Pointer?
      get() = __1524014802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_AudioNotificationRequested(value: TypedEventHandler<GuidanceNavigator?,
        GuidanceAudioNotificationRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1524014802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1524014802_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AudioNotificationRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1524014802_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1524014802_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsGuidanceAudioMuted(): Boolean {
      val fnPtr = _1524014802_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1524014802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsGuidanceAudioMuted(value: Boolean): Unit {
      val fnPtr = _1524014802_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1524014802_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGuidanceNavigator2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1524014802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceNavigator2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cdc50d1041c4bf3b633a101fc2f6b57")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceNavigator2(ptr: Pointer?): WithDefault = IGuidanceNavigator2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceNavigator2 {
      val address = segment.toRawLongValue()
      return makeIGuidanceNavigator2(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceNavigator2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1524014802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceNavigator2): Array<IGuidanceNavigator2?> =
        (elements as
        Array<IGuidanceNavigator2?>).castToImpl<IGuidanceNavigator2,IGuidanceNavigator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceNavigator2?> =
        arrayOfNulls<IGuidanceNavigator2_Impl>(size) as Array<IGuidanceNavigator2?>
  }
}
