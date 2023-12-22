package Windows.Gaming.Input

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IArcadeStickStatics.ABI::class)
@Signature("{5c37b8c8-37b1-4ad8-9458-200f1a30018e}")
@Guid("5c37b8c837b14ad89458200f1a30018e")
@WinRTInterface("5c37b8c837b14ad89458200f1a30018e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IArcadeStickStatics.ByReference::class)
public interface IArcadeStickStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ArcadeStickAdded(value: EventHandler<ArcadeStick?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ArcadeStickAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_ArcadeStickRemoved(value: EventHandler<ArcadeStick?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ArcadeStickRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_ArcadeSticks(): IVectorView<ArcadeStick?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IArcadeStickStatics> {
    public override fun getValue() = ABI.makeIArcadeStickStatics(pointer.getPointer(0))

    public fun setValue(value: IArcadeStickStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IArcadeStickStatics {
    public val __473814088_Ptr: Pointer?

    public val _473814088_VtblPtr: Pointer?
      get() = __473814088_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ArcadeStickAdded(value: EventHandler<ArcadeStick?>?):
        EventRegistrationToken? {
      val fnPtr = _473814088_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__473814088_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ArcadeStickAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _473814088_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__473814088_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ArcadeStickRemoved(value: EventHandler<ArcadeStick?>?):
        EventRegistrationToken? {
      val fnPtr = _473814088_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__473814088_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ArcadeStickRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _473814088_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__473814088_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ArcadeSticks(): IVectorView<ArcadeStick?>? {
      val fnPtr = _473814088_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ArcadeStick?>>()
      val hr = fn.invokeHR(arrayOf(__473814088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ArcadeStick?>>(result.getValue())
      return resultValue
    }
  }

  public class IArcadeStickStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __473814088_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IArcadeStickStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c37b8c837b14ad89458200f1a30018e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIArcadeStickStatics(ptr: Pointer?): WithDefault = IArcadeStickStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IArcadeStickStatics {
      val address = segment.toRawLongValue()
      return makeIArcadeStickStatics(Pointer(address))
    }

    public override fun toNative(obj: IArcadeStickStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__473814088_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IArcadeStickStatics): Array<IArcadeStickStatics?> =
        (elements as
        Array<IArcadeStickStatics?>).castToImpl<IArcadeStickStatics,IArcadeStickStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IArcadeStickStatics?> =
        arrayOfNulls<IArcadeStickStatics_Impl>(size) as Array<IArcadeStickStatics?>
  }
}
