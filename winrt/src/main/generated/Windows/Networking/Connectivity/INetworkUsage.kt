package Windows.Networking.Connectivity

import Windows.Foundation.TimeSpan
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

@ABIMarker(INetworkUsage.ABI::class)
@Signature("{49da8fce-9985-4927-bf5b-072b5c65f8d9}")
@Guid("49da8fce99854927bf5b072b5c65f8d9")
@WinRTInterface("49da8fce99854927bf5b072b5c65f8d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkUsage.ByReference::class)
public interface INetworkUsage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BytesSent(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_BytesReceived(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_ConnectionDuration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INetworkUsage>
      {
    public override fun getValue() = ABI.makeINetworkUsage(pointer.getPointer(0))

    public fun setValue(value: INetworkUsage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkUsage {
    public val __1639571242_Ptr: Pointer?

    public val _1639571242_VtblPtr: Pointer?
      get() = __1639571242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BytesSent(): WinDef.ULONG {
      val fnPtr = _1639571242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1639571242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_BytesReceived(): WinDef.ULONG {
      val fnPtr = _1639571242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1639571242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ConnectionDuration(): TimeSpan? {
      val fnPtr = _1639571242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1639571242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class INetworkUsage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1639571242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkUsage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49da8fce99854927bf5b072b5c65f8d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkUsage(ptr: Pointer?): WithDefault = INetworkUsage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkUsage {
      val address = segment.toRawLongValue()
      return makeINetworkUsage(Pointer(address))
    }

    public override fun toNative(obj: INetworkUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1639571242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkUsage): Array<INetworkUsage?> = (elements as
        Array<INetworkUsage?>).castToImpl<INetworkUsage,INetworkUsage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkUsage?> =
        arrayOfNulls<INetworkUsage_Impl>(size) as Array<INetworkUsage?>
  }
}
