package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IFlyoutBaseStatics6.ABI::class)
@Signature("{96d49254-c91b-5246-8b39-afc2a2c50cf8}")
@Guid("96d49254c91b52468b39afc2a2c50cf8")
@WinRTInterface("96d49254c91b52468b39afc2a2c50cf8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBaseStatics6.ByReference::class)
public interface IFlyoutBaseStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShouldConstrainToRootBoundsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutBaseStatics6> {
    public override fun getValue() = ABI.makeIFlyoutBaseStatics6(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBaseStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBaseStatics6 {
    public val __1942908025_Ptr: Pointer?

    public val _1942908025_VtblPtr: Pointer?
      get() = __1942908025_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShouldConstrainToRootBoundsProperty(): DependencyProperty? {
      val fnPtr = _1942908025_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908025_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutBaseStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1942908025_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBaseStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96d49254c91b52468b39afc2a2c50cf8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBaseStatics6(ptr: Pointer?): WithDefault = IFlyoutBaseStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBaseStatics6 {
      val address = segment.toRawLongValue()
      return makeIFlyoutBaseStatics6(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBaseStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1942908025_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBaseStatics6): Array<IFlyoutBaseStatics6?> =
        (elements as
        Array<IFlyoutBaseStatics6?>).castToImpl<IFlyoutBaseStatics6,IFlyoutBaseStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBaseStatics6?> =
        arrayOfNulls<IFlyoutBaseStatics6_Impl>(size) as Array<IFlyoutBaseStatics6?>
  }
}
