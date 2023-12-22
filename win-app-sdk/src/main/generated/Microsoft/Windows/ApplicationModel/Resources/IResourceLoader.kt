package Microsoft.Windows.ApplicationModel.Resources

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IResourceLoader.ABI::class)
@Signature("{bc3f76bf-da46-54cd-8715-8b8aaf16eaac}")
@Guid("bc3f76bfda4654cd87158b8aaf16eaac")
@WinRTInterface("bc3f76bfda4654cd87158b8aaf16eaac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceLoader.ByReference::class)
public interface IResourceLoader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetString(resourceId: String?): String?

  @InterfaceMethod(1)
  public fun GetStringForUri(resourceUri: Uri?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceLoader> {
    public override fun getValue() = ABI.makeIResourceLoader(pointer.getPointer(0))

    public fun setValue(value: IResourceLoader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceLoader {
    public val __686181553_Ptr: Pointer?

    public val _686181553_VtblPtr: Pointer?
      get() = __686181553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetString(resourceId: String?): String? {
      val fnPtr = _686181553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__686181553_Ptr, marshalToNative(resourceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetStringForUri(resourceUri: Uri?): String? {
      val fnPtr = _686181553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__686181553_Ptr, marshalToNative(resourceUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IResourceLoader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __686181553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceLoader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc3f76bfda4654cd87158b8aaf16eaac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceLoader(ptr: Pointer?): WithDefault = IResourceLoader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceLoader {
      val address = segment.toRawLongValue()
      return makeIResourceLoader(Pointer(address))
    }

    public override fun toNative(obj: IResourceLoader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__686181553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceLoader): Array<IResourceLoader?> = (elements as
        Array<IResourceLoader?>).castToImpl<IResourceLoader,IResourceLoader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceLoader?> =
        arrayOfNulls<IResourceLoader_Impl>(size) as Array<IResourceLoader?>
  }
}
