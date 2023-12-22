package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMobileBroadbandPinLockStateChangeTriggerDetails.ABI::class)
@Signature("{d338c091-3e91-4d38-9036-aee83a6e79ad}")
@Guid("d338c0913e914d389036aee83a6e79ad")
@WinRTInterface("d338c0913e914d389036aee83a6e79ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandPinLockStateChangeTriggerDetails.ByReference::class)
public interface IMobileBroadbandPinLockStateChangeTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PinLockStateChanges(): IVectorView<MobileBroadbandPinLockStateChange?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandPinLockStateChangeTriggerDetails> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandPinLockStateChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandPinLockStateChangeTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandPinLockStateChangeTriggerDetails {
    public val __111338791_Ptr: Pointer?

    public val _111338791_VtblPtr: Pointer?
      get() = __111338791_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PinLockStateChanges():
        IVectorView<MobileBroadbandPinLockStateChange?>? {
      val fnPtr = _111338791_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandPinLockStateChange?>>()
      val hr = fn.invokeHR(arrayOf(__111338791_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MobileBroadbandPinLockStateChange?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandPinLockStateChangeTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __111338791_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandPinLockStateChangeTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d338c0913e914d389036aee83a6e79ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandPinLockStateChangeTriggerDetails(ptr: Pointer?): WithDefault =
        IMobileBroadbandPinLockStateChangeTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandPinLockStateChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandPinLockStateChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandPinLockStateChangeTriggerDetails):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__111338791_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandPinLockStateChangeTriggerDetails):
        Array<IMobileBroadbandPinLockStateChangeTriggerDetails?> = (elements as
        Array<IMobileBroadbandPinLockStateChangeTriggerDetails?>).castToImpl<IMobileBroadbandPinLockStateChangeTriggerDetails,IMobileBroadbandPinLockStateChangeTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandPinLockStateChangeTriggerDetails?>
        = arrayOfNulls<IMobileBroadbandPinLockStateChangeTriggerDetails_Impl>(size) as
        Array<IMobileBroadbandPinLockStateChangeTriggerDetails?>
  }
}
