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

@ABIMarker(IMobileBroadbandDeviceInformation3.ABI::class)
@Signature("{e08bb4bd-5d30-4b5a-92cc-d54df881d49e}")
@Guid("e08bb4bd5d304b5a92ccd54df881d49e")
@WinRTInterface("e08bb4bd5d304b5a92ccd54df881d49e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceInformation3.ByReference::class)
public interface IMobileBroadbandDeviceInformation3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SimSpn(): String?

  @InterfaceMethod(1)
  public fun get_SimPnn(): String?

  @InterfaceMethod(2)
  public fun get_SimGid1(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceInformation3> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceInformation3(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceInformation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceInformation3 {
    public val __284562745_Ptr: Pointer?

    public val _284562745_VtblPtr: Pointer?
      get() = __284562745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SimSpn(): String? {
      val fnPtr = _284562745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__284562745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SimPnn(): String? {
      val fnPtr = _284562745_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__284562745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SimGid1(): String? {
      val fnPtr = _284562745_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__284562745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandDeviceInformation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __284562745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceInformation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e08bb4bd5d304b5a92ccd54df881d49e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceInformation3(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceInformation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandDeviceInformation3 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceInformation3(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceInformation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__284562745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceInformation3):
        Array<IMobileBroadbandDeviceInformation3?> = (elements as
        Array<IMobileBroadbandDeviceInformation3?>).castToImpl<IMobileBroadbandDeviceInformation3,IMobileBroadbandDeviceInformation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceInformation3?> =
        arrayOfNulls<IMobileBroadbandDeviceInformation3_Impl>(size) as
        Array<IMobileBroadbandDeviceInformation3?>
  }
}
