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

@ABIMarker(IResourceLoaderStatics.ABI::class)
@Signature("{ec9c894a-1466-5f2f-8eee-a70cbd2b51bb}")
@Guid("ec9c894a14665f2f8eeea70cbd2b51bb")
@WinRTInterface("ec9c894a14665f2f8eeea70cbd2b51bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceLoaderStatics.ByReference::class)
public interface IResourceLoaderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultResourceFilePath(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceLoaderStatics> {
    public override fun getValue() = ABI.makeIResourceLoaderStatics(pointer.getPointer(0))

    public fun setValue(value: IResourceLoaderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceLoaderStatics {
    public val __499670390_Ptr: Pointer?

    public val _499670390_VtblPtr: Pointer?
      get() = __499670390_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultResourceFilePath(): String? {
      val fnPtr = _499670390_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__499670390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IResourceLoaderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __499670390_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceLoaderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec9c894a14665f2f8eeea70cbd2b51bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceLoaderStatics(ptr: Pointer?): WithDefault =
        IResourceLoaderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceLoaderStatics {
      val address = segment.toRawLongValue()
      return makeIResourceLoaderStatics(Pointer(address))
    }

    public override fun toNative(obj: IResourceLoaderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__499670390_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceLoaderStatics): Array<IResourceLoaderStatics?> =
        (elements as
        Array<IResourceLoaderStatics?>).castToImpl<IResourceLoaderStatics,IResourceLoaderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceLoaderStatics?> =
        arrayOfNulls<IResourceLoaderStatics_Impl>(size) as Array<IResourceLoaderStatics?>
  }
}
