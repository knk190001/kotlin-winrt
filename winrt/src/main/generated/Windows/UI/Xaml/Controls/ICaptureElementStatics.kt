package Windows.UI.Xaml.Controls

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

@ABIMarker(ICaptureElementStatics.ABI::class)
@Signature("{1e438ded-7da6-409e-806e-305ae4ad9b3f}")
@Guid("1e438ded7da6409e806e305ae4ad9b3f")
@WinRTInterface("1e438ded7da6409e806e305ae4ad9b3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICaptureElementStatics.ByReference::class)
public interface ICaptureElementStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_StretchProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICaptureElementStatics> {
    public override fun getValue() = ABI.makeICaptureElementStatics(pointer.getPointer(0))

    public fun setValue(value: ICaptureElementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICaptureElementStatics {
    public val __1280103283_Ptr: Pointer?

    public val _1280103283_VtblPtr: Pointer?
      get() = __1280103283_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceProperty(): DependencyProperty? {
      val fnPtr = _1280103283_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1280103283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StretchProperty(): DependencyProperty? {
      val fnPtr = _1280103283_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1280103283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICaptureElementStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1280103283_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICaptureElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e438ded7da6409e806e305ae4ad9b3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICaptureElementStatics(ptr: Pointer?): WithDefault =
        ICaptureElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICaptureElementStatics {
      val address = segment.toRawLongValue()
      return makeICaptureElementStatics(Pointer(address))
    }

    public override fun toNative(obj: ICaptureElementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1280103283_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICaptureElementStatics): Array<ICaptureElementStatics?> =
        (elements as
        Array<ICaptureElementStatics?>).castToImpl<ICaptureElementStatics,ICaptureElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICaptureElementStatics?> =
        arrayOfNulls<ICaptureElementStatics_Impl>(size) as Array<ICaptureElementStatics?>
  }
}
