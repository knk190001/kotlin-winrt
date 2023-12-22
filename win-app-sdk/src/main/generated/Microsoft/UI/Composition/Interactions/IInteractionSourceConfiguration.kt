package Microsoft.UI.Composition.Interactions

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInteractionSourceConfiguration.ABI::class)
@Signature("{099e0124-dadf-5bc6-a895-90387657550f}")
@Guid("099e0124dadf5bc6a89590387657550f")
@WinRTInterface("099e0124dadf5bc6a89590387657550f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionSourceConfiguration.ByReference::class)
public interface IInteractionSourceConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PositionXSourceMode(): InteractionSourceRedirectionMode?

  @InterfaceMethod(1)
  public fun put_PositionXSourceMode(value: InteractionSourceRedirectionMode?): Unit

  @InterfaceMethod(2)
  public fun get_PositionYSourceMode(): InteractionSourceRedirectionMode?

  @InterfaceMethod(3)
  public fun put_PositionYSourceMode(value: InteractionSourceRedirectionMode?): Unit

  @InterfaceMethod(4)
  public fun get_ScaleSourceMode(): InteractionSourceRedirectionMode?

  @InterfaceMethod(5)
  public fun put_ScaleSourceMode(value: InteractionSourceRedirectionMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionSourceConfiguration> {
    public override fun getValue() = ABI.makeIInteractionSourceConfiguration(pointer.getPointer(0))

    public fun setValue(value: IInteractionSourceConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionSourceConfiguration {
    public val __424579155_Ptr: Pointer?

    public val _424579155_VtblPtr: Pointer?
      get() = __424579155_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PositionXSourceMode(): InteractionSourceRedirectionMode? {
      val fnPtr = _424579155_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionSourceRedirectionMode>()
      val hr = fn.invokeHR(arrayOf(__424579155_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionSourceRedirectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PositionXSourceMode(value: InteractionSourceRedirectionMode?): Unit {
      val fnPtr = _424579155_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__424579155_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PositionYSourceMode(): InteractionSourceRedirectionMode? {
      val fnPtr = _424579155_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionSourceRedirectionMode>()
      val hr = fn.invokeHR(arrayOf(__424579155_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionSourceRedirectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PositionYSourceMode(value: InteractionSourceRedirectionMode?): Unit {
      val fnPtr = _424579155_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__424579155_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ScaleSourceMode(): InteractionSourceRedirectionMode? {
      val fnPtr = _424579155_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionSourceRedirectionMode>()
      val hr = fn.invokeHR(arrayOf(__424579155_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionSourceRedirectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ScaleSourceMode(value: InteractionSourceRedirectionMode?): Unit {
      val fnPtr = _424579155_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__424579155_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInteractionSourceConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __424579155_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionSourceConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("099e0124dadf5bc6a89590387657550f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionSourceConfiguration(ptr: Pointer?): WithDefault =
        IInteractionSourceConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionSourceConfiguration {
      val address = segment.toRawLongValue()
      return makeIInteractionSourceConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IInteractionSourceConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__424579155_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionSourceConfiguration):
        Array<IInteractionSourceConfiguration?> = (elements as
        Array<IInteractionSourceConfiguration?>).castToImpl<IInteractionSourceConfiguration,IInteractionSourceConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionSourceConfiguration?> =
        arrayOfNulls<IInteractionSourceConfiguration_Impl>(size) as
        Array<IInteractionSourceConfiguration?>
  }
}
