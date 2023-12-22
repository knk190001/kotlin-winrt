package Windows.Networking.Connectivity

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

@ABIMarker(INetworkItem.ABI::class)
@Signature("{01bc4d39-f5e0-4567-a28c-42080c831b2b}")
@Guid("01bc4d39f5e04567a28c42080c831b2b")
@WinRTInterface("01bc4d39f5e04567a28c42080c831b2b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkItem.ByReference::class)
public interface INetworkItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun GetNetworkTypes(): NetworkTypes?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INetworkItem> {
    public override fun getValue() = ABI.makeINetworkItem(pointer.getPointer(0))

    public fun setValue(value: INetworkItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkItem {
    public val __1193680190_Ptr: Pointer?

    public val _1193680190_VtblPtr: Pointer?
      get() = __1193680190_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1193680190_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1193680190_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetNetworkTypes(): NetworkTypes? {
      val fnPtr = _1193680190_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkTypes>()
      val hr = fn.invokeHR(arrayOf(__1193680190_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkTypes>(result.getValue())
      return resultValue
    }
  }

  public class INetworkItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1193680190_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01bc4d39f5e04567a28c42080c831b2b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkItem(ptr: Pointer?): WithDefault = INetworkItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkItem {
      val address = segment.toRawLongValue()
      return makeINetworkItem(Pointer(address))
    }

    public override fun toNative(obj: INetworkItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1193680190_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkItem): Array<INetworkItem?> = (elements as
        Array<INetworkItem?>).castToImpl<INetworkItem,INetworkItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkItem?> =
        arrayOfNulls<INetworkItem_Impl>(size) as Array<INetworkItem?>
  }
}
