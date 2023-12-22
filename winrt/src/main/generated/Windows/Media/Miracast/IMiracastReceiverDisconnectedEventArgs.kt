package Windows.Media.Miracast

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

@ABIMarker(IMiracastReceiverDisconnectedEventArgs.ABI::class)
@Signature("{d9a15e5e-5fee-57e6-b4b0-04727db93229}")
@Guid("d9a15e5e5fee57e6b4b004727db93229")
@WinRTInterface("d9a15e5e5fee57e6b4b004727db93229")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverDisconnectedEventArgs.ByReference::class)
public interface IMiracastReceiverDisconnectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): MiracastReceiverConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverDisconnectedEventArgs> {
    public override fun getValue() =
        ABI.makeIMiracastReceiverDisconnectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverDisconnectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverDisconnectedEventArgs {
    public val __1868155911_Ptr: Pointer?

    public val _1868155911_VtblPtr: Pointer?
      get() = __1868155911_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): MiracastReceiverConnection? {
      val fnPtr = _1868155911_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverConnection>()
      val hr = fn.invokeHR(arrayOf(__1868155911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverConnection>(result.getValue())
      return resultValue
    }
  }

  public class IMiracastReceiverDisconnectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1868155911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverDisconnectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9a15e5e5fee57e6b4b004727db93229")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverDisconnectedEventArgs(ptr: Pointer?): WithDefault =
        IMiracastReceiverDisconnectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverDisconnectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverDisconnectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverDisconnectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1868155911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverDisconnectedEventArgs):
        Array<IMiracastReceiverDisconnectedEventArgs?> = (elements as
        Array<IMiracastReceiverDisconnectedEventArgs?>).castToImpl<IMiracastReceiverDisconnectedEventArgs,IMiracastReceiverDisconnectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverDisconnectedEventArgs?> =
        arrayOfNulls<IMiracastReceiverDisconnectedEventArgs_Impl>(size) as
        Array<IMiracastReceiverDisconnectedEventArgs?>
  }
}
