package Windows.UI.Xaml.Hosting

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

@ABIMarker(IDesignerAppExitedEventArgs.ABI::class)
@Signature("{f6aac86a-0cad-410c-8f62-dc2936151c74}")
@Guid("f6aac86a0cad410c8f62dc2936151c74")
@WinRTInterface("f6aac86a0cad410c8f62dc2936151c74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesignerAppExitedEventArgs.ByReference::class)
public interface IDesignerAppExitedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExitCode(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesignerAppExitedEventArgs> {
    public override fun getValue() = ABI.makeIDesignerAppExitedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDesignerAppExitedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesignerAppExitedEventArgs {
    public val __781100266_Ptr: Pointer?

    public val _781100266_VtblPtr: Pointer?
      get() = __781100266_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExitCode(): WinDef.UINT {
      val fnPtr = _781100266_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__781100266_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IDesignerAppExitedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __781100266_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesignerAppExitedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6aac86a0cad410c8f62dc2936151c74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesignerAppExitedEventArgs(ptr: Pointer?): WithDefault =
        IDesignerAppExitedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesignerAppExitedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDesignerAppExitedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDesignerAppExitedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__781100266_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesignerAppExitedEventArgs):
        Array<IDesignerAppExitedEventArgs?> = (elements as
        Array<IDesignerAppExitedEventArgs?>).castToImpl<IDesignerAppExitedEventArgs,IDesignerAppExitedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesignerAppExitedEventArgs?> =
        arrayOfNulls<IDesignerAppExitedEventArgs_Impl>(size) as Array<IDesignerAppExitedEventArgs?>
  }
}
