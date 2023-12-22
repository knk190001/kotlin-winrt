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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWindow3.ABI::class)
@Signature("{32c20dd8-faef-4375-a2ab-32640e4815c7}")
@Guid("32c20dd8faef4375a2ab32640e4815c7")
@WinRTInterface("32c20dd8faef4375a2ab32640e4815c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindow3.ByReference::class)
public interface ICoreWindow3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ClosestInteractiveBoundsRequested(handler: TypedEventHandler<CoreWindow?,
      ClosestInteractiveBoundsRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ClosestInteractiveBoundsRequested(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun GetCurrentKeyEventDeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICoreWindow3> {
    public override fun getValue() = ABI.makeICoreWindow3(pointer.getPointer(0))

    public fun setValue(value: ICoreWindow3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindow3 {
    public val __1001563415_Ptr: Pointer?

    public val _1001563415_VtblPtr: Pointer?
      get() = __1001563415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_ClosestInteractiveBoundsRequested(handler: TypedEventHandler<CoreWindow?,
        ClosestInteractiveBoundsRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1001563415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1001563415_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ClosestInteractiveBoundsRequested(cookie: EventRegistrationToken?):
        Unit {
      val fnPtr = _1001563415_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1001563415_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetCurrentKeyEventDeviceId(): String? {
      val fnPtr = _1001563415_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1001563415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWindow3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1001563415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindow3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("32c20dd8faef4375a2ab32640e4815c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindow3(ptr: Pointer?): WithDefault = ICoreWindow3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindow3 {
      val address = segment.toRawLongValue()
      return makeICoreWindow3(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindow3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1001563415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindow3): Array<ICoreWindow3?> = (elements as
        Array<ICoreWindow3?>).castToImpl<ICoreWindow3,ICoreWindow3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindow3?> =
        arrayOfNulls<ICoreWindow3_Impl>(size) as Array<ICoreWindow3?>
  }
}
