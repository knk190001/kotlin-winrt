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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionPathGeometry.ABI::class)
@Signature("{0f6e6b82-060b-571e-b849-ab8e0d723962}")
@Guid("0f6e6b82060b571eb849ab8e0d723962")
@WinRTInterface("0f6e6b82060b571eb849ab8e0d723962")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionPathGeometry.ByReference::class)
public interface ICompositionPathGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Path(): CompositionPath?

  @InterfaceMethod(1)
  public fun put_Path(value: CompositionPath?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionPathGeometry> {
    public override fun getValue() = ABI.makeICompositionPathGeometry(pointer.getPointer(0))

    public fun setValue(value: ICompositionPathGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionPathGeometry {
    public val __140036536_Ptr: Pointer?

    public val _140036536_VtblPtr: Pointer?
      get() = __140036536_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Path(): CompositionPath? {
      val fnPtr = _140036536_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPath>()
      val hr = fn.invokeHR(arrayOf(__140036536_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Path(value: CompositionPath?): Unit {
      val fnPtr = _140036536_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__140036536_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionPathGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __140036536_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionPathGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f6e6b82060b571eb849ab8e0d723962")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionPathGeometry(ptr: Pointer?): WithDefault =
        ICompositionPathGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionPathGeometry {
      val address = segment.toRawLongValue()
      return makeICompositionPathGeometry(Pointer(address))
    }

    public override fun toNative(obj: ICompositionPathGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__140036536_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionPathGeometry):
        Array<ICompositionPathGeometry?> = (elements as
        Array<ICompositionPathGeometry?>).castToImpl<ICompositionPathGeometry,ICompositionPathGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionPathGeometry?> =
        arrayOfNulls<ICompositionPathGeometry_Impl>(size) as Array<ICompositionPathGeometry?>
  }
}
