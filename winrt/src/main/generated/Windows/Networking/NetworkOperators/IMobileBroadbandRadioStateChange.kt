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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandRadioStateChange.ABI::class)
@Signature("{b054a561-9833-4aed-9717-4348b21a24b3}")
@Guid("b054a56198334aed97174348b21a24b3")
@WinRTInterface("b054a56198334aed97174348b21a24b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandRadioStateChange.ByReference::class)
public interface IMobileBroadbandRadioStateChange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_RadioState(): MobileBroadbandRadioState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandRadioStateChange> {
    public override fun getValue() = ABI.makeIMobileBroadbandRadioStateChange(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandRadioStateChange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandRadioStateChange {
    public val __2103709410_Ptr: Pointer?

    public val _2103709410_VtblPtr: Pointer?
      get() = __2103709410_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _2103709410_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2103709410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RadioState(): MobileBroadbandRadioState? {
      val fnPtr = _2103709410_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandRadioState>()
      val hr = fn.invokeHR(arrayOf(__2103709410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandRadioState>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandRadioStateChange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2103709410_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandRadioStateChange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b054a56198334aed97174348b21a24b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandRadioStateChange(ptr: Pointer?): WithDefault =
        IMobileBroadbandRadioStateChange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandRadioStateChange {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandRadioStateChange(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandRadioStateChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2103709410_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandRadioStateChange):
        Array<IMobileBroadbandRadioStateChange?> = (elements as
        Array<IMobileBroadbandRadioStateChange?>).castToImpl<IMobileBroadbandRadioStateChange,IMobileBroadbandRadioStateChange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandRadioStateChange?> =
        arrayOfNulls<IMobileBroadbandRadioStateChange_Impl>(size) as
        Array<IMobileBroadbandRadioStateChange?>
  }
}
