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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IResourceNotFoundEventArgs.ABI::class)
@Signature("{64abb08b-e77d-5b26-830f-15941e0e8200}")
@Guid("64abb08be77d5b26830f15941e0e8200")
@WinRTInterface("64abb08be77d5b26830f15941e0e8200")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceNotFoundEventArgs.ByReference::class)
public interface IResourceNotFoundEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Context(): ResourceContext?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun SetResolvedCandidate(candidate: ResourceCandidate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceNotFoundEventArgs> {
    public override fun getValue() = ABI.makeIResourceNotFoundEventArgs(pointer.getPointer(0))

    public fun setValue(value: IResourceNotFoundEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceNotFoundEventArgs {
    public val __1563779540_Ptr: Pointer?

    public val _1563779540_VtblPtr: Pointer?
      get() = __1563779540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Context(): ResourceContext? {
      val fnPtr = _1563779540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceContext>()
      val hr = fn.invokeHR(arrayOf(__1563779540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _1563779540_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1563779540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetResolvedCandidate(candidate: ResourceCandidate?): Unit {
      val fnPtr = _1563779540_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1563779540_Ptr, marshalToNative(candidate),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IResourceNotFoundEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1563779540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceNotFoundEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64abb08be77d5b26830f15941e0e8200")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceNotFoundEventArgs(ptr: Pointer?): WithDefault =
        IResourceNotFoundEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceNotFoundEventArgs {
      val address = segment.toRawLongValue()
      return makeIResourceNotFoundEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IResourceNotFoundEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1563779540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceNotFoundEventArgs):
        Array<IResourceNotFoundEventArgs?> = (elements as
        Array<IResourceNotFoundEventArgs?>).castToImpl<IResourceNotFoundEventArgs,IResourceNotFoundEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceNotFoundEventArgs?> =
        arrayOfNulls<IResourceNotFoundEventArgs_Impl>(size) as Array<IResourceNotFoundEventArgs?>
  }
}
