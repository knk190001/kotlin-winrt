package Windows.Devices.WiFiDirect

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IWiFiDirectConnectionParameters2.ABI::class)
@Signature("{ab3b0fbe-aa82-44b4-88c8-e3056b89801d}")
@Guid("ab3b0fbeaa8244b488c8e3056b89801d")
@WinRTInterface("ab3b0fbeaa8244b488c8e3056b89801d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectConnectionParameters2.ByReference::class)
public interface IWiFiDirectConnectionParameters2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreferenceOrderedConfigurationMethods(): IVector<WiFiDirectConfigurationMethod?>?

  @InterfaceMethod(1)
  public fun get_PreferredPairingProcedure(): WiFiDirectPairingProcedure?

  @InterfaceMethod(2)
  public fun put_PreferredPairingProcedure(value: WiFiDirectPairingProcedure?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectConnectionParameters2> {
    public override fun getValue() = ABI.makeIWiFiDirectConnectionParameters2(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectConnectionParameters2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectConnectionParameters2 {
    public val __123377091_Ptr: Pointer?

    public val _123377091_VtblPtr: Pointer?
      get() = __123377091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreferenceOrderedConfigurationMethods():
        IVector<WiFiDirectConfigurationMethod?>? {
      val fnPtr = _123377091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WiFiDirectConfigurationMethod?>>()
      val hr = fn.invokeHR(arrayOf(__123377091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<WiFiDirectConfigurationMethod?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PreferredPairingProcedure(): WiFiDirectPairingProcedure? {
      val fnPtr = _123377091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectPairingProcedure>()
      val hr = fn.invokeHR(arrayOf(__123377091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectPairingProcedure>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_PreferredPairingProcedure(value: WiFiDirectPairingProcedure?): Unit {
      val fnPtr = _123377091_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__123377091_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWiFiDirectConnectionParameters2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __123377091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectConnectionParameters2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab3b0fbeaa8244b488c8e3056b89801d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectConnectionParameters2(ptr: Pointer?): WithDefault =
        IWiFiDirectConnectionParameters2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectConnectionParameters2 {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectConnectionParameters2(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectConnectionParameters2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__123377091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectConnectionParameters2):
        Array<IWiFiDirectConnectionParameters2?> = (elements as
        Array<IWiFiDirectConnectionParameters2?>).castToImpl<IWiFiDirectConnectionParameters2,IWiFiDirectConnectionParameters2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectConnectionParameters2?> =
        arrayOfNulls<IWiFiDirectConnectionParameters2_Impl>(size) as
        Array<IWiFiDirectConnectionParameters2?>
  }
}
