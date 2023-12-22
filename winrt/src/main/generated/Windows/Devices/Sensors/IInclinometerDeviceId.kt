package Windows.Devices.Sensors

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

@ABIMarker(IInclinometerDeviceId.ABI::class)
@Signature("{01e91982-41ff-4406-ae83-62210ff16fe3}")
@Guid("01e9198241ff4406ae8362210ff16fe3")
@WinRTInterface("01e9198241ff4406ae8362210ff16fe3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerDeviceId.ByReference::class)
public interface IInclinometerDeviceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerDeviceId> {
    public override fun getValue() = ABI.makeIInclinometerDeviceId(pointer.getPointer(0))

    public fun setValue(value: IInclinometerDeviceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerDeviceId {
    public val __833921354_Ptr: Pointer?

    public val _833921354_VtblPtr: Pointer?
      get() = __833921354_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _833921354_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__833921354_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometerDeviceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __833921354_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerDeviceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01e9198241ff4406ae8362210ff16fe3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerDeviceId(ptr: Pointer?): WithDefault =
        IInclinometerDeviceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerDeviceId {
      val address = segment.toRawLongValue()
      return makeIInclinometerDeviceId(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerDeviceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__833921354_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerDeviceId): Array<IInclinometerDeviceId?> =
        (elements as
        Array<IInclinometerDeviceId?>).castToImpl<IInclinometerDeviceId,IInclinometerDeviceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerDeviceId?> =
        arrayOfNulls<IInclinometerDeviceId_Impl>(size) as Array<IInclinometerDeviceId?>
  }
}
