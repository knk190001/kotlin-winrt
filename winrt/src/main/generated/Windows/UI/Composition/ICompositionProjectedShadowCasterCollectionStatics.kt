package Windows.UI.Composition

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

@ABIMarker(ICompositionProjectedShadowCasterCollectionStatics.ABI::class)
@Signature("{56fbb136-e94f-5299-ab5b-6e15e38bd899}")
@Guid("56fbb136e94f5299ab5b6e15e38bd899")
@WinRTInterface("56fbb136e94f5299ab5b6e15e38bd899")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionProjectedShadowCasterCollectionStatics.ByReference::class)
public interface ICompositionProjectedShadowCasterCollectionStatics : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_MaxRespectedCasters(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionProjectedShadowCasterCollectionStatics> {
    public override fun getValue() =
        ABI.makeICompositionProjectedShadowCasterCollectionStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositionProjectedShadowCasterCollectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionProjectedShadowCasterCollectionStatics {
    public val __18369281_Ptr: Pointer?

    public val _18369281_VtblPtr: Pointer?
      get() = __18369281_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxRespectedCasters(): Int {
      val fnPtr = _18369281_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__18369281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ICompositionProjectedShadowCasterCollectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __18369281_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionProjectedShadowCasterCollectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56fbb136e94f5299ab5b6e15e38bd899")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionProjectedShadowCasterCollectionStatics(ptr: Pointer?): WithDefault =
        ICompositionProjectedShadowCasterCollectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICompositionProjectedShadowCasterCollectionStatics {
      val address = segment.toRawLongValue()
      return makeICompositionProjectedShadowCasterCollectionStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositionProjectedShadowCasterCollectionStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__18369281_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionProjectedShadowCasterCollectionStatics):
        Array<ICompositionProjectedShadowCasterCollectionStatics?> = (elements as
        Array<ICompositionProjectedShadowCasterCollectionStatics?>).castToImpl<ICompositionProjectedShadowCasterCollectionStatics,ICompositionProjectedShadowCasterCollectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ICompositionProjectedShadowCasterCollectionStatics?> =
        arrayOfNulls<ICompositionProjectedShadowCasterCollectionStatics_Impl>(size) as
        Array<ICompositionProjectedShadowCasterCollectionStatics?>
  }
}
