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

@ABIMarker(IKnownSimpleHapticsControllerWaveformsStatics.ABI::class)
@Signature("{3d577ef7-4cee-11e6-b535-001bdc06ab3b}")
@Guid("3d577ef74cee11e6b535001bdc06ab3b")
@WinRTInterface("3d577ef74cee11e6b535001bdc06ab3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownSimpleHapticsControllerWaveformsStatics.ByReference::class)
public interface IKnownSimpleHapticsControllerWaveformsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Click(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_BuzzContinuous(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_RumbleContinuous(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_Press(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_Release(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownSimpleHapticsControllerWaveformsStatics> {
    public override fun getValue() =
        ABI.makeIKnownSimpleHapticsControllerWaveformsStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownSimpleHapticsControllerWaveformsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownSimpleHapticsControllerWaveformsStatics {
    public val __851588955_Ptr: Pointer?

    public val _851588955_VtblPtr: Pointer?
      get() = __851588955_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Click(): WinDef.USHORT {
      val fnPtr = _851588955_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__851588955_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_BuzzContinuous(): WinDef.USHORT {
      val fnPtr = _851588955_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__851588955_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_RumbleContinuous(): WinDef.USHORT {
      val fnPtr = _851588955_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__851588955_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Press(): WinDef.USHORT {
      val fnPtr = _851588955_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__851588955_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Release(): WinDef.USHORT {
      val fnPtr = _851588955_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__851588955_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IKnownSimpleHapticsControllerWaveformsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __851588955_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownSimpleHapticsControllerWaveformsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d577ef74cee11e6b535001bdc06ab3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownSimpleHapticsControllerWaveformsStatics(ptr: Pointer?): WithDefault =
        IKnownSimpleHapticsControllerWaveformsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IKnownSimpleHapticsControllerWaveformsStatics {
      val address = segment.toRawLongValue()
      return makeIKnownSimpleHapticsControllerWaveformsStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownSimpleHapticsControllerWaveformsStatics): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__851588955_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownSimpleHapticsControllerWaveformsStatics):
        Array<IKnownSimpleHapticsControllerWaveformsStatics?> = (elements as
        Array<IKnownSimpleHapticsControllerWaveformsStatics?>).castToImpl<IKnownSimpleHapticsControllerWaveformsStatics,IKnownSimpleHapticsControllerWaveformsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownSimpleHapticsControllerWaveformsStatics?> =
        arrayOfNulls<IKnownSimpleHapticsControllerWaveformsStatics_Impl>(size) as
        Array<IKnownSimpleHapticsControllerWaveformsStatics?>
  }
}
