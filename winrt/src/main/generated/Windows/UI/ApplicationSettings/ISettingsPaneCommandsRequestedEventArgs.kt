package Windows.UI.ApplicationSettings

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

@ABIMarker(ISettingsPaneCommandsRequestedEventArgs.ABI::class)
@Signature("{205f5d24-1b48-4629-a6ca-2fdfedafb75d}")
@Guid("205f5d241b484629a6ca2fdfedafb75d")
@WinRTInterface("205f5d241b484629a6ca2fdfedafb75d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISettingsPaneCommandsRequestedEventArgs.ByReference::class)
public interface ISettingsPaneCommandsRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): SettingsPaneCommandsRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISettingsPaneCommandsRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeISettingsPaneCommandsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISettingsPaneCommandsRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISettingsPaneCommandsRequestedEventArgs {
    public val __152522719_Ptr: Pointer?

    public val _152522719_VtblPtr: Pointer?
      get() = __152522719_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): SettingsPaneCommandsRequest? {
      val fnPtr = _152522719_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SettingsPaneCommandsRequest>()
      val hr = fn.invokeHR(arrayOf(__152522719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SettingsPaneCommandsRequest>(result.getValue())
      return resultValue
    }
  }

  public class ISettingsPaneCommandsRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __152522719_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISettingsPaneCommandsRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("205f5d241b484629a6ca2fdfedafb75d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISettingsPaneCommandsRequestedEventArgs(ptr: Pointer?): WithDefault =
        ISettingsPaneCommandsRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISettingsPaneCommandsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeISettingsPaneCommandsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISettingsPaneCommandsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__152522719_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISettingsPaneCommandsRequestedEventArgs):
        Array<ISettingsPaneCommandsRequestedEventArgs?> = (elements as
        Array<ISettingsPaneCommandsRequestedEventArgs?>).castToImpl<ISettingsPaneCommandsRequestedEventArgs,ISettingsPaneCommandsRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISettingsPaneCommandsRequestedEventArgs?> =
        arrayOfNulls<ISettingsPaneCommandsRequestedEventArgs_Impl>(size) as
        Array<ISettingsPaneCommandsRequestedEventArgs?>
  }
}
