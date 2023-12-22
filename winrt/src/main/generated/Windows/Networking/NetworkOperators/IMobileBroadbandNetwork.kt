package Windows.Networking.NetworkOperators

import Windows.Networking.Connectivity.NetworkAdapter
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMobileBroadbandNetwork.ABI::class)
@Signature("{cb63928c-0309-4cb6-a8c1-6a5a3c8e1ff6}")
@Guid("cb63928c03094cb6a8c16a5a3c8e1ff6")
@WinRTInterface("cb63928c03094cb6a8c16a5a3c8e1ff6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandNetwork.ByReference::class)
public interface IMobileBroadbandNetwork : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkAdapter(): NetworkAdapter?

  @InterfaceMethod(1)
  public fun get_NetworkRegistrationState(): NetworkRegistrationState?

  @InterfaceMethod(2)
  public fun get_RegistrationNetworkError(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_PacketAttachNetworkError(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_ActivationNetworkError(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_AccessPointName(): String?

  @InterfaceMethod(6)
  public fun get_RegisteredDataClass(): DataClasses?

  @InterfaceMethod(7)
  public fun get_RegisteredProviderId(): String?

  @InterfaceMethod(8)
  public fun get_RegisteredProviderName(): String?

  @InterfaceMethod(9)
  public fun ShowConnectionUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandNetwork> {
    public override fun getValue() = ABI.makeIMobileBroadbandNetwork(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandNetwork_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandNetwork {
    public val __149603442_Ptr: Pointer?

    public val _149603442_VtblPtr: Pointer?
      get() = __149603442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkAdapter(): NetworkAdapter? {
      val fnPtr = _149603442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkAdapter>()
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkAdapter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NetworkRegistrationState(): NetworkRegistrationState? {
      val fnPtr = _149603442_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkRegistrationState>()
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkRegistrationState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RegistrationNetworkError(): WinDef.UINT {
      val fnPtr = _149603442_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PacketAttachNetworkError(): WinDef.UINT {
      val fnPtr = _149603442_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ActivationNetworkError(): WinDef.UINT {
      val fnPtr = _149603442_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_AccessPointName(): String? {
      val fnPtr = _149603442_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RegisteredDataClass(): DataClasses? {
      val fnPtr = _149603442_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataClasses>()
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataClasses>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_RegisteredProviderId(): String? {
      val fnPtr = _149603442_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_RegisteredProviderName(): String? {
      val fnPtr = _149603442_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ShowConnectionUI(): Unit {
      val fnPtr = _149603442_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__149603442_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMobileBroadbandNetwork_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __149603442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandNetwork, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb63928c03094cb6a8c16a5a3c8e1ff6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandNetwork(ptr: Pointer?): WithDefault =
        IMobileBroadbandNetwork_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandNetwork {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandNetwork(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandNetwork): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__149603442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandNetwork): Array<IMobileBroadbandNetwork?>
        = (elements as
        Array<IMobileBroadbandNetwork?>).castToImpl<IMobileBroadbandNetwork,IMobileBroadbandNetwork_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandNetwork?> =
        arrayOfNulls<IMobileBroadbandNetwork_Impl>(size) as Array<IMobileBroadbandNetwork?>
  }
}
