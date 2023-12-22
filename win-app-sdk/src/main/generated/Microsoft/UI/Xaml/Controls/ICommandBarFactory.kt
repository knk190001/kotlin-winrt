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

@ABIMarker(ICommandBarFactory.ABI::class)
@Signature("{8d4079c3-fa0a-5bb1-b45d-499c378761b4}")
@Guid("8d4079c3fa0a5bb1b45d499c378761b4")
@WinRTInterface("8d4079c3fa0a5bb1b45d499c378761b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarFactory.ByReference::class)
public interface ICommandBarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): CommandBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFactory> {
    public override fun getValue() = ABI.makeICommandBarFactory(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFactory {
    public val __243985349_Ptr: Pointer?

    public val _243985349_VtblPtr: Pointer?
      get() = __243985349_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CommandBar? {
      val fnPtr = _243985349_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBar>()
      val hr = fn.invokeHR(arrayOf(__243985349_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBar>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __243985349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d4079c3fa0a5bb1b45d499c378761b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFactory(ptr: Pointer?): WithDefault = ICommandBarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarFactory {
      val address = segment.toRawLongValue()
      return makeICommandBarFactory(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__243985349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFactory): Array<ICommandBarFactory?> =
        (elements as
        Array<ICommandBarFactory?>).castToImpl<ICommandBarFactory,ICommandBarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarFactory?> =
        arrayOfNulls<ICommandBarFactory_Impl>(size) as Array<ICommandBarFactory?>
  }
}
