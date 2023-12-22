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

@ABIMarker(IClaimedBarcodeScanner4.ABI::class)
@Signature("{5d501f97-376a-41a8-a230-2f37c1949dde}")
@Guid("5d501f97376a41a8a2302f37c1949dde")
@WinRTInterface("5d501f97376a41a8a2302f37c1949dde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedBarcodeScanner4.ByReference::class)
public interface IClaimedBarcodeScanner4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Closed(handler: TypedEventHandler<ClaimedBarcodeScanner?,
      ClaimedBarcodeScannerClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedBarcodeScanner4> {
    public override fun getValue() = ABI.makeIClaimedBarcodeScanner4(pointer.getPointer(0))

    public fun setValue(value: IClaimedBarcodeScanner4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedBarcodeScanner4 {
    public val __1237950182_Ptr: Pointer?

    public val _1237950182_VtblPtr: Pointer?
      get() = __1237950182_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Closed(handler: TypedEventHandler<ClaimedBarcodeScanner?,
        ClaimedBarcodeScannerClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1237950182_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1237950182_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1237950182_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237950182_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedBarcodeScanner4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237950182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedBarcodeScanner4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d501f97376a41a8a2302f37c1949dde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedBarcodeScanner4(ptr: Pointer?): WithDefault =
        IClaimedBarcodeScanner4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedBarcodeScanner4 {
      val address = segment.toRawLongValue()
      return makeIClaimedBarcodeScanner4(Pointer(address))
    }

    public override fun toNative(obj: IClaimedBarcodeScanner4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237950182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedBarcodeScanner4): Array<IClaimedBarcodeScanner4?>
        = (elements as
        Array<IClaimedBarcodeScanner4?>).castToImpl<IClaimedBarcodeScanner4,IClaimedBarcodeScanner4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedBarcodeScanner4?> =
        arrayOfNulls<IClaimedBarcodeScanner4_Impl>(size) as Array<IClaimedBarcodeScanner4?>
  }
}
