package Microsoft.UI.Xaml.Media

import Windows.UI.Color
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

@ABIMarker(ISolidColorBrushFactory.ABI::class)
@Signature("{7b559384-4daa-54f4-91ef-33a23fd816ca}")
@Guid("7b5593844daa54f491ef33a23fd816ca")
@WinRTInterface("7b5593844daa54f491ef33a23fd816ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISolidColorBrushFactory.ByReference::class)
public interface ISolidColorBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithColor(color: Color?): SolidColorBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISolidColorBrushFactory> {
    public override fun getValue() = ABI.makeISolidColorBrushFactory(pointer.getPointer(0))

    public fun setValue(value: ISolidColorBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISolidColorBrushFactory {
    public val __1459205497_Ptr: Pointer?

    public val _1459205497_VtblPtr: Pointer?
      get() = __1459205497_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithColor(color: Color?): SolidColorBrush? {
      val fnPtr = _1459205497_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__1459205497_Ptr, marshalToNative(color), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }
  }

  public class ISolidColorBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1459205497_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISolidColorBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b5593844daa54f491ef33a23fd816ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISolidColorBrushFactory(ptr: Pointer?): WithDefault =
        ISolidColorBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISolidColorBrushFactory {
      val address = segment.toRawLongValue()
      return makeISolidColorBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: ISolidColorBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1459205497_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISolidColorBrushFactory): Array<ISolidColorBrushFactory?>
        = (elements as
        Array<ISolidColorBrushFactory?>).castToImpl<ISolidColorBrushFactory,ISolidColorBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISolidColorBrushFactory?> =
        arrayOfNulls<ISolidColorBrushFactory_Impl>(size) as Array<ISolidColorBrushFactory?>
  }
}
