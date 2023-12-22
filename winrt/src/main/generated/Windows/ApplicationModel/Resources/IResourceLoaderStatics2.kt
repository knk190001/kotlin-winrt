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

@ABIMarker(IResourceLoaderStatics2.ABI::class)
@Signature("{0cc04141-6466-4989-9494-0b82dfc53f1f}")
@Guid("0cc041416466498994940b82dfc53f1f")
@WinRTInterface("0cc041416466498994940b82dfc53f1f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceLoaderStatics2.ByReference::class)
public interface IResourceLoaderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): ResourceLoader?

  @InterfaceMethod(1)
  public fun GetForCurrentView(name: String?): ResourceLoader?

  @InterfaceMethod(2)
  public fun GetForViewIndependentUse(): ResourceLoader?

  @InterfaceMethod(3)
  public fun GetForViewIndependentUse(name: String?): ResourceLoader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceLoaderStatics2> {
    public override fun getValue() = ABI.makeIResourceLoaderStatics2(pointer.getPointer(0))

    public fun setValue(value: IResourceLoaderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceLoaderStatics2 {
    public val __1166939804_Ptr: Pointer?

    public val _1166939804_VtblPtr: Pointer?
      get() = __1166939804_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): ResourceLoader? {
      val fnPtr = _1166939804_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1166939804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceLoader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForCurrentView(name: String?): ResourceLoader? {
      val fnPtr = _1166939804_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1166939804_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceLoader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetForViewIndependentUse(): ResourceLoader? {
      val fnPtr = _1166939804_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1166939804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceLoader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetForViewIndependentUse(name: String?): ResourceLoader? {
      val fnPtr = _1166939804_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1166939804_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceLoader>(result.getValue())
      return resultValue
    }
  }

  public class IResourceLoaderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1166939804_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceLoaderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cc041416466498994940b82dfc53f1f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceLoaderStatics2(ptr: Pointer?): WithDefault =
        IResourceLoaderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceLoaderStatics2 {
      val address = segment.toRawLongValue()
      return makeIResourceLoaderStatics2(Pointer(address))
    }

    public override fun toNative(obj: IResourceLoaderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1166939804_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceLoaderStatics2): Array<IResourceLoaderStatics2?>
        = (elements as
        Array<IResourceLoaderStatics2?>).castToImpl<IResourceLoaderStatics2,IResourceLoaderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceLoaderStatics2?> =
        arrayOfNulls<IResourceLoaderStatics2_Impl>(size) as Array<IResourceLoaderStatics2?>
  }
}
