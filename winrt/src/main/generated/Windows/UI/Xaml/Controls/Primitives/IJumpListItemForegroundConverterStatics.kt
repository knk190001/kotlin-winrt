package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IJumpListItemForegroundConverterStatics.ABI::class)
@Signature("{474e7352-210c-4673-ac6a-413f0e2c7750}")
@Guid("474e7352210c4673ac6a413f0e2c7750")
@WinRTInterface("474e7352210c4673ac6a413f0e2c7750")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJumpListItemForegroundConverterStatics.ByReference::class)
public interface IJumpListItemForegroundConverterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_DisabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJumpListItemForegroundConverterStatics> {
    public override fun getValue() =
        ABI.makeIJumpListItemForegroundConverterStatics(pointer.getPointer(0))

    public fun setValue(value: IJumpListItemForegroundConverterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJumpListItemForegroundConverterStatics {
    public val __1365584445_Ptr: Pointer?

    public val _1365584445_VtblPtr: Pointer?
      get() = __1365584445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnabledProperty(): DependencyProperty? {
      val fnPtr = _1365584445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1365584445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisabledProperty(): DependencyProperty? {
      val fnPtr = _1365584445_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1365584445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IJumpListItemForegroundConverterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1365584445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJumpListItemForegroundConverterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("474e7352210c4673ac6a413f0e2c7750")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJumpListItemForegroundConverterStatics(ptr: Pointer?): WithDefault =
        IJumpListItemForegroundConverterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IJumpListItemForegroundConverterStatics {
      val address = segment.toRawLongValue()
      return makeIJumpListItemForegroundConverterStatics(Pointer(address))
    }

    public override fun toNative(obj: IJumpListItemForegroundConverterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1365584445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJumpListItemForegroundConverterStatics):
        Array<IJumpListItemForegroundConverterStatics?> = (elements as
        Array<IJumpListItemForegroundConverterStatics?>).castToImpl<IJumpListItemForegroundConverterStatics,IJumpListItemForegroundConverterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJumpListItemForegroundConverterStatics?> =
        arrayOfNulls<IJumpListItemForegroundConverterStatics_Impl>(size) as
        Array<IJumpListItemForegroundConverterStatics?>
  }
}
