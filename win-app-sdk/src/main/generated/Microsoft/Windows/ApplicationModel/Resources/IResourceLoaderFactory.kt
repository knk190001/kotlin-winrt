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

@ABIMarker(IResourceLoaderFactory.ABI::class)
@Signature("{871f83aa-fb34-50d6-b9b9-2c35f3ffc004}")
@Guid("871f83aafb3450d6b9b92c35f3ffc004")
@WinRTInterface("871f83aafb3450d6b9b92c35f3ffc004")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceLoaderFactory.ByReference::class)
public interface IResourceLoaderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(fileName: String?): ResourceLoader?

  @InterfaceMethod(1)
  public fun CreateInstance2(fileName: String?, resourceMap: String?): ResourceLoader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceLoaderFactory> {
    public override fun getValue() = ABI.makeIResourceLoaderFactory(pointer.getPointer(0))

    public fun setValue(value: IResourceLoaderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceLoaderFactory {
    public val __1304923835_Ptr: Pointer?

    public val _1304923835_VtblPtr: Pointer?
      get() = __1304923835_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(fileName: String?): ResourceLoader? {
      val fnPtr = _1304923835_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1304923835_Ptr, marshalToNative(fileName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceLoader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstance2(fileName: String?, resourceMap: String?): ResourceLoader? {
      val fnPtr = _1304923835_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1304923835_Ptr, marshalToNative(fileName),
          marshalToNative(resourceMap), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceLoader>(result.getValue())
      return resultValue
    }
  }

  public class IResourceLoaderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1304923835_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceLoaderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("871f83aafb3450d6b9b92c35f3ffc004")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceLoaderFactory(ptr: Pointer?): WithDefault =
        IResourceLoaderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceLoaderFactory {
      val address = segment.toRawLongValue()
      return makeIResourceLoaderFactory(Pointer(address))
    }

    public override fun toNative(obj: IResourceLoaderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1304923835_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceLoaderFactory): Array<IResourceLoaderFactory?> =
        (elements as
        Array<IResourceLoaderFactory?>).castToImpl<IResourceLoaderFactory,IResourceLoaderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceLoaderFactory?> =
        arrayOfNulls<IResourceLoaderFactory_Impl>(size) as Array<IResourceLoaderFactory?>
  }
}
