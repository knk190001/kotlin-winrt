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

@ABIMarker(ICommandBarTemplateSettings2.ABI::class)
@Signature("{fbb24f93-c2e2-4177-a2b6-3cd705073cf6}")
@Guid("fbb24f93c2e24177a2b63cd705073cf6")
@WinRTInterface("fbb24f93c2e24177a2b63cd705073cf6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarTemplateSettings2.ByReference::class)
public interface ICommandBarTemplateSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OverflowContentMaxWidth(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarTemplateSettings2> {
    public override fun getValue() = ABI.makeICommandBarTemplateSettings2(pointer.getPointer(0))

    public fun setValue(value: ICommandBarTemplateSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarTemplateSettings2 {
    public val __1936499503_Ptr: Pointer?

    public val _1936499503_VtblPtr: Pointer?
      get() = __1936499503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OverflowContentMaxWidth(): Double {
      val fnPtr = _1936499503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1936499503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class ICommandBarTemplateSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1936499503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarTemplateSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbb24f93c2e24177a2b63cd705073cf6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarTemplateSettings2(ptr: Pointer?): WithDefault =
        ICommandBarTemplateSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarTemplateSettings2 {
      val address = segment.toRawLongValue()
      return makeICommandBarTemplateSettings2(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarTemplateSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1936499503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarTemplateSettings2):
        Array<ICommandBarTemplateSettings2?> = (elements as
        Array<ICommandBarTemplateSettings2?>).castToImpl<ICommandBarTemplateSettings2,ICommandBarTemplateSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarTemplateSettings2?> =
        arrayOfNulls<ICommandBarTemplateSettings2_Impl>(size) as
        Array<ICommandBarTemplateSettings2?>
  }
}
