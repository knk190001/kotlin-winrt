package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IJumpListItemBackgroundConverterStatics.ABI::class)
@Signature("{b03cb261-71ec-540e-83ac-e1a9fdd335e6}")
@Guid("b03cb26171ec540e83ace1a9fdd335e6")
@WinRTInterface("b03cb26171ec540e83ace1a9fdd335e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJumpListItemBackgroundConverterStatics.ByReference::class)
public interface IJumpListItemBackgroundConverterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_DisabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJumpListItemBackgroundConverterStatics> {
    public override fun getValue() =
        ABI.makeIJumpListItemBackgroundConverterStatics(pointer.getPointer(0))

    public fun setValue(value: IJumpListItemBackgroundConverterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJumpListItemBackgroundConverterStatics {
    public val __497037667_Ptr: Pointer?

    public val _497037667_VtblPtr: Pointer?
      get() = __497037667_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnabledProperty(): DependencyProperty? {
      val fnPtr = _497037667_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__497037667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisabledProperty(): DependencyProperty? {
      val fnPtr = _497037667_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__497037667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IJumpListItemBackgroundConverterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __497037667_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJumpListItemBackgroundConverterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b03cb26171ec540e83ace1a9fdd335e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJumpListItemBackgroundConverterStatics(ptr: Pointer?): WithDefault =
        IJumpListItemBackgroundConverterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IJumpListItemBackgroundConverterStatics {
      val address = segment.toRawLongValue()
      return makeIJumpListItemBackgroundConverterStatics(Pointer(address))
    }

    public override fun toNative(obj: IJumpListItemBackgroundConverterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__497037667_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJumpListItemBackgroundConverterStatics):
        Array<IJumpListItemBackgroundConverterStatics?> = (elements as
        Array<IJumpListItemBackgroundConverterStatics?>).castToImpl<IJumpListItemBackgroundConverterStatics,IJumpListItemBackgroundConverterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJumpListItemBackgroundConverterStatics?> =
        arrayOfNulls<IJumpListItemBackgroundConverterStatics_Impl>(size) as
        Array<IJumpListItemBackgroundConverterStatics?>
  }
}
