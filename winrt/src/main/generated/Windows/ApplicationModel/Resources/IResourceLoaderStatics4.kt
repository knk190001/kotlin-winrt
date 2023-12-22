package Windows.ApplicationModel.Resources

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

@ABIMarker(IResourceLoaderStatics4.ABI::class)
@Signature("{9fb36c32-6c8c-4316-962e-909539b5c259}")
@Guid("9fb36c326c8c4316962e909539b5c259")
@WinRTInterface("9fb36c326c8c4316962e909539b5c259")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceLoaderStatics4.ByReference::class)
public interface IResourceLoaderStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultPriPath(packageFullName: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceLoaderStatics4> {
    public override fun getValue() = ABI.makeIResourceLoaderStatics4(pointer.getPointer(0))

    public fun setValue(value: IResourceLoaderStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceLoaderStatics4 {
    public val __1166939806_Ptr: Pointer?

    public val _1166939806_VtblPtr: Pointer?
      get() = __1166939806_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultPriPath(packageFullName: String?): String? {
      val fnPtr = _1166939806_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1166939806_Ptr, marshalToNative(packageFullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IResourceLoaderStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1166939806_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceLoaderStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fb36c326c8c4316962e909539b5c259")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceLoaderStatics4(ptr: Pointer?): WithDefault =
        IResourceLoaderStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceLoaderStatics4 {
      val address = segment.toRawLongValue()
      return makeIResourceLoaderStatics4(Pointer(address))
    }

    public override fun toNative(obj: IResourceLoaderStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1166939806_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceLoaderStatics4): Array<IResourceLoaderStatics4?>
        = (elements as
        Array<IResourceLoaderStatics4?>).castToImpl<IResourceLoaderStatics4,IResourceLoaderStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceLoaderStatics4?> =
        arrayOfNulls<IResourceLoaderStatics4_Impl>(size) as Array<IResourceLoaderStatics4?>
  }
}
