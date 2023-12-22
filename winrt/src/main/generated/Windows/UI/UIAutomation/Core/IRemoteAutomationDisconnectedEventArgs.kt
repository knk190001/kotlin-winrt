package Windows.UI.UIAutomation.Core

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

@ABIMarker(IRemoteAutomationDisconnectedEventArgs.ABI::class)
@Signature("{bbb33a3d-5d90-5c38-9eb2-dd9dcc1b2e3f}")
@Guid("bbb33a3d5d905c389eb2dd9dcc1b2e3f")
@WinRTInterface("bbb33a3d5d905c389eb2dd9dcc1b2e3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteAutomationDisconnectedEventArgs.ByReference::class)
public interface IRemoteAutomationDisconnectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalPipeName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteAutomationDisconnectedEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteAutomationDisconnectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteAutomationDisconnectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteAutomationDisconnectedEventArgs {
    public val __137705879_Ptr: Pointer?

    public val _137705879_VtblPtr: Pointer?
      get() = __137705879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalPipeName(): String? {
      val fnPtr = _137705879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__137705879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteAutomationDisconnectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __137705879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteAutomationDisconnectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbb33a3d5d905c389eb2dd9dcc1b2e3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteAutomationDisconnectedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteAutomationDisconnectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteAutomationDisconnectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteAutomationDisconnectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteAutomationDisconnectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__137705879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteAutomationDisconnectedEventArgs):
        Array<IRemoteAutomationDisconnectedEventArgs?> = (elements as
        Array<IRemoteAutomationDisconnectedEventArgs?>).castToImpl<IRemoteAutomationDisconnectedEventArgs,IRemoteAutomationDisconnectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteAutomationDisconnectedEventArgs?> =
        arrayOfNulls<IRemoteAutomationDisconnectedEventArgs_Impl>(size) as
        Array<IRemoteAutomationDisconnectedEventArgs?>
  }
}
