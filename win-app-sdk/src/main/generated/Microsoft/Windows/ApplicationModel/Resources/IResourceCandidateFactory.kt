package Microsoft.Windows.ApplicationModel.Resources

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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IResourceCandidateFactory.ABI::class)
@Signature("{bb2b30f8-c19b-5f43-88d9-69ad728a32f4}")
@Guid("bb2b30f8c19b5f4388d969ad728a32f4")
@WinRTInterface("bb2b30f8c19b5f4388d969ad728a32f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceCandidateFactory.ByReference::class)
public interface IResourceCandidateFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(kind: ResourceCandidateKind?, `data`: String?): ResourceCandidate?

  @InterfaceMethod(1)
  public fun CreateInstance2(`data`: Array<Byte>): ResourceCandidate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceCandidateFactory> {
    public override fun getValue() = ABI.makeIResourceCandidateFactory(pointer.getPointer(0))

    public fun setValue(value: IResourceCandidateFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceCandidateFactory {
    public val __559861181_Ptr: Pointer?

    public val _559861181_VtblPtr: Pointer?
      get() = __559861181_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(kind: ResourceCandidateKind?, `data`: String?):
        ResourceCandidate? {
      val fnPtr = _559861181_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__559861181_Ptr, marshalToNative(kind), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstance2(`data`: Array<Byte>): ResourceCandidate? {
      val fnPtr = _559861181_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__559861181_Ptr, data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidate>(result.getValue())
      return resultValue
    }
  }

  public class IResourceCandidateFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __559861181_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceCandidateFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb2b30f8c19b5f4388d969ad728a32f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceCandidateFactory(ptr: Pointer?): WithDefault =
        IResourceCandidateFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceCandidateFactory {
      val address = segment.toRawLongValue()
      return makeIResourceCandidateFactory(Pointer(address))
    }

    public override fun toNative(obj: IResourceCandidateFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__559861181_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceCandidateFactory):
        Array<IResourceCandidateFactory?> = (elements as
        Array<IResourceCandidateFactory?>).castToImpl<IResourceCandidateFactory,IResourceCandidateFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceCandidateFactory?> =
        arrayOfNulls<IResourceCandidateFactory_Impl>(size) as Array<IResourceCandidateFactory?>
  }
}
