package Microsoft.UI.Composition

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionAnimation4.ABI::class)
@Signature("{c4101447-dfe4-597f-b5bc-96443f5d18a1}")
@Guid("c4101447dfe4597fb5bc96443f5d18a1")
@WinRTInterface("c4101447dfe4597fb5bc96443f5d18a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionAnimation4.ByReference::class)
public interface ICompositionAnimation4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetExpressionReferenceParameter(parameterName: String?, source: IAnimationObject?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionAnimation4> {
    public override fun getValue() = ABI.makeICompositionAnimation4(pointer.getPointer(0))

    public fun setValue(value: ICompositionAnimation4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionAnimation4 {
    public val __1238376449_Ptr: Pointer?

    public val _1238376449_VtblPtr: Pointer?
      get() = __1238376449_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetExpressionReferenceParameter(parameterName: String?,
        source: IAnimationObject?): Unit {
      val fnPtr = _1238376449_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1238376449_Ptr, marshalToNative(parameterName),
          marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionAnimation4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1238376449_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionAnimation4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4101447dfe4597fb5bc96443f5d18a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionAnimation4(ptr: Pointer?): WithDefault =
        ICompositionAnimation4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionAnimation4 {
      val address = segment.toRawLongValue()
      return makeICompositionAnimation4(Pointer(address))
    }

    public override fun toNative(obj: ICompositionAnimation4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1238376449_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionAnimation4): Array<ICompositionAnimation4?> =
        (elements as
        Array<ICompositionAnimation4?>).castToImpl<ICompositionAnimation4,ICompositionAnimation4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionAnimation4?> =
        arrayOfNulls<ICompositionAnimation4_Impl>(size) as Array<ICompositionAnimation4?>
  }
}
