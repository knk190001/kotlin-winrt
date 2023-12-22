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

@ABIMarker(IResourceManagerFactory.ABI::class)
@Signature("{d6acf18f-458a-535b-a5c4-ac2dc4e49099}")
@Guid("d6acf18f458a535ba5c4ac2dc4e49099")
@WinRTInterface("d6acf18f458a535ba5c4ac2dc4e49099")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceManagerFactory.ByReference::class)
public interface IResourceManagerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(fileName: String?): ResourceManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceManagerFactory> {
    public override fun getValue() = ABI.makeIResourceManagerFactory(pointer.getPointer(0))

    public fun setValue(value: IResourceManagerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceManagerFactory {
    public val __1973242919_Ptr: Pointer?

    public val _1973242919_VtblPtr: Pointer?
      get() = __1973242919_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(fileName: String?): ResourceManager? {
      val fnPtr = _1973242919_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceManager>()
      val hr = fn.invokeHR(arrayOf(__1973242919_Ptr, marshalToNative(fileName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceManager>(result.getValue())
      return resultValue
    }
  }

  public class IResourceManagerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1973242919_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceManagerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d6acf18f458a535ba5c4ac2dc4e49099")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceManagerFactory(ptr: Pointer?): WithDefault =
        IResourceManagerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceManagerFactory {
      val address = segment.toRawLongValue()
      return makeIResourceManagerFactory(Pointer(address))
    }

    public override fun toNative(obj: IResourceManagerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1973242919_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceManagerFactory): Array<IResourceManagerFactory?>
        = (elements as
        Array<IResourceManagerFactory?>).castToImpl<IResourceManagerFactory,IResourceManagerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceManagerFactory?> =
        arrayOfNulls<IResourceManagerFactory_Impl>(size) as Array<IResourceManagerFactory?>
  }
}
