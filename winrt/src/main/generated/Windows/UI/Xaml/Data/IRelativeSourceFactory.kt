package Windows.UI.Xaml.Data

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

@ABIMarker(IRelativeSourceFactory.ABI::class)
@Signature("{ef8392cd-446e-4f93-aacb-9b1255577460}")
@Guid("ef8392cd446e4f93aacb9b1255577460")
@WinRTInterface("ef8392cd446e4f93aacb9b1255577460")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRelativeSourceFactory.ByReference::class)
public interface IRelativeSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RelativeSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRelativeSourceFactory> {
    public override fun getValue() = ABI.makeIRelativeSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IRelativeSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRelativeSourceFactory {
    public val __935073755_Ptr: Pointer?

    public val _935073755_VtblPtr: Pointer?
      get() = __935073755_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RelativeSource? {
      val fnPtr = _935073755_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RelativeSource>()
      val hr = fn.invokeHR(arrayOf(__935073755_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RelativeSource>(result.getValue())
      return resultValue
    }
  }

  public class IRelativeSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __935073755_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRelativeSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef8392cd446e4f93aacb9b1255577460")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRelativeSourceFactory(ptr: Pointer?): WithDefault =
        IRelativeSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRelativeSourceFactory {
      val address = segment.toRawLongValue()
      return makeIRelativeSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IRelativeSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__935073755_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRelativeSourceFactory): Array<IRelativeSourceFactory?> =
        (elements as
        Array<IRelativeSourceFactory?>).castToImpl<IRelativeSourceFactory,IRelativeSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRelativeSourceFactory?> =
        arrayOfNulls<IRelativeSourceFactory_Impl>(size) as Array<IRelativeSourceFactory?>
  }
}
