package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.XamlRoot
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFlyoutBase6.ABI::class)
@Signature("{5399de8c-06cc-5b52-b65a-ff9322d1c940}")
@Guid("5399de8c06cc5b52b65aff9322d1c940")
@WinRTInterface("5399de8c06cc5b52b65aff9322d1c940")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBase6.ByReference::class)
public interface IFlyoutBase6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShouldConstrainToRootBounds(): Boolean

  @InterfaceMethod(1)
  public fun put_ShouldConstrainToRootBounds(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsConstrainedToRootBounds(): Boolean

  @InterfaceMethod(3)
  public fun get_XamlRoot(): XamlRoot?

  @InterfaceMethod(4)
  public fun put_XamlRoot(value: XamlRoot?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlyoutBase6> {
    public override fun getValue() = ABI.makeIFlyoutBase6(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBase6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBase6 {
    public val __1324150290_Ptr: Pointer?

    public val _1324150290_VtblPtr: Pointer?
      get() = __1324150290_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShouldConstrainToRootBounds(): Boolean {
      val fnPtr = _1324150290_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1324150290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ShouldConstrainToRootBounds(value: Boolean): Unit {
      val fnPtr = _1324150290_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150290_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsConstrainedToRootBounds(): Boolean {
      val fnPtr = _1324150290_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1324150290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_XamlRoot(): XamlRoot? {
      val fnPtr = _1324150290_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlRoot>()
      val hr = fn.invokeHR(arrayOf(__1324150290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlRoot>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_XamlRoot(value: XamlRoot?): Unit {
      val fnPtr = _1324150290_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150290_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBase6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1324150290_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBase6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5399de8c06cc5b52b65aff9322d1c940")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBase6(ptr: Pointer?): WithDefault = IFlyoutBase6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBase6 {
      val address = segment.toRawLongValue()
      return makeIFlyoutBase6(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBase6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1324150290_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBase6): Array<IFlyoutBase6?> = (elements as
        Array<IFlyoutBase6?>).castToImpl<IFlyoutBase6,IFlyoutBase6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBase6?> =
        arrayOfNulls<IFlyoutBase6_Impl>(size) as Array<IFlyoutBase6?>
  }
}
