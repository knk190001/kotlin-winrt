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

@ABIMarker(IMobileBroadbandModemConfiguration.ABI::class)
@Signature("{fce035a3-d6cd-4320-b982-be9d3ec7890f}")
@Guid("fce035a3d6cd4320b982be9d3ec7890f")
@WinRTInterface("fce035a3d6cd4320b982be9d3ec7890f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandModemConfiguration.ByReference::class)
public interface IMobileBroadbandModemConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uicc(): MobileBroadbandUicc?

  @InterfaceMethod(1)
  public fun get_HomeProviderId(): String?

  @InterfaceMethod(2)
  public fun get_HomeProviderName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandModemConfiguration> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandModemConfiguration(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandModemConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandModemConfiguration {
    public val __107880152_Ptr: Pointer?

    public val _107880152_VtblPtr: Pointer?
      get() = __107880152_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uicc(): MobileBroadbandUicc? {
      val fnPtr = _107880152_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandUicc>()
      val hr = fn.invokeHR(arrayOf(__107880152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandUicc>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HomeProviderId(): String? {
      val fnPtr = _107880152_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__107880152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HomeProviderName(): String? {
      val fnPtr = _107880152_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__107880152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandModemConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __107880152_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandModemConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fce035a3d6cd4320b982be9d3ec7890f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandModemConfiguration(ptr: Pointer?): WithDefault =
        IMobileBroadbandModemConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandModemConfiguration {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandModemConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandModemConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__107880152_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandModemConfiguration):
        Array<IMobileBroadbandModemConfiguration?> = (elements as
        Array<IMobileBroadbandModemConfiguration?>).castToImpl<IMobileBroadbandModemConfiguration,IMobileBroadbandModemConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandModemConfiguration?> =
        arrayOfNulls<IMobileBroadbandModemConfiguration_Impl>(size) as
        Array<IMobileBroadbandModemConfiguration?>
  }
}
