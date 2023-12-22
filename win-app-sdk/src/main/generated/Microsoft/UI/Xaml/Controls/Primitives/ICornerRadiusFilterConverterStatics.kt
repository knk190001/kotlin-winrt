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

@ABIMarker(ICornerRadiusFilterConverterStatics.ABI::class)
@Signature("{2d9574f9-cc9e-535e-a70e-d55c4ca27f49}")
@Guid("2d9574f9cc9e535ea70ed55c4ca27f49")
@WinRTInterface("2d9574f9cc9e535ea70ed55c4ca27f49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICornerRadiusFilterConverterStatics.ByReference::class)
public interface ICornerRadiusFilterConverterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FilterProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ScaleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICornerRadiusFilterConverterStatics> {
    public override fun getValue() =
        ABI.makeICornerRadiusFilterConverterStatics(pointer.getPointer(0))

    public fun setValue(value: ICornerRadiusFilterConverterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICornerRadiusFilterConverterStatics {
    public val __2104370731_Ptr: Pointer?

    public val _2104370731_VtblPtr: Pointer?
      get() = __2104370731_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FilterProperty(): DependencyProperty? {
      val fnPtr = _2104370731_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2104370731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ScaleProperty(): DependencyProperty? {
      val fnPtr = _2104370731_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2104370731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICornerRadiusFilterConverterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2104370731_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICornerRadiusFilterConverterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d9574f9cc9e535ea70ed55c4ca27f49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICornerRadiusFilterConverterStatics(ptr: Pointer?): WithDefault =
        ICornerRadiusFilterConverterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICornerRadiusFilterConverterStatics {
      val address = segment.toRawLongValue()
      return makeICornerRadiusFilterConverterStatics(Pointer(address))
    }

    public override fun toNative(obj: ICornerRadiusFilterConverterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2104370731_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICornerRadiusFilterConverterStatics):
        Array<ICornerRadiusFilterConverterStatics?> = (elements as
        Array<ICornerRadiusFilterConverterStatics?>).castToImpl<ICornerRadiusFilterConverterStatics,ICornerRadiusFilterConverterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICornerRadiusFilterConverterStatics?> =
        arrayOfNulls<ICornerRadiusFilterConverterStatics_Impl>(size) as
        Array<ICornerRadiusFilterConverterStatics?>
  }
}
