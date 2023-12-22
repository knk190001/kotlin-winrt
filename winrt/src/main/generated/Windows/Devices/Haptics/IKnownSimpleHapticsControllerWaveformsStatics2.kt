package Windows.Devices.Haptics

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IKnownSimpleHapticsControllerWaveformsStatics2.ABI::class)
@Signature("{a7d24c27-b79d-510a-bf79-ff6d49173e1d}")
@Guid("a7d24c27b79d510abf79ff6d49173e1d")
@WinRTInterface("a7d24c27b79d510abf79ff6d49173e1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownSimpleHapticsControllerWaveformsStatics2.ByReference::class)
public interface IKnownSimpleHapticsControllerWaveformsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BrushContinuous(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_ChiselMarkerContinuous(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_EraserContinuous(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_Error(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_GalaxyPenContinuous(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun get_Hover(): WinDef.USHORT

  @InterfaceMethod(6)
  public fun get_InkContinuous(): WinDef.USHORT

  @InterfaceMethod(7)
  public fun get_MarkerContinuous(): WinDef.USHORT

  @InterfaceMethod(8)
  public fun get_PencilContinuous(): WinDef.USHORT

  @InterfaceMethod(9)
  public fun get_Success(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownSimpleHapticsControllerWaveformsStatics2> {
    public override fun getValue() =
        ABI.makeIKnownSimpleHapticsControllerWaveformsStatics2(pointer.getPointer(0))

    public fun setValue(value: IKnownSimpleHapticsControllerWaveformsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownSimpleHapticsControllerWaveformsStatics2 {
    public val __629453879_Ptr: Pointer?

    public val _629453879_VtblPtr: Pointer?
      get() = __629453879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BrushContinuous(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ChiselMarkerContinuous(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_EraserContinuous(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Error(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_GalaxyPenContinuous(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Hover(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_InkContinuous(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_MarkerContinuous(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_PencilContinuous(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_Success(): WinDef.USHORT {
      val fnPtr = _629453879_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__629453879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IKnownSimpleHapticsControllerWaveformsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __629453879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownSimpleHapticsControllerWaveformsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7d24c27b79d510abf79ff6d49173e1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownSimpleHapticsControllerWaveformsStatics2(ptr: Pointer?): WithDefault =
        IKnownSimpleHapticsControllerWaveformsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IKnownSimpleHapticsControllerWaveformsStatics2 {
      val address = segment.toRawLongValue()
      return makeIKnownSimpleHapticsControllerWaveformsStatics2(Pointer(address))
    }

    public override fun toNative(obj: IKnownSimpleHapticsControllerWaveformsStatics2): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__629453879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownSimpleHapticsControllerWaveformsStatics2):
        Array<IKnownSimpleHapticsControllerWaveformsStatics2?> = (elements as
        Array<IKnownSimpleHapticsControllerWaveformsStatics2?>).castToImpl<IKnownSimpleHapticsControllerWaveformsStatics2,IKnownSimpleHapticsControllerWaveformsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownSimpleHapticsControllerWaveformsStatics2?> =
        arrayOfNulls<IKnownSimpleHapticsControllerWaveformsStatics2_Impl>(size) as
        Array<IKnownSimpleHapticsControllerWaveformsStatics2?>
  }
}
