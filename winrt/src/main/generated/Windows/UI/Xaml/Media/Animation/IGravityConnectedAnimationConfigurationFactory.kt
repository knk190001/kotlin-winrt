package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IGravityConnectedAnimationConfigurationFactory.ABI::class)
@Signature("{e822c41f-3656-5090-92f5-c217eaacb682}")
@Guid("e822c41f3656509092f5c217eaacb682")
@WinRTInterface("e822c41f3656509092f5c217eaacb682")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGravityConnectedAnimationConfigurationFactory.ByReference::class)
public interface IGravityConnectedAnimationConfigurationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      GravityConnectedAnimationConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGravityConnectedAnimationConfigurationFactory> {
    public override fun getValue() =
        ABI.makeIGravityConnectedAnimationConfigurationFactory(pointer.getPointer(0))

    public fun setValue(value: IGravityConnectedAnimationConfigurationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGravityConnectedAnimationConfigurationFactory {
    public val __1232256503_Ptr: Pointer?

    public val _1232256503_VtblPtr: Pointer?
      get() = __1232256503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GravityConnectedAnimationConfiguration? {
      val fnPtr = _1232256503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GravityConnectedAnimationConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1232256503_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GravityConnectedAnimationConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IGravityConnectedAnimationConfigurationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1232256503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGravityConnectedAnimationConfigurationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e822c41f3656509092f5c217eaacb682")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGravityConnectedAnimationConfigurationFactory(ptr: Pointer?): WithDefault =
        IGravityConnectedAnimationConfigurationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGravityConnectedAnimationConfigurationFactory {
      val address = segment.toRawLongValue()
      return makeIGravityConnectedAnimationConfigurationFactory(Pointer(address))
    }

    public override fun toNative(obj: IGravityConnectedAnimationConfigurationFactory): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1232256503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGravityConnectedAnimationConfigurationFactory):
        Array<IGravityConnectedAnimationConfigurationFactory?> = (elements as
        Array<IGravityConnectedAnimationConfigurationFactory?>).castToImpl<IGravityConnectedAnimationConfigurationFactory,IGravityConnectedAnimationConfigurationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGravityConnectedAnimationConfigurationFactory?> =
        arrayOfNulls<IGravityConnectedAnimationConfigurationFactory_Impl>(size) as
        Array<IGravityConnectedAnimationConfigurationFactory?>
  }
}
