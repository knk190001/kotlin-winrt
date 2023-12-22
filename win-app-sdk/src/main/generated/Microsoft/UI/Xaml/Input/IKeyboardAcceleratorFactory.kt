package Microsoft.UI.Xaml.Input

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

@ABIMarker(IKeyboardAcceleratorFactory.ABI::class)
@Signature("{ca1d410a-af2a-51b9-a1de-6c0af9f3b598}")
@Guid("ca1d410aaf2a51b9a1de6c0af9f3b598")
@WinRTInterface("ca1d410aaf2a51b9a1de6c0af9f3b598")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyboardAcceleratorFactory.ByReference::class)
public interface IKeyboardAcceleratorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      KeyboardAccelerator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyboardAcceleratorFactory> {
    public override fun getValue() = ABI.makeIKeyboardAcceleratorFactory(pointer.getPointer(0))

    public fun setValue(value: IKeyboardAcceleratorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyboardAcceleratorFactory {
    public val __462515791_Ptr: Pointer?

    public val _462515791_VtblPtr: Pointer?
      get() = __462515791_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        KeyboardAccelerator? {
      val fnPtr = _462515791_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyboardAccelerator>()
      val hr = fn.invokeHR(arrayOf(__462515791_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyboardAccelerator>(result.getValue())
      return resultValue
    }
  }

  public class IKeyboardAcceleratorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __462515791_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyboardAcceleratorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca1d410aaf2a51b9a1de6c0af9f3b598")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyboardAcceleratorFactory(ptr: Pointer?): WithDefault =
        IKeyboardAcceleratorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyboardAcceleratorFactory {
      val address = segment.toRawLongValue()
      return makeIKeyboardAcceleratorFactory(Pointer(address))
    }

    public override fun toNative(obj: IKeyboardAcceleratorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__462515791_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyboardAcceleratorFactory):
        Array<IKeyboardAcceleratorFactory?> = (elements as
        Array<IKeyboardAcceleratorFactory?>).castToImpl<IKeyboardAcceleratorFactory,IKeyboardAcceleratorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyboardAcceleratorFactory?> =
        arrayOfNulls<IKeyboardAcceleratorFactory_Impl>(size) as Array<IKeyboardAcceleratorFactory?>
  }
}
