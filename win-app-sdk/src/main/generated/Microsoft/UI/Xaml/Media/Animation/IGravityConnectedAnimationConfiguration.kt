package Microsoft.UI.Xaml.Media.Animation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGravityConnectedAnimationConfiguration.ABI::class)
@Signature("{04c8b276-cff3-5a55-9229-33dc66c99e20}")
@Guid("04c8b276cff35a55922933dc66c99e20")
@WinRTInterface("04c8b276cff35a55922933dc66c99e20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGravityConnectedAnimationConfiguration.ByReference::class)
public interface IGravityConnectedAnimationConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsShadowEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsShadowEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGravityConnectedAnimationConfiguration> {
    public override fun getValue() =
        ABI.makeIGravityConnectedAnimationConfiguration(pointer.getPointer(0))

    public fun setValue(value: IGravityConnectedAnimationConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGravityConnectedAnimationConfiguration {
    public val __757549112_Ptr: Pointer?

    public val _757549112_VtblPtr: Pointer?
      get() = __757549112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsShadowEnabled(): Boolean {
      val fnPtr = _757549112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__757549112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsShadowEnabled(value: Boolean): Unit {
      val fnPtr = _757549112_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__757549112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGravityConnectedAnimationConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __757549112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGravityConnectedAnimationConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04c8b276cff35a55922933dc66c99e20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGravityConnectedAnimationConfiguration(ptr: Pointer?): WithDefault =
        IGravityConnectedAnimationConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGravityConnectedAnimationConfiguration {
      val address = segment.toRawLongValue()
      return makeIGravityConnectedAnimationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IGravityConnectedAnimationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__757549112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGravityConnectedAnimationConfiguration):
        Array<IGravityConnectedAnimationConfiguration?> = (elements as
        Array<IGravityConnectedAnimationConfiguration?>).castToImpl<IGravityConnectedAnimationConfiguration,IGravityConnectedAnimationConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGravityConnectedAnimationConfiguration?> =
        arrayOfNulls<IGravityConnectedAnimationConfiguration_Impl>(size) as
        Array<IGravityConnectedAnimationConfiguration?>
  }
}
