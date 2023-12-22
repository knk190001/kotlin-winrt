package Windows.Devices.WiFiDirect

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
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWiFiDirectConnectionParameters.ABI::class)
@Signature("{b2e55405-5702-4b16-a02c-bbcd21ef6098}")
@Guid("b2e5540557024b16a02cbbcd21ef6098")
@WinRTInterface("b2e5540557024b16a02cbbcd21ef6098")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectConnectionParameters.ByReference::class)
public interface IWiFiDirectConnectionParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GroupOwnerIntent(): Short

  @InterfaceMethod(1)
  public fun put_GroupOwnerIntent(value: Short): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectConnectionParameters> {
    public override fun getValue() = ABI.makeIWiFiDirectConnectionParameters(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectConnectionParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectConnectionParameters {
    public val __827304085_Ptr: Pointer?

    public val _827304085_VtblPtr: Pointer?
      get() = __827304085_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GroupOwnerIntent(): Short {
      val fnPtr = _827304085_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Short>()
      val hr = fn.invokeHR(arrayOf(__827304085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Short>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_GroupOwnerIntent(value: Short): Unit {
      val fnPtr = _827304085_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__827304085_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWiFiDirectConnectionParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __827304085_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectConnectionParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2e5540557024b16a02cbbcd21ef6098")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectConnectionParameters(ptr: Pointer?): WithDefault =
        IWiFiDirectConnectionParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectConnectionParameters {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectConnectionParameters(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectConnectionParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__827304085_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectConnectionParameters):
        Array<IWiFiDirectConnectionParameters?> = (elements as
        Array<IWiFiDirectConnectionParameters?>).castToImpl<IWiFiDirectConnectionParameters,IWiFiDirectConnectionParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectConnectionParameters?> =
        arrayOfNulls<IWiFiDirectConnectionParameters_Impl>(size) as
        Array<IWiFiDirectConnectionParameters?>
  }
}
