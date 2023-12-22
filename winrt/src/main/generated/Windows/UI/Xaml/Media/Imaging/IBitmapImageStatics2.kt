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

@ABIMarker(IBitmapImageStatics2.ABI::class)
@Signature("{c5f5576a-75af-41a4-b893-8fe91fee2882}")
@Guid("c5f5576a75af41a4b8938fe91fee2882")
@WinRTInterface("c5f5576a75af41a4b8938fe91fee2882")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapImageStatics2.ByReference::class)
public interface IBitmapImageStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DecodePixelTypeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapImageStatics2> {
    public override fun getValue() = ABI.makeIBitmapImageStatics2(pointer.getPointer(0))

    public fun setValue(value: IBitmapImageStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapImageStatics2 {
    public val __1301688217_Ptr: Pointer?

    public val _1301688217_VtblPtr: Pointer?
      get() = __1301688217_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DecodePixelTypeProperty(): DependencyProperty? {
      val fnPtr = _1301688217_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1301688217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapImageStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1301688217_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapImageStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5f5576a75af41a4b8938fe91fee2882")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapImageStatics2(ptr: Pointer?): WithDefault = IBitmapImageStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapImageStatics2 {
      val address = segment.toRawLongValue()
      return makeIBitmapImageStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBitmapImageStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1301688217_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapImageStatics2): Array<IBitmapImageStatics2?> =
        (elements as
        Array<IBitmapImageStatics2?>).castToImpl<IBitmapImageStatics2,IBitmapImageStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapImageStatics2?> =
        arrayOfNulls<IBitmapImageStatics2_Impl>(size) as Array<IBitmapImageStatics2?>
  }
}
