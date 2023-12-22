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

@ABIMarker(IToggleSplitButtonFactory.ABI::class)
@Signature("{3fcf073b-e57c-573d-af38-d1b2ad387951}")
@Guid("3fcf073be57c573daf38d1b2ad387951")
@WinRTInterface("3fcf073be57c573daf38d1b2ad387951")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSplitButtonFactory.ByReference::class)
public interface IToggleSplitButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ToggleSplitButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSplitButtonFactory> {
    public override fun getValue() = ABI.makeIToggleSplitButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IToggleSplitButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSplitButtonFactory {
    public val __781682446_Ptr: Pointer?

    public val _781682446_VtblPtr: Pointer?
      get() = __781682446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ToggleSplitButton? {
      val fnPtr = _781682446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToggleSplitButton>()
      val hr = fn.invokeHR(arrayOf(__781682446_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToggleSplitButton>(result.getValue())
      return resultValue
    }
  }

  public class IToggleSplitButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __781682446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSplitButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fcf073be57c573daf38d1b2ad387951")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSplitButtonFactory(ptr: Pointer?): WithDefault =
        IToggleSplitButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleSplitButtonFactory {
      val address = segment.toRawLongValue()
      return makeIToggleSplitButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IToggleSplitButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__781682446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSplitButtonFactory):
        Array<IToggleSplitButtonFactory?> = (elements as
        Array<IToggleSplitButtonFactory?>).castToImpl<IToggleSplitButtonFactory,IToggleSplitButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSplitButtonFactory?> =
        arrayOfNulls<IToggleSplitButtonFactory_Impl>(size) as Array<IToggleSplitButtonFactory?>
  }
}
