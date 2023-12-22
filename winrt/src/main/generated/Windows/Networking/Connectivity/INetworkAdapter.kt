package Windows.Networking.Connectivity

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

@ABIMarker(INetworkAdapter.ABI::class)
@Signature("{3b542e03-5388-496c-a8a3-affd39aec2e6}")
@Guid("3b542e035388496ca8a3affd39aec2e6")
@WinRTInterface("3b542e035388496ca8a3affd39aec2e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkAdapter.ByReference::class)
public interface INetworkAdapter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OutboundMaxBitsPerSecond(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_InboundMaxBitsPerSecond(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_IanaInterfaceType(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_NetworkItem(): NetworkItem?

  @InterfaceMethod(4)
  public fun get_NetworkAdapterId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun GetConnectedProfileAsync(): IAsyncOperation<ConnectionProfile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkAdapter> {
    public override fun getValue() = ABI.makeINetworkAdapter(pointer.getPointer(0))

    public fun setValue(value: INetworkAdapter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkAdapter {
    public val __374321852_Ptr: Pointer?

    public val _374321852_VtblPtr: Pointer?
      get() = __374321852_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OutboundMaxBitsPerSecond(): WinDef.ULONG {
      val fnPtr = _374321852_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__374321852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_InboundMaxBitsPerSecond(): WinDef.ULONG {
      val fnPtr = _374321852_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__374321852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IanaInterfaceType(): WinDef.UINT {
      val fnPtr = _374321852_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__374321852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_NetworkItem(): NetworkItem? {
      val fnPtr = _374321852_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkItem>()
      val hr = fn.invokeHR(arrayOf(__374321852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_NetworkAdapterId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _374321852_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__374321852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetConnectedProfileAsync(): IAsyncOperation<ConnectionProfile?>? {
      val fnPtr = _374321852_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ConnectionProfile?>>()
      val hr = fn.invokeHR(arrayOf(__374321852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ConnectionProfile?>>(result.getValue())
      return resultValue
    }
  }

  public class INetworkAdapter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __374321852_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkAdapter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b542e035388496ca8a3affd39aec2e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkAdapter(ptr: Pointer?): WithDefault = INetworkAdapter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkAdapter {
      val address = segment.toRawLongValue()
      return makeINetworkAdapter(Pointer(address))
    }

    public override fun toNative(obj: INetworkAdapter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__374321852_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkAdapter): Array<INetworkAdapter?> = (elements as
        Array<INetworkAdapter?>).castToImpl<INetworkAdapter,INetworkAdapter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkAdapter?> =
        arrayOfNulls<INetworkAdapter_Impl>(size) as Array<INetworkAdapter?>
  }
}
