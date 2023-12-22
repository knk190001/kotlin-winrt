package Windows.Storage.Pickers.Provider

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

@ABIMarker(ITargetFileRequestedEventArgs.ABI::class)
@Signature("{b163dbc1-1b51-4c89-a591-0fd40b3c57c9}")
@Guid("b163dbc11b514c89a5910fd40b3c57c9")
@WinRTInterface("b163dbc11b514c89a5910fd40b3c57c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetFileRequestedEventArgs.ByReference::class)
public interface ITargetFileRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): TargetFileRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetFileRequestedEventArgs> {
    public override fun getValue() = ABI.makeITargetFileRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITargetFileRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetFileRequestedEventArgs {
    public val __1300848761_Ptr: Pointer?

    public val _1300848761_VtblPtr: Pointer?
      get() = __1300848761_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): TargetFileRequest? {
      val fnPtr = _1300848761_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetFileRequest>()
      val hr = fn.invokeHR(arrayOf(__1300848761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetFileRequest>(result.getValue())
      return resultValue
    }
  }

  public class ITargetFileRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1300848761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetFileRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b163dbc11b514c89a5910fd40b3c57c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetFileRequestedEventArgs(ptr: Pointer?): WithDefault =
        ITargetFileRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetFileRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeITargetFileRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITargetFileRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1300848761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetFileRequestedEventArgs):
        Array<ITargetFileRequestedEventArgs?> = (elements as
        Array<ITargetFileRequestedEventArgs?>).castToImpl<ITargetFileRequestedEventArgs,ITargetFileRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetFileRequestedEventArgs?> =
        arrayOfNulls<ITargetFileRequestedEventArgs_Impl>(size) as
        Array<ITargetFileRequestedEventArgs?>
  }
}
