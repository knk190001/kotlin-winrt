package Windows.UI.Xaml.Controls

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

@ABIMarker(IPivot3.ABI::class)
@Signature("{95bcbf96-f0da-4089-8c65-e8b81354c766}")
@Guid("95bcbf96f0da40898c65e8b81354c766")
@WinRTInterface("95bcbf96f0da40898c65e8b81354c766")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivot3.ByReference::class)
public interface IPivot3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderFocusVisualPlacement(): PivotHeaderFocusVisualPlacement?

  @InterfaceMethod(1)
  public fun put_HeaderFocusVisualPlacement(value: PivotHeaderFocusVisualPlacement?): Unit

  @InterfaceMethod(2)
  public fun get_IsHeaderItemsCarouselEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsHeaderItemsCarouselEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPivot3> {
    public override fun getValue() = ABI.makeIPivot3(pointer.getPointer(0))

    public fun setValue(value: IPivot3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivot3 {
    public val __647336781_Ptr: Pointer?

    public val _647336781_VtblPtr: Pointer?
      get() = __647336781_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderFocusVisualPlacement(): PivotHeaderFocusVisualPlacement? {
      val fnPtr = _647336781_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PivotHeaderFocusVisualPlacement>()
      val hr = fn.invokeHR(arrayOf(__647336781_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PivotHeaderFocusVisualPlacement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HeaderFocusVisualPlacement(value: PivotHeaderFocusVisualPlacement?):
        Unit {
      val fnPtr = _647336781_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__647336781_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsHeaderItemsCarouselEnabled(): Boolean {
      val fnPtr = _647336781_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__647336781_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsHeaderItemsCarouselEnabled(value: Boolean): Unit {
      val fnPtr = _647336781_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__647336781_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPivot3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __647336781_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivot3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95bcbf96f0da40898c65e8b81354c766")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivot3(ptr: Pointer?): WithDefault = IPivot3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivot3 {
      val address = segment.toRawLongValue()
      return makeIPivot3(Pointer(address))
    }

    public override fun toNative(obj: IPivot3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__647336781_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivot3): Array<IPivot3?> = (elements as
        Array<IPivot3?>).castToImpl<IPivot3,IPivot3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivot3?> = arrayOfNulls<IPivot3_Impl>(size) as
        Array<IPivot3?>
  }
}
