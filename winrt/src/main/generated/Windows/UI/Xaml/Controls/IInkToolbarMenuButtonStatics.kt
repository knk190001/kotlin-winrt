package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IInkToolbarMenuButtonStatics.ABI::class)
@Signature("{f03b17a6-b8b0-4a87-a961-37cd05d83137}")
@Guid("f03b17a6b8b04a87a96137cd05d83137")
@WinRTInterface("f03b17a6b8b04a87a96137cd05d83137")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarMenuButtonStatics.ByReference::class)
public interface IInkToolbarMenuButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsExtensionGlyphShownProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarMenuButtonStatics> {
    public override fun getValue() = ABI.makeIInkToolbarMenuButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarMenuButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarMenuButtonStatics {
    public val __1473509187_Ptr: Pointer?

    public val _1473509187_VtblPtr: Pointer?
      get() = __1473509187_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsExtensionGlyphShownProperty(): DependencyProperty? {
      val fnPtr = _1473509187_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1473509187_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarMenuButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1473509187_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarMenuButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f03b17a6b8b04a87a96137cd05d83137")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarMenuButtonStatics(ptr: Pointer?): WithDefault =
        IInkToolbarMenuButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarMenuButtonStatics {
      val address = segment.toRawLongValue()
      return makeIInkToolbarMenuButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarMenuButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1473509187_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarMenuButtonStatics):
        Array<IInkToolbarMenuButtonStatics?> = (elements as
        Array<IInkToolbarMenuButtonStatics?>).castToImpl<IInkToolbarMenuButtonStatics,IInkToolbarMenuButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarMenuButtonStatics?> =
        arrayOfNulls<IInkToolbarMenuButtonStatics_Impl>(size) as
        Array<IInkToolbarMenuButtonStatics?>
  }
}
