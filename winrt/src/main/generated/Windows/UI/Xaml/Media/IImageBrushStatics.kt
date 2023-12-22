package Windows.UI.Xaml.Media

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

@ABIMarker(IImageBrushStatics.ABI::class)
@Signature("{1255b1b2-dd18-42e5-892c-eae30c305b8c}")
@Guid("1255b1b2dd1842e5892ceae30c305b8c")
@WinRTInterface("1255b1b2dd1842e5892ceae30c305b8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageBrushStatics.ByReference::class)
public interface IImageBrushStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ImageSourceProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageBrushStatics> {
    public override fun getValue() = ABI.makeIImageBrushStatics(pointer.getPointer(0))

    public fun setValue(value: IImageBrushStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageBrushStatics {
    public val __153337258_Ptr: Pointer?

    public val _153337258_VtblPtr: Pointer?
      get() = __153337258_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ImageSourceProperty(): DependencyProperty? {
      val fnPtr = _153337258_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__153337258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IImageBrushStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __153337258_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageBrushStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1255b1b2dd1842e5892ceae30c305b8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageBrushStatics(ptr: Pointer?): WithDefault = IImageBrushStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageBrushStatics {
      val address = segment.toRawLongValue()
      return makeIImageBrushStatics(Pointer(address))
    }

    public override fun toNative(obj: IImageBrushStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__153337258_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageBrushStatics): Array<IImageBrushStatics?> =
        (elements as
        Array<IImageBrushStatics?>).castToImpl<IImageBrushStatics,IImageBrushStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageBrushStatics?> =
        arrayOfNulls<IImageBrushStatics_Impl>(size) as Array<IImageBrushStatics?>
  }
}
