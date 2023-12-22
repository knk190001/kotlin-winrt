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

@ABIMarker(IProviderNetworkUsage.ABI::class)
@Signature("{5ec69e04-7931-48c8-b8f3-46300fa42728}")
@Guid("5ec69e04793148c8b8f346300fa42728")
@WinRTInterface("5ec69e04793148c8b8f346300fa42728")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProviderNetworkUsage.ByReference::class)
public interface IProviderNetworkUsage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BytesSent(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_BytesReceived(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_ProviderId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProviderNetworkUsage> {
    public override fun getValue() = ABI.makeIProviderNetworkUsage(pointer.getPointer(0))

    public fun setValue(value: IProviderNetworkUsage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProviderNetworkUsage {
    public val __1997514343_Ptr: Pointer?

    public val _1997514343_VtblPtr: Pointer?
      get() = __1997514343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BytesSent(): WinDef.ULONG {
      val fnPtr = _1997514343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1997514343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_BytesReceived(): WinDef.ULONG {
      val fnPtr = _1997514343_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1997514343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ProviderId(): String? {
      val fnPtr = _1997514343_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1997514343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IProviderNetworkUsage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1997514343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProviderNetworkUsage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ec69e04793148c8b8f346300fa42728")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProviderNetworkUsage(ptr: Pointer?): WithDefault =
        IProviderNetworkUsage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProviderNetworkUsage {
      val address = segment.toRawLongValue()
      return makeIProviderNetworkUsage(Pointer(address))
    }

    public override fun toNative(obj: IProviderNetworkUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1997514343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProviderNetworkUsage): Array<IProviderNetworkUsage?> =
        (elements as
        Array<IProviderNetworkUsage?>).castToImpl<IProviderNetworkUsage,IProviderNetworkUsage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProviderNetworkUsage?> =
        arrayOfNulls<IProviderNetworkUsage_Impl>(size) as Array<IProviderNetworkUsage?>
  }
}
