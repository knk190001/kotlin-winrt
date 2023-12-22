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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICoreTouchHitTesting.ABI::class)
@Signature("{b1d8a289-3acf-4124-9fa3-ea8aba353c21}")
@Guid("b1d8a2893acf41249fa3ea8aba353c21")
@WinRTInterface("b1d8a2893acf41249fa3ea8aba353c21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTouchHitTesting.ByReference::class)
public interface ICoreTouchHitTesting : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_TouchHitTesting(handler: TypedEventHandler<IUnknown?, TouchHitTestingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_TouchHitTesting(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTouchHitTesting> {
    public override fun getValue() = ABI.makeICoreTouchHitTesting(pointer.getPointer(0))

    public fun setValue(value: ICoreTouchHitTesting_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTouchHitTesting {
    public val __1598768706_Ptr: Pointer?

    public val _1598768706_VtblPtr: Pointer?
      get() = __1598768706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_TouchHitTesting(handler: TypedEventHandler<IUnknown?,
        TouchHitTestingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1598768706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1598768706_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_TouchHitTesting(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1598768706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1598768706_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreTouchHitTesting_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1598768706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTouchHitTesting, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1d8a2893acf41249fa3ea8aba353c21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTouchHitTesting(ptr: Pointer?): WithDefault = ICoreTouchHitTesting_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTouchHitTesting {
      val address = segment.toRawLongValue()
      return makeICoreTouchHitTesting(Pointer(address))
    }

    public override fun toNative(obj: ICoreTouchHitTesting): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1598768706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTouchHitTesting): Array<ICoreTouchHitTesting?> =
        (elements as
        Array<ICoreTouchHitTesting?>).castToImpl<ICoreTouchHitTesting,ICoreTouchHitTesting_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTouchHitTesting?> =
        arrayOfNulls<ICoreTouchHitTesting_Impl>(size) as Array<ICoreTouchHitTesting?>
  }
}
