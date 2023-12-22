package Windows.UI.Xaml.Controls.Primitives

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICommandBarTemplateSettings4.ABI::class)
@Signature("{f2562dd3-aa58-59c5-853b-828a19d1214e}")
@Guid("f2562dd3aa5859c5853b828a19d1214e")
@WinRTInterface("f2562dd3aa5859c5853b828a19d1214e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarTemplateSettings4.ByReference::class)
public interface ICommandBarTemplateSettings4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OverflowContentCompactYTranslation(): Double

  @InterfaceMethod(1)
  public fun get_OverflowContentMinimalYTranslation(): Double

  @InterfaceMethod(2)
  public fun get_OverflowContentHiddenYTranslation(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarTemplateSettings4> {
    public override fun getValue() = ABI.makeICommandBarTemplateSettings4(pointer.getPointer(0))

    public fun setValue(value: ICommandBarTemplateSettings4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarTemplateSettings4 {
    public val __1936499501_Ptr: Pointer?

    public val _1936499501_VtblPtr: Pointer?
      get() = __1936499501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OverflowContentCompactYTranslation(): Double {
      val fnPtr = _1936499501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1936499501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_OverflowContentMinimalYTranslation(): Double {
      val fnPtr = _1936499501_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1936499501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_OverflowContentHiddenYTranslation(): Double {
      val fnPtr = _1936499501_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1936499501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class ICommandBarTemplateSettings4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1936499501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarTemplateSettings4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2562dd3aa5859c5853b828a19d1214e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarTemplateSettings4(ptr: Pointer?): WithDefault =
        ICommandBarTemplateSettings4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarTemplateSettings4 {
      val address = segment.toRawLongValue()
      return makeICommandBarTemplateSettings4(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarTemplateSettings4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1936499501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarTemplateSettings4):
        Array<ICommandBarTemplateSettings4?> = (elements as
        Array<ICommandBarTemplateSettings4?>).castToImpl<ICommandBarTemplateSettings4,ICommandBarTemplateSettings4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarTemplateSettings4?> =
        arrayOfNulls<ICommandBarTemplateSettings4_Impl>(size) as
        Array<ICommandBarTemplateSettings4?>
  }
}
