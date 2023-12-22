package Windows.System

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

@ABIMarker(IProcessLauncherResult.ABI::class)
@Signature("{544c8934-86d8-4991-8e75-ece8a43b6b6d}")
@Guid("544c893486d849918e75ece8a43b6b6d")
@WinRTInterface("544c893486d849918e75ece8a43b6b6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessLauncherResult.ByReference::class)
public interface IProcessLauncherResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExitCode(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessLauncherResult> {
    public override fun getValue() = ABI.makeIProcessLauncherResult(pointer.getPointer(0))

    public fun setValue(value: IProcessLauncherResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessLauncherResult {
    public val __1766730781_Ptr: Pointer?

    public val _1766730781_VtblPtr: Pointer?
      get() = __1766730781_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExitCode(): WinDef.UINT {
      val fnPtr = _1766730781_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1766730781_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IProcessLauncherResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1766730781_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessLauncherResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("544c893486d849918e75ece8a43b6b6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessLauncherResult(ptr: Pointer?): WithDefault =
        IProcessLauncherResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessLauncherResult {
      val address = segment.toRawLongValue()
      return makeIProcessLauncherResult(Pointer(address))
    }

    public override fun toNative(obj: IProcessLauncherResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1766730781_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessLauncherResult): Array<IProcessLauncherResult?> =
        (elements as
        Array<IProcessLauncherResult?>).castToImpl<IProcessLauncherResult,IProcessLauncherResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessLauncherResult?> =
        arrayOfNulls<IProcessLauncherResult_Impl>(size) as Array<IProcessLauncherResult?>
  }
}
