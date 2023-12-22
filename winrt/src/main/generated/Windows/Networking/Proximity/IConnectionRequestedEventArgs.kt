package Windows.Networking.Proximity

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

@ABIMarker(IConnectionRequestedEventArgs.ABI::class)
@Signature("{eb6891ae-4f1e-4c66-bd0d-46924a942e08}")
@Guid("eb6891ae4f1e4c66bd0d46924a942e08")
@WinRTInterface("eb6891ae4f1e4c66bd0d46924a942e08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionRequestedEventArgs.ByReference::class)
public interface IConnectionRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PeerInformation(): PeerInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionRequestedEventArgs> {
    public override fun getValue() = ABI.makeIConnectionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IConnectionRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionRequestedEventArgs {
    public val __544328832_Ptr: Pointer?

    public val _544328832_VtblPtr: Pointer?
      get() = __544328832_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PeerInformation(): PeerInformation? {
      val fnPtr = _544328832_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PeerInformation>()
      val hr = fn.invokeHR(arrayOf(__544328832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PeerInformation>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __544328832_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb6891ae4f1e4c66bd0d46924a942e08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionRequestedEventArgs(ptr: Pointer?): WithDefault =
        IConnectionRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIConnectionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IConnectionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__544328832_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionRequestedEventArgs):
        Array<IConnectionRequestedEventArgs?> = (elements as
        Array<IConnectionRequestedEventArgs?>).castToImpl<IConnectionRequestedEventArgs,IConnectionRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionRequestedEventArgs?> =
        arrayOfNulls<IConnectionRequestedEventArgs_Impl>(size) as
        Array<IConnectionRequestedEventArgs?>
  }
}
