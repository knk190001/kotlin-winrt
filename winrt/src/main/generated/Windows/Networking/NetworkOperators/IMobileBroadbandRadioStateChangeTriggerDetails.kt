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

@ABIMarker(IMobileBroadbandRadioStateChangeTriggerDetails.ABI::class)
@Signature("{71301ace-093c-42c6-b0db-ad1f75a65445}")
@Guid("71301ace093c42c6b0dbad1f75a65445")
@WinRTInterface("71301ace093c42c6b0dbad1f75a65445")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandRadioStateChangeTriggerDetails.ByReference::class)
public interface IMobileBroadbandRadioStateChangeTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RadioStateChanges(): IVectorView<MobileBroadbandRadioStateChange?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandRadioStateChangeTriggerDetails> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandRadioStateChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandRadioStateChangeTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandRadioStateChangeTriggerDetails {
    public val __1077216020_Ptr: Pointer?

    public val _1077216020_VtblPtr: Pointer?
      get() = __1077216020_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RadioStateChanges(): IVectorView<MobileBroadbandRadioStateChange?>? {
      val fnPtr = _1077216020_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandRadioStateChange?>>()
      val hr = fn.invokeHR(arrayOf(__1077216020_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MobileBroadbandRadioStateChange?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandRadioStateChangeTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1077216020_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandRadioStateChangeTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71301ace093c42c6b0dbad1f75a65445")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandRadioStateChangeTriggerDetails(ptr: Pointer?): WithDefault =
        IMobileBroadbandRadioStateChangeTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandRadioStateChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandRadioStateChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandRadioStateChangeTriggerDetails): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1077216020_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandRadioStateChangeTriggerDetails):
        Array<IMobileBroadbandRadioStateChangeTriggerDetails?> = (elements as
        Array<IMobileBroadbandRadioStateChangeTriggerDetails?>).castToImpl<IMobileBroadbandRadioStateChangeTriggerDetails,IMobileBroadbandRadioStateChangeTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandRadioStateChangeTriggerDetails?> =
        arrayOfNulls<IMobileBroadbandRadioStateChangeTriggerDetails_Impl>(size) as
        Array<IMobileBroadbandRadioStateChangeTriggerDetails?>
  }
}
