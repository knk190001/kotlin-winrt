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

@ABIMarker(ITextBlockStatics3.ABI::class)
@Signature("{8d16b9eb-20a1-4eab-bbf2-1d6bdcbcd705}")
@Guid("8d16b9eb20a14eabbbf21d6bdcbcd705")
@WinRTInterface("8d16b9eb20a14eabbbf21d6bdcbcd705")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlockStatics3.ByReference::class)
public interface ITextBlockStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBlockStatics3> {
    public override fun getValue() = ABI.makeITextBlockStatics3(pointer.getPointer(0))

    public fun setValue(value: ITextBlockStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlockStatics3 {
    public val __106258446_Ptr: Pointer?

    public val _106258446_VtblPtr: Pointer?
      get() = __106258446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty? {
      val fnPtr = _106258446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__106258446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextBlockStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106258446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlockStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d16b9eb20a14eabbbf21d6bdcbcd705")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlockStatics3(ptr: Pointer?): WithDefault = ITextBlockStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlockStatics3 {
      val address = segment.toRawLongValue()
      return makeITextBlockStatics3(Pointer(address))
    }

    public override fun toNative(obj: ITextBlockStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106258446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlockStatics3): Array<ITextBlockStatics3?> =
        (elements as
        Array<ITextBlockStatics3?>).castToImpl<ITextBlockStatics3,ITextBlockStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlockStatics3?> =
        arrayOfNulls<ITextBlockStatics3_Impl>(size) as Array<ITextBlockStatics3?>
  }
}
