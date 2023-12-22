package Microsoft.Windows.Widgets.Providers

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWidgetUpdateRequestOptionsStatics.ABI::class)
@Signature("{4645b5e3-d332-5d11-82f0-3607e5df6018}")
@Guid("4645b5e3d3325d1182f03607e5df6018")
@WinRTInterface("4645b5e3d3325d1182f03607e5df6018")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetUpdateRequestOptionsStatics.ByReference::class)
public interface IWidgetUpdateRequestOptionsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnsetValue(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetUpdateRequestOptionsStatics> {
    public override fun getValue() =
        ABI.makeIWidgetUpdateRequestOptionsStatics(pointer.getPointer(0))

    public fun setValue(value: IWidgetUpdateRequestOptionsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetUpdateRequestOptionsStatics {
    public val __737664056_Ptr: Pointer?

    public val _737664056_VtblPtr: Pointer?
      get() = __737664056_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnsetValue(): String? {
      val fnPtr = _737664056_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__737664056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWidgetUpdateRequestOptionsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __737664056_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetUpdateRequestOptionsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4645b5e3d3325d1182f03607e5df6018")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetUpdateRequestOptionsStatics(ptr: Pointer?): WithDefault =
        IWidgetUpdateRequestOptionsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetUpdateRequestOptionsStatics {
      val address = segment.toRawLongValue()
      return makeIWidgetUpdateRequestOptionsStatics(Pointer(address))
    }

    public override fun toNative(obj: IWidgetUpdateRequestOptionsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__737664056_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetUpdateRequestOptionsStatics):
        Array<IWidgetUpdateRequestOptionsStatics?> = (elements as
        Array<IWidgetUpdateRequestOptionsStatics?>).castToImpl<IWidgetUpdateRequestOptionsStatics,IWidgetUpdateRequestOptionsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetUpdateRequestOptionsStatics?> =
        arrayOfNulls<IWidgetUpdateRequestOptionsStatics_Impl>(size) as
        Array<IWidgetUpdateRequestOptionsStatics?>
  }
}
