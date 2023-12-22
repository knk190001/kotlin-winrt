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

@ABIMarker(IInkToolbarStatics2.ABI::class)
@Signature("{aac1f8f2-2c1f-4e9c-b3f3-31ff22b51c7a}")
@Guid("aac1f8f22c1f4e9cb3f331ff22b51c7a")
@WinRTInterface("aac1f8f22c1f4e9cb3f331ff22b51c7a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarStatics2.ByReference::class)
public interface IInkToolbarStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsStencilButtonCheckedProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ButtonFlyoutPlacementProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_OrientationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarStatics2> {
    public override fun getValue() = ABI.makeIInkToolbarStatics2(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarStatics2 {
    public val __1782586882_Ptr: Pointer?

    public val _1782586882_VtblPtr: Pointer?
      get() = __1782586882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsStencilButtonCheckedProperty(): DependencyProperty? {
      val fnPtr = _1782586882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1782586882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ButtonFlyoutPlacementProperty(): DependencyProperty? {
      val fnPtr = _1782586882_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1782586882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _1782586882_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1782586882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1782586882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aac1f8f22c1f4e9cb3f331ff22b51c7a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarStatics2(ptr: Pointer?): WithDefault = IInkToolbarStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarStatics2 {
      val address = segment.toRawLongValue()
      return makeIInkToolbarStatics2(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1782586882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarStatics2): Array<IInkToolbarStatics2?> =
        (elements as
        Array<IInkToolbarStatics2?>).castToImpl<IInkToolbarStatics2,IInkToolbarStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarStatics2?> =
        arrayOfNulls<IInkToolbarStatics2_Impl>(size) as Array<IInkToolbarStatics2?>
  }
}
