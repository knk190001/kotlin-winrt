package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandPcoDataChangeTriggerDetails.ABI::class)
@Signature("{263f5114-64e0-4493-909b-2d14a01962b1}")
@Guid("263f511464e04493909b2d14a01962b1")
@WinRTInterface("263f511464e04493909b2d14a01962b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandPcoDataChangeTriggerDetails.ByReference::class)
public interface IMobileBroadbandPcoDataChangeTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UpdatedData(): MobileBroadbandPco?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandPcoDataChangeTriggerDetails> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandPcoDataChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandPcoDataChangeTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandPcoDataChangeTriggerDetails {
    public val __33803588_Ptr: Pointer?

    public val _33803588_VtblPtr: Pointer?
      get() = __33803588_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UpdatedData(): MobileBroadbandPco? {
      val fnPtr = _33803588_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandPco>()
      val hr = fn.invokeHR(arrayOf(__33803588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandPco>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandPcoDataChangeTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __33803588_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandPcoDataChangeTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("263f511464e04493909b2d14a01962b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandPcoDataChangeTriggerDetails(ptr: Pointer?): WithDefault =
        IMobileBroadbandPcoDataChangeTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandPcoDataChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandPcoDataChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandPcoDataChangeTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__33803588_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandPcoDataChangeTriggerDetails):
        Array<IMobileBroadbandPcoDataChangeTriggerDetails?> = (elements as
        Array<IMobileBroadbandPcoDataChangeTriggerDetails?>).castToImpl<IMobileBroadbandPcoDataChangeTriggerDetails,IMobileBroadbandPcoDataChangeTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandPcoDataChangeTriggerDetails?> =
        arrayOfNulls<IMobileBroadbandPcoDataChangeTriggerDetails_Impl>(size) as
        Array<IMobileBroadbandPcoDataChangeTriggerDetails?>
  }
}
