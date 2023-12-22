package Microsoft.Windows.ApplicationModel.Resources

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(IResourceCandidate.ABI::class)
@Signature("{6c54bc0c-ef1e-57b8-b478-34fece737356}")
@Guid("6c54bc0cef1e57b8b47834fece737356")
@WinRTInterface("6c54bc0cef1e57b8b47834fece737356")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceCandidate.ByReference::class)
public interface IResourceCandidate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ValueAsString(): String?

  @InterfaceMethod(1)
  public fun get_ValueAsBytes(): Array<Byte>?

  @InterfaceMethod(2)
  public fun get_Kind(): ResourceCandidateKind?

  @InterfaceMethod(3)
  public fun get_QualifierValues(): IMapView<String?, String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceCandidate> {
    public override fun getValue() = ABI.makeIResourceCandidate(pointer.getPointer(0))

    public fun setValue(value: IResourceCandidate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceCandidate {
    public val __1123383495_Ptr: Pointer?

    public val _1123383495_VtblPtr: Pointer?
      get() = __1123383495_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ValueAsString(): String? {
      val fnPtr = _1123383495_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1123383495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ValueAsBytes(): Array<Byte>? {
      val fnPtr = _1123383495_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__1123383495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Kind(): ResourceCandidateKind? {
      val fnPtr = _1123383495_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidateKind>()
      val hr = fn.invokeHR(arrayOf(__1123383495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidateKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_QualifierValues(): IMapView<String?, String?>? {
      val fnPtr = _1123383495_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1123383495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, String?>>(result.getValue())
      return resultValue
    }
  }

  public class IResourceCandidate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1123383495_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceCandidate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6c54bc0cef1e57b8b47834fece737356")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceCandidate(ptr: Pointer?): WithDefault = IResourceCandidate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceCandidate {
      val address = segment.toRawLongValue()
      return makeIResourceCandidate(Pointer(address))
    }

    public override fun toNative(obj: IResourceCandidate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1123383495_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceCandidate): Array<IResourceCandidate?> =
        (elements as
        Array<IResourceCandidate?>).castToImpl<IResourceCandidate,IResourceCandidate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceCandidate?> =
        arrayOfNulls<IResourceCandidate_Impl>(size) as Array<IResourceCandidate?>
  }
}
