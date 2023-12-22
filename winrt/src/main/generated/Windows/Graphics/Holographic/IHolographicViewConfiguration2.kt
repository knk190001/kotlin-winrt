package Windows.Graphics.Holographic

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IHolographicViewConfiguration2.ABI::class)
@Signature("{e241756e-e0d0-5019-9af5-1b165bc2f54e}")
@Guid("e241756ee0d050199af51b165bc2f54e")
@WinRTInterface("e241756ee0d050199af51b165bc2f54e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicViewConfiguration2.ByReference::class)
public interface IHolographicViewConfiguration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedDepthReprojectionMethods():
      IVectorView<HolographicDepthReprojectionMethod?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicViewConfiguration2> {
    public override fun getValue() = ABI.makeIHolographicViewConfiguration2(pointer.getPointer(0))

    public fun setValue(value: IHolographicViewConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicViewConfiguration2 {
    public val __589150244_Ptr: Pointer?

    public val _589150244_VtblPtr: Pointer?
      get() = __589150244_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedDepthReprojectionMethods():
        IVectorView<HolographicDepthReprojectionMethod?>? {
      val fnPtr = _589150244_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HolographicDepthReprojectionMethod?>>()
      val hr = fn.invokeHR(arrayOf(__589150244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<HolographicDepthReprojectionMethod?>>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicViewConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589150244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicViewConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e241756ee0d050199af51b165bc2f54e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicViewConfiguration2(ptr: Pointer?): WithDefault =
        IHolographicViewConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicViewConfiguration2 {
      val address = segment.toRawLongValue()
      return makeIHolographicViewConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: IHolographicViewConfiguration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589150244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicViewConfiguration2):
        Array<IHolographicViewConfiguration2?> = (elements as
        Array<IHolographicViewConfiguration2?>).castToImpl<IHolographicViewConfiguration2,IHolographicViewConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicViewConfiguration2?> =
        arrayOfNulls<IHolographicViewConfiguration2_Impl>(size) as
        Array<IHolographicViewConfiguration2?>
  }
}
