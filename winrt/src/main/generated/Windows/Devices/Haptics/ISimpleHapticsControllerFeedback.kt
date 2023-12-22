package Windows.Devices.Haptics

import Windows.Foundation.TimeSpan
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

@ABIMarker(ISimpleHapticsControllerFeedback.ABI::class)
@Signature("{3d577ef8-4cee-11e6-b535-001bdc06ab3b}")
@Guid("3d577ef84cee11e6b535001bdc06ab3b")
@WinRTInterface("3d577ef84cee11e6b535001bdc06ab3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISimpleHapticsControllerFeedback.ByReference::class)
public interface ISimpleHapticsControllerFeedback : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Waveform(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_Duration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISimpleHapticsControllerFeedback> {
    public override fun getValue() = ABI.makeISimpleHapticsControllerFeedback(pointer.getPointer(0))

    public fun setValue(value: ISimpleHapticsControllerFeedback_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISimpleHapticsControllerFeedback {
    public val __1564083998_Ptr: Pointer?

    public val _1564083998_VtblPtr: Pointer?
      get() = __1564083998_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Waveform(): WinDef.USHORT {
      val fnPtr = _1564083998_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1564083998_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1564083998_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1564083998_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ISimpleHapticsControllerFeedback_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1564083998_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISimpleHapticsControllerFeedback, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d577ef84cee11e6b535001bdc06ab3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISimpleHapticsControllerFeedback(ptr: Pointer?): WithDefault =
        ISimpleHapticsControllerFeedback_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISimpleHapticsControllerFeedback {
      val address = segment.toRawLongValue()
      return makeISimpleHapticsControllerFeedback(Pointer(address))
    }

    public override fun toNative(obj: ISimpleHapticsControllerFeedback): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1564083998_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISimpleHapticsControllerFeedback):
        Array<ISimpleHapticsControllerFeedback?> = (elements as
        Array<ISimpleHapticsControllerFeedback?>).castToImpl<ISimpleHapticsControllerFeedback,ISimpleHapticsControllerFeedback_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISimpleHapticsControllerFeedback?> =
        arrayOfNulls<ISimpleHapticsControllerFeedback_Impl>(size) as
        Array<ISimpleHapticsControllerFeedback?>
  }
}
