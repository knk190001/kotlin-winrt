package Windows.Graphics.Holographic

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicSpaceStatics2.ABI::class)
@Signature("{0e777088-75fc-48af-8758-0652f6f07c59}")
@Guid("0e77708875fc48af87580652f6f07c59")
@WinRTInterface("0e77708875fc48af87580652f6f07c59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicSpaceStatics2.ByReference::class)
public interface IHolographicSpaceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsAvailable(): Boolean

  @InterfaceMethod(2)
  public fun add_IsAvailableChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_IsAvailableChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicSpaceStatics2> {
    public override fun getValue() = ABI.makeIHolographicSpaceStatics2(pointer.getPointer(0))

    public fun setValue(value: IHolographicSpaceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicSpaceStatics2 {
    public val __2132053880_Ptr: Pointer?

    public val _2132053880_VtblPtr: Pointer?
      get() = __2132053880_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _2132053880_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2132053880_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsAvailable(): Boolean {
      val fnPtr = _2132053880_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2132053880_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_IsAvailableChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _2132053880_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2132053880_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_IsAvailableChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2132053880_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2132053880_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicSpaceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2132053880_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicSpaceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e77708875fc48af87580652f6f07c59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicSpaceStatics2(ptr: Pointer?): WithDefault =
        IHolographicSpaceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicSpaceStatics2 {
      val address = segment.toRawLongValue()
      return makeIHolographicSpaceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IHolographicSpaceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2132053880_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicSpaceStatics2):
        Array<IHolographicSpaceStatics2?> = (elements as
        Array<IHolographicSpaceStatics2?>).castToImpl<IHolographicSpaceStatics2,IHolographicSpaceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicSpaceStatics2?> =
        arrayOfNulls<IHolographicSpaceStatics2_Impl>(size) as Array<IHolographicSpaceStatics2?>
  }
}
