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

@ABIMarker(IMobileBroadbandModemStatics.ABI::class)
@Signature("{f99ed637-d6f1-4a78-8cbc-6421a65063c8}")
@Guid("f99ed637d6f14a788cbc6421a65063c8")
@WinRTInterface("f99ed637d6f14a788cbc6421a65063c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandModemStatics.ByReference::class)
public interface IMobileBroadbandModemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromId(deviceId: String?): MobileBroadbandModem?

  @InterfaceMethod(2)
  public fun GetDefault(): MobileBroadbandModem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandModemStatics> {
    public override fun getValue() = ABI.makeIMobileBroadbandModemStatics(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandModemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandModemStatics {
    public val __651426167_Ptr: Pointer?

    public val _651426167_VtblPtr: Pointer?
      get() = __651426167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _651426167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__651426167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromId(deviceId: String?): MobileBroadbandModem? {
      val fnPtr = _651426167_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandModem>()
      val hr = fn.invokeHR(arrayOf(__651426167_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandModem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDefault(): MobileBroadbandModem? {
      val fnPtr = _651426167_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandModem>()
      val hr = fn.invokeHR(arrayOf(__651426167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandModem>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandModemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __651426167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandModemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f99ed637d6f14a788cbc6421a65063c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandModemStatics(ptr: Pointer?): WithDefault =
        IMobileBroadbandModemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandModemStatics {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandModemStatics(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandModemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__651426167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandModemStatics):
        Array<IMobileBroadbandModemStatics?> = (elements as
        Array<IMobileBroadbandModemStatics?>).castToImpl<IMobileBroadbandModemStatics,IMobileBroadbandModemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandModemStatics?> =
        arrayOfNulls<IMobileBroadbandModemStatics_Impl>(size) as
        Array<IMobileBroadbandModemStatics?>
  }
}
