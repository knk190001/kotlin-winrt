package Microsoft.UI.Xaml.Markup

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IProvideValueTarget.ABI::class)
@Signature("{3f01ff68-3efd-591d-a506-de13fcaabd83}")
@Guid("3f01ff683efd591da506de13fcaabd83")
@WinRTInterface("3f01ff683efd591da506de13fcaabd83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProvideValueTarget.ByReference::class)
public interface IProvideValueTarget : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetObject(): IUnknown?

  @InterfaceMethod(1)
  public fun get_TargetProperty(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProvideValueTarget> {
    public override fun getValue() = ABI.makeIProvideValueTarget(pointer.getPointer(0))

    public fun setValue(value: IProvideValueTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProvideValueTarget {
    public val __2124363946_Ptr: Pointer?

    public val _2124363946_VtblPtr: Pointer?
      get() = __2124363946_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetObject(): IUnknown? {
      val fnPtr = _2124363946_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2124363946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TargetProperty(): IUnknown? {
      val fnPtr = _2124363946_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2124363946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IProvideValueTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2124363946_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProvideValueTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f01ff683efd591da506de13fcaabd83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProvideValueTarget(ptr: Pointer?): WithDefault = IProvideValueTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProvideValueTarget {
      val address = segment.toRawLongValue()
      return makeIProvideValueTarget(Pointer(address))
    }

    public override fun toNative(obj: IProvideValueTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2124363946_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProvideValueTarget): Array<IProvideValueTarget?> =
        (elements as
        Array<IProvideValueTarget?>).castToImpl<IProvideValueTarget,IProvideValueTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProvideValueTarget?> =
        arrayOfNulls<IProvideValueTarget_Impl>(size) as Array<IProvideValueTarget?>
  }
}
