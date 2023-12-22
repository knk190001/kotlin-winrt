package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandAccountEventArgs.ABI::class)
@Signature("{3853c880-77de-4c04-bead-a123b08c9f59}")
@Guid("3853c88077de4c04beada123b08c9f59")
@WinRTInterface("3853c88077de4c04beada123b08c9f59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandAccountEventArgs.ByReference::class)
public interface IMobileBroadbandAccountEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkAccountId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandAccountEventArgs> {
    public override fun getValue() = ABI.makeIMobileBroadbandAccountEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandAccountEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandAccountEventArgs {
    public val __1339460314_Ptr: Pointer?

    public val _1339460314_VtblPtr: Pointer?
      get() = __1339460314_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkAccountId(): String? {
      val fnPtr = _1339460314_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1339460314_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandAccountEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1339460314_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandAccountEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3853c88077de4c04beada123b08c9f59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandAccountEventArgs(ptr: Pointer?): WithDefault =
        IMobileBroadbandAccountEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandAccountEventArgs {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandAccountEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandAccountEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1339460314_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandAccountEventArgs):
        Array<IMobileBroadbandAccountEventArgs?> = (elements as
        Array<IMobileBroadbandAccountEventArgs?>).castToImpl<IMobileBroadbandAccountEventArgs,IMobileBroadbandAccountEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandAccountEventArgs?> =
        arrayOfNulls<IMobileBroadbandAccountEventArgs_Impl>(size) as
        Array<IMobileBroadbandAccountEventArgs?>
  }
}
