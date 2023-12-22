package Windows.Devices.PointOfService

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

@ABIMarker(IClaimedPosPrinter2.ABI::class)
@Signature("{5bf7a3d5-5198-437a-82df-589993fa77e1}")
@Guid("5bf7a3d55198437a82df589993fa77e1")
@WinRTInterface("5bf7a3d55198437a82df589993fa77e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedPosPrinter2.ByReference::class)
public interface IClaimedPosPrinter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Closed(handler: TypedEventHandler<ClaimedPosPrinter?,
      ClaimedPosPrinterClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedPosPrinter2> {
    public override fun getValue() = ABI.makeIClaimedPosPrinter2(pointer.getPointer(0))

    public fun setValue(value: IClaimedPosPrinter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedPosPrinter2 {
    public val __1620940208_Ptr: Pointer?

    public val _1620940208_VtblPtr: Pointer?
      get() = __1620940208_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Closed(handler: TypedEventHandler<ClaimedPosPrinter?,
        ClaimedPosPrinterClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1620940208_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1620940208_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1620940208_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1620940208_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedPosPrinter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1620940208_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedPosPrinter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bf7a3d55198437a82df589993fa77e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedPosPrinter2(ptr: Pointer?): WithDefault = IClaimedPosPrinter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedPosPrinter2 {
      val address = segment.toRawLongValue()
      return makeIClaimedPosPrinter2(Pointer(address))
    }

    public override fun toNative(obj: IClaimedPosPrinter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1620940208_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedPosPrinter2): Array<IClaimedPosPrinter2?> =
        (elements as
        Array<IClaimedPosPrinter2?>).castToImpl<IClaimedPosPrinter2,IClaimedPosPrinter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedPosPrinter2?> =
        arrayOfNulls<IClaimedPosPrinter2_Impl>(size) as Array<IClaimedPosPrinter2?>
  }
}
