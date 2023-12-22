package Microsoft.UI.Xaml.Controls

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

@ABIMarker(INumberBoxFactory.ABI::class)
@Signature("{6b81f3cb-45a4-5d19-9bbb-a9fe4656ac4d}")
@Guid("6b81f3cb45a45d199bbba9fe4656ac4d")
@WinRTInterface("6b81f3cb45a45d199bbba9fe4656ac4d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberBoxFactory.ByReference::class)
public interface INumberBoxFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): NumberBox?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumberBoxFactory> {
    public override fun getValue() = ABI.makeINumberBoxFactory(pointer.getPointer(0))

    public fun setValue(value: INumberBoxFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberBoxFactory {
    public val __1256165551_Ptr: Pointer?

    public val _1256165551_VtblPtr: Pointer?
      get() = __1256165551_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        NumberBox? {
      val fnPtr = _1256165551_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NumberBox>()
      val hr = fn.invokeHR(arrayOf(__1256165551_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NumberBox>(result.getValue())
      return resultValue
    }
  }

  public class INumberBoxFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1256165551_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberBoxFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b81f3cb45a45d199bbba9fe4656ac4d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberBoxFactory(ptr: Pointer?): WithDefault = INumberBoxFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberBoxFactory {
      val address = segment.toRawLongValue()
      return makeINumberBoxFactory(Pointer(address))
    }

    public override fun toNative(obj: INumberBoxFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1256165551_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberBoxFactory): Array<INumberBoxFactory?> = (elements
        as Array<INumberBoxFactory?>).castToImpl<INumberBoxFactory,INumberBoxFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberBoxFactory?> =
        arrayOfNulls<INumberBoxFactory_Impl>(size) as Array<INumberBoxFactory?>
  }
}
