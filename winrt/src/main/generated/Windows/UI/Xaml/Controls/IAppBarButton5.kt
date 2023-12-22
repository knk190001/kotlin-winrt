package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.AppBarButtonTemplateSettings
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

@ABIMarker(IAppBarButton5.ABI::class)
@Signature("{4096fc7f-1aec-4b0f-a031-ca8c4e06d2ed}")
@Guid("4096fc7f1aec4b0fa031ca8c4e06d2ed")
@WinRTInterface("4096fc7f1aec4b0fa031ca8c4e06d2ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarButton5.ByReference::class)
public interface IAppBarButton5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TemplateSettings(): AppBarButtonTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppBarButton5>
      {
    public override fun getValue() = ABI.makeIAppBarButton5(pointer.getPointer(0))

    public fun setValue(value: IAppBarButton5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarButton5 {
    public val __1843150315_Ptr: Pointer?

    public val _1843150315_VtblPtr: Pointer?
      get() = __1843150315_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TemplateSettings(): AppBarButtonTemplateSettings? {
      val fnPtr = _1843150315_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarButtonTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1843150315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarButtonTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarButton5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1843150315_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarButton5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4096fc7f1aec4b0fa031ca8c4e06d2ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarButton5(ptr: Pointer?): WithDefault = IAppBarButton5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarButton5 {
      val address = segment.toRawLongValue()
      return makeIAppBarButton5(Pointer(address))
    }

    public override fun toNative(obj: IAppBarButton5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1843150315_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarButton5): Array<IAppBarButton5?> = (elements as
        Array<IAppBarButton5?>).castToImpl<IAppBarButton5,IAppBarButton5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarButton5?> =
        arrayOfNulls<IAppBarButton5_Impl>(size) as Array<IAppBarButton5?>
  }
}
