package Microsoft.UI.Xaml

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

@ABIMarker(IWindowFactory.ABI::class)
@Signature("{f0441536-afef-5222-918f-324a9b2dec75}")
@Guid("f0441536afef5222918f324a9b2dec75")
@WinRTInterface("f0441536afef5222918f324a9b2dec75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowFactory.ByReference::class)
public interface IWindowFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Window?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWindowFactory>
      {
    public override fun getValue() = ABI.makeIWindowFactory(pointer.getPointer(0))

    public fun setValue(value: IWindowFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowFactory {
    public val __59190765_Ptr: Pointer?

    public val _59190765_VtblPtr: Pointer?
      get() = __59190765_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Window? {
      val fnPtr = _59190765_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Window>()
      val hr = fn.invokeHR(arrayOf(__59190765_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Window>(result.getValue())
      return resultValue
    }
  }

  public class IWindowFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __59190765_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0441536afef5222918f324a9b2dec75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowFactory(ptr: Pointer?): WithDefault = IWindowFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowFactory {
      val address = segment.toRawLongValue()
      return makeIWindowFactory(Pointer(address))
    }

    public override fun toNative(obj: IWindowFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__59190765_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowFactory): Array<IWindowFactory?> = (elements as
        Array<IWindowFactory?>).castToImpl<IWindowFactory,IWindowFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowFactory?> =
        arrayOfNulls<IWindowFactory_Impl>(size) as Array<IWindowFactory?>
  }
}
