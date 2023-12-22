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

@ABIMarker(IAppBarButtonStatics.ABI::class)
@Signature("{7ccd13e6-5301-407f-874e-dc9160aa07af}")
@Guid("7ccd13e65301407f874edc9160aa07af")
@WinRTInterface("7ccd13e65301407f874edc9160aa07af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarButtonStatics.ByReference::class)
public interface IAppBarButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LabelProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IconProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsCompactProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarButtonStatics> {
    public override fun getValue() = ABI.makeIAppBarButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IAppBarButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarButtonStatics {
    public val __98078331_Ptr: Pointer?

    public val _98078331_VtblPtr: Pointer?
      get() = __98078331_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LabelProperty(): DependencyProperty? {
      val fnPtr = _98078331_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__98078331_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IconProperty(): DependencyProperty? {
      val fnPtr = _98078331_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__98078331_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsCompactProperty(): DependencyProperty? {
      val fnPtr = _98078331_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__98078331_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __98078331_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ccd13e65301407f874edc9160aa07af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarButtonStatics(ptr: Pointer?): WithDefault = IAppBarButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarButtonStatics {
      val address = segment.toRawLongValue()
      return makeIAppBarButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppBarButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__98078331_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarButtonStatics): Array<IAppBarButtonStatics?> =
        (elements as
        Array<IAppBarButtonStatics?>).castToImpl<IAppBarButtonStatics,IAppBarButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarButtonStatics?> =
        arrayOfNulls<IAppBarButtonStatics_Impl>(size) as Array<IAppBarButtonStatics?>
  }
}
