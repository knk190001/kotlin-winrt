package Windows.Networking.NetworkOperators

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INetworkOperatorTetheringManager.ABI::class)
@Signature("{d45a8da0-0e86-4d98-8ba4-dd70d4b764d3}")
@Guid("d45a8da00e864d988ba4dd70d4b764d3")
@WinRTInterface("d45a8da00e864d988ba4dd70d4b764d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringManager.ByReference::class)
public interface INetworkOperatorTetheringManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxClientCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_ClientCount(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_TetheringOperationalState(): TetheringOperationalState?

  @InterfaceMethod(3)
  public fun GetCurrentAccessPointConfiguration(): NetworkOperatorTetheringAccessPointConfiguration?

  @InterfaceMethod(4)
  public
      fun ConfigureAccessPointAsync(configuration: NetworkOperatorTetheringAccessPointConfiguration?):
      IAsyncAction?

  @InterfaceMethod(5)
  public fun StartTetheringAsync(): IAsyncOperation<NetworkOperatorTetheringOperationResult?>?

  @InterfaceMethod(6)
  public fun StopTetheringAsync(): IAsyncOperation<NetworkOperatorTetheringOperationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringManager> {
    public override fun getValue() = ABI.makeINetworkOperatorTetheringManager(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringManager {
    public val __853466378_Ptr: Pointer?

    public val _853466378_VtblPtr: Pointer?
      get() = __853466378_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxClientCount(): WinDef.UINT {
      val fnPtr = _853466378_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__853466378_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ClientCount(): WinDef.UINT {
      val fnPtr = _853466378_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__853466378_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_TetheringOperationalState(): TetheringOperationalState? {
      val fnPtr = _853466378_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TetheringOperationalState>()
      val hr = fn.invokeHR(arrayOf(__853466378_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TetheringOperationalState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetCurrentAccessPointConfiguration():
        NetworkOperatorTetheringAccessPointConfiguration? {
      val fnPtr = _853466378_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkOperatorTetheringAccessPointConfiguration>()
      val hr = fn.invokeHR(arrayOf(__853466378_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<NetworkOperatorTetheringAccessPointConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override
        fun ConfigureAccessPointAsync(configuration: NetworkOperatorTetheringAccessPointConfiguration?):
        IAsyncAction? {
      val fnPtr = _853466378_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__853466378_Ptr, marshalToNative(configuration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun StartTetheringAsync():
        IAsyncOperation<NetworkOperatorTetheringOperationResult?>? {
      val fnPtr = _853466378_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<NetworkOperatorTetheringOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__853466378_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<NetworkOperatorTetheringOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun StopTetheringAsync():
        IAsyncOperation<NetworkOperatorTetheringOperationResult?>? {
      val fnPtr = _853466378_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<NetworkOperatorTetheringOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__853466378_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<NetworkOperatorTetheringOperationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorTetheringManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __853466378_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d45a8da00e864d988ba4dd70d4b764d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringManager(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkOperatorTetheringManager {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringManager(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__853466378_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringManager):
        Array<INetworkOperatorTetheringManager?> = (elements as
        Array<INetworkOperatorTetheringManager?>).castToImpl<INetworkOperatorTetheringManager,INetworkOperatorTetheringManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorTetheringManager?> =
        arrayOfNulls<INetworkOperatorTetheringManager_Impl>(size) as
        Array<INetworkOperatorTetheringManager?>
  }
}
