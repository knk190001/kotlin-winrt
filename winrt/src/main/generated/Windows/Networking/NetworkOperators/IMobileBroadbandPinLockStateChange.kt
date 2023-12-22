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

@ABIMarker(IMobileBroadbandPinLockStateChange.ABI::class)
@Signature("{be16673e-1f04-4f95-8b90-e7f559dde7e5}")
@Guid("be16673e1f044f958b90e7f559dde7e5")
@WinRTInterface("be16673e1f044f958b90e7f559dde7e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandPinLockStateChange.ByReference::class)
public interface IMobileBroadbandPinLockStateChange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_PinType(): MobileBroadbandPinType?

  @InterfaceMethod(2)
  public fun get_PinLockState(): MobileBroadbandPinLockState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandPinLockStateChange> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandPinLockStateChange(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandPinLockStateChange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandPinLockStateChange {
    public val __1881462179_Ptr: Pointer?

    public val _1881462179_VtblPtr: Pointer?
      get() = __1881462179_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1881462179_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1881462179_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PinType(): MobileBroadbandPinType? {
      val fnPtr = _1881462179_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandPinType>()
      val hr = fn.invokeHR(arrayOf(__1881462179_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandPinType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PinLockState(): MobileBroadbandPinLockState? {
      val fnPtr = _1881462179_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandPinLockState>()
      val hr = fn.invokeHR(arrayOf(__1881462179_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandPinLockState>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandPinLockStateChange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1881462179_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandPinLockStateChange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be16673e1f044f958b90e7f559dde7e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandPinLockStateChange(ptr: Pointer?): WithDefault =
        IMobileBroadbandPinLockStateChange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandPinLockStateChange {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandPinLockStateChange(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandPinLockStateChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1881462179_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandPinLockStateChange):
        Array<IMobileBroadbandPinLockStateChange?> = (elements as
        Array<IMobileBroadbandPinLockStateChange?>).castToImpl<IMobileBroadbandPinLockStateChange,IMobileBroadbandPinLockStateChange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandPinLockStateChange?> =
        arrayOfNulls<IMobileBroadbandPinLockStateChange_Impl>(size) as
        Array<IMobileBroadbandPinLockStateChange?>
  }
}
