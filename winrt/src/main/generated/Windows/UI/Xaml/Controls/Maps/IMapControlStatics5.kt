package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapControlStatics5.ABI::class)
@Signature("{09626f00-b7dd-4189-a7f7-830c412deea3}")
@Guid("09626f00b7dd4189a7f7830c412deea3")
@WinRTInterface("09626f00b7dd4189a7f7830c412deea3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlStatics5.ByReference::class)
public interface IMapControlStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MapProjectionProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_StyleSheetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ViewPaddingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlStatics5> {
    public override fun getValue() = ABI.makeIMapControlStatics5(pointer.getPointer(0))

    public fun setValue(value: IMapControlStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlStatics5 {
    public val __142000222_Ptr: Pointer?

    public val _142000222_VtblPtr: Pointer?
      get() = __142000222_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MapProjectionProperty(): DependencyProperty? {
      val fnPtr = _142000222_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000222_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StyleSheetProperty(): DependencyProperty? {
      val fnPtr = _142000222_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000222_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ViewPaddingProperty(): DependencyProperty? {
      val fnPtr = _142000222_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000222_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __142000222_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09626f00b7dd4189a7f7830c412deea3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlStatics5(ptr: Pointer?): WithDefault = IMapControlStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlStatics5 {
      val address = segment.toRawLongValue()
      return makeIMapControlStatics5(Pointer(address))
    }

    public override fun toNative(obj: IMapControlStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__142000222_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlStatics5): Array<IMapControlStatics5?> =
        (elements as
        Array<IMapControlStatics5?>).castToImpl<IMapControlStatics5,IMapControlStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlStatics5?> =
        arrayOfNulls<IMapControlStatics5_Impl>(size) as Array<IMapControlStatics5?>
  }
}
