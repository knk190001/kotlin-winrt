package Windows.UI.Input.Spatial

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialInteractionManagerStatics2.ABI::class)
@Signature("{93f16c52-b88a-5929-8d7c-48cb948b081c}")
@Guid("93f16c52b88a59298d7c48cb948b081c")
@WinRTInterface("93f16c52b88a59298d7c48cb948b081c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionManagerStatics2.ByReference::class)
public interface ISpatialInteractionManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSourceKindSupported(kind: SpatialInteractionSourceKind?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionManagerStatics2> {
    public override fun getValue() =
        ABI.makeISpatialInteractionManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionManagerStatics2 {
    public val __1790750476_Ptr: Pointer?

    public val _1790750476_VtblPtr: Pointer?
      get() = __1790750476_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSourceKindSupported(kind: SpatialInteractionSourceKind?): Boolean {
      val fnPtr = _1790750476_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1790750476_Ptr, marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialInteractionManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1790750476_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93f16c52b88a59298d7c48cb948b081c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionManagerStatics2(ptr: Pointer?): WithDefault =
        ISpatialInteractionManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1790750476_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionManagerStatics2):
        Array<ISpatialInteractionManagerStatics2?> = (elements as
        Array<ISpatialInteractionManagerStatics2?>).castToImpl<ISpatialInteractionManagerStatics2,ISpatialInteractionManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionManagerStatics2?> =
        arrayOfNulls<ISpatialInteractionManagerStatics2_Impl>(size) as
        Array<ISpatialInteractionManagerStatics2?>
  }
}
