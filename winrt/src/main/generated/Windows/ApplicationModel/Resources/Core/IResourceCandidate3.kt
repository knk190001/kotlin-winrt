package Windows.ApplicationModel.Resources.Core

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

@ABIMarker(IResourceCandidate3.ABI::class)
@Signature("{08ae97f8-517a-4674-958c-4a3c7cd2cc6b}")
@Guid("08ae97f8517a4674958c4a3c7cd2cc6b")
@WinRTInterface("08ae97f8517a4674958c4a3c7cd2cc6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceCandidate3.ByReference::class)
public interface IResourceCandidate3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): ResourceCandidateKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceCandidate3> {
    public override fun getValue() = ABI.makeIResourceCandidate3(pointer.getPointer(0))

    public fun setValue(value: IResourceCandidate3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceCandidate3 {
    public val __1963903861_Ptr: Pointer?

    public val _1963903861_VtblPtr: Pointer?
      get() = __1963903861_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): ResourceCandidateKind? {
      val fnPtr = _1963903861_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidateKind>()
      val hr = fn.invokeHR(arrayOf(__1963903861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidateKind>(result.getValue())
      return resultValue
    }
  }

  public class IResourceCandidate3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1963903861_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceCandidate3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08ae97f8517a4674958c4a3c7cd2cc6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceCandidate3(ptr: Pointer?): WithDefault = IResourceCandidate3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceCandidate3 {
      val address = segment.toRawLongValue()
      return makeIResourceCandidate3(Pointer(address))
    }

    public override fun toNative(obj: IResourceCandidate3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1963903861_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceCandidate3): Array<IResourceCandidate3?> =
        (elements as
        Array<IResourceCandidate3?>).castToImpl<IResourceCandidate3,IResourceCandidate3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceCandidate3?> =
        arrayOfNulls<IResourceCandidate3_Impl>(size) as Array<IResourceCandidate3?>
  }
}
