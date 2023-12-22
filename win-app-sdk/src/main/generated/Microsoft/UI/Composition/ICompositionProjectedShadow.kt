package Microsoft.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionProjectedShadow.ABI::class)
@Signature("{d400ab10-8b92-5abb-9e23-807974fc6961}")
@Guid("d400ab108b925abb9e23807974fc6961")
@WinRTInterface("d400ab108b925abb9e23807974fc6961")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionProjectedShadow.ByReference::class)
public interface ICompositionProjectedShadow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BlurRadiusMultiplier(): Float

  @InterfaceMethod(1)
  public fun put_BlurRadiusMultiplier(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_Casters(): CompositionProjectedShadowCasterCollection?

  @InterfaceMethod(3)
  public fun get_LightSource(): CompositionLight?

  @InterfaceMethod(4)
  public fun put_LightSource(value: CompositionLight?): Unit

  @InterfaceMethod(5)
  public fun get_MaxBlurRadius(): Float

  @InterfaceMethod(6)
  public fun put_MaxBlurRadius(value: Float): Unit

  @InterfaceMethod(7)
  public fun get_MinBlurRadius(): Float

  @InterfaceMethod(8)
  public fun put_MinBlurRadius(value: Float): Unit

  @InterfaceMethod(9)
  public fun get_Receivers(): CompositionProjectedShadowReceiverUnorderedCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionProjectedShadow> {
    public override fun getValue() = ABI.makeICompositionProjectedShadow(pointer.getPointer(0))

    public fun setValue(value: ICompositionProjectedShadow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionProjectedShadow {
    public val __722554745_Ptr: Pointer?

    public val _722554745_VtblPtr: Pointer?
      get() = __722554745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BlurRadiusMultiplier(): Float {
      val fnPtr = _722554745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BlurRadiusMultiplier(value: Float): Unit {
      val fnPtr = _722554745_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Casters(): CompositionProjectedShadowCasterCollection? {
      val fnPtr = _722554745_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionProjectedShadowCasterCollection>()
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<CompositionProjectedShadowCasterCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LightSource(): CompositionLight? {
      val fnPtr = _722554745_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionLight>()
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionLight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_LightSource(value: CompositionLight?): Unit {
      val fnPtr = _722554745_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_MaxBlurRadius(): Float {
      val fnPtr = _722554745_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_MaxBlurRadius(value: Float): Unit {
      val fnPtr = _722554745_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_MinBlurRadius(): Float {
      val fnPtr = _722554745_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_MinBlurRadius(value: Float): Unit {
      val fnPtr = _722554745_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Receivers(): CompositionProjectedShadowReceiverUnorderedCollection? {
      val fnPtr = _722554745_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionProjectedShadowReceiverUnorderedCollection>()
      val hr = fn.invokeHR(arrayOf(__722554745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<CompositionProjectedShadowReceiverUnorderedCollection>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionProjectedShadow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __722554745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionProjectedShadow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d400ab108b925abb9e23807974fc6961")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionProjectedShadow(ptr: Pointer?): WithDefault =
        ICompositionProjectedShadow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionProjectedShadow {
      val address = segment.toRawLongValue()
      return makeICompositionProjectedShadow(Pointer(address))
    }

    public override fun toNative(obj: ICompositionProjectedShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__722554745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionProjectedShadow):
        Array<ICompositionProjectedShadow?> = (elements as
        Array<ICompositionProjectedShadow?>).castToImpl<ICompositionProjectedShadow,ICompositionProjectedShadow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionProjectedShadow?> =
        arrayOfNulls<ICompositionProjectedShadow_Impl>(size) as Array<ICompositionProjectedShadow?>
  }
}
