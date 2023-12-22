package Windows.Media.Audio

import Windows.Media.Effects.IAudioEffectDefinition
import Windows.Media.Effects.IAudioEffectDefinition.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEchoEffectDefinition.ABI::class)
@Signature("{0e4d3faa-36b8-4c91-b9da-11f44a8a6610}")
@Guid("0e4d3faa36b84c91b9da11f44a8a6610")
@WinRTInterface("0e4d3faa36b84c91b9da11f44a8a6610")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEchoEffectDefinition.ByReference::class)
public interface IEchoEffectDefinition : NativeMapped, IWinRTInterface, IAudioEffectDefinition {
  @InterfaceMethod(0)
  public fun put_WetDryMix(value: Double): Unit

  @InterfaceMethod(1)
  public fun get_WetDryMix(): Double

  @InterfaceMethod(2)
  public fun put_Feedback(value: Double): Unit

  @InterfaceMethod(3)
  public fun get_Feedback(): Double

  @InterfaceMethod(4)
  public fun put_Delay(value: Double): Unit

  @InterfaceMethod(5)
  public fun get_Delay(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEchoEffectDefinition> {
    public override fun getValue() = ABI.makeIEchoEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: IEchoEffectDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEchoEffectDefinition, IAudioEffectDefinition.WithDefault {
    public val __1578953583_Ptr: Pointer?

    public val _1578953583_VtblPtr: Pointer?
      get() = __1578953583_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_WetDryMix(value: Double): Unit {
      val fnPtr = _1578953583_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1578953583_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_WetDryMix(): Double {
      val fnPtr = _1578953583_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1578953583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Feedback(value: Double): Unit {
      val fnPtr = _1578953583_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1578953583_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Feedback(): Double {
      val fnPtr = _1578953583_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1578953583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_Delay(value: Double): Unit {
      val fnPtr = _1578953583_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1578953583_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Delay(): Double {
      val fnPtr = _1578953583_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1578953583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IEchoEffectDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioEffectDefinition {
    public override val __1562923618_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1578953583_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1578953583_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEchoEffectDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e4d3faa36b84c91b9da11f44a8a6610")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEchoEffectDefinition(ptr: Pointer?): WithDefault =
        IEchoEffectDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEchoEffectDefinition {
      val address = segment.toRawLongValue()
      return makeIEchoEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: IEchoEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1578953583_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEchoEffectDefinition): Array<IEchoEffectDefinition?> =
        (elements as
        Array<IEchoEffectDefinition?>).castToImpl<IEchoEffectDefinition,IEchoEffectDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEchoEffectDefinition?> =
        arrayOfNulls<IEchoEffectDefinition_Impl>(size) as Array<IEchoEffectDefinition?>
  }
}
