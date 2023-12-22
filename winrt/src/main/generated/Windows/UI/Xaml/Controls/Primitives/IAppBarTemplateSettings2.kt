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

@ABIMarker(IAppBarTemplateSettings2.ABI::class)
@Signature("{cbe66259-0399-5bcc-b925-4d5f5c9a4568}")
@Guid("cbe6625903995bccb9254d5f5c9a4568")
@WinRTInterface("cbe6625903995bccb9254d5f5c9a4568")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarTemplateSettings2.ByReference::class)
public interface IAppBarTemplateSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NegativeCompactVerticalDelta(): Double

  @InterfaceMethod(1)
  public fun get_NegativeMinimalVerticalDelta(): Double

  @InterfaceMethod(2)
  public fun get_NegativeHiddenVerticalDelta(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarTemplateSettings2> {
    public override fun getValue() = ABI.makeIAppBarTemplateSettings2(pointer.getPointer(0))

    public fun setValue(value: IAppBarTemplateSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarTemplateSettings2 {
    public val __1306877273_Ptr: Pointer?

    public val _1306877273_VtblPtr: Pointer?
      get() = __1306877273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NegativeCompactVerticalDelta(): Double {
      val fnPtr = _1306877273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1306877273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_NegativeMinimalVerticalDelta(): Double {
      val fnPtr = _1306877273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1306877273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_NegativeHiddenVerticalDelta(): Double {
      val fnPtr = _1306877273_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1306877273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBarTemplateSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1306877273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarTemplateSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cbe6625903995bccb9254d5f5c9a4568")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarTemplateSettings2(ptr: Pointer?): WithDefault =
        IAppBarTemplateSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarTemplateSettings2 {
      val address = segment.toRawLongValue()
      return makeIAppBarTemplateSettings2(Pointer(address))
    }

    public override fun toNative(obj: IAppBarTemplateSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1306877273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarTemplateSettings2):
        Array<IAppBarTemplateSettings2?> = (elements as
        Array<IAppBarTemplateSettings2?>).castToImpl<IAppBarTemplateSettings2,IAppBarTemplateSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarTemplateSettings2?> =
        arrayOfNulls<IAppBarTemplateSettings2_Impl>(size) as Array<IAppBarTemplateSettings2?>
  }
}
