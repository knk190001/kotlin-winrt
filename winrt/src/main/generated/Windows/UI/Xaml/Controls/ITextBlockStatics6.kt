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

@ABIMarker(ITextBlockStatics6.ABI::class)
@Signature("{3d1013a9-f9a6-43a2-99d3-573b89a83ca3}")
@Guid("3d1013a9f9a643a299d3573b89a83ca3")
@WinRTInterface("3d1013a9f9a643a299d3573b89a83ca3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlockStatics6.ByReference::class)
public interface ITextBlockStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextTrimmedProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HorizontalTextAlignmentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBlockStatics6> {
    public override fun getValue() = ABI.makeITextBlockStatics6(pointer.getPointer(0))

    public fun setValue(value: ITextBlockStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlockStatics6 {
    public val __106258443_Ptr: Pointer?

    public val _106258443_VtblPtr: Pointer?
      get() = __106258443_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextTrimmedProperty(): DependencyProperty? {
      val fnPtr = _106258443_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__106258443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HorizontalTextAlignmentProperty(): DependencyProperty? {
      val fnPtr = _106258443_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__106258443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextBlockStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106258443_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlockStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d1013a9f9a643a299d3573b89a83ca3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlockStatics6(ptr: Pointer?): WithDefault = ITextBlockStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlockStatics6 {
      val address = segment.toRawLongValue()
      return makeITextBlockStatics6(Pointer(address))
    }

    public override fun toNative(obj: ITextBlockStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106258443_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlockStatics6): Array<ITextBlockStatics6?> =
        (elements as
        Array<ITextBlockStatics6?>).castToImpl<ITextBlockStatics6,ITextBlockStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlockStatics6?> =
        arrayOfNulls<ITextBlockStatics6_Impl>(size) as Array<ITextBlockStatics6?>
  }
}
