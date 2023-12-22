package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Visibility
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

@ABIMarker(ICommandBarTemplateSettings3.ABI::class)
@Signature("{3bd71eba-3403-4bfe-842d-2ce8c511d245}")
@Guid("3bd71eba34034bfe842d2ce8c511d245")
@WinRTInterface("3bd71eba34034bfe842d2ce8c511d245")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarTemplateSettings3.ByReference::class)
public interface ICommandBarTemplateSettings3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EffectiveOverflowButtonVisibility(): Visibility?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarTemplateSettings3> {
    public override fun getValue() = ABI.makeICommandBarTemplateSettings3(pointer.getPointer(0))

    public fun setValue(value: ICommandBarTemplateSettings3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarTemplateSettings3 {
    public val __1936499502_Ptr: Pointer?

    public val _1936499502_VtblPtr: Pointer?
      get() = __1936499502_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EffectiveOverflowButtonVisibility(): Visibility? {
      val fnPtr = _1936499502_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__1936499502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarTemplateSettings3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1936499502_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarTemplateSettings3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3bd71eba34034bfe842d2ce8c511d245")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarTemplateSettings3(ptr: Pointer?): WithDefault =
        ICommandBarTemplateSettings3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarTemplateSettings3 {
      val address = segment.toRawLongValue()
      return makeICommandBarTemplateSettings3(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarTemplateSettings3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1936499502_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarTemplateSettings3):
        Array<ICommandBarTemplateSettings3?> = (elements as
        Array<ICommandBarTemplateSettings3?>).castToImpl<ICommandBarTemplateSettings3,ICommandBarTemplateSettings3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarTemplateSettings3?> =
        arrayOfNulls<ICommandBarTemplateSettings3_Impl>(size) as
        Array<ICommandBarTemplateSettings3?>
  }
}
