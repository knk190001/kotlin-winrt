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

@ABIMarker(IButtonFactory.ABI::class)
@Signature("{fe393422-d91c-57b1-9a9c-2c7e3f41f77c}")
@Guid("fe393422d91c57b19a9c2c7e3f41f77c")
@WinRTInterface("fe393422d91c57b19a9c2c7e3f41f77c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IButtonFactory.ByReference::class)
public interface IButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Button?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IButtonFactory>
      {
    public override fun getValue() = ABI.makeIButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IButtonFactory {
    public val __1808241425_Ptr: Pointer?

    public val _1808241425_VtblPtr: Pointer?
      get() = __1808241425_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Button? {
      val fnPtr = _1808241425_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Button>()
      val hr = fn.invokeHR(arrayOf(__1808241425_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Button>(result.getValue())
      return resultValue
    }
  }

  public class IButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1808241425_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe393422d91c57b19a9c2c7e3f41f77c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIButtonFactory(ptr: Pointer?): WithDefault = IButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IButtonFactory {
      val address = segment.toRawLongValue()
      return makeIButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1808241425_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IButtonFactory): Array<IButtonFactory?> = (elements as
        Array<IButtonFactory?>).castToImpl<IButtonFactory,IButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IButtonFactory?> =
        arrayOfNulls<IButtonFactory_Impl>(size) as Array<IButtonFactory?>
  }
}
