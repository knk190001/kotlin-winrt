package Windows.UI.Xaml

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

@ABIMarker(IApplication3.ABI::class)
@Signature("{b775ad7c-18b8-45ca-a1b0-dc483e4b1028}")
@Guid("b775ad7c18b845caa1b0dc483e4b1028")
@WinRTInterface("b775ad7c18b845caa1b0dc483e4b1028")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplication3.ByReference::class)
public interface IApplication3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HighContrastAdjustment(): ApplicationHighContrastAdjustment?

  @InterfaceMethod(1)
  public fun put_HighContrastAdjustment(value: ApplicationHighContrastAdjustment?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IApplication3>
      {
    public override fun getValue() = ABI.makeIApplication3(pointer.getPointer(0))

    public fun setValue(value: IApplication3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplication3 {
    public val __520585269_Ptr: Pointer?

    public val _520585269_VtblPtr: Pointer?
      get() = __520585269_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HighContrastAdjustment(): ApplicationHighContrastAdjustment? {
      val fnPtr = _520585269_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationHighContrastAdjustment>()
      val hr = fn.invokeHR(arrayOf(__520585269_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationHighContrastAdjustment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HighContrastAdjustment(value: ApplicationHighContrastAdjustment?):
        Unit {
      val fnPtr = _520585269_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__520585269_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplication3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __520585269_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplication3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b775ad7c18b845caa1b0dc483e4b1028")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplication3(ptr: Pointer?): WithDefault = IApplication3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplication3 {
      val address = segment.toRawLongValue()
      return makeIApplication3(Pointer(address))
    }

    public override fun toNative(obj: IApplication3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__520585269_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplication3): Array<IApplication3?> = (elements as
        Array<IApplication3?>).castToImpl<IApplication3,IApplication3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplication3?> =
        arrayOfNulls<IApplication3_Impl>(size) as Array<IApplication3?>
  }
}
