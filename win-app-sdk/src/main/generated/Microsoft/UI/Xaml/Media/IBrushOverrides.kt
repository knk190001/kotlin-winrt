package Microsoft.UI.Xaml.Media

import Microsoft.UI.Composition.AnimationPropertyInfo
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

@ABIMarker(IBrushOverrides.ABI::class)
@Signature("{b6b08394-bacf-53db-9ac7-be1c693e3513}")
@Guid("b6b08394bacf53db9ac7be1c693e3513")
@WinRTInterface("b6b08394bacf53db9ac7be1c693e3513")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrushOverrides.ByReference::class)
public interface IBrushOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PopulatePropertyInfoOverride(propertyName: String?,
      animationPropertyInfo: AnimationPropertyInfo?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBrushOverrides> {
    public override fun getValue() = ABI.makeIBrushOverrides(pointer.getPointer(0))

    public fun setValue(value: IBrushOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrushOverrides {
    public val __1915701634_Ptr: Pointer?

    public val _1915701634_VtblPtr: Pointer?
      get() = __1915701634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PopulatePropertyInfoOverride(propertyName: String?,
        animationPropertyInfo: AnimationPropertyInfo?): Unit {
      val fnPtr = _1915701634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1915701634_Ptr, marshalToNative(propertyName),
          marshalToNative(animationPropertyInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBrushOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1915701634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrushOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6b08394bacf53db9ac7be1c693e3513")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrushOverrides(ptr: Pointer?): WithDefault = IBrushOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrushOverrides {
      val address = segment.toRawLongValue()
      return makeIBrushOverrides(Pointer(address))
    }

    public override fun toNative(obj: IBrushOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1915701634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrushOverrides): Array<IBrushOverrides?> = (elements as
        Array<IBrushOverrides?>).castToImpl<IBrushOverrides,IBrushOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrushOverrides?> =
        arrayOfNulls<IBrushOverrides_Impl>(size) as Array<IBrushOverrides?>
  }
}
