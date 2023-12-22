package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVectorView
import Windows.Networking.HostName
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

@ABIMarker(IVpnChannelConfiguration.ABI::class)
@Signature("{0e2ddca2-2012-4fe4-b179-8c652c6d107e}")
@Guid("0e2ddca220124fe4b1798c652c6d107e")
@WinRTInterface("0e2ddca220124fe4b1798c652c6d107e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnChannelConfiguration.ByReference::class)
public interface IVpnChannelConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ServerServiceName(): String?

  @InterfaceMethod(1)
  public fun get_ServerHostNameList(): IVectorView<HostName?>?

  @InterfaceMethod(2)
  public fun get_CustomField(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnChannelConfiguration> {
    public override fun getValue() = ABI.makeIVpnChannelConfiguration(pointer.getPointer(0))

    public fun setValue(value: IVpnChannelConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnChannelConfiguration {
    public val __1001837603_Ptr: Pointer?

    public val _1001837603_VtblPtr: Pointer?
      get() = __1001837603_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServerServiceName(): String? {
      val fnPtr = _1001837603_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1001837603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServerHostNameList(): IVectorView<HostName?>? {
      val fnPtr = _1001837603_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HostName?>>()
      val hr = fn.invokeHR(arrayOf(__1001837603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HostName?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CustomField(): String? {
      val fnPtr = _1001837603_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1001837603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IVpnChannelConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1001837603_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnChannelConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e2ddca220124fe4b1798c652c6d107e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnChannelConfiguration(ptr: Pointer?): WithDefault =
        IVpnChannelConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnChannelConfiguration {
      val address = segment.toRawLongValue()
      return makeIVpnChannelConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IVpnChannelConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1001837603_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnChannelConfiguration):
        Array<IVpnChannelConfiguration?> = (elements as
        Array<IVpnChannelConfiguration?>).castToImpl<IVpnChannelConfiguration,IVpnChannelConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnChannelConfiguration?> =
        arrayOfNulls<IVpnChannelConfiguration_Impl>(size) as Array<IVpnChannelConfiguration?>
  }
}
