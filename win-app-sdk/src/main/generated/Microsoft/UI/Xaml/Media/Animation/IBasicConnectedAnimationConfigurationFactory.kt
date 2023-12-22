package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IBasicConnectedAnimationConfigurationFactory.ABI::class)
@Signature("{2d156a02-0fb5-5ad1-af9b-bc9c2720fecb}")
@Guid("2d156a020fb55ad1af9bbc9c2720fecb")
@WinRTInterface("2d156a020fb55ad1af9bbc9c2720fecb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBasicConnectedAnimationConfigurationFactory.ByReference::class)
public interface IBasicConnectedAnimationConfigurationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      BasicConnectedAnimationConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBasicConnectedAnimationConfigurationFactory> {
    public override fun getValue() =
        ABI.makeIBasicConnectedAnimationConfigurationFactory(pointer.getPointer(0))

    public fun setValue(value: IBasicConnectedAnimationConfigurationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBasicConnectedAnimationConfigurationFactory {
    public val __597659838_Ptr: Pointer?

    public val _597659838_VtblPtr: Pointer?
      get() = __597659838_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        BasicConnectedAnimationConfiguration? {
      val fnPtr = _597659838_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BasicConnectedAnimationConfiguration>()
      val hr = fn.invokeHR(arrayOf(__597659838_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BasicConnectedAnimationConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IBasicConnectedAnimationConfigurationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __597659838_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBasicConnectedAnimationConfigurationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d156a020fb55ad1af9bbc9c2720fecb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBasicConnectedAnimationConfigurationFactory(ptr: Pointer?): WithDefault =
        IBasicConnectedAnimationConfigurationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBasicConnectedAnimationConfigurationFactory {
      val address = segment.toRawLongValue()
      return makeIBasicConnectedAnimationConfigurationFactory(Pointer(address))
    }

    public override fun toNative(obj: IBasicConnectedAnimationConfigurationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__597659838_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBasicConnectedAnimationConfigurationFactory):
        Array<IBasicConnectedAnimationConfigurationFactory?> = (elements as
        Array<IBasicConnectedAnimationConfigurationFactory?>).castToImpl<IBasicConnectedAnimationConfigurationFactory,IBasicConnectedAnimationConfigurationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBasicConnectedAnimationConfigurationFactory?> =
        arrayOfNulls<IBasicConnectedAnimationConfigurationFactory_Impl>(size) as
        Array<IBasicConnectedAnimationConfigurationFactory?>
  }
}
