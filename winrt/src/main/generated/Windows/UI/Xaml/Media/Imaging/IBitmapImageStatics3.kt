package Windows.UI.Xaml.Media.Imaging

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

@ABIMarker(IBitmapImageStatics3.ABI::class)
@Signature("{2b44e30d-f6d5-4411-a8cd-bf7603c4faa0}")
@Guid("2b44e30df6d54411a8cdbf7603c4faa0")
@WinRTInterface("2b44e30df6d54411a8cdbf7603c4faa0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapImageStatics3.ByReference::class)
public interface IBitmapImageStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAnimatedBitmapProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsPlayingProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_AutoPlayProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapImageStatics3> {
    public override fun getValue() = ABI.makeIBitmapImageStatics3(pointer.getPointer(0))

    public fun setValue(value: IBitmapImageStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapImageStatics3 {
    public val __1301688216_Ptr: Pointer?

    public val _1301688216_VtblPtr: Pointer?
      get() = __1301688216_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAnimatedBitmapProperty(): DependencyProperty? {
      val fnPtr = _1301688216_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1301688216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsPlayingProperty(): DependencyProperty? {
      val fnPtr = _1301688216_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1301688216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AutoPlayProperty(): DependencyProperty? {
      val fnPtr = _1301688216_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1301688216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapImageStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1301688216_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapImageStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b44e30df6d54411a8cdbf7603c4faa0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapImageStatics3(ptr: Pointer?): WithDefault = IBitmapImageStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapImageStatics3 {
      val address = segment.toRawLongValue()
      return makeIBitmapImageStatics3(Pointer(address))
    }

    public override fun toNative(obj: IBitmapImageStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1301688216_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapImageStatics3): Array<IBitmapImageStatics3?> =
        (elements as
        Array<IBitmapImageStatics3?>).castToImpl<IBitmapImageStatics3,IBitmapImageStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapImageStatics3?> =
        arrayOfNulls<IBitmapImageStatics3_Impl>(size) as Array<IBitmapImageStatics3?>
  }
}
