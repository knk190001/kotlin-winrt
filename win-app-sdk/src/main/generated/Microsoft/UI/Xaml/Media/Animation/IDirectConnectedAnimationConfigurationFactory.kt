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

@ABIMarker(IDirectConnectedAnimationConfigurationFactory.ABI::class)
@Signature("{604aba9b-4eb8-5310-91dc-30962e25ab00}")
@Guid("604aba9b4eb8531091dc30962e25ab00")
@WinRTInterface("604aba9b4eb8531091dc30962e25ab00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDirectConnectedAnimationConfigurationFactory.ByReference::class)
public interface IDirectConnectedAnimationConfigurationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      DirectConnectedAnimationConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDirectConnectedAnimationConfigurationFactory> {
    public override fun getValue() =
        ABI.makeIDirectConnectedAnimationConfigurationFactory(pointer.getPointer(0))

    public fun setValue(value: IDirectConnectedAnimationConfigurationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDirectConnectedAnimationConfigurationFactory {
    public val __1078784275_Ptr: Pointer?

    public val _1078784275_VtblPtr: Pointer?
      get() = __1078784275_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DirectConnectedAnimationConfiguration? {
      val fnPtr = _1078784275_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectConnectedAnimationConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1078784275_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectConnectedAnimationConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IDirectConnectedAnimationConfigurationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1078784275_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDirectConnectedAnimationConfigurationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("604aba9b4eb8531091dc30962e25ab00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDirectConnectedAnimationConfigurationFactory(ptr: Pointer?): WithDefault =
        IDirectConnectedAnimationConfigurationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDirectConnectedAnimationConfigurationFactory {
      val address = segment.toRawLongValue()
      return makeIDirectConnectedAnimationConfigurationFactory(Pointer(address))
    }

    public override fun toNative(obj: IDirectConnectedAnimationConfigurationFactory): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1078784275_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDirectConnectedAnimationConfigurationFactory):
        Array<IDirectConnectedAnimationConfigurationFactory?> = (elements as
        Array<IDirectConnectedAnimationConfigurationFactory?>).castToImpl<IDirectConnectedAnimationConfigurationFactory,IDirectConnectedAnimationConfigurationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDirectConnectedAnimationConfigurationFactory?> =
        arrayOfNulls<IDirectConnectedAnimationConfigurationFactory_Impl>(size) as
        Array<IDirectConnectedAnimationConfigurationFactory?>
  }
}
