package Windows.ApplicationModel.Resources.Management

import Windows.Foundation.Uri
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

@ABIMarker(IResourceIndexerFactory2.ABI::class)
@Signature("{6040f18d-d5e5-4b60-9201-cd279cbcfed9}")
@Guid("6040f18dd5e54b609201cd279cbcfed9")
@WinRTInterface("6040f18dd5e54b609201cd279cbcfed9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceIndexerFactory2.ByReference::class)
public interface IResourceIndexerFactory2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateResourceIndexerWithExtension(projectRoot: Uri?, extensionDllPath: Uri?):
      ResourceIndexer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceIndexerFactory2> {
    public override fun getValue() = ABI.makeIResourceIndexerFactory2(pointer.getPointer(0))

    public fun setValue(value: IResourceIndexerFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceIndexerFactory2 {
    public val __862525350_Ptr: Pointer?

    public val _862525350_VtblPtr: Pointer?
      get() = __862525350_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateResourceIndexerWithExtension(projectRoot: Uri?,
        extensionDllPath: Uri?): ResourceIndexer? {
      val fnPtr = _862525350_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceIndexer>()
      val hr = fn.invokeHR(arrayOf(__862525350_Ptr, marshalToNative(projectRoot),
          marshalToNative(extensionDllPath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceIndexer>(result.getValue())
      return resultValue
    }
  }

  public class IResourceIndexerFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __862525350_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceIndexerFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6040f18dd5e54b609201cd279cbcfed9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceIndexerFactory2(ptr: Pointer?): WithDefault =
        IResourceIndexerFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceIndexerFactory2 {
      val address = segment.toRawLongValue()
      return makeIResourceIndexerFactory2(Pointer(address))
    }

    public override fun toNative(obj: IResourceIndexerFactory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__862525350_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceIndexerFactory2):
        Array<IResourceIndexerFactory2?> = (elements as
        Array<IResourceIndexerFactory2?>).castToImpl<IResourceIndexerFactory2,IResourceIndexerFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceIndexerFactory2?> =
        arrayOfNulls<IResourceIndexerFactory2_Impl>(size) as Array<IResourceIndexerFactory2?>
  }
}
