package Windows.ApplicationModel.Resources

import Windows.UI.UIContext
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

@ABIMarker(IResourceLoaderStatics3.ABI::class)
@Signature("{64609dfb-64ac-491b-8100-0e558d61c1d0}")
@Guid("64609dfb64ac491b81000e558d61c1d0")
@WinRTInterface("64609dfb64ac491b81000e558d61c1d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceLoaderStatics3.ByReference::class)
public interface IResourceLoaderStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUIContext(context: UIContext?): ResourceLoader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceLoaderStatics3> {
    public override fun getValue() = ABI.makeIResourceLoaderStatics3(pointer.getPointer(0))

    public fun setValue(value: IResourceLoaderStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceLoaderStatics3 {
    public val __1166939805_Ptr: Pointer?

    public val _1166939805_VtblPtr: Pointer?
      get() = __1166939805_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUIContext(context: UIContext?): ResourceLoader? {
      val fnPtr = _1166939805_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1166939805_Ptr, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceLoader>(result.getValue())
      return resultValue
    }
  }

  public class IResourceLoaderStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1166939805_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceLoaderStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64609dfb64ac491b81000e558d61c1d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceLoaderStatics3(ptr: Pointer?): WithDefault =
        IResourceLoaderStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceLoaderStatics3 {
      val address = segment.toRawLongValue()
      return makeIResourceLoaderStatics3(Pointer(address))
    }

    public override fun toNative(obj: IResourceLoaderStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1166939805_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceLoaderStatics3): Array<IResourceLoaderStatics3?>
        = (elements as
        Array<IResourceLoaderStatics3?>).castToImpl<IResourceLoaderStatics3,IResourceLoaderStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceLoaderStatics3?> =
        arrayOfNulls<IResourceLoaderStatics3_Impl>(size) as Array<IResourceLoaderStatics3?>
  }
}
