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

@ABIMarker(ISkewTransformStatics.ABI::class)
@Signature("{93265150-53d0-52e3-88a3-3d93e2ed861a}")
@Guid("9326515053d052e388a33d93e2ed861a")
@WinRTInterface("9326515053d052e388a33d93e2ed861a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISkewTransformStatics.ByReference::class)
public interface ISkewTransformStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterXProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CenterYProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_AngleXProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_AngleYProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISkewTransformStatics> {
    public override fun getValue() = ABI.makeISkewTransformStatics(pointer.getPointer(0))

    public fun setValue(value: ISkewTransformStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISkewTransformStatics {
    public val __974554516_Ptr: Pointer?

    public val _974554516_VtblPtr: Pointer?
      get() = __974554516_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterXProperty(): DependencyProperty? {
      val fnPtr = _974554516_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__974554516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CenterYProperty(): DependencyProperty? {
      val fnPtr = _974554516_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__974554516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AngleXProperty(): DependencyProperty? {
      val fnPtr = _974554516_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__974554516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AngleYProperty(): DependencyProperty? {
      val fnPtr = _974554516_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__974554516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISkewTransformStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __974554516_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISkewTransformStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9326515053d052e388a33d93e2ed861a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISkewTransformStatics(ptr: Pointer?): WithDefault =
        ISkewTransformStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISkewTransformStatics {
      val address = segment.toRawLongValue()
      return makeISkewTransformStatics(Pointer(address))
    }

    public override fun toNative(obj: ISkewTransformStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__974554516_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISkewTransformStatics): Array<ISkewTransformStatics?> =
        (elements as
        Array<ISkewTransformStatics?>).castToImpl<ISkewTransformStatics,ISkewTransformStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISkewTransformStatics?> =
        arrayOfNulls<ISkewTransformStatics_Impl>(size) as Array<ISkewTransformStatics?>
  }
}
