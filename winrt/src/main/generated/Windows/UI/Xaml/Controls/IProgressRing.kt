package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.ProgressRingTemplateSettings
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

@ABIMarker(IProgressRing.ABI::class)
@Signature("{6da5e49e-6e9d-425c-bd7c-02173e39763f}")
@Guid("6da5e49e6e9d425cbd7c02173e39763f")
@WinRTInterface("6da5e49e6e9d425cbd7c02173e39763f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressRing.ByReference::class)
public interface IProgressRing : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(1)
  public fun put_IsActive(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_TemplateSettings(): ProgressRingTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IProgressRing>
      {
    public override fun getValue() = ABI.makeIProgressRing(pointer.getPointer(0))

    public fun setValue(value: IProgressRing_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressRing {
    public val __2079183897_Ptr: Pointer?

    public val _2079183897_VtblPtr: Pointer?
      get() = __2079183897_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _2079183897_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2079183897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsActive(value: Boolean): Unit {
      val fnPtr = _2079183897_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079183897_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TemplateSettings(): ProgressRingTemplateSettings? {
      val fnPtr = _2079183897_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProgressRingTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__2079183897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProgressRingTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IProgressRing_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2079183897_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressRing, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6da5e49e6e9d425cbd7c02173e39763f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressRing(ptr: Pointer?): WithDefault = IProgressRing_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressRing {
      val address = segment.toRawLongValue()
      return makeIProgressRing(Pointer(address))
    }

    public override fun toNative(obj: IProgressRing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2079183897_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressRing): Array<IProgressRing?> = (elements as
        Array<IProgressRing?>).castToImpl<IProgressRing,IProgressRing_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressRing?> =
        arrayOfNulls<IProgressRing_Impl>(size) as Array<IProgressRing?>
  }
}
