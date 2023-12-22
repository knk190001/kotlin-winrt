package Windows.Devices.Display.Core

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

@ABIMarker(IDisplaySource2.ABI::class)
@Signature("{71e18952-b321-5af4-bfe8-03fbea31e40d}")
@Guid("71e18952b3215af4bfe803fbea31e40d")
@WinRTInterface("71e18952b3215af4bfe803fbea31e40d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplaySource2.ByReference::class)
public interface IDisplaySource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): DisplaySourceStatus?

  @InterfaceMethod(1)
  public fun add_StatusChanged(handler: TypedEventHandler<DisplaySource?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_StatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplaySource2> {
    public override fun getValue() = ABI.makeIDisplaySource2(pointer.getPointer(0))

    public fun setValue(value: IDisplaySource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplaySource2 {
    public val __1175110569_Ptr: Pointer?

    public val _1175110569_VtblPtr: Pointer?
      get() = __1175110569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): DisplaySourceStatus? {
      val fnPtr = _1175110569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplaySourceStatus>()
      val hr = fn.invokeHR(arrayOf(__1175110569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplaySourceStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_StatusChanged(handler: TypedEventHandler<DisplaySource?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1175110569_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1175110569_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_StatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1175110569_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1175110569_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplaySource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1175110569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplaySource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71e18952b3215af4bfe803fbea31e40d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplaySource2(ptr: Pointer?): WithDefault = IDisplaySource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplaySource2 {
      val address = segment.toRawLongValue()
      return makeIDisplaySource2(Pointer(address))
    }

    public override fun toNative(obj: IDisplaySource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1175110569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplaySource2): Array<IDisplaySource2?> = (elements as
        Array<IDisplaySource2?>).castToImpl<IDisplaySource2,IDisplaySource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplaySource2?> =
        arrayOfNulls<IDisplaySource2_Impl>(size) as Array<IDisplaySource2?>
  }
}
