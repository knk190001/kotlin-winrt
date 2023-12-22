package Microsoft.UI.Xaml.Media

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

@ABIMarker(IGradientStopStatics.ABI::class)
@Signature("{0b566c1b-37de-5bfd-b419-0f7c4c0a0523}")
@Guid("0b566c1b37de5bfdb4190f7c4c0a0523")
@WinRTInterface("0b566c1b37de5bfdb4190f7c4c0a0523")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGradientStopStatics.ByReference::class)
public interface IGradientStopStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColorProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGradientStopStatics> {
    public override fun getValue() = ABI.makeIGradientStopStatics(pointer.getPointer(0))

    public fun setValue(value: IGradientStopStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGradientStopStatics {
    public val __955429822_Ptr: Pointer?

    public val _955429822_VtblPtr: Pointer?
      get() = __955429822_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColorProperty(): DependencyProperty? {
      val fnPtr = _955429822_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__955429822_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OffsetProperty(): DependencyProperty? {
      val fnPtr = _955429822_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__955429822_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IGradientStopStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __955429822_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGradientStopStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b566c1b37de5bfdb4190f7c4c0a0523")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGradientStopStatics(ptr: Pointer?): WithDefault = IGradientStopStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGradientStopStatics {
      val address = segment.toRawLongValue()
      return makeIGradientStopStatics(Pointer(address))
    }

    public override fun toNative(obj: IGradientStopStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__955429822_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGradientStopStatics): Array<IGradientStopStatics?> =
        (elements as
        Array<IGradientStopStatics?>).castToImpl<IGradientStopStatics,IGradientStopStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGradientStopStatics?> =
        arrayOfNulls<IGradientStopStatics_Impl>(size) as Array<IGradientStopStatics?>
  }
}
