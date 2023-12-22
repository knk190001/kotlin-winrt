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

@ABIMarker(IClaimedMagneticStripeReader2.ABI::class)
@Signature("{236fafdf-e2dc-4d7d-9c78-060df2bf2928}")
@Guid("236fafdfe2dc4d7d9c78060df2bf2928")
@WinRTInterface("236fafdfe2dc4d7d9c78060df2bf2928")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedMagneticStripeReader2.ByReference::class)
public interface IClaimedMagneticStripeReader2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Closed(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
      ClaimedMagneticStripeReaderClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedMagneticStripeReader2> {
    public override fun getValue() = ABI.makeIClaimedMagneticStripeReader2(pointer.getPointer(0))

    public fun setValue(value: IClaimedMagneticStripeReader2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedMagneticStripeReader2 {
    public val __626289314_Ptr: Pointer?

    public val _626289314_VtblPtr: Pointer?
      get() = __626289314_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Closed(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
        ClaimedMagneticStripeReaderClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _626289314_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__626289314_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _626289314_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__626289314_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedMagneticStripeReader2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __626289314_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedMagneticStripeReader2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("236fafdfe2dc4d7d9c78060df2bf2928")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedMagneticStripeReader2(ptr: Pointer?): WithDefault =
        IClaimedMagneticStripeReader2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedMagneticStripeReader2 {
      val address = segment.toRawLongValue()
      return makeIClaimedMagneticStripeReader2(Pointer(address))
    }

    public override fun toNative(obj: IClaimedMagneticStripeReader2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__626289314_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedMagneticStripeReader2):
        Array<IClaimedMagneticStripeReader2?> = (elements as
        Array<IClaimedMagneticStripeReader2?>).castToImpl<IClaimedMagneticStripeReader2,IClaimedMagneticStripeReader2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedMagneticStripeReader2?> =
        arrayOfNulls<IClaimedMagneticStripeReader2_Impl>(size) as
        Array<IClaimedMagneticStripeReader2?>
  }
}
