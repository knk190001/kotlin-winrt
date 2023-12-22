package Windows.System

import Windows.UI.ViewManagement.ViewSizePreference
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

@ABIMarker(ILauncherViewOptions.ABI::class)
@Signature("{8a9b29f1-7ca7-49de-9bd3-3c5b7184f616}")
@Guid("8a9b29f17ca749de9bd33c5b7184f616")
@WinRTInterface("8a9b29f17ca749de9bd33c5b7184f616")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILauncherViewOptions.ByReference::class)
public interface ILauncherViewOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredRemainingView(): ViewSizePreference?

  @InterfaceMethod(1)
  public fun put_DesiredRemainingView(value: ViewSizePreference?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILauncherViewOptions> {
    public override fun getValue() = ABI.makeILauncherViewOptions(pointer.getPointer(0))

    public fun setValue(value: ILauncherViewOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILauncherViewOptions {
    public val __432697174_Ptr: Pointer?

    public val _432697174_VtblPtr: Pointer?
      get() = __432697174_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredRemainingView(): ViewSizePreference? {
      val fnPtr = _432697174_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ViewSizePreference>()
      val hr = fn.invokeHR(arrayOf(__432697174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ViewSizePreference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredRemainingView(value: ViewSizePreference?): Unit {
      val fnPtr = _432697174_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__432697174_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILauncherViewOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __432697174_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILauncherViewOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a9b29f17ca749de9bd33c5b7184f616")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILauncherViewOptions(ptr: Pointer?): WithDefault = ILauncherViewOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILauncherViewOptions {
      val address = segment.toRawLongValue()
      return makeILauncherViewOptions(Pointer(address))
    }

    public override fun toNative(obj: ILauncherViewOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__432697174_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILauncherViewOptions): Array<ILauncherViewOptions?> =
        (elements as
        Array<ILauncherViewOptions?>).castToImpl<ILauncherViewOptions,ILauncherViewOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILauncherViewOptions?> =
        arrayOfNulls<ILauncherViewOptions_Impl>(size) as Array<ILauncherViewOptions?>
  }
}
