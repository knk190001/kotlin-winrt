package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ITabViewItemTemplateSettingsStatics2.ABI::class)
@Signature("{d31ab42b-3842-5e4d-8845-6232eea8ee1d}")
@Guid("d31ab42b38425e4d88456232eea8ee1d")
@WinRTInterface("d31ab42b38425e4d88456232eea8ee1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewItemTemplateSettingsStatics2.ByReference::class)
public interface ITabViewItemTemplateSettingsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TabGeometryProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewItemTemplateSettingsStatics2> {
    public override fun getValue() =
        ABI.makeITabViewItemTemplateSettingsStatics2(pointer.getPointer(0))

    public fun setValue(value: ITabViewItemTemplateSettingsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewItemTemplateSettingsStatics2 {
    public val __831070960_Ptr: Pointer?

    public val _831070960_VtblPtr: Pointer?
      get() = __831070960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TabGeometryProperty(): DependencyProperty? {
      val fnPtr = _831070960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__831070960_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewItemTemplateSettingsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __831070960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewItemTemplateSettingsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d31ab42b38425e4d88456232eea8ee1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewItemTemplateSettingsStatics2(ptr: Pointer?): WithDefault =
        ITabViewItemTemplateSettingsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewItemTemplateSettingsStatics2 {
      val address = segment.toRawLongValue()
      return makeITabViewItemTemplateSettingsStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITabViewItemTemplateSettingsStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__831070960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewItemTemplateSettingsStatics2):
        Array<ITabViewItemTemplateSettingsStatics2?> = (elements as
        Array<ITabViewItemTemplateSettingsStatics2?>).castToImpl<ITabViewItemTemplateSettingsStatics2,ITabViewItemTemplateSettingsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewItemTemplateSettingsStatics2?> =
        arrayOfNulls<ITabViewItemTemplateSettingsStatics2_Impl>(size) as
        Array<ITabViewItemTemplateSettingsStatics2?>
  }
}
