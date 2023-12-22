package Windows.UI.Xaml.Media

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

@ABIMarker(IMatrixTransformStatics.ABI::class)
@Signature("{43e02e47-15b8-4758-bb97-7d52420acc5b}")
@Guid("43e02e4715b84758bb977d52420acc5b")
@WinRTInterface("43e02e4715b84758bb977d52420acc5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMatrixTransformStatics.ByReference::class)
public interface IMatrixTransformStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MatrixProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMatrixTransformStatics> {
    public override fun getValue() = ABI.makeIMatrixTransformStatics(pointer.getPointer(0))

    public fun setValue(value: IMatrixTransformStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMatrixTransformStatics {
    public val __293609878_Ptr: Pointer?

    public val _293609878_VtblPtr: Pointer?
      get() = __293609878_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MatrixProperty(): DependencyProperty? {
      val fnPtr = _293609878_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__293609878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMatrixTransformStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __293609878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMatrixTransformStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43e02e4715b84758bb977d52420acc5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMatrixTransformStatics(ptr: Pointer?): WithDefault =
        IMatrixTransformStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMatrixTransformStatics {
      val address = segment.toRawLongValue()
      return makeIMatrixTransformStatics(Pointer(address))
    }

    public override fun toNative(obj: IMatrixTransformStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__293609878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMatrixTransformStatics): Array<IMatrixTransformStatics?>
        = (elements as
        Array<IMatrixTransformStatics?>).castToImpl<IMatrixTransformStatics,IMatrixTransformStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMatrixTransformStatics?> =
        arrayOfNulls<IMatrixTransformStatics_Impl>(size) as Array<IMatrixTransformStatics?>
  }
}
