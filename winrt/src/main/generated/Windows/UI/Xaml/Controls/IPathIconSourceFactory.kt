package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPathIconSourceFactory.ABI::class)
@Signature("{8f7f85b9-5247-4f3b-833f-e384bf7e9c84}")
@Guid("8f7f85b952474f3b833fe384bf7e9c84")
@WinRTInterface("8f7f85b952474f3b833fe384bf7e9c84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathIconSourceFactory.ByReference::class)
public interface IPathIconSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): PathIconSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPathIconSourceFactory> {
    public override fun getValue() = ABI.makeIPathIconSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IPathIconSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathIconSourceFactory {
    public val __1444901941_Ptr: Pointer?

    public val _1444901941_VtblPtr: Pointer?
      get() = __1444901941_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        PathIconSource? {
      val fnPtr = _1444901941_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PathIconSource>()
      val hr = fn.invokeHR(arrayOf(__1444901941_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PathIconSource>(result.getValue())
      return resultValue
    }
  }

  public class IPathIconSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1444901941_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathIconSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f7f85b952474f3b833fe384bf7e9c84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathIconSourceFactory(ptr: Pointer?): WithDefault =
        IPathIconSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathIconSourceFactory {
      val address = segment.toRawLongValue()
      return makeIPathIconSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IPathIconSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1444901941_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathIconSourceFactory): Array<IPathIconSourceFactory?> =
        (elements as
        Array<IPathIconSourceFactory?>).castToImpl<IPathIconSourceFactory,IPathIconSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathIconSourceFactory?> =
        arrayOfNulls<IPathIconSourceFactory_Impl>(size) as Array<IPathIconSourceFactory?>
  }
}
