package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Media.SystemBackdrop
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

@ABIMarker(IPopup3.ABI::class)
@Signature("{03736c25-dd36-5344-9a8d-3f4e8e616cba}")
@Guid("03736c25dd3653449a8d3f4e8e616cba")
@WinRTInterface("03736c25dd3653449a8d3f4e8e616cba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopup3.ByReference::class)
public interface IPopup3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemBackdrop(): SystemBackdrop?

  @InterfaceMethod(1)
  public fun put_SystemBackdrop(value: SystemBackdrop?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopup3> {
    public override fun getValue() = ABI.makeIPopup3(pointer.getPointer(0))

    public fun setValue(value: IPopup3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopup3 {
    public val __253127528_Ptr: Pointer?

    public val _253127528_VtblPtr: Pointer?
      get() = __253127528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemBackdrop(): SystemBackdrop? {
      val fnPtr = _253127528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemBackdrop>()
      val hr = fn.invokeHR(arrayOf(__253127528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemBackdrop>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SystemBackdrop(value: SystemBackdrop?): Unit {
      val fnPtr = _253127528_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__253127528_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPopup3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __253127528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopup3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03736c25dd3653449a8d3f4e8e616cba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopup3(ptr: Pointer?): WithDefault = IPopup3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopup3 {
      val address = segment.toRawLongValue()
      return makeIPopup3(Pointer(address))
    }

    public override fun toNative(obj: IPopup3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__253127528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopup3): Array<IPopup3?> = (elements as
        Array<IPopup3?>).castToImpl<IPopup3,IPopup3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopup3?> = arrayOfNulls<IPopup3_Impl>(size) as
        Array<IPopup3?>
  }
}
