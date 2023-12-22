package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.Brush
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

@ABIMarker(IIconSource.ABI::class)
@Signature("{92ec8d55-45eb-47a4-863c-91b224044f9b}")
@Guid("92ec8d5545eb47a4863c91b224044f9b")
@WinRTInterface("92ec8d5545eb47a4863c91b224044f9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconSource.ByReference::class)
public interface IIconSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Foreground(): Brush?

  @InterfaceMethod(1)
  public fun put_Foreground(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IIconSource> {
    public override fun getValue() = ABI.makeIIconSource(pointer.getPointer(0))

    public fun setValue(value: IIconSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconSource {
    public val __2024113392_Ptr: Pointer?

    public val _2024113392_VtblPtr: Pointer?
      get() = __2024113392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _2024113392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__2024113392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _2024113392_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2024113392_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIconSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2024113392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92ec8d5545eb47a4863c91b224044f9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconSource(ptr: Pointer?): WithDefault = IIconSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconSource {
      val address = segment.toRawLongValue()
      return makeIIconSource(Pointer(address))
    }

    public override fun toNative(obj: IIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2024113392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconSource): Array<IIconSource?> = (elements as
        Array<IIconSource?>).castToImpl<IIconSource,IIconSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconSource?> =
        arrayOfNulls<IIconSource_Impl>(size) as Array<IIconSource?>
  }
}
