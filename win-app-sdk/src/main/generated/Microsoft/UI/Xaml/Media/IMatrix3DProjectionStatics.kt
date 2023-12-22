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

@ABIMarker(IMatrix3DProjectionStatics.ABI::class)
@Signature("{a5a7e267-7a5d-58ef-a8cd-b88ebdf82207}")
@Guid("a5a7e2677a5d58efa8cdb88ebdf82207")
@WinRTInterface("a5a7e2677a5d58efa8cdb88ebdf82207")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMatrix3DProjectionStatics.ByReference::class)
public interface IMatrix3DProjectionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProjectionMatrixProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMatrix3DProjectionStatics> {
    public override fun getValue() = ABI.makeIMatrix3DProjectionStatics(pointer.getPointer(0))

    public fun setValue(value: IMatrix3DProjectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMatrix3DProjectionStatics {
    public val __1634678893_Ptr: Pointer?

    public val _1634678893_VtblPtr: Pointer?
      get() = __1634678893_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProjectionMatrixProperty(): DependencyProperty? {
      val fnPtr = _1634678893_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1634678893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMatrix3DProjectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1634678893_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMatrix3DProjectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5a7e2677a5d58efa8cdb88ebdf82207")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMatrix3DProjectionStatics(ptr: Pointer?): WithDefault =
        IMatrix3DProjectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMatrix3DProjectionStatics {
      val address = segment.toRawLongValue()
      return makeIMatrix3DProjectionStatics(Pointer(address))
    }

    public override fun toNative(obj: IMatrix3DProjectionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1634678893_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMatrix3DProjectionStatics):
        Array<IMatrix3DProjectionStatics?> = (elements as
        Array<IMatrix3DProjectionStatics?>).castToImpl<IMatrix3DProjectionStatics,IMatrix3DProjectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMatrix3DProjectionStatics?> =
        arrayOfNulls<IMatrix3DProjectionStatics_Impl>(size) as Array<IMatrix3DProjectionStatics?>
  }
}
