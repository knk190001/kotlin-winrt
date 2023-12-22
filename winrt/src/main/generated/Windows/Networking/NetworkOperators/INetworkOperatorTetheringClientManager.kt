package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(INetworkOperatorTetheringClientManager.ABI::class)
@Signature("{91b14016-8dca-4225-bbed-eef8b8d718d7}")
@Guid("91b140168dca4225bbedeef8b8d718d7")
@WinRTInterface("91b140168dca4225bbedeef8b8d718d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringClientManager.ByReference::class)
public interface INetworkOperatorTetheringClientManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetTetheringClients(): IVectorView<NetworkOperatorTetheringClient?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringClientManager> {
    public override fun getValue() =
        ABI.makeINetworkOperatorTetheringClientManager(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringClientManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringClientManager {
    public val __809148907_Ptr: Pointer?

    public val _809148907_VtblPtr: Pointer?
      get() = __809148907_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetTetheringClients(): IVectorView<NetworkOperatorTetheringClient?>? {
      val fnPtr = _809148907_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<NetworkOperatorTetheringClient?>>()
      val hr = fn.invokeHR(arrayOf(__809148907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<NetworkOperatorTetheringClient?>>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorTetheringClientManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __809148907_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringClientManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("91b140168dca4225bbedeef8b8d718d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringClientManager(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringClientManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkOperatorTetheringClientManager {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringClientManager(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringClientManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__809148907_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringClientManager):
        Array<INetworkOperatorTetheringClientManager?> = (elements as
        Array<INetworkOperatorTetheringClientManager?>).castToImpl<INetworkOperatorTetheringClientManager,INetworkOperatorTetheringClientManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorTetheringClientManager?> =
        arrayOfNulls<INetworkOperatorTetheringClientManager_Impl>(size) as
        Array<INetworkOperatorTetheringClientManager?>
  }
}
