package Windows.Networking.NetworkOperators

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

@ABIMarker(INetworkOperatorTetheringClient.ABI::class)
@Signature("{709d254c-595f-4847-bb30-646935542918}")
@Guid("709d254c595f4847bb30646935542918")
@WinRTInterface("709d254c595f4847bb30646935542918")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringClient.ByReference::class)
public interface INetworkOperatorTetheringClient : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MacAddress(): String?

  @InterfaceMethod(1)
  public fun get_HostNames(): IVectorView<HostName?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringClient> {
    public override fun getValue() = ABI.makeINetworkOperatorTetheringClient(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringClient_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringClient {
    public val __943117154_Ptr: Pointer?

    public val _943117154_VtblPtr: Pointer?
      get() = __943117154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MacAddress(): String? {
      val fnPtr = _943117154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__943117154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HostNames(): IVectorView<HostName?>? {
      val fnPtr = _943117154_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HostName?>>()
      val hr = fn.invokeHR(arrayOf(__943117154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HostName?>>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorTetheringClient_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __943117154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringClient, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("709d254c595f4847bb30646935542918")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringClient(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringClient_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkOperatorTetheringClient {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringClient(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__943117154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringClient):
        Array<INetworkOperatorTetheringClient?> = (elements as
        Array<INetworkOperatorTetheringClient?>).castToImpl<INetworkOperatorTetheringClient,INetworkOperatorTetheringClient_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorTetheringClient?> =
        arrayOfNulls<INetworkOperatorTetheringClient_Impl>(size) as
        Array<INetworkOperatorTetheringClient?>
  }
}
