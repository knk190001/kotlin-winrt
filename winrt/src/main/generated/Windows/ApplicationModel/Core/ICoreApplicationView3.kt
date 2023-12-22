package Windows.ApplicationModel.Core

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

@ABIMarker(ICoreApplicationView3.ABI::class)
@Signature("{07ebe1b3-a4cf-4550-ab70-b07e85330bc8}")
@Guid("07ebe1b3a4cf4550ab70b07e85330bc8")
@WinRTInterface("07ebe1b3a4cf4550ab70b07e85330bc8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplicationView3.ByReference::class)
public interface ICoreApplicationView3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsComponent(): Boolean

  @InterfaceMethod(1)
  public fun get_TitleBar(): CoreApplicationViewTitleBar?

  @InterfaceMethod(2)
  public fun add_HostedViewClosing(handler: TypedEventHandler<CoreApplicationView?,
      HostedViewClosingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_HostedViewClosing(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplicationView3> {
    public override fun getValue() = ABI.makeICoreApplicationView3(pointer.getPointer(0))

    public fun setValue(value: ICoreApplicationView3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplicationView3 {
    public val __503948957_Ptr: Pointer?

    public val _503948957_VtblPtr: Pointer?
      get() = __503948957_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsComponent(): Boolean {
      val fnPtr = _503948957_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__503948957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_TitleBar(): CoreApplicationViewTitleBar? {
      val fnPtr = _503948957_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreApplicationViewTitleBar>()
      val hr = fn.invokeHR(arrayOf(__503948957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreApplicationViewTitleBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_HostedViewClosing(handler: TypedEventHandler<CoreApplicationView?,
        HostedViewClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _503948957_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__503948957_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_HostedViewClosing(token: EventRegistrationToken?): Unit {
      val fnPtr = _503948957_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__503948957_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreApplicationView3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __503948957_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplicationView3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07ebe1b3a4cf4550ab70b07e85330bc8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplicationView3(ptr: Pointer?): WithDefault =
        ICoreApplicationView3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplicationView3 {
      val address = segment.toRawLongValue()
      return makeICoreApplicationView3(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplicationView3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__503948957_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplicationView3): Array<ICoreApplicationView3?> =
        (elements as
        Array<ICoreApplicationView3?>).castToImpl<ICoreApplicationView3,ICoreApplicationView3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplicationView3?> =
        arrayOfNulls<ICoreApplicationView3_Impl>(size) as Array<ICoreApplicationView3?>
  }
}
