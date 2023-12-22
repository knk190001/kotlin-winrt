package Windows.UI.ViewManagement.Core

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IUISettingsControllerStatics.ABI::class)
@Signature("{eb3c68cc-c220-578c-8119-7db324ed26a6}")
@Guid("eb3c68ccc220578c81197db324ed26a6")
@WinRTInterface("eb3c68ccc220578c81197db324ed26a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettingsControllerStatics.ByReference::class)
public interface IUISettingsControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestDefaultAsync(): IAsyncOperation<UISettingsController?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUISettingsControllerStatics> {
    public override fun getValue() = ABI.makeIUISettingsControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IUISettingsControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettingsControllerStatics {
    public val __1522915809_Ptr: Pointer?

    public val _1522915809_VtblPtr: Pointer?
      get() = __1522915809_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestDefaultAsync(): IAsyncOperation<UISettingsController?>? {
      val fnPtr = _1522915809_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UISettingsController?>>()
      val hr = fn.invokeHR(arrayOf(__1522915809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UISettingsController?>>(result.getValue())
      return resultValue
    }
  }

  public class IUISettingsControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1522915809_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettingsControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb3c68ccc220578c81197db324ed26a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettingsControllerStatics(ptr: Pointer?): WithDefault =
        IUISettingsControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUISettingsControllerStatics {
      val address = segment.toRawLongValue()
      return makeIUISettingsControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IUISettingsControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1522915809_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettingsControllerStatics):
        Array<IUISettingsControllerStatics?> = (elements as
        Array<IUISettingsControllerStatics?>).castToImpl<IUISettingsControllerStatics,IUISettingsControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettingsControllerStatics?> =
        arrayOfNulls<IUISettingsControllerStatics_Impl>(size) as
        Array<IUISettingsControllerStatics?>
  }
}
