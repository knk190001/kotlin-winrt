package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IGroupStyleSelectorOverrides.ABI::class)
@Signature("{f691cab2-77ad-4d3d-a51c-8ef9c3836456}")
@Guid("f691cab277ad4d3da51c8ef9c3836456")
@WinRTInterface("f691cab277ad4d3da51c8ef9c3836456")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupStyleSelectorOverrides.ByReference::class)
public interface IGroupStyleSelectorOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SelectGroupStyleCore(group: IUnknown?, level: WinDef.UINT): GroupStyle?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGroupStyleSelectorOverrides> {
    public override fun getValue() = ABI.makeIGroupStyleSelectorOverrides(pointer.getPointer(0))

    public fun setValue(value: IGroupStyleSelectorOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupStyleSelectorOverrides {
    public val __2129351910_Ptr: Pointer?

    public val _2129351910_VtblPtr: Pointer?
      get() = __2129351910_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SelectGroupStyleCore(group: IUnknown?, level: WinDef.UINT): GroupStyle? {
      val fnPtr = _2129351910_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GroupStyle>()
      val hr = fn.invokeHR(arrayOf(__2129351910_Ptr, marshalToNative(group), level, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GroupStyle>(result.getValue())
      return resultValue
    }
  }

  public class IGroupStyleSelectorOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2129351910_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupStyleSelectorOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f691cab277ad4d3da51c8ef9c3836456")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupStyleSelectorOverrides(ptr: Pointer?): WithDefault =
        IGroupStyleSelectorOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupStyleSelectorOverrides {
      val address = segment.toRawLongValue()
      return makeIGroupStyleSelectorOverrides(Pointer(address))
    }

    public override fun toNative(obj: IGroupStyleSelectorOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2129351910_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupStyleSelectorOverrides):
        Array<IGroupStyleSelectorOverrides?> = (elements as
        Array<IGroupStyleSelectorOverrides?>).castToImpl<IGroupStyleSelectorOverrides,IGroupStyleSelectorOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupStyleSelectorOverrides?> =
        arrayOfNulls<IGroupStyleSelectorOverrides_Impl>(size) as
        Array<IGroupStyleSelectorOverrides?>
  }
}
