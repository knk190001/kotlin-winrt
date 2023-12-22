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

@ABIMarker(ITranslateTransformStatics.ABI::class)
@Signature("{1342eb11-5a6e-5263-ab3e-9b672a86fc0c}")
@Guid("1342eb115a6e5263ab3e9b672a86fc0c")
@WinRTInterface("1342eb115a6e5263ab3e9b672a86fc0c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITranslateTransformStatics.ByReference::class)
public interface ITranslateTransformStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_YProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITranslateTransformStatics> {
    public override fun getValue() = ABI.makeITranslateTransformStatics(pointer.getPointer(0))

    public fun setValue(value: ITranslateTransformStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITranslateTransformStatics {
    public val __502692586_Ptr: Pointer?

    public val _502692586_VtblPtr: Pointer?
      get() = __502692586_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XProperty(): DependencyProperty? {
      val fnPtr = _502692586_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__502692586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_YProperty(): DependencyProperty? {
      val fnPtr = _502692586_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__502692586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITranslateTransformStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __502692586_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITranslateTransformStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1342eb115a6e5263ab3e9b672a86fc0c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITranslateTransformStatics(ptr: Pointer?): WithDefault =
        ITranslateTransformStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITranslateTransformStatics {
      val address = segment.toRawLongValue()
      return makeITranslateTransformStatics(Pointer(address))
    }

    public override fun toNative(obj: ITranslateTransformStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__502692586_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITranslateTransformStatics):
        Array<ITranslateTransformStatics?> = (elements as
        Array<ITranslateTransformStatics?>).castToImpl<ITranslateTransformStatics,ITranslateTransformStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITranslateTransformStatics?> =
        arrayOfNulls<ITranslateTransformStatics_Impl>(size) as Array<ITranslateTransformStatics?>
  }
}
