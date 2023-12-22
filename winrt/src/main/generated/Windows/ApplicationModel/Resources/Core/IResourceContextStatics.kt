package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IResourceContextStatics.ABI::class)
@Signature("{98be9d6c-6338-4b31-99df-b2b442f17149}")
@Guid("98be9d6c63384b3199dfb2b442f17149")
@WinRTInterface("98be9d6c63384b3199dfb2b442f17149")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceContextStatics.ByReference::class)
public interface IResourceContextStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMatchingContext(result: IIterable<ResourceQualifier?>?): ResourceContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceContextStatics> {
    public override fun getValue() = ABI.makeIResourceContextStatics(pointer.getPointer(0))

    public fun setValue(value: IResourceContextStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceContextStatics {
    public val __1893047045_Ptr: Pointer?

    public val _1893047045_VtblPtr: Pointer?
      get() = __1893047045_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMatchingContext(result: IIterable<ResourceQualifier?>?):
        ResourceContext? {
      val fnPtr = _1893047045_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceContext>()
      val hr = fn.invokeHR(arrayOf(__1893047045_Ptr, marshalToNative(result), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceContext>(result.getValue())
      return resultValue
    }
  }

  public class IResourceContextStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1893047045_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceContextStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("98be9d6c63384b3199dfb2b442f17149")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceContextStatics(ptr: Pointer?): WithDefault =
        IResourceContextStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceContextStatics {
      val address = segment.toRawLongValue()
      return makeIResourceContextStatics(Pointer(address))
    }

    public override fun toNative(obj: IResourceContextStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1893047045_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceContextStatics): Array<IResourceContextStatics?>
        = (elements as
        Array<IResourceContextStatics?>).castToImpl<IResourceContextStatics,IResourceContextStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceContextStatics?> =
        arrayOfNulls<IResourceContextStatics_Impl>(size) as Array<IResourceContextStatics?>
  }
}
